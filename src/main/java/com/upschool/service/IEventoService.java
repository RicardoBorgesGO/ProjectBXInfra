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
}
