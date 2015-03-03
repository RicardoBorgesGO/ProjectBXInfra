package br.com.infra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.infra.commons.entity.Paciente;
import br.com.infra.dao.IPacienteDAO;
import br.com.infra.service.IPacienteService;

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
	public void salvarPaciente(final Paciente paciente) {
		if (paciente.getId() == null)
			pacienteDAO.salvar(paciente);
		else
			pacienteDAO.atualizar(paciente);
	}

}
