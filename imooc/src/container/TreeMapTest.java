package container;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args){
	Map<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("����", new Integer(5));
	hm.put("����", new Integer(3));
	hm.put("����", new Integer(1));
	hm.put("�Ը�", new Integer(4));
	System.out.println(hm);
	//����һ��TreeMap����
	Map<String,Integer> sortedMap=new TreeMap<String,Integer>();
	sortedMap.putAll(hm);
	System.out.println(sortedMap);
	Iterator itk=hm.keySet().iterator();//����hm�ļ��ĵ�����
	Iterator itv=hm.values().iterator();//����hm��ֵ�ĵ�����
	while(itk.hasNext()){
		Object key=itk.next();
		Object value=itv.next();
		System.out.print(key.toString()+"=");
		System.out.print(value.toString()+",");
	}
}
public static void print(Collection c){
	Iterator it=c.iterator();
	while(it.hasNext()){
		Object o=it.next();
		System.out.println(o);
	}
	
}
}
