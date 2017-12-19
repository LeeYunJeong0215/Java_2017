package sec03_example_promotion;

public class promotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; // 4바이트 = 1바이트
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue; // 4바이트 = 2바이트
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue; //8바이트 = 4바이트
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //8바이트 = 4바이트
		System.out.println(doubleValue);
		
		longValue = 100000000000L;
		float floatValue = longValue; // 4바이트 = 8바이트
		//근데 왜 에러가 발생하지 않고 자동타입변환이 될까?
		//float는 부동소수점 방식을 쓰기 때문에 더 큰 수 표현이 가능하다.
		//그래서 에러가 발생하지 않음.
		System.out.println(floatValue);
	}

}
