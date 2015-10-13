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
	
	/*@Test
	//Ensure that 
	public void test1_Navigator_getNextLoc()
	{
		Location loc = mockito.mock()
	}*/
}