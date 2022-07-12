
public class Preson {
	
	protected String lastName;
	protected String firstName;
	protected String phone;
	
	
	public Preson(String lastName, String firstName, String phone) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Last Name: " + lastName + "\tFirst Name: " + firstName + "\tPhone: " + phone;
	}
	
	
	
	

}
