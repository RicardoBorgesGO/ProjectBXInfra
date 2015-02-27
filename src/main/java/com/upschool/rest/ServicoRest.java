package com.upschool.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.upschool.util.MensagemRespostaServico;

public class ServicoRest {

	protected Response gerarMensagemDeRetorno(MensagemRespostaServico mensagem) {
		return Response.status(Status.OK).entity(mensagem).build();
	}

	protected Response gerarMensagemDeErro(Exception e) {
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
	}
}
