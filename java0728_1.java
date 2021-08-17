package java07_4week;

public class java0728_1 {

	public static void main(String[] args) {
		// 애국가에서 닳이 몇 번째에 있는 지와 letter 문자열의 길이 구하기
		// String letter = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
//		String letter = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
//		
//		int index = letter.indexOf("닳");
//		System.out.println(index);
//		
//		int t = letter.length();
//		System.out.println(t);
		
		
		 //While을 이용하여 서로 다른 세 정수 만들기, 임의 정수는 Math.random. 1~10사이
		
		int loop = 0;
		int a,b,c;
		
		while ( loop < 1)
		{
			a = (int)(Math.random()*9)+1;
			b = (int)(Math.random()*9)+1;
			c = (int)(Math.random()*9)+1;
			
			if(a!=b && a!=c && b!=c) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			
				loop++;
			}		
		}

		
		// for와 if 사용하여 1~100 홀수의 합 구하기
		
//		int sum=0;
//		
//		for (int i=0; i<100; i++)
//			if ( i%2 ==1 ) //2로 나누어 나머지가 1이면 홀수
//				sum += i;
//		
//		System.out.println(sum);
	}

}
