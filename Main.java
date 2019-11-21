import java.util.*;

public class Main{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
//		Member member1 = new Member("�ڿ���", "010-2014-6463", "20181519", "����Ʈ������а�");
//		Member member2 = new Member("sfasa", "010-2014-6463", "sadfa", "����Ʈ������а�");  
//
//		list.addFirst(member1);
//		list.addFirst(member1);
//		System.out.println(list.toString());
//		list.addEnd(member1);
//		System.out.println(list.toString());
		

		while(true) {
			showPrint();
			try {
				int s1 = scan.nextInt();
//			}
//			catch(InputMismatchException ime) {
//				System.out.println("������ ���ڸ� �Է��Ͻʽÿ�");
//				int s1 = 0;
//			}finally{
				if (s1 == 1) {
					System.out.println("�̸��� �Է��ϼ��� : ");
					String name = scan.next();
					System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
					String phoneNum = scan.next();
					System.out.println("�й��� �Է��ϼ��� : ");
					String id = scan.next();
					System.out.println("������ �Է��ϼ��� : ");
					String major = scan.next();
					Member member = new Member(name, phoneNum, id, major);
						
					selectAdd();
					int s2 = scan.nextInt();
						
					if (s2 == 1) {
						list.addFirst(member);
					}else if (s2 == 2) {
						System.out.println("������ �κ��� �� ����ó�� �й��� �Է��ϼ���");
						String inputId = scan.next();
						list.addMid(inputId, member);
					}else if (s2 == 3) {
						list.addEnd(member);
					}else {System.out.println("������ ���ڸ� �Է��Ͻʽÿ�");}
						
				}else if (s1 == 2) {
					System.out.println("������ ����ó�� �й��� �Է��ϼ��� : ");
					String id = scan.next();
						
					if (list.getHead() == list.search(id)) {
						list.removeFirst();
					} else if (list.search(id).getLink() == null) {
						list.removeEnd();
					} else {
						list.removeMid(id);
					}
				}else if (s1 == 3) {
					System.out.println("������ ����ó�� �й��� �Է��ϼ��� : ");
					String id = scan.next();
					list.search(id);
					System.out.println("������ �̸��� �Է��ϼ��� : ");
					String name = scan.next();
					System.out.println("������ ��ȭ��ȣ�� �Է��ϼ��� : ");
					String phoneNum = scan.next();
					System.out.println("������ ������ �Է��ϼ��� : ");
					String major = scan.next();
					Member updateMember = new Member(name, phoneNum, id, major);
					
					list.update(id, updateMember);
				}else if (s1 == 4) {
					list.printAll();
				}else if (s1 == 5) {
					break;
				}else {System.out.println("������ ���ڸ� �Է��Ͻʽÿ�");}

			}catch(InputMismatchException ime) {
				scan = new Scanner(System.in);
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}
	}
	
	public static void showPrint() {
		System.out.println("=======================");
		System.out.println("1.����ó ���");
		System.out.println("2.����ó ����");
		System.out.println("3.����ó ����");
		System.out.println("4.����ó ��� ����");
		System.out.println("5.���α׷� ����");
		System.out.println("=======================");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
	}
	public static void selectAdd() {
		System.out.println("=======================");
		System.out.println("1.��ȭ��ȣ�� ���� �տ� ���");
		System.out.println("2.��ȭ��ȣ�� �߰��� ���");
		System.out.println("3.��ȭ��ȣ�� �� ���� ���");
		System.out.println("=======================");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		
	}
	

	
	
}
