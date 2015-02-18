package com.upschool.dao;

import java.util.List;

public interface IGenericDAO<T> {

	public void salvar(T bean);

	public void excluir(T bean);

	public void atualizar(T bean);

	public T buscaPorId(Object id);

	public List<T> buscaTodos();
}
