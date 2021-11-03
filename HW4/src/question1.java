import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class question1 
{
	public static void main(String[] args)
	{
		
		Set<String> group1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Kevin", "Michael"));
		Set<String> group2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		// find union, difference, and intersection 
		
		Set<String> union = new LinkedHashSet<>(group1);
		union.addAll(group2);
		System.out.println("Union: " + union);
		
		Set<String> difference = new LinkedHashSet<>(group1);
		difference.removeAll(group2);
		System.out.println("Difference: " + difference);
		
		Set<String> intersection = new LinkedHashSet<>();
		for (String e: group2)
		{
			if(group1.contains(e))
			{
				intersection.add(e);
			}
		}
		
		System.out.println("Intersection: " + intersection);
	}

}

