package GuessTheMovie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuessTheMovie {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("movies.txt");

		Scanner s = new Scanner(file);

		Scanner scn = new Scanner(System.in);

		String[] arr = new String[50];
		int count = 0;
		while (s.hasNextLine()) {
			arr[count] = s.nextLine();
			count++;
		}

		int rand = (int) (Math.random() * 10);
		boolean ff = false;
		String movie = arr[rand];
		int guesses = 10;
		String arr2[] = new String[movie.length()];

		String movieName[] = movie.split("");
		boolean flag = false;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = "_";
		}
		int right = 0;
		int wrong = 0;
		String ch;
		for (int i = guesses; i > 0;) {

			System.out.println("Guess The movie Name " + " You have " + i + " guesses left");
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j] + ",");
			}
			System.out.println();
			System.out.println("Please Guess the character");
			System.out.println("You have  guessed " + wrong + " wrong chracters");
			ch = scn.next();

			for (int j = 0; j < movieName.length; j++) {
				if (movieName[j].equals(ch)) {
					arr2[j] = ch;
					flag = true;
					right++;
				}
			}

			if (flag) {
				flag = false;
			} else {
				wrong++;
				i--;
				guesses--;
			}

			if (right == movie.length()) {
				break;
			}

		}

		if (guesses > 0) {
			System.out.println("You Won");
		} else {
			System.out.println("You Lost");
			System.out.println("The Movie name is " + " " + movie);
		}

	}

}
