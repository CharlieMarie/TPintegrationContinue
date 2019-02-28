package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	
	@Test
	void testFirst() 
	{
		FIFO testFifo = new FIFO();
		Integer expected = 4;
		
		testFifo.add(4);
		
		Assertions.assertEquals(expected, testFifo.first());
	}
	
	@Test
	void testEmpty() 
	{
		FIFO testFifo = new FIFO();
		boolean expected = true;
		
		Assertions.assertEquals(expected, testFifo.isEmpty());
	}
	
	@Test
	void testRemove()
	{
		FIFO testFifo = new FIFO();
		int expected = 0;
		
		testFifo.add(4);
		testFifo.removeFirst();
		Assertions.assertEquals(expected, testFifo.size());
		
	}
}


