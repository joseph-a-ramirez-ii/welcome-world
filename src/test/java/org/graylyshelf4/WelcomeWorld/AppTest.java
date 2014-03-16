package org.graylyshelf4.WelcomeWorld;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testSayHello()
	{
		Assert.assertEquals(SayLib.SayHello(),"Welcome World #002!");
	}
	
	@Test
	public void testSayGoodBye()
	{
		Assert.assertEquals(SayLib.SayGoodbye(),"Goodbye Cruel World #002");
	}
    
}
