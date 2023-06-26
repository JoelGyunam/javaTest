package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IteratorTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 알파벳 출력
//		반복문을 이용해서 A~Z 까지 출력하세요
//		출력 예시
//
//		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

		
//		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y"};
		for(char i='A'; i < 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		2. 합 구하기
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 출력하세요.
//		단, 합이 100이 넘으면 합을 중단하고 그때 까지의 합을 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 85
//		출력 예시
//
//		105
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력 하세요 : ");
		int inputA = scan.nextInt();
		int sum1 = 0;
		for(int i = 1; i <= inputA; i++) {
			sum1 += i;
			if(sum1 > 100) {
				break;
			}
		}
		System.out.println(sum1);
		
		
//		3. 등차수열
//		1 4 7 10 13 16 19 22 25 ... 은
//		1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
//		이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여
//		등차(차이가 같다의 한문 말) 수열이라고 한다.
//
//		시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하세요.
//		입력 예시
//
//		세개의 수를 입력 하세요 : 1 3 10
//		출력 예시
//
//		28
		System.out.print("시작값 : ");
		int startNum = scan.nextInt();
		System.out.print("등차 : ");
		int distinct = scan.nextInt();
		System.out.print("몇 번째? : ");;
		int order = scan.nextInt()-1;
		int result = 0;
		
		result = (distinct*(order))+startNum;
		System.out.println(result);
		
		
//		4. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//
//		수를 입력 받고 그 수가 소수(prime)인지 아닌지 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 73
//		출력 예시
//
//		소수 입니다.
		
		System.out.print("소수 인지 확인 : ");
		int input2 = scan.nextInt();
		if(input2 % input2 == 0) {
			System.out.println("소수입니다.");
		} else System.out.println("소수가 아닙니다");
		
		
//		5. 가위 바위보 대결
//		컴퓨터와 가위 바위 보 게임을 하고 승리 결과를 출력하세요.
//		총 5판 3선승제 로 둘 중하나가 이기면 경기를 끝내고 승리 결과를 출력한다.
//		가위 : 1 바위 : 2 보 : 3
//		컴퓨터는 랜덤 클래스를 통해서 게임을 진행한다.
//		랜덤 클래스 사용법과 입력 방식은 아래와 같다.
//		Random rand = new Random();
//
//		int youWin = 0;
//		int computerWin = 0;
//		for(int i = 0; i < 5; i++) {
//		    int computerPlay = rand.nextInt(3) + 1;
//		    System.out.print("가위(1) 바위(2) 보(3)!! : ");
//		    number = scan.nextInt();
//		입출력 예시
//
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 2 -비겼습니다.
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 2 -비겼습니다.
//		가위(1) 바위(2) 보(3)!! : 3
//		computer : 1 -졌습니다.
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 3 -졌습니다.
//		가위(1) 바위(2) 보(3)!! : 1
//		computer : 1 -비겼습니다.
//		최종 결과 0:2 로 당신의 패배 입니다.
		
		int userWin = 0;
		int comWin = 0;
		int userCard = 0;
		Random rand = new Random();
		int playTime = 0;
		int randNum = 0;
		String result1 = "";
		List<String> rockscissorspaper= new ArrayList<String>();
		rockscissorspaper.add(0,"가위"); // ArrayList 에서 index는 무조건 0부터 시작되어야 하는가?
		rockscissorspaper.add(1,"바위");
		rockscissorspaper.add(2,"보");
			
		
		for(int i = playTime; playTime <3;) {
			
			System.out.print("\n1은 가위, 2는 바위, 3은 보. 1~3중에 입력하세요 : ");
			userCard = scan.nextInt();
			randNum = rand.nextInt(3)+1;
			
			if(userCard == 1 && randNum == 3) {
				System.out.println("이겼습니다 (당신 : " + rockscissorspaper.get(userCard-1) + " / 컴퓨터 : " + rockscissorspaper.get(randNum-1) + ")");
				userWin ++;
			} else if(userCard == 3 && randNum ==1) {
				System.out.println("졌습니다  (당신 : " + rockscissorspaper.get(userCard-1) + " / 컴퓨터 : " + rockscissorspaper.get(randNum-1) + ")");
				comWin ++;
			} else if(userCard < randNum) {
				System.out.println("졌습니다 (당신 : " + rockscissorspaper.get(userCard-1) + " / 컴퓨터 : " + rockscissorspaper.get(randNum-1) + ")");
				comWin ++;
			} else if(userCard > randNum) {
				System.out.println("이겼습니다 (당신 : " + rockscissorspaper.get(userCard-1) + " / 컴퓨터 : " + rockscissorspaper.get(randNum-1) + ")");
				userWin ++;
			} else if(userCard == randNum) {
				System.out.println("무승부 입니다 (당신 : " + rockscissorspaper.get(userCard-1) + " / 컴퓨터 : " + rockscissorspaper.get(randNum-1) + ")");
			}
			
			if(userWin >= comWin) {
				playTime = userWin;
				result1 = "승리";
			} else if(userWin <= comWin) {
				playTime = comWin;
				result1 = "패배";
			};
		}
		System.out.println("\n 최종 결과 " + userWin + " : " + comWin + "로 당신의 " + result1 + "입니다.");
	}

}
