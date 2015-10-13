import java.util.*;

public class Navigator
{
	private Location cur_loc;
	private int step_num;
	private boolean ready;
	private Map map;
	
	public Navigator()
	{
		map = new Map();
		cur_loc = map.getRandomLoc();
		step_num = 0;
		ready = true;
	}
	
	public Navigator(Location loc_in, Map map_in)
	{
		map = map_in;
		cur_loc = loc_in;
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
			Location new_loc = map.getNextLoc(cur_loc);
			step = ("heading from " + cur_loc + " to " + new_loc + " via " + new_loc.getStreetToHere() + ".");
			cur_loc = new_loc;
		}
		else
		{
			ready = false;
			step = "has left the city!\n-----";
		}
		step_num++;
		return step;
	}
	
	public boolean isOutsideCity()
	{
		return cur_loc.isOutsideCity();
	}
}