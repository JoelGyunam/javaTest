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
		
		System.out.println("입력 (천의 자리부터 한줄씩 출력)");
		int input1 = scan.nextInt();
		int digit = 0; //자리수

		int devide = 1; //몇으로 나눌 것 인지
		
		// 몇의 자리인지 구하기
		for(int i = input1; i>=1; i/=10) {
			digit++;			
		};
		int forCount = digit;
				
		for(int i=0; i < digit-1; i++) {
			
			//10에 자리수 만큼 제곱하기
			int k = 1; // 자리수 제곱할 기준 숫자 초기화
			for(int j = 1; j < forCount; j++) {
				k *= 10;
				devide = k;
	//			System.out.println(input1 / devide);
			};
			
			System.out.println(input1/devide);
			input1 = input1 % devide;
			forCount--;
		};
		
		int lastDigit = input1 % 10;
		System.out.println(lastDigit);
		
		
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
		
		
		System.out.println("입력 (일의 자리부터 한줄 씩 출력)");
		int input2 = scan.nextInt();
		
		int digit2 = 0;
		//자리수 구하기
		for(int i = input2; i >= 1; i/=10) {
			digit2++;			
		};
		
		for(int i = 0; i < digit2; i++) {
			System.out.println(input2 % 10);
			input2 = input2 / 10;
		};
		
		
		
//		3. 자릿수 합 구하기
//		네 자릿수를 입력 받아서 각 자릿수의 합을 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		합계는 10 입니다. 
		
		System.out.println("각 자리수 합 구하기");
		int input3 = scan.nextInt();
		int digit3 = 0;
		int total3 = 0;

		for(int i = input3; i > 1; i/=10) {
			digit3 ++;
		};
				
		for(int i = 0; i < digit3; i++) {
			total3 += input3 % 10;
			input3 = input3 / 10;
		};
		
		System.out.println(total3);
		
		
//		4. 역순 출력
//		세 자리 수를 입력 받아서 역순으로 출력하세요
//		입력 예시
//
//		입력 : 123
//		출력 예시
//
//		출력 : 321
		
		System.out.println("역순 출력");
		int input4 = scan.nextInt();
		int digit4 = 0;
		
		// 자리수 확인
		for(int i = input4; i >=1; i/=10) {
			digit4 ++;
		};
		
		for(int i = 0; i < input4; i++) {
			System.out.println(input4 % 10);
			input4 /= 10;
		};
		
	}
}
