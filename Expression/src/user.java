
public class user {

	private String fName;
	private address add;
	public String getAdd() {
		String address;
		address=add.getStreet();
		address+=", "+add.getCity();

		address+=", "+add.getState();

		address+=", "+add.getZip();

		return address;
	}

	public void setAdd(address add) {
		this.add = add;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String lName;

	private String email;
	
	
	public user(String fName,String lName,String email)
	{
		this.fName=fName;
		this.lName=lName;
		this.email=email;
	}
	public user()
	{}
	
}
