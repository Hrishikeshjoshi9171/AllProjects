package Generalization;

public class Airtel implements SIMCard {

	public static void main(String[] args) {
		Airtel A=new Airtel();
		A.SMS();
		A.AudioCalling();
		A.Internet();
		A.Hotstar();
		System.out.println();
		
		BSNL B=new BSNL();
		B.SMS();
		B.AudioCalling();
		B.Internet();
		B.Netflix();
		System.out.println();
		
		JIO J=new JIO();
		J.SMS();
		J.AudioCalling();
		J.Internet();
		J.AmazonPrime();
	}

	@Override
	public void SMS() {
		System.out.println("Airtel-->SMS");		
	}

	@Override
	public void AudioCalling() {
		System.out.println("Airtel-->AudioCalling");		
	}

	@Override
	public void Internet() {
		System.out.println("Airtel-->Internet");		
	}
	public void Hotstar() {
		System.out.println("Airtel-->Hotstar");
	}

}
