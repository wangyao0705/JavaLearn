package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dca005.D02;

public class D02Test {
	D02 mul=new D02();

	@Test
	public void test() {
		System.out.println(mul.mul(5));
		assertEquals(mul.mul(5),120);
	}

}
