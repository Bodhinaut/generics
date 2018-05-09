/**
 * Kyle M. Shive
 * zyLab 006
 * 10/10/2017
 * Using Generics and Sorting 
 * CS 150-001
 */
public class Algorithms {
    
    public static <E extends Comparable <E>> void sort(E[] list) {
        // Iterate from 0 to -2 to swap the last two in index
        for (int topIndex = 0; topIndex <= list.length - 2; topIndex++) {
            // exchange the two elements at topIndex and minIndex. The 
            // minIndex is returned from the indexOfSmallestElement() method.
            swap(list, topIndex, indexOfSmallestElement(list, topIndex) );
        }// end for
    }// end sorting method
    
    private static <E extends Comparable<E> > int indexOfSmallestElement(E[] list, int startAt) {
        int minIndex = startAt;
        // Iterate from i+1 ti i-1
        for (int index = startAt + 1; index <= list.length - 1; index++) {
            minIndex = (list[index].compareTo(list[minIndex]) < 0 )? index : minIndex;
        }// end for 
        
        return minIndex;
    }// end indexOfSmallElem method  
   
    private static <E> void swap (E[] list, int topIndex, int minIndex) {
        E tmp = list[topIndex];
        list[topIndex] = list[minIndex];
        list[minIndex] = tmp;
    }// end swap method 
    
        public static <E extends Comparable<E> > E getSmallestElement(E[] list) {
        E min = list[0]; // set first value in array as current max
        for(int i = 1; i < list.length; i++) {
            if(list[i].compareTo(min) < 0 ) {
                min = list[i];
            }
        }// end for
        return min;
    }
    
    public static <E extends Comparable<E> > E getLargestElement(E[] list) {
        E max = list[0]; // set first value in array as current max
        for(int i = 1; i < list.length; i++) {
            if(list[i].compareTo(max) > 0 ) {
                max = list[i];
            }
        }// end for
        return max;
    }
    
    }// end getLarge method 