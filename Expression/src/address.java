
public class address {
	private String street;
	private String city;
	private String state;
	private int zip;
	public address(String street,String city,String state, int zip){
		this.state=state;
		this.street=street;
		this.city=city;
		this.zip=zip;
	}
	public address(){}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

}
