package sec02_exam5_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14;//컴파일 에러 발생(자바는 double이 실수형 리터럴의 기본형이기 때문에)
		float var3 = 3.14F;//
		
		//정밀도 검사
		double var4 = 0.1234567890123456789;//double 타입의 가수(소수점 이하 자리)는 52비트
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		//float의 가수는 23bit이므로 0.12345678까지만 가능.
		
		//e사용하기
		int var6 = 3000000;
		//int var7 = 3e6; int는 정수타입이므로 지수와 가수로 되어있는 3e6은 같은 3백만이라도 저장되지 않는다
		//double타입으로 저장을 해야 함.
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
