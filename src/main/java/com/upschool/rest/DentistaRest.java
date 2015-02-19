package com.upschool.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upschool.entity.Dentista;
import com.upschool.service.IDentistaService;

@Component
@Path("/dentista")
public class DentistaRest {

	@Autowired
	private IDentistaService service;

	@GET
	@Path("/getDentistas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dentista> getDentistas() {
		return service.buscarTodosDentistas();
	}
}
