package sec04.exam1_arithmetic;

public class inputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";

		double val = Double.valueOf(userInput);
		// 문자열 -> double로 변환

		double currentBalance = 10000.0;

		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
