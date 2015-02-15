package com.upschool.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upschool.entity.Curso;
import com.upschool.service.ICursoService;

@Component
@Path("/curso")
public class CursoRest {

	@Autowired
	private ICursoService service;

	@GET
	@Path("/getCursos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Curso> getCursos() {
		return service.buscarTodos();
	}
}
