package sec04.exam1_arithmetic;

public class inputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		//���ڿ� -> double�� ��ȯ
		
		double currentBalance = 10000.0;
		
		currentBalance = currentBalance + val;
		System.out.println(currentBalance);
	}
}
