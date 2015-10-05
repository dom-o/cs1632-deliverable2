public class Driver
{
	private int id;
	private Location cur_loc;
	
	public Driver(int id_in)
	{
		cur_loc = Location.getRandomLoc();
		id = id_in;
	}
	
	public boolean isOutsideCity()
	{
		return cur_loc.isOutsideCity();
	}
	
	public String drive()
	{
		Location new_loc;
		if(!cur_loc.isOutsideCity())
		{
			new_loc = Location.getNextLoc(cur_loc);
			String to_return = ("Driver " + id + " heading from " + cur_loc + " to " + new_loc + " via " + new_loc.getToStreet() + ".");
			cur_loc = new_loc;
			return to_return;
		}
		else
		{
			return ("Driver " + id + " has left the city!\n-----");
		}
	}
}