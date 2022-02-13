import java.util.Random;

public class MaxNumber {

    public static void main(String[] args) {
        Random randGen = new Random();

        int num1, num2, num3, greatestNum;

        num1 = randGen.nextInt(101);
        num2 = randGen.nextInt(101);
        num3 = randGen.nextInt(101);

        System.out.println("The generated random numbers: " + num1 + ", " + num2 + ", " + num3);
        greatestNum = num1;

        if ( num1 > num2 && num1 > num3 )  { greatestNum = num1; }

        else if ( num2 > num1 && num2 > num3 ) { greatestNum = num2; }

        else if (num3 > num2 && num3 > num1) { greatestNum = num3; }

        System.out.println("The greatest number: " + greatestNum);

     }

    }
    

