package java07_4week;
import java.util.ArrayList;

public class java0728_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����, ����, ����, ���α׷��� 4���� ������ ����� ���غ�����. (List ���)
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
		System.out.println("����� : "+avg);
		
	}

}
