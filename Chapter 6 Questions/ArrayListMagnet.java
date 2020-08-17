package arraylistmagnet;

import java.util.*;

/**
 *
 * @author SamyB
 */

/*

Can you reconstruct the code snippets to make a working Java program that produces the output
listed below? NOTE: To do this exercise, you need one NEW piece of info—if you look in the API for
ArrayList, you’ll find a second add method that takes two arguments:

add(int index, Object o)

*/

public class ArrayListMagnet {

    /*  OUTPUT:
        
    zero one two three
    zero one three four
    zero one three four 4.2
    zero one three four 4.2
    
     */
    public static void printAL(ArrayList<String> al) {

        for (String element : al) {
            System.out.print(element + " ");

        }

        System.out.println(" ");

    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);

        if (a.contains("three")) {
            a.add("four");
        }

        a.remove(2);
        printAL(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }

        printAL(a);

        if (a.contains("two")) {
            a.add("2.2");
        }

        printAL(a);

    }

}
