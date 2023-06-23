package iterator;

import java.util.Scanner;

public class IteratorTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 무한루프 탈출
//		무한 루프와 break를 이용해서 Hello World를 8번 출력 하세요.
//		출력 예시
//
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
		int i = 1;
		while(true) {
			System.out.println("Hellow World!!");
			i++;
			if(i > 8) {
				break;
			}
		}
		
		
		
//		2. 짝수 출력
//		continue 를 이용해서 1~10 사이 수 중에 짝수만 출력 하세요.
//		출력 예시
//
//		2 4 6 8 10 
		
		
		for(int j = 1; j <= 10; j++) {
			if(j % 2 != 0) {
				continue;
			}
			System.out.print(j + " ");
		}
		
		System.out.println();
//		3. 배수 출력
//		수를 입력 받고 continue 를 이용해서 1~ 100까지 사이의 수중에 입력 받은 수의 배수만 출력 하세요
//		입력 예시
//
//		수를 입력하세요 : 9
//		출력 예시
//
//		9 18 27 36 45 54 63 72 81 90 99 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int input1 = scan.nextInt();
		for(int k = 1; k < 100; k++) {
			if(k % input1 != 0) {
				continue;
			}
			System.out.print(k + " ");
		}
		
		
//		4. 무한 입력
//		무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
//		입력이 끝나면 "끝"을 출력하세요
//		입력 예시
//
//		수를 입력하세요 : 21
//		수를 입력하세요 : 24
//		수를 입력하세요 : 83
//		수를 입력하세요 : 2
//		수를 입력하세요 : 9
//		수를 입력하세요 : 0
//		출력 예시
//
//		끝

		System.out.println();
		
		int input2 = 0;
		while(true) {
			System.out.print("수를 입력하세요 : ");
			input2 = scan.nextInt();
			if(input2 == 0) {
				break;
			}
		}
		
		
	}

}
