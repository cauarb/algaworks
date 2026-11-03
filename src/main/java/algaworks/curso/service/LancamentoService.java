package algaworks.curso.service;

import algaworks.curso.exception.PessoaInexistenteOuInativaException;
import algaworks.curso.model.Lancamento;
import algaworks.curso.model.Pessoa;
import algaworks.curso.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


@Service
public class LancamentoService {

    @Autowired
    PessoaService pessoaService;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @PostMapping
    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaService.buscarPessoaPeloCodigo(lancamento.getPessoa().getCodigo());
        if (pessoa == null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }

}
