package variable;

public class VariableTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 변수 출력
//		아래 문장을 변수를 사용하여 출력하세요.
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		String[][] scoreArray = {
				{"90","A","4.0"},
				{"80","B","3.0"},
		};
				
		System.out.println("시험성적이 " + scoreArray[0][0] + "점 이상이면 \'" + scoreArray[0][1] + "\'학점이고 평점은 " +  scoreArray[0][2] + " 입니다.");
		System.out.println("시험성적이 " + scoreArray[1][0] + "점 이상이면 \'" + scoreArray[1][1] + "\'학점이고 평점은 " +  scoreArray[1][2] + " 입니다.");


//		2. 실수 연산
//		아래 정수와 실수를 곱해서 출력하세요
//		두 수의 곱 : 1165.7250000000001
		int number1 = 33;
		double number2 = 35.325;
		
		System.out.println("두 수의 곱 : " + number1*number2);

		
//		3. 날짜 구하기
//		943 시간은 며칠 인지 구하여 출력하세요.
//		943시간은 39일 입니다.
		int targetHour = 943;
		System.out.println(targetHour + "시간은 " + targetHour/24 + "일 입니다.");
		
		
//		4. 도형 넓이 구하기
//		가로 길이 8 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//		넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요.
//		사각형의 넓이 : 72
//		삼각형의 넓이 : 36.0
		int width = 8;
		int height = 9;
		int rectangleArea = width * height;
		double trangleArea = rectangleArea * 0.5;
		System.out.println("사각형의 넓이 : " + rectangleArea);
		System.out.println("삼각형의 넒이 : " + trangleArea);
		
		
//		5. 평균 구하기
//		아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//		국어 : 93 수학 : 88 영어 : 94
//		국어 93점, 수학 88점, 영어 94점
//		평균 : 91.66666666666667
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (korean+math+english)/3.0;
		System.out.println("국어 " + korean + "점, " + "수학 " + math + "점, " + "영어 " + english + "점");
		System.out.println("평균 : " + average);
		
		
//		6. 화씨 구하기
//		아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//		화씨 온도 = 9 / 5 * 섭씨 온도 + 32
//
//		섭씨 30도는 화씨 86.0도 입니다.
		int celciusDegree = 30;
		double fireDegree = 9.0 / 5 * celciusDegree + 32;
		System.out.println("섭씨 " + celciusDegree + "도는 화씨 " + fireDegree + "도 입니다.");
		
	}

}
