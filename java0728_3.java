package java07_4week;
import java.util.ArrayList;

public class java0728_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//수학, 물리, 영어, 프로그래밍 4가지 과목의 평균을 구해보세요. (List 사용)
		ArrayList<Integer> scores = new ArrayList<Integer>( );
		
		scores.add( 100 );
		scores.add( 90 );
		scores.add( 97 );
		scores.add( 93 );
		
		int avg = 0;
		int sum = 0;
		int arraysize = scores.size();
		
		for ( int i = 0; i < arraysize; i++ ) {
			System.out.println( "scores["+ i + "] : " + scores.get(i) );
			sum = sum + scores.get(i);
			}
		avg = sum / arraysize;
		System.out.println("평균은 : "+avg);
		
	}

}
