package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		//int i = 128; //byte타입은 -128~127까지만 저장할 수 있으므로 byte범위를 초과함.
		int i = 125;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { //byte타입의 최소값(-128) 또는 최대값(127)을 넘을경우 실행
			System.out.println("byte 타입으로 변환할 수 없습니다");
			System.out.println("값을 다시 확인해주세요");
		} else {//위의 조건이 맞지 않으면 실행됨. 즉 저장범위내이면 강제타입변환 실행.
			byte b = (byte) i;
		}
		byte b = (byte) i ;
		//byte b = (byte) i;//그래서 여기에는 쓰레기 값이 들어갈 것이다.
		System.out.println(b);
	}

}
