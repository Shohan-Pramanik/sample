package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.OperatorTestClass;

public class OperatorTestUnitTest {

	OperatorTestClass operatorTest = new OperatorTestClass();
	@Test
	public void operatorTestUnitTest() {
		assertEquals(5,operatorTest.addition(2,3));
		assertEquals(5,operatorTest.subtraction(10,5));
		assertEquals(5,operatorTest.multiplication(5,1));
		assertEquals(5,operatorTest.division(10,2));
		assertEquals(5,operatorTest.modulas(17,12));

		assertEquals(-3,operatorTest.bitNot(2));
		assertEquals(2,operatorTest.bitAnd(2,3));
		assertEquals(3,operatorTest.bitOr(2,3));
		assertEquals(1,operatorTest.bitExOr(2,3));
		assertEquals(4,operatorTest.bitShiftRight(8,1));
		assertEquals(16,operatorTest.bitShiftLeft(8,1));
		assertEquals(5,operatorTest.bitShiftRightZero(20,2));

		assertEquals(true,operatorTest.equalTo(12,12));
		assertEquals(true,operatorTest.notEqualTo(12,13));
		assertEquals(true,operatorTest.greaterThan(5,3));

		assertEquals(false,operatorTest.logicalNot(true));
		assertEquals(true,operatorTest.logicalAnd(true,true));
		assertEquals(true,operatorTest.logicalOr(true,false));
		assertEquals(true,operatorTest.logicalExOr(false,true));
	}


}
