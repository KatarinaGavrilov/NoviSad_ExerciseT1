import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Spare() {
		Frame frame = new Frame(5,5);
		boolean isSpare = frame.isSpare();
		
		assertEquals("Incorrect", true, isSpare);
		
	}

}
