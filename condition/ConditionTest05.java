package condition;

import java.util.Scanner;

public class ConditionTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.짝수 구하기
//		세개의 수를 입력 받아서 짝수일 때만 그 값을 출력 하세요.
//		입력 예시
//
//		세개의 수를 입력 하세요 : 4 6 9
//		출력 예시
//
//		4는 짝수 입니다. 
//		6은 짝수 입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 수를 입력하세요 (짝수 찾기)");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		int array[] = {input1, input2, input3};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i] + "는 짝수입니다");
			};
		}
				
		
//		2. 비만도 구하기
//		BMI 수치를 입력 받아서 비만 판정을 출력하세요.
//
//		bmi 수치	비만도
//		~ 10 이하	정상
//		~ 20 이하	과체중
//		20 ~ 초과	비만
//		입력 예시
//
//		bmi 수치를 입력 하세요 : 18
//		출력 예시
//
//		과체중
		System.out.print("bmi 수치를 입력하세요 : ");
		int input4 = scan.nextInt();
		
		switch (input4/10) {
		case 0 : System.out.println("정상"); break;
		case 1 : System.out.println("과체중"); break;
		case 2 : System.out.println("비만"); break;
		default : System.out.println("비만");
		}
		
		
//		3. 평균 합격 구하기
//		두 점수를 입력 받고 , 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		입력 예시
//
//		두 점수를 입력 하세요 : 87 95
//		출력 예시
//
//		합격입니다.
		
		System.out.println("두 점수를 입력하세요");
		int input5 = scan.nextInt();
		int input6 = scan.nextInt();
		double avg = (input5+input6)/2;
		
		if(avg >= 70.0) {
			System.out.println("합격입니다");
		} else if(avg < 70) {
			System.out.println("불합격 입니다");
		}
		
		
		
//		4. 큰값 구하기
//		세 개의 정수를 입력 받아, 가장 큰값을 출력 하세요.
//		입력 예시
//
//		세 수를 입력 하세요 : 3 8 5
//		출력 예시
//
//		8
		System.out.println("세 수를 입력하세요 (가장 큰 값 출력)");
		int input7 = scan.nextInt();
		int input8 = scan.nextInt();
		int input9 = scan.nextInt();
		int largest = 0;
		
		int array2[] = {input7, input8, input9};
		
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] > 0) {
				largest = array2[i];
			}
		}
		
		System.out.println(largest);
		
//		5. 계절 구하기
//		월(month)를 입력 받아서 어떤 계절인지 출력하세요.
//
//		월	계절
//		3, 4, 5	봄
//		6, 7, 8	여름
//		9, 10, 11	가을
//		12, 1, 2	겨울
//		입력 예시
//
//		월을 입력 하세요 : 5
//		출력 예시
//
//		봄
		
		System.out.print("월을 입력하세요 : ");
		int input10 = scan.nextInt();
		
		switch(input10) {
		case 3 : ;
		case 4 : ;
		case 5 : System.out.println("봄"); break;
		case 6 : ;
		case 7 : ;
		case 8 : System.out.println("여름"); break;
		case 9 : ;
		case 10 :;
		case 11 : System.out.println("가을"); break;
		case 12 : ;
		case 1 : ;
		case 2 : System.out.println("겨울"); break;
		default : System.out.println("잘못된 입력입니다.");
				};
		
		
	}

}
