package bootcamp.exercicio2;

import bootcamp.exercicio1.Precedente;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public void sort(Object[] arr, Comparator c) {
        bubbleSort(arr, c);
    }

    public void bubbleSort(Object arr[], Comparator c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (c.compare(arr[j + 1], arr[j]) < 0) {
                    Object temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
