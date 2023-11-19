package by.pvt.core.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class MVCInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
          MVCConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
