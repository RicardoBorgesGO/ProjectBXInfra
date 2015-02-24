package com.upschool.dao.impl;

import org.springframework.stereotype.Repository;

import com.upschool.dao.IUsuarioDAO;
import com.upschool.entity.Usuario;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements
		IUsuarioDAO {

	@Override
	public Usuario realizarLogin(Usuario usuario) {
		return (Usuario) getEntityManager().createQuery(
				"SELECT e FROM " + Usuario.class + " e").getSingleResult();
	}

}
