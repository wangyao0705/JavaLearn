package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dca005.D03;

public class D03Test {

	D03 a = new D03();

	@Test
	public void testMax() {

		int[] array = new int[] { 85, 66, 86,9999 };
		assertEquals(a.max(array), 9999);
	}

	@Test
	public void testMin() {

		int[] array = new int[] { 85, 66, 86,9999 };
		assertEquals(a.min(array), 66);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAvg() {

		int[] array = new int[] { 90, 90, 90};
	assertEquals(a.avg(array), 90.0);
	}




	}


