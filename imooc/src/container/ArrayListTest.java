package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args){
	List<String> list=new ArrayList<String>(4);//����һ����СΪ4�ļ���
	list.add("����");
	list.add("��ѧ");
	list.add("����");
	list.add("����");
	System.out.println("��һ��ѡ�ε��еĿ�Ŀ��");
	for(Iterator<String> iter=list.iterator();iter.hasNext();){
		String s=iter.next();
		System.out.print(s+"\t");
		if("��ѧ".equals(s)){
			iter.remove();//����ӿ�Ŀ�б���ɾ��
		}
	}
	System.out.println();
	System.out.println("�ڶ���ѡ�ε��еĿ�Ŀ��");
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.print(s+"\t");
		if("����".equals(s)||"����".equals(s)){
			it.remove();
		}
	}
	System.out.println();
	System.out.println("���û��ѡ��Ŀ�Ŀ");
	for(Iterator<String> iter=list.iterator();iter.hasNext();){
		String s=iter.next();
		System.out.print(s+"\t");
	}
			
}
}
