package sec04.exam1_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		/*double result = 7 * 0.1;
		System.out.println(result);
		������� 0.700000000000001�� ����.
		��Ȯ�� 0.7�� �ƴϴ�*/
				
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		//number*pieceUnit ������� 0.700000000000001�� ����.
		//�����ߴ� �� 0.3�� ������ �ʴ´�.
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7������ ����");
		System.out.println(result + "������ ���´�");
		/* �����
		��� �Ѱ�����
		0.7������ ����
		0.29999999999999993������ ���´�
*/
		
	}

		

}
