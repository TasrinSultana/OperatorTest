package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();

	@Test
	void testArithmatic() {
		// Arithmatic Operator
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(5,oT.subtraction(8,3),"");
		assertEquals(5,oT.division(15,3),"");
		assertEquals(6,oT.multiplication(2,3),"");
		assertEquals(2,oT.modulas(2,3),"");
	}
		
	void testBitwise() {
		// Bitwise Operator
		assertEquals(-61,oT.bitNot(60),"");
		assertEquals(12,oT.bitAnd(60, 13),"");
		assertEquals(61,oT.bitOr(60, 13),"");
		assertEquals(49,oT.bitExOr(60, 13),"");
		assertEquals(15,oT.bitShiftRight(60, 2),"");
	}
		
	
	void testRational() {
		// Rational operator
		assertEquals(true,oT.equalTo(12, 12),"");
		assertEquals(true,oT.notEqualTo(12, 13),"");
		assertEquals(true,oT.greaterThan(15, 13),"");
	}
		
	void testLogical() {
		// logical operator
		assertEquals(true,oT.logicalNot(false),"");
		
		// fail("Not yet implemented");
	}

}