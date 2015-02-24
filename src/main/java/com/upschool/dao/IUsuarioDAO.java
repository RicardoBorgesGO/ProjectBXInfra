package com.upschool.dao;

import com.upschool.entity.Usuario;

public interface IUsuarioDAO extends IGenericDAO<Usuario> {

	Usuario realizarLogin(Usuario usuario);

}
