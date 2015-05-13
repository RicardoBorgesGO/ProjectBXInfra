package br.com.infra.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;

import br.com.infra.service.ITenantService;
import br.com.infra.service.impl.TenantServiceImpl;

public class SchemaResolver {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SchemaResolver.class);
	
	protected String resolveTenant() {
//		LOGGER.debug("Checking tenant from ThreadLocal.. ");
//		String tenant = TenantThreadLocal.tenantThreadLocal.get();
//		LOGGER.debug("ThreadLocal tenant - " + tenant);
//
//		if (tenant != null)
//			return tenant;
//
//		final ApplicationContext applicationContext = SpringUtils.getSpringContext();
//		
		String tenantSchema = null;
//		ITenantService tenantService = null;
//		MultiTenancyUtils multiTenancyUtils = null;
//		
//		if (null == applicationContext) {
//			LOGGER.error("Spring application context is null");
//			throw new IllegalStateException("Spring application context is null");
//		}
//		
//		tenantService = applicationContext.getBean(TenantServiceImpl.class);
//		multiTenancyUtils = applicationContext.getBean(MultiTenancyUtils.class);
//		
//		try {
//			tenantService.getTenantSchemaName();
//		} catch (final BeanCreationException e) {
//			tenantSchema = multiTenancyUtils.getDefaultSchema();
//			LOGGER.info("Applicatino Startup, Request not initialised yet. Default schema is used {}", tenantSchema);
//			
//			return tenantSchema;
//		}
//		
//		tenantSchema = tenantService.getTenantSchemaName();
//		LOGGER.debug("Tenant Schema is {}", tenantSchema);
		
		//TODO Implementar estratégia de trocar de tenant
		tenantSchema = "public";
		
		return tenantSchema;
	}
}
