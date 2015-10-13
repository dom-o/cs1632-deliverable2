import java.util.*;

public class Navigator
{
	private Location cur_loc;
	private int step_num;
	private boolean ready;
	
	public Navigator()
	{
		cur_loc = getRandomLoc();
		step_num = 0;
		ready = true;
	}
	
	public boolean ready()
	{
		return ready;
	}
	
	public String step()
	{
		String step;
		if(!cur_loc.isOutsideCity() || step_num < 1)
		{			
			Location new_loc = getNextLoc(cur_loc);
			step = ("heading from " + cur_loc + " to " + new_loc + " via " + new_loc.getStreetToHere() + ".");
			cur_loc = new_loc;
		}
		else
		{
			ready = false;
			step = "has left the city!\n-----";
		}
		step_num++;
		//System.out.println("STEP: " + step);
		return step;
	}
	
	public boolean isOutsideCity()
	{
		return cur_loc.isOutsideCity();
	}
	
	public Location getRandomLoc()
	{
		return Map.all_locs[Map.rand.nextInt(Map.all_locs.length)];
	}
	
	public Location getNextLoc(Location prev_loc)
	{
		int next = Map.rand.nextInt(prev_loc.getLocsFromHere().length);
		Location next_loc = Map.all_locs[prev_loc.getLocsFromHere()[next]];
		next_loc.setStreetToHere(Map.streets[prev_loc.getStreetsFromHere()[next]]);
		return next_loc;
	}
}