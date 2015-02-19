package com.upschool.service;

import java.util.List;

import com.upschool.entity.Dentista;

public interface IDentistaService {

	/**
	 * Busca todos os dentistas
	 * 
	 * @return
	 */
	public List<Dentista> buscarTodosDentistas();
}
