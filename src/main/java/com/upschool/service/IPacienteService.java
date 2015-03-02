package com.upschool.service;

import java.util.List;

import com.upschool.entity.Paciente;

public interface IPacienteService {

	List<Paciente> buscarTodos();
	
	/**
	 * Salva paciente
	 * @param paciente
	 */
	void salvarPaciente(Paciente paciente);
}
