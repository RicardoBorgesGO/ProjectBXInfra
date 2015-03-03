package br.com.infra.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.infra.commons.entity.Evento;
import br.com.infra.dao.IEventoDAO;

@Repository
public class EventoDAOImpl extends GenericDAOImpl<Evento> implements IEventoDAO {

}
