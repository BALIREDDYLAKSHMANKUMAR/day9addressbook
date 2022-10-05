package PracticePrograms.Practicesproblems;


import java.util.*;
public class AAdressBookCollection {
	HashMap<String,AAdressbook>AAdressbookSystem = new HashMap<String,AAdressbook>();
	Scanner s = new Scanner(System.in);
	void homeMenu() {
		while(true) {
			System.out.println("welcome to addressbooksystem: choose an option 1:open an addressbook 2:create an addressbook 3:delete an addressBook");
			int input = Integer.parseInt(s.nextLine());
			switch(input) {
			case 1:
				openAAdressbook();
				break;
			case 2:
				CreateAAdressbook();
				break;
			case 3:
				deleteAAdressbook();
				break;
			}
		}
	}
void openAAdressbook() {
	System.out.println("Give name for the addressbook to open:");
	String Searchkey = s.nextLine();
	AAdressbook a = AAdressbookSystem.get(Searchkey);
	if(a==null) {
		System.out.println("Address book does not exist");
	}
	else {
		System.out.println("opening Address book:"+Searchkey);
		a.accessAAdressbook(a, s);
	}
}
void CreateAAdressbook() {
	System.out.println("give name for the addressbook to create:");
	String name = s.nextLine();
	AAdressbook newAddressbook = new AAdressbook();
	newAddressbook.accessAAdressbook(newAddressbook,s);
	AAdressbookSystem.put(name, newAddressbook);
}
void deleteAAdressbook() {
	System.out.println("Give name for the addressbook to delete:");
	String name = s.nextLine();
	if((AAdressbookSystem.get(name))!=null) {
		if (AAdressbookSystem.remove(name)==null) {
			System.out.println("Addressbook does not exist");
		}else {
			AAdressbookSystem.remove(name);
			System.out.println("Create address book first!!");
		}
	}
}
}
