package algaworks.curso.resource;

import algaworks.curso.event.RecursoCriadoEvent;
import algaworks.curso.model.Lancamento;
import algaworks.curso.repository.LancamentoRepository;
import algaworks.curso.repository.filter.LancamentoFilter;
import algaworks.curso.service.LancamentoService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamento")
public class LancamentoResouce {

    @Autowired
    LancamentoRepository lancamentoRepository;

    @Autowired
    LancamentoService lancamentoService;

    @Autowired
    private ApplicationEventPublisher publisher;


    @GetMapping
    public Page<Lancamento> pesquisar(LancamentoFilter lancamentoFilter, Pageable pageable) {
        return lancamentoRepository.filtrar(lancamentoFilter, pageable);
    }

    @GetMapping("/{codigo}")
    public Lancamento buscarPorCodigo(@PathVariable Long codigo) {
        return lancamentoRepository.findById(codigo).get();
    }

    @PostMapping
    public ResponseEntity<Lancamento> criar(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response) {
        Lancamento lancamentoSalvo = lancamentoService.salvar(lancamento);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, lancamentoSalvo.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }

    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long codigo) {
        if (!lancamentoRepository.existsById(codigo)) {
            throw new EmptyResultDataAccessException(1);
        }
        lancamentoRepository.deleteById(codigo);
    }

}
