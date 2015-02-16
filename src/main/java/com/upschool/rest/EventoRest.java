package com.upschool.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upschool.entity.Evento;
import com.upschool.service.IEventoService;

@Component
@Path("/evento")
public class EventoRest {

	@Autowired
	private IEventoService eventoService;

	@GET
	@Path("/getEventos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Evento> getEventos() {
		return eventoService.listarTodosOsEventos();
	}
}
