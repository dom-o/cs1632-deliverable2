import java.util.*;

public class Driver
{
	private int id;
	private Navigator nav;
	
	public Driver(int id_in)
	{
		nav = new Navigator();
		id = id_in;
	}
	
	public Driver(int id_in, Navigator nav_in)
	{
		nav = nav_in;
		id = id_in;
	}
	
	public boolean isOutsideCity()
	{
		return nav.isOutsideCity();
	}
	
	public String[] drive()
	{
		Location new_loc;
		ArrayList<String> steps = new ArrayList<String>();
		
		while(nav.ready())
		{
			steps.add("Driver " + id + " " + nav.step());
		}	
		
		return steps.toArray(new String[steps.size()]);
	}
}