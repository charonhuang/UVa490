import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> str_coll = new Vector<String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String in_str = sc.nextLine();
			
			str_coll.add(in_str);
		}
		
		int max_length = -1;
		
		for(int i = str_coll.size()-1; i >= 0; i--)
		{
			if(str_coll.get(i).length() > max_length)
				max_length = str_coll.get(i).length();
		}
		
		for(int j = 0; j < max_length; j++)
		{
			StringBuilder out_str = new StringBuilder();
			for(int k = str_coll.size()-1; k >= 0; k--)
			{
				if(str_coll.get(k).length() > j)
					out_str.append(str_coll.get(k).charAt(j));
				else
					out_str.append(' ');
			}
			System.out.println(out_str.toString());
		}
		
		sc.close();
	}

}
