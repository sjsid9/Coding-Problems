package ContactsQuiz;

public class ContactsManager {

	private Contact[] freinds = new Contact[500];
	private int freindsCount = 0;

	public static void main(String[] args) {

		ContactsManager contactsManager = new ContactsManager();
		contactsManager.addContact("Siddhant", "9999454431");
		contactsManager.addContact("Nikhil", "8006651242");
		System.out.println(contactsManager.searchContact("Siddhant"));
		System.out.println(contactsManager.searchContact("Nikhil"));
		System.out.println(contactsManager.searchContact("nikhil"));
	}

	public void addContact(String name, String phoneNumber) {

		this.freinds[this.freindsCount] = new Contact(name, phoneNumber);
		freindsCount++;

	}

	public String searchContact(String searchName) {

		for (int i = 0; i < freindsCount; i++) {

			if (freinds[i].getName().equals(searchName)) {
				return freinds[i].getPhoneNumber();
			}

		}
		return null;
	}

}
