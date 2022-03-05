import java.util.Scanner;

public class lab423 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int sum = 0;
		double avg = 0;
		int counter = 0;
		int userInput = 0;

		userInput = scnr.nextInt();
		int max = userInput;
		int min = userInput;

		// this works for one but all

		// this condition is redundant to the one of while-loop
		// if ((userInput <= 0)) {
		// sum = 0;
		// avg = 0;
		// }

		// else {
		while (userInput >= 0) {

			// while (userInput < min) {
			if (userInput < min) {
				min = userInput;
			}
			// while (userInput > max) {
			if (userInput > max) {
				max = userInput;
			}

			sum += userInput;
			counter = counter + 1;

			userInput = scnr.nextInt();
		}

		// sum = sum - max - min;

		if (counter < 3) {
			sum = 0;
			avg = 0;
		} else {
			sum = sum - max - min;
			avg = ((double) sum / (counter - 2));
		}

		// if (sum == 0) {
		// avg = (sum / (counter - 2));
		// }

		// else {
		// avg = ((double) sum / (counter - 2));
		// }
		// }

		// while (userInput >= 0) {

		// while (userInput < min) { min = userInput; }
		// while (userInput > max) { max = userInput; }

		// sum += userInput;
		// counter = counter + 1;

		// userInput = scnr.nextInt();
		// }

		// sum = sum - max - min;
		// if (sum == 0) {
		// avg = ( sum / (counter - 2));
		// }

		// else {
		// avg = ( (double) sum / (counter - 2));
		// }

		/* Type your code here. */

		// Use the below line to print the result
		System.out.printf("%d %.2f\n", sum, avg);
		scnr.close();
	}
}