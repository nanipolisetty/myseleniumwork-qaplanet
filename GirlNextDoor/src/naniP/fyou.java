package naniP;

import java.util.ArrayList;
import java.util.Iterator;
public class fyou {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
				
				al.add("What I've Done");
				al.add("bleeding");
				al.add("bleed out");
				al.add("dont walk away");
				al.add("I hate everything about you");
				al.add("Animal I have become");
				//System.out.println(al.size());
/*System.out.println(al.get(0));
for(String i:al)
	System.out.println(i);

	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
					*/
		Iterator <String> it = al.iterator();		
				while(it.hasNext()){
	
					System.out.println(it.next());
					
				}
	}
}
