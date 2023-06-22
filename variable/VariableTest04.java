package variable;

import java.util.Scanner;

public class VariableTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사칙연산
//		두 수를 입력 받아서 덧셈 뺄셈 곱하기 나누기한 결과를 출력하세요
//		입력 예시
//
//		입력1 : 5
//		입력2 : 9
//		출력 예시
//
//		덧셈 : 14
//		뺄셈 : -4
//		곱셈 : 45
//		나눗셈 : 0
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 1");
		int num1 = scan.nextInt();
		System.out.print("입력 2");
		int num2 = scan.nextInt();
		
		System.out.println("덧셈 : " + (num1+num2));
		System.out.println("뺄셈 : " + (num1-num2));
		System.out.println("곱셈 : " + (num1*num2));
		System.out.println("나눗셈 : " + (num1/num2));
		
		
//		2. 몫과 나머지
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		입력 예시
//
//		입력1 : 843
//		입력2 : 8
//		출력 예시
//
//		몫 : 105 나머지 : 3
		System.out.print("입력 1");
		num1 = scan.nextInt();
		System.out.print("입력 2");
		num2 = scan.nextInt();
		System.out.println("몫 : " + num1/num2 + " 나머지 : " + num1%num2);
		
		
//		3. 정사각형 넓이
//		입력 받은 숫자의 값을 한 변의 길이로 하는 가진 정사각형의 넓이를 구하여 출력하세요.
//		입력 예시
//
//		길이 : 43
//		출력 예시
//
//		정사각형의 넓이 : 1849
		System.out.print("길이 : ");
		num1 = scan.nextInt();		
		System.out.println("정사각형의 넓이 : " + num1*num1);
		
//		4. 삼각형의 넓이
//		밑변 과 높이를 입력 받아서 삼각형의 넓이를 구하여 출력하세요.
//		입력 예시
//
//		밑변 : 13
//		높이 : 9
//		출력 예시
//
//		삼각형의 넓이 : 58.5
		System.out.print("밑변 : ");
		num1 = scan.nextInt();
		System.out.print("높이 : ");
		num2 = scan.nextInt();
		System.out.println("삼각형의 넓이 : " + (num1*num2)/2.0);
		
//		5. 교체
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//
//		x : 6
//		y : 4
//		출력 예시
//
//		x : 4 y : 6
		System.out.print("x : ");
		num1 = scan.nextInt();
		System.out.print("y : ");
		num2 = scan.nextInt();
		System.out.println("x : " + num2 + " y : " + num1);
		
		
//		6. 초 변환
//		초를 입력 받아서 ?분?초 형태로 출력하세요.
//		입력 예시
//
//		초 : 464
//		출력 예시
//
//		7분 44초
		System.out.print("초 : ");
		num1 = scan.nextInt();		
		System.out.println(num1/60 + "분 " + num1%60 + "초");
		
	}

}
