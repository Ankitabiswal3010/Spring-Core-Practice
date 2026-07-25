package SpringCore.LibraryManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService 
{
	List<Library>data;
	public LibraryService()
	{
		
	}
	public List<Library> getData() {
		return data;
	}
	public void setData(List<Library> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "LibraryService [data=" + data + "]";
	}
	public Map<String,Integer>getCodeName()
	{
		Map<String,Integer> result=new HashMap<String,Integer>();
		for(Library value:data)
		{
			result.put(value.getLibraryName(),value.getLibraryCode());
		}
		return result;
	}
	public Library getDetails(int libraryCode)
	{
		Library result=null;
		for(Library value:data)
		{
			if(value.getLibraryCode()==libraryCode)
			{
				result=value;
			}
		}
		return result;
	}

}
