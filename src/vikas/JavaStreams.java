package vikas;

import java.util.ArrayList;

public class JavaStreams {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ashok");
		names.add("vikas");
		names.add("vinod");
		names.add("yuasa");
		int count = 0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("v"))
			{
				count++;
			}
		}
		
System.out.println(count);
	}

}

