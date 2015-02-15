package com.upschool.rest;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.baeldung.persistence.model.Email;
import org.baeldung.persistence.service.IEmailService;
import org.springframework.stereotype.Component;

@Component
@Path("/email")
public class EmailRest {

	// @Autowired
	private IEmailService service;

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, List<Email>> findAll() {
		final Map<String, List<Email>> map = new LinkedHashMap<>();
		map.put("emails", service.findAll());
		return map;
	}
}
