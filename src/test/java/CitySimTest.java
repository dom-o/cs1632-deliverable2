import static org.mockito.Mockito.*;
//import static org.hamcrest.matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class CitySimTest
{
	@Test
	//Ensure location know when it is at outside city.
	public void test1_Location_isOutsideCity()
	{
		Location loc = new Location("Outside City", new int[]{1,2,3}, new int[]{1,2,3});
		assertEquals(loc.isOutsideCity(), true);
	}
	
	@Test
	//Ensure that step calls both the current location and the 
	public void test1_Navigator_step()
	{
		Location mock_loc = mock(Location.class);
		Map mock_map = mock(Map.class);
		Navigator nav = new Navigator(mock_loc, mock_map);
		when(mock_loc.isOutsideCity()).thenReturn(true);
		when(mock_map.getNextLoc(mock_loc)).thenReturn(Map.all_locs[1]);
		
		String s = nav.step();
		
		verify(mock_loc, times(1)).isOutsideCity();
		verify(mock_map, times(1)).getNextLoc(mock_loc);
	}
}