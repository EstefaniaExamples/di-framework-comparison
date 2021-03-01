package com.cdi.example.springbootcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

// https://dzone.com/articles/compile-and-run-time-dependency

@SpringBootApplication(proxyBeanMethods = false)
public class AccountApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(AccountApplication.class, args);
		displayAllBeans();

		runAccounts();
	}

	private static void runAccounts() {
		// If a client creates a Saving account instance, we know it will always use Bubble Sort. It is already set in stone.
		// Or, if a client creates a Debit object, it will always call an Insertion sort. It is not possible to
		// change sorting behavior without changing code — this is a compile-time dependency.

		// We have a compile-time dependency due to inheritance. Therefore, we have to modify the existing code to accommodate the change request above.

		final Account accSaving = new Saving();
		accSaving.sort(); //Prints: Bubble Sort
		final Account accDebit = new Debit();
		accDebit.sort(); //Prints: Insertion Sort
		final Account accDividend = new Dividend();
		accDividend.sort(); //Prints: Bubble Sort

		// We have just used the Strategy Pattern to break a compile-time dependency, and our code does not need to be changed
		// anymore to use a different sorting algorithm. Our code can be enhanced independently; a new sorting algorithm can be
		// added without disturbing your code.

		// Compile-time dependencies require code to be changed, but run-time dependencies do not.
		// Everyone is happy. Breaking dependency, reducing complexity, more flexible code.
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
