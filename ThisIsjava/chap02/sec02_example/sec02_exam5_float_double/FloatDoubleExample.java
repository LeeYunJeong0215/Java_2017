package sec02_exam5_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// �Ǽ��� ����
		double var1 = 3.14;
		//float var2 = 3.14;//������ ���� �߻�(�ڹٴ� double�� �Ǽ��� ���ͷ��� �⺻���̱� ������)
		float var3 = 3.14F;//
		
		//���е� �˻�
		double var4 = 0.1234567890123456789;//double Ÿ���� ����(�Ҽ��� ���� �ڸ�)�� 52��Ʈ
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		//float�� ������ 23bit�̹Ƿ� 0.12345678������ ����.
		
		//e����ϱ�
		int var6 = 3000000;
		//int var7 = 3e6; int�� ����Ÿ���̹Ƿ� ������ ������ �Ǿ��ִ� 3e6�� ���� 3�鸸�̶� ������� �ʴ´�
		//doubleŸ������ ������ �ؾ� ��.
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
