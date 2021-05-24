package bootcamp.exercicio2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] testeInteger = {1,2,3,4,5,6};
        String[] testeString = {"Amanda","Zuleide","Caio","Beatriz"};


        Comparator cInteger = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Comparator cString = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Sorter sorter;
        try{
            sorter = MyFactory.getInstance("sorter");
        } catch (Exception e) {
            System.out.println("Classe não encontrada");
           return;
        }


        System.out.println("COMPARAÇÃO DE INTEGER");
        sorter.sort(testeInteger, cInteger);
        System.out.println(Arrays.asList(testeInteger));

        System.out.println("\nCOMPARAÇÃO DE STRING");
        sorter.sort(testeString, cString);
        System.out.println(Arrays.asList(testeString));

        Time time = new Time();

        double timers = 0;
        Integer[] bigArray = new Integer[5000];
        for (int x = 0; x < 100; x++){
            bigArray = new Integer[5000];
            for (int i = 5000; i > 0; i--){
                bigArray[5000-i] = (int) (Math.random()*1000);
            }

            time.start();
            sorter.sort(bigArray,cInteger);
            time.stop();
            timers += time.elapsedTime();
        }

        System.out.println(timers/100);

        // Apos os testes, vimos que QuickSort >= HeapSort >= QuicSort



    }
}
