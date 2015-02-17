package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IEventoDAO;
import com.upschool.entity.Evento;
import com.upschool.service.IEventoService;

@Service
@Transactional
public class EventoServiceImpl implements IEventoService {

	@Autowired
	private IEventoDAO eventoDao;

	@Override
	public List<Evento> listarTodosOsEventos() {
		return eventoDao.buscaTodos();
	}

	@Override
	public void salvarEvento(final Evento evento) {
		eventoDao.salvar(evento);
	}

}
