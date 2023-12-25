package Generalization;

public class JIO implements SIMCard {

	public static void main(String[] args) {
		JIO J=new JIO();
		J.SMS();
		J.AudioCalling();
		J.Internet();
		J.AmazonPrime();

	}

	@Override
	public void SMS() {
		System.out.println("JIO --> SMS");
	}

	@Override
	public void AudioCalling() {
		System.out.println("JIO --> AudioCalling");		
	}

	@Override
	public void Internet() {
		System.out.println("JIO --> Internet");		
	}
	public void AmazonPrime() {
		System.out.println("JIO--> Amazon Prime");
	}

}
