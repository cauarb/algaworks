package algaworks.curso.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link algaworks.curso.model.Endereco}
 **/
@StaticMetamodel(Endereco.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Endereco_ {

	
	/**
	 * @see #logradouro
	 **/
	public static final String LOGRADOURO = "logradouro";
	
	/**
	 * @see #numero
	 **/
	public static final String NUMERO = "numero";
	
	/**
	 * @see #complemento
	 **/
	public static final String COMPLEMENTO = "complemento";
	
	/**
	 * @see #bairro
	 **/
	public static final String BAIRRO = "bairro";
	
	/**
	 * @see #cep
	 **/
	public static final String CEP = "cep";
	
	/**
	 * @see #cidade
	 **/
	public static final String CIDADE = "cidade";
	
	/**
	 * @see #estado
	 **/
	public static final String ESTADO = "estado";

	
	/**
	 * Static metamodel type for {@link algaworks.curso.model.Endereco}
	 **/
	public static volatile EmbeddableType<Endereco> class_;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#logradouro}
	 **/
	public static volatile SingularAttribute<Endereco, String> logradouro;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#numero}
	 **/
	public static volatile SingularAttribute<Endereco, String> numero;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#complemento}
	 **/
	public static volatile SingularAttribute<Endereco, String> complemento;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#bairro}
	 **/
	public static volatile SingularAttribute<Endereco, String> bairro;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#cep}
	 **/
	public static volatile SingularAttribute<Endereco, String> cep;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#cidade}
	 **/
	public static volatile SingularAttribute<Endereco, String> cidade;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Endereco#estado}
	 **/
	public static volatile SingularAttribute<Endereco, String> estado;

}

