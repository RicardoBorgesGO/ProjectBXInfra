package org.baeldung.persistence.service;

import java.util.List;

import org.baeldung.persistence.dao.IEmailDao;
import org.baeldung.persistence.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Component
//@Path("/email")
@Service
@Transactional
public class EmailService implements IEmailService {

	@Autowired
	private IEmailDao dao;

	public EmailService() {
		super();
	}

	// API
	// @GET
	// @Path("/list")
	// @Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Email> findAll() {
		return dao.findAll();
	}
}
