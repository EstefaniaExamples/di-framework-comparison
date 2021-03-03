package org.cdi.example;

import org.cdi.example.sort.InsertionSort;
import org.cdi.example.sort.SortingServices;

public abstract class Account {
    // Default sorting method for transactions etc.
    // We've violated the Single Responsibility Principle. Sorting is not the job of a bank account — a bank account should do only bank account things.

    // We added reference to interface
    SortingServices sortService = new InsertionSort();

    // We can change sorting algorithm at run-time
    // We do not need to change our code anymore for sorting algorithm
    public void setSortingAlgorithm(final SortingServices sort) {
        this.sortService = sort;
    }

    // Default sorting method for transactions etc.
    public void sort() {
        // Default sorting still Insertion
        sortService.sort();
        //System.out.println("Insertion Sort");
    }
}
