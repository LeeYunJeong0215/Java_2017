package sec03_example_promotion;

public class promotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; // 4����Ʈ = 1����Ʈ
		System.out.println(intValue);

		char charValue = '��';
		intValue = charValue; // 4����Ʈ = 2����Ʈ
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue; //8����Ʈ = 4����Ʈ
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //8����Ʈ = 4����Ʈ
		System.out.println(doubleValue);
		
		longValue = 100000000000L;
		float floatValue = longValue; // 4����Ʈ = 8����Ʈ
		//�ٵ� �� ������ �߻����� �ʰ� �ڵ�Ÿ�Ժ�ȯ�� �ɱ�?
		//float�� �ε��Ҽ��� ����� ���� ������ �� ū �� ǥ���� �����ϴ�.
		//�׷��� ������ �߻����� ����.
		System.out.println(floatValue);
	}

}
