package PracticePrograms.Practicesproblems;
import java.util.*;
public class AAdressbook {
	ArrayList<AAdressContact>arrli = new ArrayList<AAdressContact>();
	void addAAdressContact(Scanner s) {
		System.out.println("Enter First Name:");
		String firstName = s.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = s.nextLine();
		System.out.println("Enter Address:");
		String address = s.nextLine();
		System.out.println("Enter city:");
		String city = s.nextLine();
		System.out.println("Enter State:");
		String state = s.nextLine();
		System.out.println("Enter ZipCode:");
		String zipcode = s.nextLine();
		System.out.println("Enter phonenumber:");
		String phoneNumber = s.nextLine();
		System.out.println("Enter EmailID:");
		String emailID = s.nextLine();
		arrli.add(new AAdressContact(firstName,lastName,address,city,state,zipcode,phoneNumber,emailID));
		
	}
	void displayAAdressContact() {
		System.out.println(arrli);
	}
	void editAAdressContact(Scanner s) {
		System.out.println("Enter first Name of contact to search:");
		String Search = s.nextLine();
		AAdressContact matchedAAdressContact = null;
		for (int i=0; i<arrli.size(); i++) {
			AAdressContact AAdressContact = arrli.get(i);
			String currentName = AAdressContact.getFirstName();
			if(currentName.equals(Search)) {
				matchedAAdressContact = AAdressContact;
				break;
			}
			
		}
		System.out.println("Found"+matchedAAdressContact);
		if(matchedAAdressContact != null) {
			System.out.println("Select what filed to edit 1:firstname 2:lastname 3:address 4:city 5:state 6:zipcode 7:phonenumber 8:emailID");
			String change;
			int Choice = Integer.parseInt(s.nextLine());
			switch (Choice) {
			case 1:
				System.out.println("Give new firstname:");
				change = s.nextLine();
				matchedAAdressContact.setFirstName(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			
			case 2:
				System.out.println("Give new lastname:");
				change = s.nextLine();
				matchedAAdressContact.setLastName(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 3:
				System.out.println("Give new address:");
				change = s.nextLine();
				matchedAAdressContact.setAddress(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 4:
				System.out.println("Give new city:");
				change = s.nextLine();
				matchedAAdressContact.setCity(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 5:
				System.out.println("Give new state:");
				change = s.nextLine();
				matchedAAdressContact.setState(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 6:
				System.out.println("Give new zipcode:");
				change = s.nextLine();
				matchedAAdressContact.setZipcode(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 7:
				System.out.println("Give new phoneNumber:");
				change = s.nextLine();
				matchedAAdressContact.setPhoneNumber(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
			case 8:
				System.out.println("Give new emailID:");
				change = s.nextLine();
				matchedAAdressContact.setEmailID(change);
				System.out.println("updated Contact:"+matchedAAdressContact);
				break;
				
			
			
			}
			
		}
		
	}
	void deleteAAdressContact(Scanner s) {
		System.out.println("Enter first name of contact to delete:");
		String Search = s.nextLine();
		AAdressContact matchedAAdressContact = null;
		for ( int i=0; i<arrli.size(); i++) {
			AAdressContact AAdressContact = arrli.get(i);
			String currentName = AAdressContact.getFirstName();
			if (currentName.equals(Search)) {
				matchedAAdressContact = AAdressContact;
				break;
			}
		}
		arrli.remove(matchedAAdressContact);
		displayAAdressContact();
	}
	void addMultipleAAdressContact(Scanner s) {
		String input = "yes";
		while (input.equalsIgnoreCase("yes")) {
			addAAdressContact(s);
			System.out.println("Add more yes/no?");
			input = s.nextLine();
		}
	}
	void accessAAdressbook(AAdressbook a,Scanner s) {
		while(true) {
			System.out.println("welcome to address book program");
			System.out.println("Given choice 1:Create a Contact 2:Display Contact 3:Edit Contact 4:Delete Contact 5:AddMultipleContact 6:Goback");
			String str =s.nextLine();
			int Choice = Integer.parseInt(str);
			switch (Choice) {
			case 1:
				a.addAAdressContact(s);
				break;
			case 2:
				a.displayAAdressContact();
				break;
			case 3:
				a.editAAdressContact(s);
				break;
			case 4:
				a.deleteAAdressContact(s);
				break;
			case 5:
				a.addMultipleAAdressContact(s);
				break;
			case 6:
				return;
				
			}
		}
	}
	
	
	

}
