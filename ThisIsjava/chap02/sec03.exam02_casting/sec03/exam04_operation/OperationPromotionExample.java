package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue1 + byteValue2; ������ ���� �߻�
		//���������̹Ƿ� �� ������ ��� int������ ����. �׷��� byte���̹Ƿ� ���� �߻�
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2;
		//�����߻�, intŸ�� ���� ����Ÿ�� ������ int�� �ڵ���ȯ�� �ǹǷ�
		//����� int�� �����µ� charŸ������ �޾����Ƿ� �����߻�.
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		//���� ������� �Ǽ��� 2.5�ε� ����/�����̹Ƿ� �������� ���� ��µ�.
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 
		//����/�Ǽ��̹Ƿ� ���������ڰ� �Ǽ������� �ٲ�� �Ǽ�/�Ǽ��� ���ε�
		//�̰��� int�� ������� �������� �ϹǷ� ������ ���� �߻�.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		

	}

}
