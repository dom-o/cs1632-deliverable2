public class CitySimTest
{
	private ByteArrayOutputStream out;
	
	@Before
	public void prepareOutputStream()
	{
		System.setOut(new PrintStream(out));
	}
	
	@Test
	public void driverTest
	{
		
	}
}