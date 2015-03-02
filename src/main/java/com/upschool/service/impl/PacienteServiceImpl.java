package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IPacienteDAO;
import com.upschool.entity.Paciente;
import com.upschool.service.IPacienteService;

@Service
@Transactional
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteDAO pacienteDAO;
	
	@Override
	public List<Paciente> buscarTodos() {
		return pacienteDAO.buscaTodos();
	}

	@Override
	public void salvarPaciente(Paciente paciente) {
		pacienteDAO.salvar(paciente);
	}

}
