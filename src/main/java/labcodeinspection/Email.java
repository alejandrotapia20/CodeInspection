package labcodeinspection;

import java.util.Locale;

@SuppressWarnings("PMD.SystemPrintln")
public class Email {

	private final String firstName;
	private final String lastName;
	private String password;
	private String department;
	private final int defaultPasswordLength = 8;
	private String email;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "unknown";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultPasswordLength);
		this.email = this.firstName.toLowerCase(Locale.ROOT) + this.lastName.toLowerCase(Locale.ROOT) + "@"
				+ this.department + ".espol.edu.ec";
	}
}
