package study;

import java.util.LinkedHashMap ;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Study {
	
	public static final String SHOP_SHOHIN_00 = "バナナ" ;
	
	public static final String SHOP_SHOHIN_01 = "牛乳" ;
	
	public static final String SHOP_SHOHIN_02 = "豚肉" ;
	
	public static final String SHOP_SHOHIN_03 = "コロッケ" ;
	
	public static void main(String args[]) {
		
		List<String> shohinList = new LinkedList<String>();
		
		shohinList.add("バナナ");
		
		shohinList.add("牛乳");
		
		shohinList.add("豚肉");
		
		shohinList.add("コロッケ");
		
//二番目の要素が必要と指定してる。
		
		LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
		
		shopMap.put(shohinList.get(0), 125);
		
		shopMap.put(shohinList.get(1), 180);
		
		shopMap.put(shohinList.get(2), 350);
		
		shopMap.put(shohinList.get(3), 100);
		
		for (Entry<String, Integer> s : shopMap.entrySet()) {
			
			System.out.println(s +"円になります!");
		}
	}

}
