package chapter5;

class Ball{
	String name;
	
	Ball(){
		System.out.println("A ball has been initalized");
	}
	
	Ball(String name){
		this.name = name;
		System.out.println("A ball called " + name + "has been initailized");
	}
}

public class TestArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(arr1.length);
		
		int[] arr2 = {2, 3, 4, 5, 6, 7};
		
		arr1 = arr2;
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[5]);
		
		System.out.println("***************");
		
		String[] arr3 = new String[] {
				"you",
				"are",
				"a",
				"good",
				"boy",
		};
		
		for(String a : arr3) {
			System.out.println(a);
		}
		
		System.out.println("***************");
		
		Ball[] arr4 = new Ball[4];		//ֻ�������������ã���δ�����������
		
		arr4[0] = new Ball("blue");		//������һ�����󲢸�ֵ�������һ��Ԫ�أ�����Ԫ������Ϊnull
		
		System.out.println(arr4[1]);
		
		
	}
		
}
