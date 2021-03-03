package org.cdi.example;

import org.cdi.example.sort.BubbleSort;

public class Saving extends Account {
    // Saving accounts likes to use Bubble sort for sorting needs.
    public Saving() {
        //Default sorting for Saving Account
        sortService = new BubbleSort();
    }

    @Override
    public void sort() {
        //Just call a sort method
        sortService.sort();
        //System.out.println("Bubble Sort");
    }
}
