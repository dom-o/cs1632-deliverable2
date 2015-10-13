import java.util.*;

public class Map
{
	public static Location[] all_locs = 
	{
		new Location("Mall", new int[]{1, 3}, new int[]{2, 0}), 
		new Location("Bookstore", new int[]{4, 2}, new int[]{2, 1}), 
		new Location("University", new int[]{3, 1}, new int[]{3, 1}), 
		new Location("Coffee Shop", new int[]{4, 0}, new int[]{3, 0}), 
		new Location("Outside City", new int[]{0, 2}, new int[]{2, 3})
	};
	
	public static String[] streets = {"Meow St", "Chirp St", "Fourth Ave", "Fifth Ave"};
	
	public static Random rand = new Random();
	
	public static void setRand(int seed_in)
	{
		rand = new Random(seed_in);
	}
	
	public Location getNextLoc(Location prev_loc)
	{
		int next = rand.nextInt(prev_loc.getLocsFromHere().length);
		Location next_loc = all_locs[prev_loc.getLocsFromHere()[next]];
		next_loc.setStreetToHere(streets[prev_loc.getStreetsFromHere()[next]]);
		return next_loc;
	}
	
	public Location getRandomLoc()
	{
		return all_locs[rand.nextInt(all_locs.length)];
	}
}