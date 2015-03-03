package br.com.infra.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.infra.commons.entity.Usuario;
import br.com.infra.commons.util.MensagemRespostaServico;
import br.com.infra.service.IUsuarioService;

@Component
@Path("/usuario")
public class UsuarioRest extends ServicoRest {

	@Autowired
	private IUsuarioService usuarioService;

	@POST
	@Path("/realizarLogin")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response realizarLogin(final Usuario usuario) {
		try {
			Usuario usuarioCadastrado = usuarioService.realizarLogin(usuario);
			if (usuarioCadastrado == null) {
				return gerarMensagemDeRetorno(MensagemRespostaServico.ERRO_USUARIO_NAO_ENCONTRADO);
			}
		} catch (final Exception e) {
			e.printStackTrace();
			return gerarMensagemDeErro(e);
		}
		return gerarMensagemDeRetorno(MensagemRespostaServico.SUCESSO_LOGIN_REALIZADO);
	}

}