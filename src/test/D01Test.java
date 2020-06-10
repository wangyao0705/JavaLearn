package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dca005.D01;


public class D01Test {
	D01 sum=new D01();

	@Test
	public void test() {
		assertEquals(sum.sum(100),2550);
	}

}
