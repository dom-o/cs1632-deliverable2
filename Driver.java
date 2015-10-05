public class Driver
{
	private int id;
	private Location cur_loc;
	
	public Driver(int id_in)
	{
		cur_loc = Location.getRandomLoc();
		id = id_in;
	}
	
	public void drive()
	{
		Location new_loc;
		do
		{
			new_loc = Location.getNextLoc(cur_loc);
			System.out.println("Driver " + id + " heading from " + cur_loc + " to " + new_loc + " via " + new_loc.getToStreet() + ".");
			cur_loc = new_loc;
		}
		while(!cur_loc.isOutsideCity());
		
		System.out.println("Driver " + id + " has left the city!\n-----");
	}
}