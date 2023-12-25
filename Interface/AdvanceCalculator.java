package Interface;

public class AdvanceCalculator implements Calculator,Casio{

	@Override
	public void addition() {
		System.out.println("I am in addition method");
		
	}

	@Override
	public void Substraction() {
		System.out.println("I am in substraction method");
		
	}

	@Override
	public void Multiplication() {
		System.out.println("I am in Multiplication method");
		
	}

	@Override
	public void log() {
		System.out.println("Casio Interface:Log");
		
	}

	@Override
	public void Tan() {
		System.out.println("Casio Interface:Tan");
		
	}
	
	public void cos() {
		System.out.println("AdvanceCalculator class:Cos");
	}
	
	public void sin() {
		System.out.println("AdvanceCalculator class:Sin");
	}

}
