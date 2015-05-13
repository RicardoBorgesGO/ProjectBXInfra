package br.com.infra.config;

public class TenantThreadLocal {
	public static final ThreadLocal<String> tenantThreadLocal = new ThreadLocal<String>();
}
