package br.com.infra.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.infra.commons.entity.Usuario;
import br.com.infra.dao.IUsuarioDAO;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements
		IUsuarioDAO {

	@Override
	public Usuario realizarLogin(Usuario usuario) {
		return (Usuario) getEntityManager().createQuery(
				"SELECT e FROM Usuario e").getSingleResult();
	}

}
