/*
score �� 90�̻��̸� ������ A
             80�̻��̸� ������ B
			 70�̻��̸� ������ C
			 60�̻��̸� ������ D
			 60�̸��� ������ F
X5 �̻��̸� X+ ����

��� : ������ XX���̹Ƿ� X�����Դϴ�.
*/
public class SwitchTest2 {
	public static void main(String[] args) {
		
		String grade = "";
		int score = 110;
		
		switch ( score / 10 ) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default :
				grade = "F";
				break;
		}
		if ( score == 100 || ((score % 10 >= 5) && score >60)  ) {
			grade += "+";
		}

		System.out.println("������ " + score + "���̹Ƿ� " + grade + " ���� �Դϴ�");
	}
}