package org.test1;


import java.util.LinkedHashSet;
import java.util.Set;

public class settask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
usereducation a=new usereducation();
a.setStdname("karthick");
a.setStdPhone(978975539l);
a.setEmail("kaarthickramu");
a.setGen("Male");
a.setStdid(1234);



Set<usereducation> d=new LinkedHashSet<>();
d.add(a);
for(usereducation x:d) {
	System.out.println(x.getStdit());
	System.out.println(x.getStdname());
	System.out.println(x.getGen());
	System.out.println(x.getAddress());
	System.out.println(x.getStdPhone());
}

	}

}
