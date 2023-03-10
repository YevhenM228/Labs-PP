package org.example.taxes;

import java.util.Comparator;

class SortAsc implements Comparator<Income> {
    @Override
    public int compare(Income o1, Income o2) {
        return (int)(o1.sizeOfTax - o2.sizeOfTax);
    }
}