public class OperTest5 {
	public static void main(String[] args) {

		int x = 0;
		System.out.println("1. x = " + x);

		x = 10;
		System.out.println("2. x = " + x);
		
		x += 5;  // x = x + 5;
		System.out.println("3. x = " + x);

		x -= 5; 
		System.out.println("4. x = " + x);

		x *= 5;
		System.out.println("5. x = " + x);
		
		x = 10;
		//x�� ���� 1������Ű�� ���
		x = x + 1;
		System.out.println("������ x = " + x);
		x++;
		System.out.println("������ x = " + x);
		x = ++x;
		System.out.println("������ x = " + x);
		x += 1;
		System.out.println("������ x = " + x);
	
	
	}
}