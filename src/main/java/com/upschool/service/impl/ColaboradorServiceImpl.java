package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IColaboradorDAO;
import com.upschool.entity.Colaborador;
import com.upschool.service.IColaboradorService;

@Service
@Transactional
public class ColaboradorServiceImpl implements IColaboradorService {

	@Autowired
	private IColaboradorDAO dao;

	@Override
	public List<Colaborador> buscarTodosColaboradores() {
		return dao.buscaTodos();
	}

	@Override
	public void salvarColaborador(final Colaborador colaborador) {
		if (colaborador.getId() == null)
			dao.salvar(colaborador);
		else
			dao.atualizar(colaborador);
	}

	@Override
	public void excluirColaborador(final Colaborador colaborador) {
		final Colaborador colaboradorThis = dao.buscaPorId(colaborador.getId());
		dao.excluir(colaboradorThis);
	}

	@Override
	public void atualizarColaborador(final Colaborador colaborador) {
		dao.atualizar(colaborador);
	}

}
