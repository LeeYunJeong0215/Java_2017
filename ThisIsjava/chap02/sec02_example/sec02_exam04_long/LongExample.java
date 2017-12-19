package sec02_exam04_long;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long var1 = 10;
		long var2 = 20L;//20을 4바이트수가 아닌 8바이트의 수로 해석하라
		
		long var3 = 10000000000L;//L을 붙이지 않으면 수가 너무 크므로 컴파일 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
