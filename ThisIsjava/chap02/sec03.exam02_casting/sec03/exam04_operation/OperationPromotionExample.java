package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue1 + byteValue2; 컴파일 에러 발생
		//정수연산이므로 두 연산자 모두 int형으로 변함. 그래서 byte형이므로 에러 발생
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2;
		//에러발생, int타입 이하 정수타입 연산은 int로 자동변환이 되므로
		//결과는 int가 나오는데 char타입으로 받았으므로 오류발생.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		//원래 결과값은 실수인 2.5인데 정수/정수이므로 정수값인 몫이 출력됨.
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 
		//정수/실수이므로 정수연산자가 실수형으로 바뀌어 실수/실수인 셈인데
		//이것을 int로 결과값을 받으려고 하므로 컴파일 오류 발생.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		

	}

}
