package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		//strVar1,2,3���� ���ڿ��� ���� ����Ǿ� �ִ°��� �ƴ϶�
		//����(����)�� ����Ǿ� �ִ�.
		String strVar1 = "�ſ��";
		String strVar2 = "�ſ��";
		String strVar3 = new String("�ſ��");
		
		//������
		System.out.println(strVar1 == strVar2); 
		System.out.println(strVar1 == strVar3);
		System.out.println();//�� �� ����
		//���ڿ��� equals()
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		
		
		
	}

}
