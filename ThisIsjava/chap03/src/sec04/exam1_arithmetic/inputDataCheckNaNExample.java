package sec04.exam1_arithmetic;

public class inputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";

		double val = Double.valueOf(userInput);
		// ���ڿ� -> double�� ��ȯ

		double currentBalance = 10000.0;

		if (Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
