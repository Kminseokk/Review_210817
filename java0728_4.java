package java07_4week;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class java0728_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//수학, 물리, 영어, 프로그래밍 4가지 과목의 평균을 구해보세요. (Map 사용)
		Map<String, Integer> scores = new HashMap<String, Integer>( );
		int a;
		a = sc.nextInt();
		
		scores.put( "math", a );
		scores.put( "phisic", 90 );
		scores.put( "eng", 90 );
		scores.put( "program", 90 );
		
		int avg = 0;
		int sum = 0;
		int arraysize = scores.size(); // Map 안에 4개의 과목만이 있다고 가정, 만약 과목수가 더 있다면 size를 사용해선 안됨.
		
		System.out.println("사이즈 테스트 : "+arraysize);
		
		sum = scores.get("math") + scores.get("phisic")+ scores.get("eng")+ scores.get("program") ;
		
		System.out.println("SUM 테스트 : "+sum);
		
		avg = sum / arraysize; // Map 안에 4개의 과목만이 있다고 가정, 5개 이상의 과목이라면 4라고 입력해주는 것이 나음.
		
		System.out.println("평균은 : "+avg);

	}

}
