package org.test1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class encapsul2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
encapsulate a=new encapsulate();
a.setName("karthi");
a.setId(123);
a.setPhno(9870123l);
System.out.println(a.getName());
System.out.println(a.getId());
System.out.println(a.getPhno());

encapsulate a1=new encapsulate();
a1.setName("raji");
a1.setId(234);
a1.setPhno(239012l);
System.out.println(a1.getName());
System.out.println(a1.getId());
System.out.println(a1.getPhno());
System.out.println();

List <encapsulate>li=new ArrayList<>();
li.add(a);
li.add(a1);

for(int i=0; i<li.size(); i++) {
	System.out.println(li.get(i).getName());
	System.out.println(li.get(i).getId());
	System.out.println(li.get(i).getPhno());
	
	System.out.println();
	for(encapsulate x:li) {
		System.out.println(x.getName());
		System.out.println(x.getId());
		
		Map<Integer, encapsulate> mp=new LinkedHashMap<>();	
		mp.put(1, a);
		mp.put(2, a1);
		
		Set<Entry<Integer, encapsulate>> m = mp.entrySet();
		for(Entry<Integer, encapsulate>x1:m) {
			System.out.println(x1.getValue().getName());
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}


}
	

}
