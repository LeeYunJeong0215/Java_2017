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

		// byte���� ������ �ʰ��Ѵٰ� ������ ���°� �ƴ϶�
		// �ٽ� ��ȸ�ؼ� -128���� �ٽ� ����
		var1++;
		System.out.println(var1);

		var1++;
		System.out.println(var1);

	}

}
