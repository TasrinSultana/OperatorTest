package main;

public class OperatorTestClass {
	public int addition(int operand1, int operand2) {
		return operand1 + operand2;
	}
	
	public int  subtraction(int operand1, int operand2) {
		return operand1 - operand2;
	}
	
	public int division(int operand1, int operand2) {
		return operand1 / operand2;
	}
	
	public int multiplication(int operand1, int operand2) {
		return operand1 * operand2;
	}
	

	public int modulas(int operand1, int operand2) {
		return operand1 % operand2;
	}
	
	public boolean equalTo(int operand1, int operand2) {
		if(operand1 == operand2)
			return true;
		else
			return false;
				
	}
	
	public boolean notEqualTo(int operand1, int operand2) {
		if(operand1 != operand2)
			return true;
		else
			return false;
				
	}
	
	public boolean greaterThan(int operand1, int operand2) {
		if(operand1 > operand2)
			return true;
		else
			return false;
				
	}
	
	public int bitNot(int operand1) {
		return ~ operand1;
	}
	
	public int bitAnd(int operand1, int operand2) {
		return operand1 & operand2;
	}
	
	public int bitOr(int operand1, int operand2) {
		return operand1 | operand2;
	}
	
	public int bitExOr(int operand1, int operand2) {
		return operand1 ^ operand2;
	}
	
	public int bitShiftRight(int operand1, int operand2) {
		return operand1 >> operand2;
	}
	

	public boolean logicalNot(boolean operand1) {
		return ! operand1;
	}

}