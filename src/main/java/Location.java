public class Location
{
	private int[] locs_from_here;
	private int[] streets_from_here;
	private String name;
	private String street_to_here = null;
	
	public Location(String name_in, int[] to_locs_in, int[] to_streets_in)
	{
		name = name_in;
		locs_from_here = to_locs_in;
		streets_from_here = to_streets_in;
	}
	
	public String toString()
	{
		return name;
	}
	
	public boolean isOutsideCity()
	{
		return name.equals("Outside City");
	}
	
	public int[] getLocsFromHere()
	{
		return locs_from_here;
	}
	
	public int[] getStreetsFromHere()
	{
		return streets_from_here;
	}
	
	public String getStreetToHere()
	{
		return street_to_here;
	}
	
	public void setStreetToHere(String street_in)
	{
		street_to_here = street_in;
	}
}