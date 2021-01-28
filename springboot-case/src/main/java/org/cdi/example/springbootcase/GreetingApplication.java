package org.cdi.example.springbootcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class GreetingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(GreetingApplication.class, args);
		displayAllBeans();
	}

	public static void displayAllBeans() {
		final String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		final AtomicInteger counter = new AtomicInteger();
		final String SPACE = " ";

		Arrays.stream(allBeanNames)
				.map(beanName -> new StringBuilder()
						.append(counter.getAndIncrement())
						.append(SPACE)
						.append(beanName)
						.toString())
				.forEach(System.out::println);
	}

}
