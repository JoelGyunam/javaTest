package variable;

public class VariableTest01 {
	public static void main(String[] args) {
//		아래 문장을 변수를 사용하여 출력하세요.
//		 이름 : 김인규 나이 : 30
//
//		  3 + 5 = 8
//
//		  3 - 5 =  -2
//
//		  5 X 1 = 5
//		  5 X 2 = 10
//		  5 X 3 = 15
//		  5 X 4 = 20
//		  5 X 5 = 25
		
		int numbThree = 3;
		int numbFive = 5;
		
		System.out.println(numbThree + " + " + numbFive + " = " + (numbThree+numbFive));
		System.out.println(numbThree + " - " + numbFive + " = " + (numbThree-numbFive));
		
		for(int i = 1; i <= 5; i++) {
			int result = numbFive*i;
			System.out.println(numbFive + " X " + i + " = " + result);
		}
	}
}
