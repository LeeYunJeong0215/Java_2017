package sec04.exam1_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		/*double result = 7 * 0.1;
		System.out.println(result);
		결과값이 0.700000000000001이 나옴.
		정확히 0.7이 아니다*/
				
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		//number*pieceUnit 결과값이 0.700000000000001이 나옴.
		//유도했던 값 0.3이 나오지 않는다.
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result + "조각이 남는다");
		/* 결과값
		사과 한개에서
		0.7조각을 빼면
		0.29999999999999993조각이 남는다
*/
		
	}

		

}
