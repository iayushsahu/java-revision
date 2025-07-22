import java.util.Scanner;

public class findCharacterCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character: ");
		char input = sc.next().charAt(0);

		int result = checkCharacter(input);
		System.out.println(result);

		sc.close();
	}

	public static int checkCharacter(char ch) {
		if (Character.isUpperCase(ch)) {
			return 1;
		} else if (Character.isLowerCase(ch)) {
			return 0;
		} else {
			return -1;
		}
	}
}