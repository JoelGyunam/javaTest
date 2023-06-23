package condition;

import java.util.Scanner;

public class ConditionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 두 점수 합격
//		두 개의 점수를 입력 받아서 두 점수 모두가 70점이 이상이면 합격입니다 를 출력하세요
//		입력 예시
//
//		두 점수를 입력하세요 : 87 73
//		출력 예시
//
//		합격 입니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 점수를 입력하세요 : ");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		
		if(input1 >=70 && input2 >= 70) {
			System.out.println("합격입니다.");
		} else System.out.println("불합격 입니다.");
		
		
//		2. 공배수 구하기
//		수를 입력 받아서 2와 3의 공배수인지 판별하세요.
//		입력 예시
//
//		수를 입력하세요 : 12
//		출력 예시
//
//		12는 2와 3의 공배수 입니다.
		
		System.out.print("수를 입력하세요 : ");
		int input3 = scan.nextInt();
		
		if(input3 % 6 == 0) {
			System.out.println(input3 + "는 2와 3의 공배수 입니다.");
		} else System.out.println(input3 + "는 2와 3의 공배수가 아닙니다.");
		
		
		
//		3. 범위
//		1 ~ 10 사이의 수를 입력 받아야 한다. 범위를 넘어 갈 경우 잘못 입력 하셨습니다 를 출력하세요.
//		입력 예시
//
//		1~10 사이의 수를 입력 하세요 : 14
//		출력 예시
//
//		잘못 입력 하셨습니다.
		
		System.out.print("1~10 사이의 수를 입력하세요 : ");
		int input4 = scan.nextInt();
		if(input4 >= 1 && input4 <=10) {
			System.out.println("정상 입력");
		} else System.out.println("잘못 입력하셨습니다");
		
		
	}

}
