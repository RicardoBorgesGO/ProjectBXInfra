package com.upschool.service;

import java.util.List;

import com.upschool.entity.Colaborador;

public interface IColaboradorService {

	/**
	 * Busca todos os colaboradores
	 *
	 * @return
	 */
	public List<Colaborador> buscarTodosColaboradores();

	/**
	 * Salva colaborador
	 *
	 * @param colaborador
	 */
	public void salvarColaborador(Colaborador colaborador);

	/**
	 * Atualiza colaborador
	 * 
	 * @param colaborador
	 */
	public void atualizarColaborador(Colaborador colaborador);

	/**
	 * Exclui colaborador
	 * 
	 * @param colaborador
	 */
	public void excluirColaborador(Colaborador colaborador);
}
