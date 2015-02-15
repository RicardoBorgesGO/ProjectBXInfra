package com.upschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IProfessorDAO;
import com.upschool.entity.Professor;
import com.upschool.service.IProfessorService;

@Service
@Transactional
public class ProfessorServiceImpl implements IProfessorService {

	@Autowired
	private IProfessorDAO dao;

	public ProfessorServiceImpl() {
		super();
	}

	@Override
	public List<Professor> buscarTodos() {
		return dao.buscaTodos();
	}

}
