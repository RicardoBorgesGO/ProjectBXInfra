package org.baeldung.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entidade de E-MAILS
 */
@Entity
@Table(name = "E_MAILS")
public class Email implements Serializable {

	private static final long serialVersionUID = -6959410129220399205L;

	@Id
	@Column(name = "CD_EMAIL", unique = true, nullable = false, precision = 10, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "E_MAIL_SQ")
	@SequenceGenerator(sequenceName = "STG.E_MAIL_SEQ", name = "E_MAIL_SQ", allocationSize = 1)
	private Long id;

	@Column(name = "NM_EMAIL", nullable = false, length = 150)
	private String nmEmail;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(final String nmEmail) {
		this.nmEmail = nmEmail;
	}

}
