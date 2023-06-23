package condition;

import java.util.Scanner;

public class ConditionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 수 비교
//		수를 하나 입력 받아서 10보다 큰 수 인지 작은 수 인지 출력하세요.
//		입력 예시
//
//		수를 입력하세요 : 8
//		출력 예시
//
//		8는 10보다 작습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int input1 = scan.nextInt();
		if(input1 == 10) {
			System.out.println("두 수가 동일합니다");
		} else if(input1 > 10) {
			System.out.println(input1 + "은 10보다 큽니다");
		} else if(input1 < 10) {
			System.out.println(input1 + "은 10보다 작습니다");
		};
		
		
//		2. 수 비교
//		두 수 a, b 를 입력 받아서 a가 클 경우 ">" 를 b가 클 경우 "<"를 같을 경우 "=="를 출력하세요
//		입력 예시
//
//		두 개의 수를 입력하세요 : 43 22
//		출력 예시
//
//		>
		
		System.out.print("두 개의 수를 입력하세요 : ");
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		
		if(input2 == input3) {
			System.out.println(input2 + " = " + input3);
		}else if(input2 > input3) {
			System.out.println(input2 + " > " + input3);
		}else if(input2 < input3) {
			System.out.println(input2 + " < " + input3);
		};
		
		
//		3. 시험 합격
//		70점 이상이면 합격하는 시험에서 점수를 입력 받아서 합격 여부를 출력하세요.
//		입력 예시
//
//		성적을 입력하세요 : 86
//		출력 예시
//
//		합격 입니다.
		
		System.out.print("성적을 입력하세요 : ");
		int input4 = scan.nextInt();
		
		if(input4 < 70) {
			System.out.println("불합격 입니다");
		}else if(input4 >= 70) {
			System.out.println("합격입니다.");
		};
		
		
//		4. 홀짝 검사
//		수를 입력 받아서 짝수 인지 홀수 인지 출력하세요.
//		입력 예시
//
//		수를 입력하세요 : 4
//		출력 예시
//
//		짝수
		
		System.out.println("짝수 / 홀수 검사");
		int input5 = scan.nextInt();
		if(input5%2 == 0) {
			System.out.println("짝수");
		} else if(input5%2 > 0) {
			System.out.println("홀수");
		};
		
		
	}

}
