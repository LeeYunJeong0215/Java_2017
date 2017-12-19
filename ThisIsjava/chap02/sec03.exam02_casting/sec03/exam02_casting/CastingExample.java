package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		//44032라는 값이 유니코드번호로 저장이 되어서
		//출력값이 '가'가 나옴.
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		//intValue = longValue; 컴파일 에러 발생
		intValue = (int)longValue;
		System.out.println(intValue);
				
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		//double타입을 int로 강제변환하면 정수값만 출력됨.
	}

}
