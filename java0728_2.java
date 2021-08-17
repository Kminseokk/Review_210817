package java07_4week;

public class java0728_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[4];
		
		//수학, 물리, 영어, 프로그래밍 4가지 과목의 평균을 구해보세요. (배열 사용)
		scores[0] = 97;
		scores[1] = 90;
		scores[2] = 91;
		scores[3] = 98;
		
		int avg = 0;
		int sum = 0;
		
		for ( int i = 0; i < scores.length; i++ ) {
			System.out.println( "scores["+ i + "] : " + scores[i] );
			sum = sum + scores[i];
			}
		avg = sum / scores.length;
		System.out.println("평균은 : "+avg);
	}

}
