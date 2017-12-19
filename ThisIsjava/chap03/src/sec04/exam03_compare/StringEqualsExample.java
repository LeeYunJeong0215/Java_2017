package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		//strVar1,2,3에는 문자열이 직접 저장되어 있는것이 아니라
		//참조(번지)가 저장되어 있다.
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		String strVar3 = new String("신용권");
		
		//번지비교
		System.out.println(strVar1 == strVar2); 
		System.out.println(strVar1 == strVar3);
		System.out.println();//한 행 띄우기
		//문자열비교 equals()
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		
		
		
	}

}
