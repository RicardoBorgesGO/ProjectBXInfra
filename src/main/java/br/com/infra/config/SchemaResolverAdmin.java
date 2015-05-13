package br.com.infra.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchemaResolverAdmin extends SchemaResolver implements CurrentTenantIdentifierResolver {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SchemaResolverAdmin.class);

    @Override
    public String resolveCurrentTenantIdentifier() {
        
        String tenantResoloved = resolveTenant();
        
        LOGGER.debug("Tenant Schema resolved by SchemaResolverAdmin " + tenantResoloved);

        return tenantResoloved;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return false;
    }
}