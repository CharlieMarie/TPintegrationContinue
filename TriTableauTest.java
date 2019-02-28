package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void triCroissant() 
	{
		int tableau [] = {9,8,7};
		int expected[] = {7,8,9};
		TriTableau.triCroissant(tableau);
		Assertions.assertEquals(expected[0], tableau[0]);
		
	
		
	}

	@Test
	void triDecroissant() 
	{
		int tableau [] = {1,2,3};
		int expected[] = {3,2,1};
		TriTableau.triDecroissant(tableau);
		Assertions.assertEquals(expected[0], tableau[0]);
	}
}
