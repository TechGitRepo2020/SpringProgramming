package com.nt.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMVCAppConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
			return new Class[] {RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
			return new Class[] {WebMVCAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

}
