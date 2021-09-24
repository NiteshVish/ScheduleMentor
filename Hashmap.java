import java.util.*;
import java.util.HashMap;
public class Hashmap{
	public static void main(String[]args){
     //Scanner sc=new Scanner(System.in);
     //int Key=sc.nextInt();
     //String Value=sc.nextLine();
     //int Key;
     //String Value;
     HashMap<String,Integer> hmap=new HashMap<>();
     hmap.put("Nitesh",20);
     hmap.put("mammi",38);
     hmap.put("papa",46);
     hmap.put("big_Bro",24);
     hmap.put("rohit",19);
     Hashmap test=new Hashmap();
     System.out.println(test.getAge(hmap,"Nitesh"));
     System.out.println(test.getAge(hmap,"Rohit"));
     System.out.println(test.getAge(hmap,"tikoo"));

	}

	public int getAge(HashMap<String,Integer> hmap, String name){
		boolean res=hmap.containsKey(name);
		System.out.println("value of res= "+res);
		if(res==false){
			return -1;
		}
		else{
			int age=hmap.get(name);

			return age;

		}


	}
}