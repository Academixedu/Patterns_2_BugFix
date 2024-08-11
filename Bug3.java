public class Bug3 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = i; k <=rows; k--) {
                System.out.print(k + " ");
            }
            System.out.println(); 
          // Find and Fix the Bug
        // Output
        //  5 4 3 2 1 
        //   4 3 2 1  
        //    3 2 1   
        //     2 1    
        //      1     
        }
    }
}
