package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
public static void main(String[]args){
	//java程序主入口
		printHashMap();                    //操作HashMap显示课程科目
		printTreeMap();                    //操作TreeMap显示课程科目
		printArrayList();                  //操作ArrayList显示课程科目
	}
	public static void printHashMap(){     //操作HashMap的方法
		Map map=new HashMap();
		map.put("01", "语文");
		map.put("02", "数学");
		map.put("03", "物理");
		map.put("04", "生物");
		map.put("05", "化学");
		map.put("06",   null);
		map.put(null, "政治");
		Iterator iterator=map.keySet().iterator();   //获得迭代器iterator
		System.out.println("<1>操作HashMap显示课程科目");
		while(iterator.hasNext()){                   //循环获得每个对象
			Object key=iterator.next();              //获得每个键元素
			System.out.print(map.get(key)+"\t");   //输出值
		}
		System.out.println();
	}
	public static void printTreeMap(){     //操作TreeMap的方法
	TreeMap treeMap=new TreeMap();
	treeMap.put("01", "语文");
	treeMap.put("02", "数学");
	treeMap.put("03", "物理");
	treeMap.put("04", "生物");
	treeMap.put("05", "化学");
	treeMap.put("06",  null);
	Iterator iterator=treeMap.keySet().iterator();//获得迭代器iterator
	System.out.println("<2>操作TreeMap显示课程科目");
	while(iterator.hasNext()){
		Object key=iterator.next();
		System.out.print(treeMap.get(key)+"\t");
	}
	System.out.println();
	}
	public static void printArrayList(){   //操作有序的ArrayList列表集合M
		ArrayList arrayList=new ArrayList();
		arrayList.add("01 语文");
		arrayList.add("03 物理");
		arrayList.add("06 地理");
		arrayList.add("04 生物");
		arrayList.add("05 化学");
		arrayList.add("02 数学");
		System.out.println("<3>排序前的课程种类");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+"\t");
		}
		System.out.println();
		Collections.sort(arrayList);//根据元素的自然顺序，对指定的列表按升序进行排列
		System.out.println("<4>ArrayList排序后课程科目");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+"\t");
		}
		System.out.println();
	}
}

