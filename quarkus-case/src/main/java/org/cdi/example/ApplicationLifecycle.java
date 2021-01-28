package org.cdi.example;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupContext;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import java.beans.beancontext.BeanContext;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class ApplicationLifecycle {
    private static final Logger LOGGER = Logger.getLogger(ApplicationLifecycle.class);

    @Inject
    private BeanManager beanManager;

    void onStart(@Observes StartupContext ev) {
        final String SPACE = " ";
        final AtomicInteger counter = new AtomicInteger();
        final Set<Bean<?>> beans = beanManager.getBeans(Object.class, new AnnotationLiteral<Any>() {});
        for (final Bean<?> bean : beans) {
            LOGGER.info(counter.getAndIncrement() + SPACE + bean.getName());
        }
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application is stopping...");
    }
}