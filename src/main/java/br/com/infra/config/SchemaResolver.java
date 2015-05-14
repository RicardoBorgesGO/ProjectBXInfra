package br.com.infra.config;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import br.com.infra.commons.entity.Usuario;
import br.com.infra.service.ITenantService;
import br.com.infra.service.IUsuarioService;
import br.com.infra.service.impl.TenantServiceImpl;

@Component
public class SchemaResolver {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private ITenantService tenantService;
	
	@Autowired
	private ApplicationContext appContext;
	
	protected String resolveTenant() {
//		LOGGER.debug("Checking tenant from ThreadLocal.. ");
		String tenant = TenantThreadLocal.tenantThreadLocal.get();
//		LOGGER.debug("ThreadLocal tenant - " + tenant);

		if (tenant != null)
			return tenant;

		final ApplicationContext applicationContext = SpringUtils.getSpringContext();
		
		String tenantSchema = null;
		ITenantService tenantService = null;
		MultiTenancyUtils multiTenancyUtils = null;
		
		if (null == applicationContext) {
//			LOGGER.error("Spring application context is null");
			throw new IllegalStateException("Spring application context is null");
		}
		
//		tenantService = applicationContext.getBean(TenantServiceImpl.class);
		multiTenancyUtils = applicationContext.getBean(MultiTenancyUtils.class);
		
//		try {
//			tenantService.getTenantSchemaName();
//		} catch (final BeanCreationException e) {
			tenantSchema = multiTenancyUtils.getDefaultSchema();
//			LOGGER.info("Applicatino Startup, Request not initialised yet. Default schema is used {}", tenantSchema);
			
			return tenantSchema;
//		}
		
//		tenantSchema = tenantService.getTenantSchemaName();
//		LOGGER.debug("Tenant Schema is {}", tenantSchema);
		
		//TODO Implementar estratégia de trocar de tenant
//		tenantSchema = "public";
		
//		usuarioService.realizarLogin(new Usuario("ricardoborges", "teste"));
		
//		return tenantSchema;
	}

	public IUsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
}
