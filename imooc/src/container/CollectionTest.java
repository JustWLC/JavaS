package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
public static void main(String []args){
	Collection<String> collstr=new ArrayList<String>();
	//创建一个元素为String类型的列表
	collstr.add("张三");        //为列表添加元素
	collstr.add("李四");
	collstr.add("王五");
	collstr.add("赵六");
	System.out.println(collstr);//输出列表元素的内容
	
	Collection<String> coll=new ArrayList<String>();
	coll.add("赵刚");
	coll.add("莉莉");
	coll.addAll(collstr);
	System.out.println(coll);
	System.out.println("coll.contains(\"赵刚\")="+coll.contains("赵刚"));
	System.out.println("coll.contains(collstr)="+coll.containsAll(collstr));
	coll.retainAll(collstr);
	System.out.println("从第二个集合中删除第一个集合中不包含的元素，第二个集合元素为：");
	System.out.println(coll);
	Object []arrayo=collstr.toArray();
	System.out.println(arrayo[1]);
	coll.add("赵刚");
	Iterator it=coll.iterator();  //返回列表迭代器
	System.out.print("[");
	while(it.hasNext()){
		System.out.print(it.next()+",");
		}
	System.out.println("]");
	coll.removeAll(collstr);
	System.out.println("从第二个集合中删除第一个集合中包含的元素，第二个集合元素为：");
	System.out.println(coll);
	coll.remove("赵刚");
	System.out.println("coll.isEmpty()="+coll.isEmpty());
	System.out.println(collstr);
	collstr.clear();
	System.out.println("使用clear()后，第一个集合中的元素\n"+collstr);
	}
}
