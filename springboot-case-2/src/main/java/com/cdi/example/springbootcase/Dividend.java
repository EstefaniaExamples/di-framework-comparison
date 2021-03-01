package com.cdi.example.springbootcase;

import com.cdi.example.springbootcase.sort.BubbleSort;
import com.cdi.example.springbootcase.sort.SortingServices;

public class Dividend  extends Account {
    // Saving accounts likes to use Bubble sort for sorting needs.

    // But a change request has just arrived wanting to use the Insertion sort algorithm for Dividend.
    // This is possible, but we need to change the code — again, a compile-time dependency.
    // As said before, you don't want anyone to change your existing code, including yourself!

    public Dividend() {
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
