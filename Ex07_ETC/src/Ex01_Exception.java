/*
����
1. ����(error)      : ��Ʈ��ũ ��� , �޸� Full , �ϵ���� >> �����ڰ� �ڵ������� �ذ� �Ұ��� 
2. ����(exception)  : (�������� �ڵ� �Ǽ��� �߻�) >> ���� �ڵ� ã�Ƽ� >> �ڵ带 ���� >> ����
                    >> ���α׷� ������ �� �� �ƴ϶� ����� ���� ... ���� �˼� �����(�ƹ��� �׽�Ʈ������ �ص� ���� �ȵ� �� ����) 
                    >> �̷� ������ �߻��ϸ� (exception) ���α׷� ���� ���� (�� ��� 500�� ����)
                    >> ������ �߻��ϴ���, 
3. ���� ó�� >> ���ܰ� �߻��� ���� �ڵ� �����ϴ� ���� �ƴϰ� >> �Ϲ� �ӽù������� >> ������ �������
		  >> ���α׷��� ���������� ����ǵ��� ó�� >> �ᱹ���� ����ó���� ���ؼ� ������ ���� �κ��� ã�� 
		  >> �ٽ� �ڵ� ���� >> ����
		  
try{
	>>�������� �ǽɵǴ� �ڵ�
	>>������ �߻�(exception)
}catch(Exception e){
	>>������ �߻��� ���� �κ��� �ľ� ...
	>>ó�� (�ڵ带 �����ϴ� ���� �ƴϰ�, �����ϴ� ��)
	>> 1. �����ڿ��� email 
	>> 2. �α����Ͽ� ��� (��� �߻� ���) 
	>> 3. ������ ���α׷� ���� ���´�(�ϴ���) 
	>>�ᱹ �� ��� ���� �����ڰ� ������ �ް� �����ϴ� ���� ��.... 
}finally{
	>>������ �߻��ϴ� �߻����� �ʴ� ���������� �����ؾ� �� �ڵ�
	>> DB�۾� ���� (Ư���ڿ��� ����) ���� 
}
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		
		System.out.println(0/0);  //java.lang.ArithmeticException: / by zero
		//���α׷��� ���� ����
		//main end ������ ȭ�鿡 ��µ��� �ʾƿ�...
		System.out.println("main end");
		*/
//		-------------------------------------------------------------------
		System.out.println("main start");
		
		try {
			System.out.println(0/0);
			//���꿹�ܰ� �߻� ... try{}catch{} ó���ϸ� ���α׷��� ������ ���� ������ �ʴ´�
			
			//Exception Ŭ���� ��� (���� Ŭ������ �ֻ��� �θ� Ŭ����)
			//e ��� �ϴ� ������ ������ �޴� ���ϱ�?
			//Exception e  >>  Exception ��ü�� �ּҰ��� ����
			
			//ArithmeticException ������ �߻�
			//�����Ϸ��� ���ؼ�  ArithmeticException ��ü�� �����ǰ� 
			//�� ��ü���� ������ �Ǵ� �޽��� , �ڵ� �����ϸ� ... 
		}catch(Exception e) {   //�θ�Ÿ���� ������ �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�
			//� ���������� �ľ��ϰ� �� ������ ����
			//�����ڿ��� �����ϰų� email�����ų� log write�ϰų�...
			System.out.println(e.getMessage());
		}
		
		System.out.println("main end");

	}

}