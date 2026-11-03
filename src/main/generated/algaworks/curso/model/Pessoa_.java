package algaworks.curso.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link algaworks.curso.model.Pessoa}
 **/
@StaticMetamodel(Pessoa.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Pessoa_ {

	
	/**
	 * @see #codigo
	 **/
	public static final String CODIGO = "codigo";
	
	/**
	 * @see #nome
	 **/
	public static final String NOME = "nome";
	
	/**
	 * @see #ativo
	 **/
	public static final String ATIVO = "ativo";
	
	/**
	 * @see #endereco
	 **/
	public static final String ENDERECO = "endereco";

	
	/**
	 * Static metamodel type for {@link algaworks.curso.model.Pessoa}
	 **/
	public static volatile EntityType<Pessoa> class_;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Pessoa#codigo}
	 **/
	public static volatile SingularAttribute<Pessoa, Long> codigo;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Pessoa#nome}
	 **/
	public static volatile SingularAttribute<Pessoa, String> nome;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Pessoa#ativo}
	 **/
	public static volatile SingularAttribute<Pessoa, Boolean> ativo;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Pessoa#endereco}
	 **/
	public static volatile SingularAttribute<Pessoa, Endereco> endereco;

}

