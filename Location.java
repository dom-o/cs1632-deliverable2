import java.util.*;

public class Location
{
	private static Random rand = new Random();
	private static Location[] all_locs = 
		{
			new Location("Mall", new int[]{1, 3}, new int[]{2, 0}), 
			new Location("Bookstore", new int[]{4, 2}, new int[]{2, 1}), 
			new Location("University", new int[]{3, 1}, new int[]{3, 1}), 
			new Location("Coffee Shop", new int[]{4, 0}, new int[]{3, 0}), 
			new Location("Outside City", new int[]{0, 2}, new int[]{2, 3})
		};
	private static String[] streets = {"Meow St", "Chirp St", "Fourth Ave", "Fifth Ave"};
	
	private int[] locs_from_here;
	private int[] streets_from_here;
	private String name;
	private int street_to_here = -1;
	
	public Location(String name_in, int[] to_locs_in, int[] to_streets_in)
	{
		name = name_in;
		locs_from_here = to_locs_in;
		streets_from_here = to_streets_in;
	}
	
	public static Location getRandomLoc()
	{
		return all_locs[rand.nextInt(all_locs.length)];
	}
	
	public static void setRand(Random new_rand)
	{
		rand = new_rand;
	}
	
	public static Location getNextLoc(Location prev_loc)
	{
		int next = rand.nextInt(prev_loc.locs_from_here.length);
		Location next_loc = all_locs[prev_loc.locs_from_here[next]];
		next_loc.street_to_here = (prev_loc.streets_from_here[next]);
		return next_loc;
	}
	
	public String toString()
	{
		return name;
	}
	
	public String getToStreet()
	{
		return streets[street_to_here];
	}
	
	public boolean isOutsideCity()
	{
		return name.equals("Outside City");
	}
}