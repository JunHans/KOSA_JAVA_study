
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
				seat[i][j]= "__";  //���ڿ��� �ʱ�ȭ
				
			}
		}
		//����
		seat[2][1] = "������";
		seat[0][0] = "������";
		
		//���� �¼� ��Ȳ �����ֱ�
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "�¼�":"����");
			}
			System.out.println();
		}
		//���� �Ϸ��� ... ���¼��� ���Ű������� ... ���Ű� �Ǿ����� �˷��־��
		int row, col;
		row= 1;
		col= 0;
		if(seat[row][col].equals("__")) {
			System.out.println("���Ű����� �¼��̿�");
		}else {
			System.out.println("�̹� ���ŵ� �ڼ��̿�");
		}
		
		//��� �¼� �ʱ�ȭ "__"
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
				seat[i][j]= "__";  //���ڿ��� �ʱ�ȭ
				
			}
		}
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "�¼�":"����");
			}
			System.out.println();
		}

	}

}