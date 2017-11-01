package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
public static void main(String[]args){
	//java���������
		printHashMap();                    //����HashMap��ʾ�γ̿�Ŀ
		printTreeMap();                    //����TreeMap��ʾ�γ̿�Ŀ
		printArrayList();                  //����ArrayList��ʾ�γ̿�Ŀ
	}
	public static void printHashMap(){     //����HashMap�ķ���
		Map map=new HashMap();
		map.put("01", "����");
		map.put("02", "��ѧ");
		map.put("03", "����");
		map.put("04", "����");
		map.put("05", "��ѧ");
		map.put("06",   null);
		map.put(null, "����");
		Iterator iterator=map.keySet().iterator();   //��õ�����iterator
		System.out.println("<1>����HashMap��ʾ�γ̿�Ŀ");
		while(iterator.hasNext()){                   //ѭ�����ÿ������
			Object key=iterator.next();              //���ÿ����Ԫ��
			System.out.print(map.get(key)+"\t");   //���ֵ
		}
		System.out.println();
	}
	public static void printTreeMap(){     //����TreeMap�ķ���
	TreeMap treeMap=new TreeMap();
	treeMap.put("01", "����");
	treeMap.put("02", "��ѧ");
	treeMap.put("03", "����");
	treeMap.put("04", "����");
	treeMap.put("05", "��ѧ");
	treeMap.put("06",  null);
	Iterator iterator=treeMap.keySet().iterator();//��õ�����iterator
	System.out.println("<2>����TreeMap��ʾ�γ̿�Ŀ");
	while(iterator.hasNext()){
		Object key=iterator.next();
		System.out.print(treeMap.get(key)+"\t");
	}
	System.out.println();
	}
	public static void printArrayList(){   //���������ArrayList�б���M
		ArrayList arrayList=new ArrayList();
		arrayList.add("01 ����");
		arrayList.add("03 ����");
		arrayList.add("06 ����");
		arrayList.add("04 ����");
		arrayList.add("05 ��ѧ");
		arrayList.add("02 ��ѧ");
		System.out.println("<3>����ǰ�Ŀγ�����");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+"\t");
		}
		System.out.println();
		Collections.sort(arrayList);//����Ԫ�ص���Ȼ˳�򣬶�ָ�����б������������
		System.out.println("<4>ArrayList�����γ̿�Ŀ");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+"\t");
		}
		System.out.println();
	}
}

