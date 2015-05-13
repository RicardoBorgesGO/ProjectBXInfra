//package br.com.infra.config;
//
//import javax.servlet.ServletRequestEvent;
//import javax.servlet.ServletRequestListener;
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.ApplicationContext;
//
//import br.com.infra.service.ITenantService;
//
//public class TenantRequestListener implements ServletRequestListener {
//	
//	private static final Logger LOGGER = LoggerFactory
//			.getLogger(TenantRequestListener.class);
//
//	@Override
//	public void requestDestroyed(final ServletRequestEvent sre) {
//	}
//
//	@Override
//	public void requestInitialized(final ServletRequestEvent servletRequestEvent) {
//
//		LOGGER.debug("Initiating TenantRequestListener");
//		final HttpServletRequest request = (HttpServletRequest) servletRequestEvent
//				.getServletRequest();
//		final String path = request.getServletPath();
//		LOGGER.debug("Request URL Path is {}", path);
//		final ApplicationContext applicationContext = SpringUtils
//				.getSpringContext();
//		ITenantService tenantService = null;
//		if (null == applicationContext) {
//			LOGGER.error("Application Context is null");
//			throw new IllegalStateException("Application Context is null");
//		}
//		tenantService = applicationContext.getBean(ITenantService.class);
//		if (null == tenantService) {
//			LOGGER.error("Tenant Service is null");
//			throw new IllegalStateException("Tenant Service is null");
//		}
//		tenantService.setTenantSchemaName(path);
//	}
//
//}
