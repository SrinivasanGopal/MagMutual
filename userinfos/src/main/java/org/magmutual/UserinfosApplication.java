package org.magmutual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserinfosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserinfosApplication.class, args);
	}

	/*
	 * @Bean public ServletRegistrationBean h2servletRegistration() {
	 * ServletRegistrationBean registration = new ServletRegistrationBean(new
	 * WebServlet()); registration.addUrlMappings("/console/*"); return
	 * registration; }
	 */
}
