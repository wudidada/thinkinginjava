package chapter5;

public class Rock {
	String str1 = "str1";	//����ʱ�ͱ���ʼ����ʵ��������ֵһ��
	String str2;			//ͨ����������ʼ����ʵ����ʱ����ֵ���Σ�null����str2��
	String str3 = str2;		
	
	Rock(){
		str2 = "str2";
	}
	
	public static void main(String[] args) {
		Rock rock = new Rock();
		System.out.println("str1: " + rock.str1);
		System.out.println("str2: " + rock.str2);
		System.out.println("str1: " + rock.str3);
	}
}
