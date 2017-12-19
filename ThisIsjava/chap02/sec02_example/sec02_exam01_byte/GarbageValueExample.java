package sec02_exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;

		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + '\t' + "var2 :" + var2);
		}
		var1++;
		System.out.println(var1);

		var1++;
		System.out.println(var1);

		// byte값의 범위를 초과한다고 에러가 나는게 아니라
		// 다시 순회해서 -128부터 다시 시작
		var1++;
		System.out.println(var1);

		var1++;
		System.out.println(var1);

	}

}
