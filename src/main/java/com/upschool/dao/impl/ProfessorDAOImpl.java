package com.upschool.dao.impl;

import org.springframework.stereotype.Repository;

import com.upschool.dao.IProfessorDAO;
import com.upschool.entity.Professor;

@Repository
public class ProfessorDAOImpl extends GenericDAOImpl<Professor> implements
		IProfessorDAO {

}
