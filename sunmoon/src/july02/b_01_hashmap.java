package july02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class b_01_hashmap {

	public static void main(String[] args) {// �⺻��, ������
		HashMap hm = new HashMap();
		hm.put("�ҵ�", Double.valueOf(1234.12)); //wrapper class
		hm.put("ü��", Double.valueOf(8.2));
		hm.put("����", Double.valueOf(123123123));
		hm.put("����", Double.valueOf(28));
		hm.put("����", Double.valueOf(-19.0));
		hm.put("�ҵ�", 1234.12); // Ű�� �����ϸ� ���
		hm.put("ü��", 8.2);
		hm.put("����", 123123123);
		hm.put("����", 28);
		hm.put("����", -19.0);
		
		//Map�� Key, value; Set�� Key
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
			System.out.println(String.format("Ű: %s. ��: %s, ",key,hm.get(key)));
		}
		double balance = (Double) hm.get("�ҵ�");
		hm.put("�ҵ�", 2000);
		System.out.println("����� ��: " + hm.get("�ҵ�"));
		

	}

}