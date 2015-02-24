package com.upschool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upschool.dao.IUsuarioDAO;
import com.upschool.entity.Usuario;
import com.upschool.service.IUsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDAO dao;

	@Override
	public Usuario realizarLogin(Usuario usuario) {
		return dao.realizarLogin(usuario);
	}

}
