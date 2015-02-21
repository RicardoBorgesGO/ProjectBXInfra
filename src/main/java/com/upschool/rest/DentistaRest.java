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

import com.upschool.entity.Dentista;
import com.upschool.service.IDentistaService;

@Component
@Path("/dentista")
public class DentistaRest {

	@Autowired
	private IDentistaService dentistaService;

	@GET
	@Path("/getDentistas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dentista> getDentistas() {
		return dentistaService.buscarTodosDentistas();
	}

	@POST
	@Path("/setDentista")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarDentista(final Dentista dentista) {
		try {
			dentistaService.salvarDentista(dentista);
		} catch (final Exception e) {
			e.printStackTrace();
			return Response.status(500)
					.entity("Erro ao salvar evento. Erro: " + e).build();
		}
		return Response.status(201).entity("Evento salvo com sucesso!").build();
	}
}
