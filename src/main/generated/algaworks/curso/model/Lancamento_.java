package algaworks.curso.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Static metamodel for {@link algaworks.curso.model.Lancamento}
 **/
@StaticMetamodel(Lancamento.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Lancamento_ {

	
	/**
	 * @see #codigo
	 **/
	public static final String CODIGO = "codigo";
	
	/**
	 * @see #descricao
	 **/
	public static final String DESCRICAO = "descricao";
	
	/**
	 * @see #dataVencimento
	 **/
	public static final String DATA_VENCIMENTO = "dataVencimento";
	
	/**
	 * @see #dataPagamento
	 **/
	public static final String DATA_PAGAMENTO = "dataPagamento";
	
	/**
	 * @see #valor
	 **/
	public static final String VALOR = "valor";
	
	/**
	 * @see #observacao
	 **/
	public static final String OBSERVACAO = "observacao";
	
	/**
	 * @see #tipo
	 **/
	public static final String TIPO = "tipo";
	
	/**
	 * @see #categoria
	 **/
	public static final String CATEGORIA = "categoria";
	
	/**
	 * @see #pessoa
	 **/
	public static final String PESSOA = "pessoa";

	
	/**
	 * Static metamodel type for {@link algaworks.curso.model.Lancamento}
	 **/
	public static volatile EntityType<Lancamento> class_;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#codigo}
	 **/
	public static volatile SingularAttribute<Lancamento, Long> codigo;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#descricao}
	 **/
	public static volatile SingularAttribute<Lancamento, String> descricao;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#dataVencimento}
	 **/
	public static volatile SingularAttribute<Lancamento, LocalDate> dataVencimento;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#dataPagamento}
	 **/
	public static volatile SingularAttribute<Lancamento, LocalDate> dataPagamento;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#valor}
	 **/
	public static volatile SingularAttribute<Lancamento, BigDecimal> valor;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#observacao}
	 **/
	public static volatile SingularAttribute<Lancamento, String> observacao;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#tipo}
	 **/
	public static volatile SingularAttribute<Lancamento, TipoLancamento> tipo;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#categoria}
	 **/
	public static volatile SingularAttribute<Lancamento, Categoria> categoria;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Lancamento#pessoa}
	 **/
	public static volatile SingularAttribute<Lancamento, Pessoa> pessoa;

}

