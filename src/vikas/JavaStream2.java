package vikas;

import java.util.ArrayList;

public class JavaStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("ashok");
		names.add("vikas");
		names.add("vinod");
		names.add("yuasa");
	    long c = names.stream().filter(s->s.startsWith("v")).count();
	    System.out.println(c);
	    //greater than 4 length
	    names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	    names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
