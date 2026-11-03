package algaworks.curso.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link algaworks.curso.model.Categoria}
 **/
@StaticMetamodel(Categoria.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Categoria_ {

	
	/**
	 * @see #codigo
	 **/
	public static final String CODIGO = "codigo";
	
	/**
	 * @see #nome
	 **/
	public static final String NOME = "nome";

	
	/**
	 * Static metamodel type for {@link algaworks.curso.model.Categoria}
	 **/
	public static volatile EntityType<Categoria> class_;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Categoria#codigo}
	 **/
	public static volatile SingularAttribute<Categoria, Long> codigo;
	
	/**
	 * Static metamodel for attribute {@link algaworks.curso.model.Categoria#nome}
	 **/
	public static volatile SingularAttribute<Categoria, String> nome;

}

