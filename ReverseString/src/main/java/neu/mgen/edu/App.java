package neu.mgen.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
 
    {
        // Part 1 Array 
        int[] x = {10, 20, 30, 40, 50};
        int[] y = {5, 15, 25, 35, 45};
        int[] z = new int[5];

        // Calculate the max of respective elements from arrays x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
    

        // Print the arrays
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));

         // Part 2 ArrayList
         List<String> names = new ArrayList<>(Arrays.asList("Yashvi", "Diya", "Goku", "Raj", "Ron"));
         List<String> switchedNames = new ArrayList<>();
 
         // Switch the first and last letters in each name
         for (String name : names) {
             char firstLetter = name.charAt(0);
             char lastLetter = name.charAt(name.length() - 1);
             firstLetter=Character.toLowerCase(firstLetter);
             lastLetter=Character.toUpperCase(lastLetter);
             String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
             switchedNames.add(switchedName);
         }
 
         System.out.println("\nPart 2 - ArrayList");
         System.out.println("Names = " + names);
         System.out.println("Names (switched) = " + switchedNames);
     }
    }
 
       


