package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
public static void main(String []args){
	Collection<String> collstr=new ArrayList<String>();
	//����һ��Ԫ��ΪString���͵��б�
	collstr.add("����");        //Ϊ�б����Ԫ��
	collstr.add("����");
	collstr.add("����");
	collstr.add("����");
	System.out.println(collstr);//����б�Ԫ�ص�����
	
	Collection<String> coll=new ArrayList<String>();
	coll.add("�Ը�");
	coll.add("����");
	coll.addAll(collstr);
	System.out.println(coll);
	System.out.println("coll.contains(\"�Ը�\")="+coll.contains("�Ը�"));
	System.out.println("coll.contains(collstr)="+coll.containsAll(collstr));
	coll.retainAll(collstr);
	System.out.println("�ӵڶ���������ɾ����һ�������в�������Ԫ�أ��ڶ�������Ԫ��Ϊ��");
	System.out.println(coll);
	Object []arrayo=collstr.toArray();
	System.out.println(arrayo[1]);
	coll.add("�Ը�");
	Iterator it=coll.iterator();  //�����б������
	System.out.print("[");
	while(it.hasNext()){
		System.out.print(it.next()+",");
		}
	System.out.println("]");
	coll.removeAll(collstr);
	System.out.println("�ӵڶ���������ɾ����һ�������а�����Ԫ�أ��ڶ�������Ԫ��Ϊ��");
	System.out.println(coll);
	coll.remove("�Ը�");
	System.out.println("coll.isEmpty()="+coll.isEmpty());
	System.out.println(collstr);
	collstr.clear();
	System.out.println("ʹ��clear()�󣬵�һ�������е�Ԫ��\n"+collstr);
	}
}
