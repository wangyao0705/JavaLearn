package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dc008T.Sum;

public class SumTest {


	Sum sum=new Sum();
    @Test

	public void test() {
		assertEquals(sum.r(10,10),20);


	}
    @Test
	public void test1() {
		assertEquals(sum.r(34,56),56);
	}

	}





