import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


class RemoveDups {
	
	public void myNonDup1(List<Integer> lis) {
		Set<Integer> hs = new LinkedHashSet<Integer>(lis);
		List<Integer> listWithoutDup = new ArrayList<Integer>(hs);
		System.out.println("\nThe nondup1 order list is: ");
		System.out.println(listWithoutDup.toString())	;
		
		//for (int num : listWithoutDup) {
		//	System.out.print(num + " ");
        //		}
	}
	
	public void myNonDup2(List<Integer> lis) {
		Set<Integer> hs = new HashSet<Integer>(lis);
		List<Integer> listWithoutDup = new ArrayList<Integer>(hs);
		System.out.println("\nThe nondup2 order list is: ");
		System.out.println(listWithoutDup.toString());		
	}
		

}
