import java.io.*;

class Sorting {
    public static void main(String args[]) throws IOException {
        String t;
        int n = args.length;
        int i, j;
        
        System.out.println("\nYou have entered " + n + " names: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
        
        // Bubble sort algorithm to sort the names
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    t = args[i];
                    args[i] = args[j];
                    args[j] = t;
                }
            }
        }
        
        System.out.println("\nSorted name list is: ");
        for (i = 0; i < n; i++) {
            System.out.println(args[i]);
        }
    }
}
