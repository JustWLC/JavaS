package container;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args){
	/*为了确保Set中成员的有序而设计的一个Set的子类，存入TreeSet中的对象如果实现了
	 * Comparable接口，则要按照接口的CompareTo方法比较大小后按照升序排列，也可以
	 * 在构造方法中直接指定比较器
	 */
	SortedSet<People> people=new TreeSet<People>();
	People people1=new People("张三","0001");
	People people2=new People("李四","0003");
	People people3=new People("赵六","0002");
	People people4=new People("钱起","0004");
	People people5=new People("王五","0005");
	People people6=new People("赵刚","0006");
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
	//实现compareTo接口，比较id大小
	public int compareTo(Object o){
		People ts=(People)o;   //创建People局部变量
		return id.compareTo(ts.id);  //返回compareTo运算结果
	}
}
