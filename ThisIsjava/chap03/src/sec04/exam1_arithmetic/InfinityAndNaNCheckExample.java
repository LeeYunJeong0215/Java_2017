package sec04.exam1_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*int x = 5;
		double y = 0.0;
		
		double z1 = 5 / y;
		System.out.println(Double.isInfinite(z1));
		//infinite이면 True, 아니면 False
		
		double z2 = 5 % y;
		//System.out.println(2z); NaN이 나옴
		System.out.println(Double.isNaN(z2));
		
		System.out.println(z1 + 2);
		System.out.println(z2 + 2);
		
		if(Double.isInfinite(z1) || Double.isNaN(z2)){
			System.out.println("값 산출 불가");
		}else{
			System.out.println(z1+ 2);
			System.out.println(z2+ 2);
		}*/
		
		int x = 5;
		int y = 0; //0이 정수의 경우 arithmaticError발생
		
		try{
			int z = x / y;
			System.out.println("z=" + z);
		}catch(ArithmeticException e){
			System.out.println("0으로 나누면 안됨");
		}
		
	}

}
