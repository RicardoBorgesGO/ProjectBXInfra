package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.Email;
import org.springframework.stereotype.Repository;

@Repository
public class EmailDAO extends AbstractJpaDAO<Email> implements IEmailDao {

	public EmailDAO() {
		super();

		setClazz(Email.class);
	}
}
