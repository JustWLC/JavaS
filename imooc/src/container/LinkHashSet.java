package container;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkHashSet {
public static void main(String[] args){//java程序主入口
	hashSetResult();
	treeSetResult();
	linkedHashSetResult();
	Set hashSet=new HashSet();
	addSetElement(hashSet);
	hashSet.add("数学");             //Set不允许元素重复
	hashSet.add("语文");
	System.out.println("\n为hashSet加入数学、语文元素后->:");
	showElement(hashSet);           //调用方法显示元素
	
	hashSet.remove("政治");        //删除元素
	System.out.println("\nhashSet删除政治元素后->:");
	showElement(hashSet);
	
	List list=new ArrayList();
	list.add("数学");
	list.add("化学");
	list.add("生物");
	hashSet.addAll(list);         //将列表集合添加到集合中
	System.out.println("\nhashSet添加一个集合的所有元素后->:");
	showElement(hashSet);
	
	hashSet.retainAll(list);      //删除除列表集合中的元素之外的元素
	System.out.println("\nhashSet删除除列表之外的元素后->:");
	showElement(hashSet);
	
	hashSet.removeAll(list);
	System.out.println("\nhashSet删除集合中的元素后->:");
	showElement(hashSet);
	}
public static void hashSetResult(){//使用HashSet操作元素
	Set hashset=new HashSet();
	addSetElement(hashset);        //调用方法初始化元素
	System.out.println("使用HashSet存储的数据元素如下->:");
	showElement(hashset);          //调用方法显示元素
	
}
public static void treeSetResult(){//使用TreeSet操作元素
	Set treeset=new TreeSet();
	addSetElement(treeset);
	System.out.println("\n使用TreeSet存储的数据元素如下->:");
	showElement(treeset);
}
public static void linkedHashSetResult(){//使用LinkedHashSet操作元素
	Set linkedHashSet=new LinkedHashSet();
	addSetElement(linkedHashSet);
	System.out.println("\n使用LinkedhashSet存储的数据元素如下->:");
	showElement(linkedHashSet);
}
public static void addSetElement(Set set){//初始化Set元素
	if(set!=null){
		set.add("数学");
		set.add("语文");
		set.add("生物");
		set.add("化学");
		set.add("政治");
	}
}
public static void showElement(Set  set){//输出Set元素
	if(set!=null&&set.size()>0){
		Iterator it=set.iterator();    //获得迭代器Iterator
		while(it.hasNext()){           //循环获得Set中的每个元素
			System.out.print(it.next()+" ");
		}
	}else{
		System.out.println("没有元素");
	}
	System.out.println();
}
}
