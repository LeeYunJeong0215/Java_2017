package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수는 선언된 블록내에서만 사용이 가능하다.
		int var1;

		if (true) {
			int var2;

			var1 = 10;
			var2 = 20;
		}
		var1 = 10;
		// var2 = 20;은 오류남. if블록을 벗어나서 사용불가

		for (int i = 0; i < 1; i++) {
			int var3;

			var1 = 10;
			var3 = 30;
		}
		var1 = 10;
		// var3 = 30; 역시 오류 발생. for 블록을 벗어나서 사용불가.

	}

}
