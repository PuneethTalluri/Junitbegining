package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper=new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));	
	}
	//expected:<ABC[]> but was:<ABC[D]>
	
	//ABCD->FALSE, ABAB->TRUE, AB->TRUE, A->FALSE
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario()
	{
		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));// same way to write the above code
		assertFalse("the condition failed",true);// to point to the particular condition which has failed
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		//the above passing of the string is not required as the present Junit points to where exactly the test case is failing
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
