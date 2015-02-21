package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IDentistaDAO;
import com.upschool.entity.Dentista;
import com.upschool.service.IDentistaService;

@Service
@Transactional
public class DentistaServiceImpl implements IDentistaService {

	@Autowired
	private IDentistaDAO dao;

	@Override
	public List<Dentista> buscarTodosDentistas() {
		return dao.buscaTodos();
	}

	@Override
	public void salvarDentista(final Dentista dentista) {
		dao.salvar(dentista);
	}

}
