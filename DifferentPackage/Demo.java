package DifferentPackage;

import AccessSpecifier.ProtectedSample;
//import AccessSpecifier.DefaultAccess;
//import AccessSpecifier.PrivateSample;
import AccessSpecifier.PublicSample;

public class Demo extends ProtectedSample{

	public static void main(String[] args) {
		PublicSample p=new PublicSample();
		p.m1();
		p.name();
		System.out.println(p.Rollno);
		System.out.println();
		/*
		PrivateSample pr=new PrivateSample();
		pr.m1();
		pr.m2();
		
		DefaultAccess DA=new DefaultAccess();
		DA.m1();
		DA.m2();
		*/
		Demo D=new Demo();
		D.m1();
		D.m2();
		
	}

}
