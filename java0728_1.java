package java07_4week;

public class java0728_1 {

	public static void main(String[] args) {
		// �ֱ������� ���� �� ��°�� �ִ� ���� letter ���ڿ��� ���� ���ϱ�
		// String letter = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		
//		String letter = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
//		
//		int index = letter.indexOf("��");
//		System.out.println(index);
//		
//		int t = letter.length();
//		System.out.println(t);
		
		
		 //While�� �̿��Ͽ� ���� �ٸ� �� ���� �����, ���� ������ Math.random. 1~10����
		
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

		
		// for�� if ����Ͽ� 1~100 Ȧ���� �� ���ϱ�
		
//		int sum=0;
//		
//		for (int i=0; i<100; i++)
//			if ( i%2 ==1 ) //2�� ������ �������� 1�̸� Ȧ��
//				sum += i;
//		
//		System.out.println(sum);
	}

}
