package java07_4week;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class java0728_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//����, ����, ����, ���α׷��� 4���� ������ ����� ���غ�����. (Map ���)
		Map<String, Integer> scores = new HashMap<String, Integer>( );
		int a;
		a = sc.nextInt();
		
		scores.put( "math", a );
		scores.put( "phisic", 90 );
		scores.put( "eng", 90 );
		scores.put( "program", 90 );
		
		int avg = 0;
		int sum = 0;
		int arraysize = scores.size(); // Map �ȿ� 4���� ������ �ִٰ� ����, ���� ������� �� �ִٸ� size�� ����ؼ� �ȵ�.
		
		System.out.println("������ �׽�Ʈ : "+arraysize);
		
		sum = scores.get("math") + scores.get("phisic")+ scores.get("eng")+ scores.get("program") ;
		
		System.out.println("SUM �׽�Ʈ : "+sum);
		
		avg = sum / arraysize; // Map �ȿ� 4���� ������ �ִٰ� ����, 5�� �̻��� �����̶�� 4��� �Է����ִ� ���� ����.
		
		System.out.println("����� : "+avg);

	}

}
