package org.baeldung.persistence.service;

import java.util.List;

import org.baeldung.persistence.model.Email;

public interface IEmailService {

	public List<Email> findAll();
}
