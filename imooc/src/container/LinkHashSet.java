package container;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkHashSet {
public static void main(String[] args){//java���������
	hashSetResult();
	treeSetResult();
	linkedHashSetResult();
	Set hashSet=new HashSet();
	addSetElement(hashSet);
	hashSet.add("��ѧ");             //Set������Ԫ���ظ�
	hashSet.add("����");
	System.out.println("\nΪhashSet������ѧ������Ԫ�غ�->:");
	showElement(hashSet);           //���÷�����ʾԪ��
	
	hashSet.remove("����");        //ɾ��Ԫ��
	System.out.println("\nhashSetɾ������Ԫ�غ�->:");
	showElement(hashSet);
	
	List list=new ArrayList();
	list.add("��ѧ");
	list.add("��ѧ");
	list.add("����");
	hashSet.addAll(list);         //���б�����ӵ�������
	System.out.println("\nhashSet���һ�����ϵ�����Ԫ�غ�->:");
	showElement(hashSet);
	
	hashSet.retainAll(list);      //ɾ�����б����е�Ԫ��֮���Ԫ��
	System.out.println("\nhashSetɾ�����б�֮���Ԫ�غ�->:");
	showElement(hashSet);
	
	hashSet.removeAll(list);
	System.out.println("\nhashSetɾ�������е�Ԫ�غ�->:");
	showElement(hashSet);
	}
public static void hashSetResult(){//ʹ��HashSet����Ԫ��
	Set hashset=new HashSet();
	addSetElement(hashset);        //���÷�����ʼ��Ԫ��
	System.out.println("ʹ��HashSet�洢������Ԫ������->:");
	showElement(hashset);          //���÷�����ʾԪ��
	
}
public static void treeSetResult(){//ʹ��TreeSet����Ԫ��
	Set treeset=new TreeSet();
	addSetElement(treeset);
	System.out.println("\nʹ��TreeSet�洢������Ԫ������->:");
	showElement(treeset);
}
public static void linkedHashSetResult(){//ʹ��LinkedHashSet����Ԫ��
	Set linkedHashSet=new LinkedHashSet();
	addSetElement(linkedHashSet);
	System.out.println("\nʹ��LinkedhashSet�洢������Ԫ������->:");
	showElement(linkedHashSet);
}
public static void addSetElement(Set set){//��ʼ��SetԪ��
	if(set!=null){
		set.add("��ѧ");
		set.add("����");
		set.add("����");
		set.add("��ѧ");
		set.add("����");
	}
}
public static void showElement(Set  set){//���SetԪ��
	if(set!=null&&set.size()>0){
		Iterator it=set.iterator();    //��õ�����Iterator
		while(it.hasNext()){           //ѭ�����Set�е�ÿ��Ԫ��
			System.out.print(it.next()+" ");
		}
	}else{
		System.out.println("û��Ԫ��");
	}
	System.out.println();
}
}
