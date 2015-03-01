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

	/**
	 * Salva dentista
	 *
	 * @param dentista
	 */
	public void salvarDentista(Dentista dentista);

	/**
	 * Atualiza Dentista
	 * 
	 * @param dentista
	 */
	public void atualziarDentista(Dentista dentista);

	/**
	 * Exclui dentista
	 * 
	 * @param dentista
	 */
	public void excluirDentista(Dentista dentista);
}
