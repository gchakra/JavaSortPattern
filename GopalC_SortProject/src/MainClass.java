import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) throws IOException {
        int[] arr= {5, 0, 3, 1, 2, 3, 0, 0};
        
        ArrayList<Integer> aList=new ArrayList<Integer>();        
        List<Integer> list = (List<Integer>)aList;
       
        for (int i : arr) {
        	list.add(i);
        }        
		SortClass sortClass = new SortClass();
		sortClass.mysortList(list);
		
		// Converting primitive integer array to an Integer array
		Integer[] boxedArray = new Integer[] {5, 0, 3, 1, 2, 3, 0, 0};
		//Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		sortClass.mysortArr(boxedArray);
		
		//Block Casting-Child cast to parent ok
		//OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		//Cache cache = (Cache) optimizedDiskCache;
		
		//Child cast to sibling - runtime error
		//MemoryCache memoryCache = new MemoryCache();
		//Cache cache = (Cache) memoryCache;
		//DiskCache diskCache = (DiskCache) cache;
		
		//Parent cast to child - runtime error
		//Cache cache = new Cache();
		//MemoryCache memoryCache = (MemoryCache) cache;
		
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
		DiskCache diskCache = (DiskCache) cache;
		
		
		RemoveDups removeDups = new RemoveDups();
		removeDups.myNonDup1(list);
		removeDups.myNonDup2(list);
		
		
		ReadFromFile readFile = new ReadFromFile("/Users/gopalchakravarthy/Documents/workspace-spring-tool-suite-4-4.14.1.RELEASE/GopalC_SortProject/src/RawFile.txt");
		String x = readFile.readFile1();
		System.out.println("readFile1:Text string in file is: " + x);
		
		x = readFile.readFile2();
		System.out.println("readFile2:Text string in file is: " + x);
		
		x = readFile.readFile3();
		System.out.println("readFile3:Text string in file is: " + x);
		
		x = readFile.readFile4();
		System.out.println("readFile4:Text string in file is: " + x);
	}
}
