package condition;

import java.util.Scanner;

public class ConditionTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 과락 포함 합격 여부
//		점수 두 개를 입력 받고 합격 여부를 출력 하라
//		평균이 60점 이상이면 "합격"
//		한 과목이라도 50점 이하면 무조건 "과락"
//		평균이 60점 미만이면 "불합격"
//
//		입력 예시
//
//		점수1 : 95
//		점수2 : 48
//		출력 예시
//
//		과락
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수1 : ");
		int score1 = scan.nextInt();
		System.out.print("점수2 : ");
		int score2 = scan.nextInt();
		
		double avg = (score1 + score2)/2.0;
		
		if(avg < 60) {
			System.out.println("불합격");
		} else if (score1 < 60 || score2 < 60) {
			System.out.println("과락");
		} else if (score1 >= 60 && score2 >= 60 && avg >= 60.0) {
			System.out.println("합격");
		};
		
//		2. 윤년 구하기
//		연도를 입력 받아서 윤년인지 출력하시오
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 윤년이다.
//		입력 예시
//
//		연도 : 2020
//		출력 예시
//
//		윤년
		
		System.out.print("연도(윤년여부) : ");
		int year = scan.nextInt();
		if(year % 100 == 0 ) {
			System.out.println("윤년 아님");
		} else if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("윤년 임");
		} else System.out.println("윤년 아님");
		
//		3. 가위 바위 보 게임
//		철수와 영희가 가위(1), 바위(2), 보(3) 게임을 진행할때, 게임에서 이긴 사람을 출력하세요
//		영희의 가위바위보를 숫자로 먼저 입력 받고 그다음에 철수의 가위바위보를 숫자로 입력 받는다.
//		입력 예시
//
//		영희 공격 : 2
//		철수 공격 : 3
//		출력 예시
//
//		철수가 이겼다
		System.out.print("영희 공격 : ");
		int player1 = scan.nextInt();
		System.out.print("철수 공격 : ");
		int player2 = scan.nextInt();
		
		if(player1 > player2) {
			System.out.println("영희가 이겼다");
		} else if(player1 < player2) {
			System.out.println("철수가 이겼다");
		} else if(player1 == player2) {
			System.out.println("비겼다");
		}
		
		
//		4. 45분전
//		시간(hour)과 분(min)이 주어질 때, 해당 시간보다 45분전의 시간을 계산하여 출력하세요
//		시간은 24시간 표현방법을 사용한다
//
//		입력 예시
//
//		시간 분 입력 : 4 30
//		출력 예시
//
//		3시 45분
		
		System.out.print("시간 분 입력 : ");
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		int minuteCal = ((hour*60)+minute)-45;
		
		System.out.println(minuteCal/60 + "시" + minuteCal%60 + " 분");
		
		
//		5. 윷놀이
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
//		윷놀이는 4개의 윷을 이용하는 게임이다.
//
//		도 : 1개가 뒤집어진 상태
//		개 : 2개가 뒤집어진 상태
//		걸 : 3개가 뒤집어진 상태
//		윷 : 4개가 뒤집어진 상태
//		모 : 하나도 뒤집어지지 않은 상태
//
//		입력 예시
//
//		윷 상태를 입력하세요 : 0 1 1 1
//		출력 예시
//
//		걸
		System.out.println("윷 상태를 입력하세요 : ");
		int yut1 = scan.nextInt();
		int yut2 = scan.nextInt();
		int yut3 = scan.nextInt();
		int yut4 = scan.nextInt();
		
		int yutScore = (yut1 + yut2 + yut3 + yut4);
		
		switch (yutScore) {
		case 0 : System.out.println("모"); break;
		case 1 : System.out.println("도"); break;
		case 2 : System.out.println("개"); break;
		case 3 : System.out.println("걸"); break;
		case 4 : System.out.println("윷"); break;
		default : System.out.println("잘못된 입력입니다");
		}
		
	}

}
