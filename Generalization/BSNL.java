package Generalization;

public class BSNL implements SIMCard{

	public static void main(String[] args) {
		BSNL B=new BSNL();
		B.SMS();
		B.AudioCalling();
		B.Internet();
		B.Netflix();

	}

	@Override
	public void SMS() {
		System.out.println("BSNL--> SMS");		
	}

	@Override
	public void AudioCalling() {
		System.out.println("BSNL--> AudioCalling");		
	}

	@Override
	public void Internet() {
		System.out.println("BSNL--> Internet");
	}
	public void Netflix() {
		System.out.println("BSNL--> Netflix");
	}

}
