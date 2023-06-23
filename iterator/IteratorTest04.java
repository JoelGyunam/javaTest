package iterator;

import java.util.Scanner;

public class IteratorTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 합 구하기
//		수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 45
//		출력 예시
//
//		합 : 1035
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 입력하는 수까지의 합");
		int input1 = scan.nextInt();
		int sum1 = 0;
		for(int i = 0; i <= input1; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
//		2. 합과 평균 구하기
//		반복문으로 5개의 수를 입력 받아서 총합과 평균을 출력하세요.
//		입력 예시
//
//		1 번째 수를 입력 하세요 : 
//		3
//		2 번째 수를 입력 하세요 : 
//		59
//		3 번째 수를 입력 하세요 : 
//		43
//		4 번째 수를 입력 하세요 : 
//		20
//		5 번째 수를 입력 하세요 : 
//		659
//		출력 예시
//
//		총합 : 784 평균 : 156.8
		int sum2 = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 수를 입력하세요 : ");
			sum2 += scan.nextInt();
		}
		System.out.println("총합 : " + sum2);
		System.out.println("평균 : " + sum2/5.0);
		
		
//		3. 팩토리얼
//		팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//		수를 입력 받고 그 수의 팩토리얼을 출력하세요.
//		입력 받는 수의 최대값은 10이다.
//		입력 예시
//
//		수를 입력 하세요 : 8
//		출력 예시
//
//		8! = 40320
		int input3 = 0;
		int j = 1;
		int result = 1;
		System.out.println("팩토리얼 구하기");
		input3 = scan.nextInt();
		while(j <= input3) {
			result *= j;
			j++;
		}
		System.out.println(input3 + "! = " + result);
		
//		4. 최소값
//		반복문으로 5개의 수를 입력 받아서 최소 값을 출력하세요.
//		입력값의 최대 값은 1000 입니다.
//		입력 예시
//
//		1 번째 수를 입력 하세요 : 
//		4
//		2 번째 수를 입력 하세요 : 
//		29
//		3 번째 수를 입력 하세요 : 
//		9
//		4 번째 수를 입력 하세요 : 
//		398
//		5 번째 수를 입력 하세요 : 
//		-4
//		출력 예시
//
//		최소값은 -4입니다.
		System.out.println("1 번째 수를 입력하세요");
		int input4 = scan.nextInt();
		int minNum = input4;
		for(int i = 2; i <= 5; i++) {
			System.out.println(i + "번째 수를 입력하세요");
			input4 = scan.nextInt();
			if(input4 < minNum) {
				minNum = input4;
			}
		}
		System.out.println("최소값은 " + minNum + "입니다");
		
//		5. 약수 구하기
//		수를 입력 받아서 그 수의 약수를 모두 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 24
//		출력 예시
//
//		1 2 3 4 6 8 12 24
		int input5 = 0;
		System.out.println("약수 구하기");
		input5 = scan.nextInt();
		for(int i = 1; i <= input5; i++) {
			if(input5 % i == 0) {
				System.out.print(i + " ");
			};
		}
		
		
	}

}
