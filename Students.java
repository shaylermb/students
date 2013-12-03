import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Students {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("class.csv");
		Scanner scan = new Scanner(file);
		System.out.println("1. Choose random group?");
		System.out.println("2. Random Student?");
		int number = scanner.nextInt();
		String[] names = scan.nextLine().split(",");
		Random r = new Random();
		int rand = r.nextInt(names.length);
		int rand2 = r.nextInt(names.length);
		if (number == 1) {
			System.out.println(names[rand] + " and " + names[rand2]);
		}
		if (number == 2){
			System.out.println(names[rand]);
		}	
		
	}
}