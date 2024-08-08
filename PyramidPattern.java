public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
