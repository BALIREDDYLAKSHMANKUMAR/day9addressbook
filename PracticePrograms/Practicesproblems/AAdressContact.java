package PracticePrograms.Practicesproblems;

public class AAdressContact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String emailID;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
@Override
	public String toString() {
		return "Contact[address ="+address+",city ="+city+",emailID="+emailID+",firstName="+firstName+",lastName="+lastName+",phoneNumber="+phoneNumber+",state="+state+",zipcode="+zipcode+"]";
}
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	
	
	AAdressContact( String firstName, String lastName, String address, String city, String state, String zipcode, String phoneNumber, String emailID) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.phoneNumber = phoneNumber;
	this.emailID = emailID;
	
	}
	
	void displayContact() {
		System.out.println("FirstName:"+getFirstName());
		System.out.println("LastName:"+getLastName());
		System.out.println("Address:"+getAddress());
		System.out.println("city"+getCity());
		System.out.println("state:"+getState());
		System.out.println("PhoneNumber"+getPhoneNumber());
		System.out.println("Zipcode:"+getZipcode());
		System.out.println("emaiID"+getEmailID());
		}
	}
	


