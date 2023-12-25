package AccessSpecifier;

public class DifferentAccess {

	public static void main(String[] args) {
		/*PublicSample ps =new PublicSample();
		ps.m1();
		ps.name();
		System.out.println(ps.Rollno);
		PrivateSample PR1=new PrivateSample();
		PR1.m1();
		PR1.m2();
		System.out.println(PR1.number);
		System.out.println();
		*/
		DefaultAccess DA=new DefaultAccess();
		DA.m1();
		DA.m2();
		System.out.println(DA.no);
		
		System.out.println();
		ProtectedSample PS=new ProtectedSample();
		PS.m1();
		PS.m2();

	}

}
