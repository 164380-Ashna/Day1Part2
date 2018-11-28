package CollectionAssignment;

import java.util.Hashtable;

public class TestEmploye {
	
	public static void main(String[] args) {
		Hashtable<Employe,Integer> hash=new Hashtable<>();
		Employe e1=new Employe(101,"Ashna");
		hash.put(e1,5000);
		Employe e2=new Employe(102,"Shubham");
		hash.put(e2, 55000);
		Employe e3=new Employe(103,"Prince");
		hash.put(e3, 55000);
		Employe e4=new Employe(104,"Mummy");
		hash.put(e4,60000)	;	
		System.out.println(e2.name+" "+e2.hashCode()+e2.getClass());
		System.out.println(e2.name+" "+e3.hashCode());
		System.out.println(e1.name+" "+e1.hashCode());
		System.out.println(e4.name+" "+e4.hashCode());
		System.out.println(hash.getOrDefault(e1, 55000)+"\n "+hash.get(e1));
		System.out.println(hash.get(e3));
		}


}
