package variable;

import java.util.Scanner;

public class VariableTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 입력 출력
//		나이를 입력 받아서 아래와 같이 출력하세요.
//		입력 예시
//
//		나이를 입력하세요 
//		24
//		출력 예시
//
//		이름 : 김인규 나이 : 24
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String inputName = scan.nextLine();		
		System.out.println("나이를 입력하세요");
		int inputAge = scan.nextInt();
		System.out.println("이름 : " + inputName + " 나이 : " + inputAge);
		
		
//		2. 입력과 더하기
//		두 수를 입력 받아서 더하고 아래와 같이 출력하세요.
//		입력 예시
//
//		두 수를 입력 하세요 
//		3 5
//		출력 예시
//
//		3 + 5 = 8
		System.out.println("두 수를 입력하세요(더하기)");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
		
		
		
//		3. 입력과 빼기
//		두 수를 입력 받아서 빼고 아래와 같이 출력하세요.
//		입력 예시
//
//		두 수를 입력 하세요
//		3 5
//		출력 예시
//
//		3 - 5 = -2;
		System.out.println("두 수를 입력하세요(빼기)");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2) );
		
		
//		4. 구구단
//		단수를 입력 받고 아래와 같이 구구단을 출력하세요.
//		입력 예시
//
//		단수를 입력 하세요 : 5
//		출력 예시
//
//		5 X 1 = 5
//		5 X 2 = 10
//		5 X 3 = 15
//		5 X 4 = 20
//		5 X 5 = 25
		System.out.print("단수를 입력하세요 : ");
		num1 = scan.nextInt();
		for(int i=0; i < 9; i++) {
			System.out.println(num1 + " X " + i + " = " + num1*i );
		};
		
		
//		5. 원 넓이 구하기
//		지름을 입력 받아서 원의 넓이를 구하여 출력하세요.
//		pi는 3.14
//		입력 예시
//
//		지름을 입력하세요 :  24
//		출력 예시
//
//		원의 넓이는 452.16 입니다.
		System.out.print("지름을 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.println("원의 넓이는 " + (num1/2)*(num1/2)*3.14 +" 입니다.");
	}

}
