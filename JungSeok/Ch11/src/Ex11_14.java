import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");      set.add("alien");    set.add("bat");
		set.add("car");      set.add("Car");      set.add("disc");
		set.add("dance");    set.add("dZZZZ");    set.add("dzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");	 set.add("dzzy");	  set.add("dzzzz"); 
		set.add("dzzY");
		
		System.out.println(set);
		System.out.println("range search : "+from+" to "+to);
		System.out.println("result1 : "+set.subSet(from, to));	//b~c
		System.out.println("range search : "+from+" to "+to+"zzy");
		System.out.println("result2 : "+set.subSet(from, to+"zzy"));
		System.out.println("range search : "+from+" to "+to+"zzzY");
		System.out.println("result3 : "+set.subSet(from, to+"zzzY"));
		System.out.println("range search : "+from+" to "+to+"zzzz");
		System.out.println("result4 : "+set.subSet(from, to+"zzzz"));

	}

}
