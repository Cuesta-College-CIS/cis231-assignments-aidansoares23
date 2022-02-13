import java.util.Random;

public class AscendingNumers {

    public static void main(String[] args) {
        Random randGen = new Random();
        int num1, num2, num3;

        num1 = randGen.nextInt(101);
        num2 = randGen.nextInt(101);
        num3 = randGen.nextInt(101);

        System.out.println("The generated random numbers: " + num1 + ", " + num2 + ", " + num3);

        if ( (num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.println("Sorted order: " + num1 + " " + num2 + " " + num3);
            }
            else {
                System.out.println("Sorted order: " + num1 + " " + num3 + " " + num2);
            }
        }

        else if ( (num2 < num3) && (num2 < num1)) {
            if (num3 < num1) {
                System.out.println("Sorted order: " + num2 + " " + num3 + " " + num1);
            }
            else {
                System.out.println("Sorted order: " + num2 + " " + num1 + " " + num3);
            }
        }

        else if ( (num3 < num1) && (num3 < num2) ) {
            if (num2 < num1) {
                System.out.println("Sorted order: " + num3 + " " + num2 + " " + num1);
            }
            else {
                System.out.println("Sorted order: " + num3 + " " + num1 + " " + num2);
            }
        }
    }
    
}
