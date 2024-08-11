public class Bug2 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(j + " ");
            }
          // Output
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
        }
    }
}
