package br.com.infra.service.impl;

import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import br.com.infra.service.ITenantService;

@Service
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@PropertySource({ "classpath:persistence-postgres.properties" })
@Transactional
public class TenantServiceImpl implements ITenantService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TenantServiceImpl.class);

	private String tenantName = null;

//	@Resource(name = "multitenancyConfiguration")
	@Autowired
	private Properties properties;

	@Override
	public String getTenantSchemaName() {
		return tenantName;
	}

	@Override
    public void setTenantSchemaName(final String path) {
        LOGGER.debug("Request URL path is {}", path);
        
        if (StringUtils.isBlank(path)) {
            LOGGER.error("Request URL is blank");
            throw new IllegalArgumentException("Request URL is blank");
        }
        String tenantKey = null;
        String tenant = null;
        
        System.err.println(path);
        tenant = "client1";
//        if (login match with criteria) {
//            tenantKey = "tenant1";
//            tenant = properties.getProperty(tenantKey);
//        } else if {
//        	System.err.println("Teste");
////            Keep on adding more patterns if required to distinguish between 
//        } else {
//            LOGGER.warn("Tenant is not identified in Request URL path");
//            throw new IllegalStateException("Tenant is not identified in Request URL path");
//        }

//        if (StringUtils.isBlank(tenant)) {
//            LOGGER.error("No tenant schema exists in property file for key with value {}", tenantKey);
//            throw new IllegalStateException("No tenant schema exists in property file for key with value" + tenantKey);
//        }
        // I have not talked about it this this is to segregate  log file
        MDC.put("tenant", tenantKey);
        LOGGER.debug("Tenant for demo request is {}", tenantKey);
        
        tenantName = tenant;
    }
}
