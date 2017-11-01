package container;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args){
	/*Ϊ��ȷ��Set�г�Ա���������Ƶ�һ��Set�����࣬����TreeSet�еĶ������ʵ����
	 * Comparable�ӿڣ���Ҫ���սӿڵ�CompareTo�����Ƚϴ�С�����������У�Ҳ����
	 * �ڹ��췽����ֱ��ָ���Ƚ���
	 */
	SortedSet<People> people=new TreeSet<People>();
	People people1=new People("����","0001");
	People people2=new People("����","0003");
	People people3=new People("����","0002");
	People people4=new People("Ǯ��","0004");
	People people5=new People("����","0005");
	People people6=new People("�Ը�","0006");
	people.add(people1);
	people.add(people2);
	people.add(people3);
	people.add(people4);
	people.add(people5);
	people.add(people6);
	System.out.print(people);
	}
public static void print(Collection c){
	Iterator<String> it=c.iterator();
	while(it.hasNext()){
		String o=it.next();
		System.out.println(o);
		}
}
}
class People implements Comparable{
	String name;
	String id;
	public People(String name,String id){
		this.name=name;
		this.id=id;
	}
	public String toString(){
		return name+"|"+id;
	}
	//ʵ��compareTo�ӿڣ��Ƚ�id��С
	public int compareTo(Object o){
		People ts=(People)o;   //����People�ֲ�����
		return id.compareTo(ts.id);  //����compareTo������
	}
}
