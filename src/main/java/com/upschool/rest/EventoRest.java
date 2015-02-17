package com.upschool.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

	@POST
	@Path("/setEvento")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEvento(final Evento evento) {
		try {
			eventoService.salvarEvento(evento);
		} catch (final Exception e) {
			return Response.status(500)
					.entity("Erro ao salvar evento. Erro: " + e)
					.build();
		}
		return Response.status(201).entity("Evento salvo com sucesso!").build();
	}
}
