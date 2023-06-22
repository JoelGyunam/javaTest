package variable;

import java.util.Scanner;

public class VariableTest05 {

	public static void main(String[] args) {
		
//		
//		1. 자릿수 쪼개기
//		네 자릿수 숫자를 입력 받아서 천의 자리부터 한 줄씩 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		1
//		2
//		3
//		4
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		int input1 = 0;
		int count = 0;
		
		for(int i = 43281; i > 1; i/=10) {
			System.out.println(i);
			count++;
		};
		System.out.println(count);
		
		
		
//		2. 자릿수 쪼개기 역순
//		네 자릿수를 입력 받아서 일의 자리부터 한 줄씩 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		4
//		3
//		2
//		1
//		3. 자릿수 합 구하기
//		네 자릿수를 입력 받아서 각 자릿수의 합을 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		합계는 10 입니다. 
//		4. 역순 출력
//		세 자리 수를 입력 받아서 역순으로 출력하세요
//		입력 예시
//
//		입력 : 123
//		출력 예시
//
//		출력 : 321
		
		
	}
}
