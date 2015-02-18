package com.upschool.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.service.Service;

import com.upschool.dao.IGenericDAO;

public class GenericDAOImpl<T> implements IGenericDAO<T> {

	private Class<T> clazz;

	@PersistenceContext
	private EntityManager entityManager;

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
		return entityManager.createQuery("SELECT e FROM "
				+ clazz.getSimpleName() + " e")
				.getResultList();
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	protected Service getHibernateCurrentSession() {
		return (Service) entityManager.getDelegate();
	}

}