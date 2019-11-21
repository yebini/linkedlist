public class LinkedList {
	private Node head;
	
	public LinkedList() {
			this.head = head;}
		

	public void addFirst(Member input) {//처음에 삽입
		if (head== null) { //노드가 하나도 없는 경우
			Node node = new Node(input,null);
			head = node;
		}
		else { //노드가 있는 경우
			Node node = new Node(input, head);
			head = node;
		}
	}
	
	public void addMid(String id, Member input) { //중간에 삽입
		if (search(id)!=null) {
			if (head == null) { //노드가 하나도 없는 경우
				addFirst(input);
			}
			else {
				Node temp = search(id); // 임시포인터 변수 생성
				if(temp.getLink() != null) { //중간에 삽입
					Node node = new Node(input, temp.getLink());
					temp.setLink(node);
				}else { //마지막에 삽입하는 경우
					addEnd(input);
				}
			}
			
		}
	}
	
	public void addEnd(Member input) { // 마지막에 삽입
		if (head  == null) {
			addFirst(input);
		}else {
			Node temp = searchEnd();
			Node node = new Node(input,null);
			temp.setLink(node);
		}
	}
	
	
//	public Node search(String id) { //노드를 가리키는 포인터 변수 생성
//		Node x = head;
//		while(x.getLink() !=null) {
//			if(x.getData().getId().equals(id)) {
//				return x;
//			}
//			x = x.getLink();
//		}
//		System.out.println("해당 id를 가진 데이터가 없습니다");
//		return null;
//	}

	public Node search(String id) { //id 노드를 가리키는 포인터 변수 생성
		if (head == null) {System.out.println("리스트에 데이터가 존재하지 않습니다"); return null;} // 비어있는 상태에서 선택 시
		Node x = head;
		int a = 1;
		while(a == 1) {
			if(x.getData().getId().equals(id)) {
				return x;
			}
			x = x.getLink();
			if(x.getLink() == null) {
				a = 0;
			}
		}
		System.out.println("해당 id를 가진 데이터가 없습니다");
		return null;
	}
	
	public Node searchEnd() { //마지막노드를 가리키는 포인터 변수 생성
		Node x = head;
		while(x.getLink() !=null) {
			x = x.getLink();
		}
		return x;
	}
	
	public Node searchSemiEnd() { //마지막 전 노드를 가리키는 포인터 변수 생성
		Node x = head;
		while(x.getLink().getLink() != null) {
			x.setLink(x.getLink().getLink());
		}
		return x;
	}
	
	public void removeFirst() { //첫노드 삭제
		Node temp = head;
		head = temp.getLink();
		temp.setLink(null);
	}
	
	public void removeMid(String index) { //중간 노드 삭제
		Node temp = head;
		Node preNode = null;
		while(temp.getLink() != null) {
			if(temp.getData().getId().equals(index)) {
				preNode.setLink(temp.getLink());
				temp = null;
				return;
			}
			preNode = temp;
			temp = temp.getLink();
		}
		System.out.println("찾는 값이 없습니다!");		
	}
	
	public void removeEnd() { //마지막 노드 삭제
		Node temp1 = searchSemiEnd();
		temp1.setLink(null);
		
	}
	
	
	
	
	
	
	/**수정 */
	
	public Member update(String id, Member data) {
		Node temp = search(id);
		temp.setData(data);
		return null;
	}

	
	
	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}

	public Node getHead() {
		return head;
	}
	
	public void printAll() {
		if (head == null) {
			System.out.println("입력된 데이터가 없습니다");
		}else {
			Node x = head;
			int a = 1;
			System.out.println("이름 : " + x.getData().getName() + ", " +"전화번호 : " + x.getData().getPhoneNum()+ ", " +"학번 : " + x.getData().getId() + ", " +"전공 : " + x.getData().getMajor());
			while(a == 1) {
				x = x.getLink();
				System.out.println("이름 : " + x.getData().getName() + ", " +"전화번호 : " + x.getData().getPhoneNum()+ ", " +"학번 : " + x.getData().getId() + ", " +"전공 : " + x.getData().getMajor());
				if(x.getLink() == null) {
					a = 0;
				}
			}
		}
	}
	
	

}
