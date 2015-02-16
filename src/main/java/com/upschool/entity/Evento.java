package com.upschool.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EVENTO", schema = "PUBLIC")
public class Evento implements Serializable {

	@Column(name = "ID")
	@GeneratedValue(generator = "EVENTO_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 0, schema = "PUBLIC", name = "EVENTO_SQ", sequenceName = "EVENTO_SEQ")
	private Long id;

	@Column(name = "NOME_DO_EVENTO")
	private String nomeDoEvento;

	@Column(name = "DATA_DO_EVENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDoEvento;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(final String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public Date getDataDoEvento() {
		return dataDoEvento;
	}

	public void setDataDoEvento(final Date dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

}
