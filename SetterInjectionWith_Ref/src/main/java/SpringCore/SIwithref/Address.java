package SpringCore.SIwithref;

public class Address 
{
	private String city;
	private int pncode;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setPncode(int pncode) {
		this.pncode = pncode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pncode=" + pncode + "]";
	}
	

}
