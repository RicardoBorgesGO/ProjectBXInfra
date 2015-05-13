package br.com.infra.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import br.com.infra.config.SpringUtils;
import br.com.infra.service.ITenantService;

@Component
@Path("/tenancy")
public class TenancyRest extends ServicoRest {

	@Autowired
	private ITenantService tenantService;

	@GET
	@Path("/getTenancy")
	@Produces(MediaType.APPLICATION_JSON)
	public String getColaboradores() {

//		final HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
//		final String path = request.getServletPath();
		
//		final ApplicationContext applicationContext = SpringUtils.getSpringContext();
		
//		if (null == applicationContext) {
//			LOGGER.error("Application Context is null");
//			throw new IllegalStateException("Application Context is null");
//		}
//		tenantService = applicationContext.getBean(ITenantService.class);
		
		if (null == tenantService) {
//			LOGGER.error("Tenant Service is null");
			throw new IllegalStateException("Tenant Service is null");
		}
		
		tenantService.setTenantSchemaName("/tenancy/getTenancy");

		return "Teste";
	}
}
