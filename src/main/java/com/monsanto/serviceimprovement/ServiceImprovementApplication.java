package com.monsanto.serviceimprovement;

import com.monsanto.serviceimprovement.common.EmailService;
import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.faces.webapp.FacesServlet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;


@SpringBootApplication
@EnableAsync
public class ServiceImprovementApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceImprovementApplication.class);

	public static void main(String[] args) {

		LOGGER.info("ServiceImprovement application is starting - info");
		SpringApplication.run(ServiceImprovementApplication.class, args);

		EmailService email = new EmailService();
		try {
			CompletableFuture<Boolean> emailResult = email.sendMail();
			LOGGER.info("Email sent status "+emailResult.get());
		} catch (Exception e) {
			LOGGER.error("Email could not be sent "+e.getMessage());
		}
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		return new ServletRegistrationBean(servlet, "*.ui");
	}

	@Bean
	public FilterRegistrationBean rewriteFilter() {
		FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
		rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
				DispatcherType.ASYNC, DispatcherType.ERROR));
		rwFilter.addUrlPatterns("");
		return rwFilter;
	}

	@Bean
	public FilterRegistrationBean FileUploadFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new org.primefaces.webapp.filter.FileUploadFilter());
		registration.setName("PrimeFaces FileUpload Filter");
		return registration;
	}

	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(3);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("AsyncThread-");
		executor.initialize();
		return executor;
	}

	@Bean
	public ServletContextInitializer initializer() {
		return new ServletContextInitializer() {
			@Override
			public void onStartup(ServletContext servletContext)
					throws ServletException {
				//servletContext.setInitParameter("primefaces.THEME", "bluesky");
				servletContext.setInitParameter(
						"javax.faces.FACELETS_SKIP_COMMENTS", "true");
				servletContext.setInitParameter(
						"com.sun.faces.expressionFactory",
						"com.sun.el.ExpressionFactoryImpl");
				servletContext.setInitParameter("primefaces.UPLOADER",
						"commons");
			}
		};
	}
}
