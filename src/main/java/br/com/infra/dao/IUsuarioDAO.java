package br.com.infra.dao;

import br.com.infra.commons.entity.Usuario;

public interface IUsuarioDAO extends IGenericDAO<Usuario> {

	Usuario realizarLogin(Usuario usuario);

}
