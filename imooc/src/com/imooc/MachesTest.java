package com.imooc;

public class MachesTest {
public static void main(String[] args){
	//�������ַ�����ʾ��������ʽ
	String paterStr="\\d{4}-\\d{2}-\\d{2}";
	//����������ƥ����ַ���
	String s1="3333-33-33";
	String s2="33-33-33";
	
	//���ַ�������s1����ƥ����
	if(s1.matches(paterStr)){
		System.out.println("ƥ��ɹ���");
	}
	else{
		System.out.println("ƥ��ʧ�ܣ�");
	}
	if(s2.matches(paterStr)){
		System.out.println("ƥ��ɹ���");
		}
	else{
		System.out.println("ƥ��ʧ�ܣ�");
	}
}
}
