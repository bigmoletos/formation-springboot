package fr.wcs.wildemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.SecurityExpressionHandler;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.expressionHandler(this.webExpressionHandler())
				.antMatchers("/public/**", "/webjars/**", "/css/**").permitAll()
				.anyRequest().authenticated()
				.and().formLogin()
				.loginPage("/login")
				.permitAll()
				.and().logout().permitAll();
	}
	
	@Bean
	public RoleHierarchyImpl roleHierarchy() {
		RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
		roleHierarchy
				.setHierarchy("ROLE_ADMIN > ROLE_USER");
		return roleHierarchy;
	}

	private SecurityExpressionHandler<FilterInvocation> webExpressionHandler() {
		DefaultWebSecurityExpressionHandler defaultWebSecurityExpressionHandler = new DefaultWebSecurityExpressionHandler();
		defaultWebSecurityExpressionHandler
				.setRoleHierarchy(this.roleHierarchy());
		return defaultWebSecurityExpressionHandler;
	}
}
