package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.ICursoDAO;
import com.upschool.entity.Curso;
import com.upschool.service.ICursoService;

@Service
@Transactional
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private ICursoDAO dao;

	public CursoServiceImpl() {
		super();
	}

	@Override
	public List<Curso> buscarTodos() {
		return dao.buscaTodos();
	}

}
