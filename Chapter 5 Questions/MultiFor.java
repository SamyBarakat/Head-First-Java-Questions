package MultiFor;

/**
 *
 * @author SamyB
 */
public class MultiFor {


    public static void main(String[] args) {

        /*
        
        x = x + 3; --> 54 6
        
        x = x + 6; --> 60 10
        
        x = x + 2; --> 45 6
        
        x++; --> 36 6
        
        x--; --> 18 6
        
        x = x + 0; --> 
        
         
        
        
        
         */
        int x = 0;
        int y = 30;

        for (int outer = 0; outer < 3; outer++) { // how many times we run each outer value
            for (int inner = 4; inner > 1; inner--) { // what it does and how many times we repeat the result

                
                x = x + 0; // 6, 6 + 6 + 3 = 15 (1), 24 (2), 
                y = y - 2; // 28, 26 (1), 24
                if (x == 6) {
                    break;
                }
               

                x = x + 3;

            }

            y = y - 2;
        }
        System.out.println(x + " " + y);

        // outer run 3 times, inner run 7 times
        
        /*
        
        1 - x = 3, 2 - x = 6, 3 - x = 6, break out
        1 - y = 28, 2 - y = 26, 3 - y = 24, break out
        
        outer:
        1 - y = 22, 2 - y = 20, y = 18
        
        
        
        
        
        
        
        
        
            
        
        




         */
    }

}
