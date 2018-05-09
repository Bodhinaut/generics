
/**
 * Kyle M. Shive
 * zyLab 006
 * 10/10/2017
 * Using Generics and Sorting 
 * CS 150-001
 */
public class Main {
   public static void main(String[] args) {
       Integer[] intArray    = {10, 01, 6, 4, 9, 5, 2, 8, 3, 7};
       Character[] charArray = {'a', 'd', 'g', 'c', 'j', 'f', 'e', 'h', 'i', 'b'};
       String[] stringArray  = {"aa", "dd", "gg", "cc", "jj", "ff", "ee", "hh", "ii", "bb"};
       
       System.out.printf("%s","Original arrays:");
       System.out.printf("%n%20s","Integer array: "); 
       displayArray("Integer", intArray);
       System.out.printf("%20s","Character array: ");
       displayArray("Character", charArray);
       System.out.printf("%20s","String array: ");
       displayArray("String", stringArray );
       
       Algorithms algo = new Algorithms();
       System.out.println();
       System.out.printf("%22s","Smallest int:  " + algo.getSmallestElement(intArray) );
       System.out.printf("%n%22s","Largest int: " + algo.getLargestElement(intArray) );
       System.out.println();
       System.out.printf("%n%22s","Smallest char:  " + algo.getSmallestElement(charArray) );
       System.out.printf("%n%22s"," Largest char:  " + algo.getLargestElement(charArray) );
       System.out.println();
       System.out.printf("%n%22s","Smallest string: " + algo.getSmallestElement(stringArray) );
       System.out.printf("%n%22s"," Largest string: " + algo.getLargestElement(stringArray) );
       System.out.println();
       System.out.printf("%n%s","Sorted Arrays:");
       algo.sort(intArray);
       System.out.printf("%n%20s","Integer array: "); 
       displayArray("Integer", intArray);
       algo.sort(charArray);
       System.out.printf("%20s","Character array: "); 
       displayArray("Character", charArray);
       algo.sort(stringArray);
       System.out.printf("%20s","String array: "); 
       displayArray("String", stringArray);
       //displayArray(String.format("%20s", "Integer array:"), intArray );
   }// end main mehtod
   
   public static <E> void displayArray(String label, E[] list) {
       for (E element : list) {
            if      (element instanceof Integer  ) {
                 System.out.printf("%-2s", element + " "); 
          } else if (element instanceof String   ) { 
                 System.out.printf("%-3s", element); 
          } else if (element instanceof Character) {
                 System.out.printf("%-2s", element );
          }
       }// end forEach
       System.out.println();
   }// end display method 
   
}// end main class 
