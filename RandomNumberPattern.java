public class RandomNumberPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // Loop from 1 to 9
            for (int j = 1; j <= i; j++) { // Print each number 'i' times
                System.out.print(i);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
      
