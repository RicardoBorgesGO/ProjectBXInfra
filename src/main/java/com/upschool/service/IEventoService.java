package com.upschool.service;

import java.util.List;

import com.upschool.entity.Evento;

public interface IEventoService {

	/**
	 * Lista todos os eventos cadastrados
	 *
	 * @return
	 */
	public List<Evento> listarTodosOsEventos();

	/**
	 * Adiciona um novo Evento
	 *
	 * @param evento
	 */
	public void salvarEvento(Evento evento);

	/**
	 * Remove evento pelo id
	 *
	 * @param id
	 */
	public void removeEvento(Evento evento);

}
