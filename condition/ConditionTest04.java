package condition;

import java.util.Scanner;

public class ConditionTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		요일 구하기
//		1 일이 수요일 일때,
//		1 ~ 7일 사이의 날짜를 입력 받고 해당 요일을 출력하세요.
//		입력 예시
//
//		1~7 사이의 날짜를 입력하세요 : 5
//		출력 예시
//
//		일요일
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 7 사이의 날짜를 입력하세요 : ");
		
		int input1 = scan.nextInt();
		
		switch (input1) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		default : System.out.println("잘못된 입력입니다");
		}
		
		
	}

}
