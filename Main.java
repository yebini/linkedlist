import java.util.*;

public class Main{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
//		Member member1 = new Member("박예빈", "010-0000-0000", "20181111", "소프트웨어공학과");
//		Member member2 = new Member("sfasa", "010-0000-0000", "sadfa", "소프트웨어공학과");  
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
//				System.out.println("지정된 숫자를 입력하십시오");
//				int s1 = 0;
//			}finally{
				if (s1 == 1) {
					System.out.println("이름을 입력하세요 : ");
					String name = scan.next();
					System.out.println("전화번호를 입력하세요 : ");
					String phoneNum = scan.next();
					System.out.println("학번을 입력하세요 : ");
					String id = scan.next();
					System.out.println("전공을 입력하세요 : ");
					String major = scan.next();
					Member member = new Member(name, phoneNum, id, major);
						
					selectAdd();
					int s2 = scan.nextInt();
						
					if (s2 == 1) {
						list.addFirst(member);
					}else if (s2 == 2) {
						System.out.println("삽입할 부분의 앞 연락처의 학번을 입력하세요");
						String inputId = scan.next();
						list.addMid(inputId, member);
					}else if (s2 == 3) {
						list.addEnd(member);
					}else {System.out.println("지정된 숫자를 입력하십시오");}
						
				}else if (s1 == 2) {
					System.out.println("삭제할 연락처의 학번을 입력하세요 : ");
					String id = scan.next();
						
					if (list.getHead() == list.search(id)) {
						list.removeFirst();
					} else if (list.search(id).getLink() == null) {
						list.removeEnd();
					} else {
						list.removeMid(id);
					}
				}else if (s1 == 3) {
					System.out.println("수정할 연락처의 학번을 입력하세요 : ");
					String id = scan.next();
					list.search(id);
					System.out.println("수정할 이름을 입력하세요 : ");
					String name = scan.next();
					System.out.println("수정할 전화번호를 입력하세요 : ");
					String phoneNum = scan.next();
					System.out.println("수정할 전공을 입력하세요 : ");
					String major = scan.next();
					Member updateMember = new Member(name, phoneNum, id, major);
					
					list.update(id, updateMember);
				}else if (s1 == 4) {
					list.printAll();
				}else if (s1 == 5) {
					break;
				}else {System.out.println("지정된 숫자를 입력하십시오");}

			}catch(InputMismatchException ime) {
				scan = new Scanner(System.in);
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
	
	public static void showPrint() {
		System.out.println("=======================");
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 삭제");
		System.out.println("3.연락처 수정");
		System.out.println("4.연락처 목록 보기");
		System.out.println("5.프로그램 종료");
		System.out.println("=======================");
		System.out.println("번호를 입력하세요 : ");
	}
	public static void selectAdd() {
		System.out.println("=======================");
		System.out.println("1.전화번호부 가장 앞에 등록");
		System.out.println("2.전화번호부 중간에 등록");
		System.out.println("3.전화번호부 맨 끝에 등록");
		System.out.println("=======================");
		System.out.println("번호를 입력하세요 : ");
		
	}
	

	
	
}
