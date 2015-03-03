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

import com.upschool.entity.Colaborador;
import com.upschool.service.IColaboradorService;

@Component
@Path("/colaborador")
public class ColaboradorRest {

	@Autowired
	private IColaboradorService colaboradorService;

	@GET
	@Path("/getColaboradores")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Colaborador> getColaboradores() {
		return colaboradorService.buscarTodosColaboradores();
	}

	@POST
	@Path("/setColaborador")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarColaborador(final Colaborador colaborador) {
		try {
			colaboradorService.salvarColaborador(colaborador);
		} catch (final Exception e) {
			e.printStackTrace();
			return Response.status(500)
					.entity("Erro ao salvar evento. Erro: " + e).build();
		}
		return Response.status(201).entity("Evento salvo com sucesso!").build();
	}

	@POST
	@Path("/deleteColaborador")
	@Consumes(MediaType.APPLICATION_JSON)
	@Deprecated
	public Response excluirColaborador(final Colaborador colaborador) {
		try {
			colaboradorService.excluirColaborador(colaborador);
		} catch (final Exception e) {
			e.printStackTrace();
			return Response.status(500)
					.entity("Erro ao excluir colaborador. Erro: " + e).build();
		}
		return Response.status(201).entity("Colaborador excluido com sucesso!").build();
	}
}
