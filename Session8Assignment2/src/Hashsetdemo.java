import java.util.*;
public class Hashsetdemo {
public static void main(String args[])
{
	HashSet<Float> hash=new HashSet<Float>();
	hash.add(9.2f);
	hash.add(5.3f);
	hash.add(1.4f);
	hash.add(7.5f);
	hash.add(3.7f);
	Iterator<Float> iterate=hash.iterator();
	System.out.println("The size of the hashset is"+hash.size());
	while(iterate.hasNext())
	{
		System.out.println(iterate.next());
	}
}
}
