package FinalConcept;

public class FinalizeConcept {

	public static void main(String[] args) {
//		Finalize is the method in java which is used to perform cleanup processing just 
//		before object is garbage collected.
		
		FinalizeConcept f1=new FinalizeConcept();
		f1=null;
		System.gc();

	}
	public void finalize() {
		System.out.println("Finalize method executed");
	}

}
