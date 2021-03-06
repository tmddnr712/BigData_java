package july02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class b_01_hashmap {

	public static void main(String[] args) {// 기본형, 참조형
		HashMap hm = new HashMap();
		hm.put("소득", Double.valueOf(1234.12)); //wrapper class
		hm.put("체중", Double.valueOf(8.2));
		hm.put("저축", Double.valueOf(123123123));
		hm.put("나이", Double.valueOf(28));
		hm.put("대출", Double.valueOf(-19.0));
		hm.put("소득", 1234.12); // 키가 동일하면 엎어씀
		hm.put("체중", 8.2);
		hm.put("저축", 123123123);
		hm.put("나이", 28);
		hm.put("대출", -19.0);
		
		//Map은 Key, value; Set은 Key
		Set set = hm.entrySet(); //key + Data
		Iterator i =set.iterator();
		while(i.hasNext()) { 
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키: %s. 값: %s, ",key,hm.get(key)));
		}
		double balance = (Double) hm.get("소득");
		hm.put("소득", 2000);
		System.out.println("변경된 값: " + hm.get("소득"));
		

	}

}
