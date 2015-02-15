package org.baeldung.persistence.dao;

import java.util.List;

import org.baeldung.persistence.model.Email;

public interface IEmailDao {

	Email findOne(long id);

	List<Email> findAll();

	void create(Email entity);

	Email update(Email entity);

	void delete(Email entity);

	void deleteById(long entityId);
}
