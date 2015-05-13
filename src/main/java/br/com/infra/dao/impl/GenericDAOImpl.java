package br.com.infra.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.infra.dao.IGenericDAO;

public class GenericDAOImpl<T> implements IGenericDAO<T> {

	private Class<T> clazz;

//	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void salvar(final T bean) {
		entityManager.persist(bean);
	}

	@Override
	public void atualizar(final T bean) {
		entityManager.merge(bean);
		entityManager.flush();
	}

	@Override
	public void excluir(final T bean) {
		entityManager.remove(bean);
	}

	@Override
	public T buscaPorId(final Object id) {
		return entityManager.find(clazz, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> buscaTodos() {
		sessionFactory.getCurrentSession().createQuery("SELECT e FROM " + clazz.getSimpleName() + " e").list();
//		withOptions().tenantIdentifier("cliente1").openSession();
		
		return entityManager.createQuery("SELECT e FROM "
				+ clazz.getSimpleName() + " e")
				.getResultList();
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	protected Session getHibernateCurrentSession() {
		return (Session) entityManager.getDelegate();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}