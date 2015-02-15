package com.upschool.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upschool.entity.Professor;
import com.upschool.service.IProfessorService;

@Component
@Path("/professor")
public class ProfessorRest {

	@Autowired
	private IProfessorService service;

	@GET
	@Path("/getProfessores")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Professor> getProfessores() {
		return service.buscarTodos();
	}
}
