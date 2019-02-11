package addressBook;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.utility.Utility;

interface manager {
	void save1(PersonDetails person, String addressBook) throws JsonMappingException, IOException;
	void add() throws JsonMappingException, IOException;
	void delete(String name, String addressBook) throws JsonMappingException, IOException;
	void sortByName(String bookName) throws JsonMappingException, IOException;
	void sortByZip(String bookName) throws JsonMappingException, IOException;
	void print(String bookName, String name) throws JsonMappingException, IOException;
}

class AddressBookManager implements manager {
	static ObjectMapper mapper = new ObjectMapper();
	static String firstName;
	static String lastName;
	static String bookName;

	// create new address book
	public static boolean createAddressBook(String name) throws IOException, Exception {
		// create file with user name
		File file = new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + name + ".json");

		// check file create or not
		boolean result = file.createNewFile();

		return result;

	}

	// add person in address book
	public static void addPersonInAddressBook(String addressBook, String firstName, String lastName)
			throws JsonMappingException, IOException {

		if (new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook)
				.exists() == false) {
			System.out.println("invalid address book");
			return;
		}

		PersonDetails person = new PersonDetails();
		Address address = new Address();
		PhoneNumber phone = new PhoneNumber();
		System.out.println("Enter street:");
		String street = Utility.getString();
		System.out.println("Enter city:");
		String city = Utility.getString();
		System.out.println("Enter State:");
		String state = Utility.getString();
		System.out.println("Enter zip");
		int zip = Utility.getInt();
		System.out.println("Enter mobile number:");
		long phoneNumber = Utility.getLong();
		phone.setMobileNumber(phoneNumber);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setPhoneNumber(phone);
		AddressBookManager manager = new AddressBookManager();
		manager.save1(person, addressBook);
	}

	// to edit person details
	public static void editPerson(String name, String addressBook) throws JsonMappingException, IOException {
		int count = 0;
		int tempCount = 0;
		String temp = "";
		int stop = 0;
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				tempCount = count;
			}
			count++;
		}
		while (stop != 2) {
			System.out.println("1. for edit first name");
			System.out.println("2. for edit last name");
			System.out.println("3. for edit address and phone number");
			count = Utility.getInt();
			switch (count) {
			case 1:
				System.out.println("Enter new first name :");
				firstName = Utility.getString();
				details.get(tempCount).setFirstName(name);
				break;
			case 2:
				System.out.println("Enter new last name :");
				lastName = Utility.getString();
				details.get(tempCount).setLastName(lastName);
				break;
			case 3:
				System.out.println("press \n 1. for edit street");
				System.out.println("2. for edit city");
				System.out.println("3. for edit state");
				System.out.println("4 . for edit zip code");
				System.out.println("5 . for edit phone number");
				int choice = Utility.getInt();
				if (choice == 1) {
					System.out.println("Enter street:");
					temp = Utility.getString();
					details.get(tempCount).getAddress().setStreet(temp);
				}
				if (choice == 2) {
					System.out.println("Enter city:");
					temp = Utility.getString();
					details.get(tempCount).getAddress().setCity(temp);

				}
				if (choice == 3) {
					System.out.println("Enter state:");
					temp = Utility.getString();
					details.get(tempCount).getAddress().setState(temp);

				}
				if (choice == 4) {
					System.out.println("Enter zip:");
					int zip = Utility.getInt();
					details.get(tempCount).getAddress().setZip(zip);
					;

				}
				if (choice == 5) {
					System.out.println("Enter mobile number:");
					Long phoneNumber = Utility.getLong();
					details.get(tempCount).getPhoneNumber().setMobileNumber(phoneNumber);

				}
			}
			System.out.println("for stop press 2. or for continue press any number");
			stop = Utility.getInt();
		}
		if (stop == 2) {
			mapper.writeValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
					details);
		}
	}

	// save details after entering all data into file
	public void save1(PersonDetails person, String addressBook) throws JsonMappingException, IOException {

		if (new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook)
				.length() == 0) {
			LinkedList<PersonDetails> newPerson = new LinkedList<>();
			newPerson.add(person);
			// System.out.println(newPerson);
			mapper.writeValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
					newPerson);
			if (new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook)
					.length() != 0) {
				System.out.println("data added successfully");
			} else {
				System.out.println("unsuccessful");
			}
		} else {
			long preFileLength = new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook).length();
			LinkedList<PersonDetails> multiple = mapper.readValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
					new TypeReference<LinkedList<PersonDetails>>() {
					});
			multiple.add(person);
			mapper.writeValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
					multiple);
			long afterWriteLength = new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook).length();
			if (preFileLength < afterWriteLength) {
				System.out.println("data added successfully");
			} else {
				System.out.println("data not fill in file");
			}
		}
	}

	public void add() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter person first name:");
		firstName = Utility.getString();
		System.out.println("Enter last name");
		lastName = Utility.getString();
		System.out.println("Enter address book name");
		bookName = Utility.getString();
		addPersonInAddressBook(bookName, firstName, lastName);
	}

	// delete person from address book
	public void delete(String name, String addressBook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		int count = 0;
		boolean result = true;
		// to remove the given person
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				details.remove(count);
				System.out.println("person successfully removed");
				mapper.writeValue(
						new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
						details);
			}
			count++;
		}
		// to check whether the person is removed or not
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				result = false;
			}
		}
		if (result == true) {
			System.out.println("person successfully remove");
		}
	}

	public void sortByName(String addressBook) throws JsonMappingException, IOException {

		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		LinkedList<String> name = new LinkedList<>();
		int count = 0;
		for (PersonDetails person : details) {
			name.add(person.getFirstName());

		}
		// string array to store named for sorting purpose
		String names[] = new String[name.size()];

		// loop for store linked list object in an array
		for (String value : name) {
			names[count] = value;
			count++;
		}
		Arrays.sort(names);

		System.out.println("sort by first name");

		// loop to print sorted data by name
		// count = 0;
		for (String s : names) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getFirstName().equals(s)) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}
	}

	public void sortByZip(String addressBook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		LinkedList<Integer> zip = new LinkedList<>();
		int count = 0;
		for (PersonDetails person : details) {
			zip.add(person.getAddress().getZip());

		}
		int zipArray[] = new int[zip.size()];
		for (int value : zip) {
			zipArray[count] = value;
			count++;
		}
		Arrays.sort(zipArray);

		System.out.println("sort by zip");
		// count = 0;

		for (int s : zipArray) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getAddress().getZip() == s) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}

	}

	// print person details
	public void print(String addressBook, String name) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				System.out.println(person);
			}
		}
	}

	// to see list of address book in folder
	public static File[] openFile() {
		File folder = new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/");
		return folder.listFiles();
	}

	public static void openAddressbook(String addressbook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/addressBook/" + addressbook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		System.out.println("" + addressbook);
		System.out.println(details);

	}

}
