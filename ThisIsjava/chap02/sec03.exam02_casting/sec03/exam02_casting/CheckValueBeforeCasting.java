package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		//int i = 128; //byteŸ���� -128~127������ ������ �� �����Ƿ� byte������ �ʰ���.
		int i = 125;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { //byteŸ���� �ּҰ�(-128) �Ǵ� �ִ밪(127)�� ������� ����
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�");
			System.out.println("���� �ٽ� Ȯ�����ּ���");
		} else {//���� ������ ���� ������ �����. �� ����������̸� ����Ÿ�Ժ�ȯ ����.
			byte b = (byte) i;
		}
		byte b = (byte) i ;
		//byte b = (byte) i;//�׷��� ���⿡�� ������ ���� �� ���̴�.
		System.out.println(b);
	}

}
