package algaworks.curso.repository.lancamento;

import algaworks.curso.model.Lancamento;
import algaworks.curso.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
