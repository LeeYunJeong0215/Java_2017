package sec04.exam1_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*int x = 5;
		double y = 0.0;
		
		double z1 = 5 / y;
		System.out.println(Double.isInfinite(z1));
		//infinite�̸� True, �ƴϸ� False
		
		double z2 = 5 % y;
		//System.out.println(2z); NaN�� ����
		System.out.println(Double.isNaN(z2));
		
		System.out.println(z1 + 2);
		System.out.println(z2 + 2);
		
		if(Double.isInfinite(z1) || Double.isNaN(z2)){
			System.out.println("�� ���� �Ұ�");
		}else{
			System.out.println(z1+ 2);
			System.out.println(z2+ 2);
		}*/
		
		int x = 5;
		int y = 0; //0�� ������ ��� arithmaticError�߻�
		
		try{
			int z = x / y;
			System.out.println("z=" + z);
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵ�");
		}
		
	}

}
