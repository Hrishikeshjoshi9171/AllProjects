package Inheritance;

public class TestWhatsapp {

	public static void main(String[] args) {
		Son s=new Son();
		s.Mobile();
		s.Home();
		s.Car();
		s.Mobile();
		System.out.println();
		
		WhatsAppV1 v1=new WhatsAppV1();
		v1.TextMsg();
		System.out.println();
		WhatsAppV2 v2=new WhatsAppV2();
		v2.TextMsg();
		v2.AudioCalling();
		System.out.println();
		WhatsAppV3 v3=new WhatsAppV3();
		v3.TextMsg();
		v3.AudioCalling();
		v3.VideoCalling();
		

	}

}
