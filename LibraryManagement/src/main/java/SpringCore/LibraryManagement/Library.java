package SpringCore.LibraryManagement;

import java.util.List;


public class Library {
	private int libraryCode;
	private String libraryName;
	private String inChargeperson;
	private long contactNumber;
	private List<String> genres;
	private static int unicode=1;
	
	public Library()
	{
		IO.println("No argument constructor");
	}
	
	public Library(String libraryName) 
	{
		super();
		this.libraryName = libraryName;
	}
  public void init()
  {
	  IO.println("post contruction");
	  this.libraryCode = unicode++;
  }

	public int getLibraryCode() {
		return libraryCode;
	}


	public void setLibraryCode(int libraryCode) {
		this.libraryCode = libraryCode;
		 System.out.println("Setter Injection done for libraryCode");
	}


	public String getLibraryName() {
		return libraryName;
	}


	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
		 System.out.println("Setter Injection doe for libraryName");
	}


	public String getInChargeperson() {
		return inChargeperson;
	}


	public void setInChargeperson(String inChargeperson) {
		this.inChargeperson = inChargeperson;
		 System.out.println("Setter Injection done for inChargePerson");
	}


	public long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
		System.out.println("Setter Injection done for contactNumber");
	}


	public List<String> getGenres() {
		return genres;
	}


	public void setGenres(List<String> genres) {
		System.out.println("Setter Injection done for genres");
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Library [libraryCode=" + libraryCode + ", libraryName=" + libraryName + ", inChargeperson="
				+ inChargeperson + ", contactNumber=" + contactNumber + ", genres=" + genres + "]";
	}
	
	public void destroy()
	{
		IO.println("post destruction logic");
		this.contactNumber=0;
		this.inChargeperson="null";
		this.libraryName="null";
		this.libraryCode=0;
		this.genres=null;
		
	}
	
}
