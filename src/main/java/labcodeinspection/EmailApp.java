package labcodeinspection;

import java.util.Scanner;

@SuppressWarnings("PMD.SystemPrintln")
public final class EmailApp {

	private EmailApp() {
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = scanner.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = scanner.nextInt();
		scanner.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
