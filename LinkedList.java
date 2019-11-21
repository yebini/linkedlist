public class LinkedList {
	private Node head;
	
	public LinkedList() {
			this.head = head;}
		

	public void addFirst(Member input) {//ó���� ����
		if (head== null) { //��尡 �ϳ��� ���� ���
			Node node = new Node(input,null);
			head = node;
		}
		else { //��尡 �ִ� ���
			Node node = new Node(input, head);
			head = node;
		}
	}
	
	public void addMid(String id, Member input) { //�߰��� ����
		if (search(id)!=null) {
			if (head == null) { //��尡 �ϳ��� ���� ���
				addFirst(input);
			}
			else {
				Node temp = search(id); // �ӽ������� ���� ����
				if(temp.getLink() != null) { //�߰��� ����
					Node node = new Node(input, temp.getLink());
					temp.setLink(node);
				}else { //�������� �����ϴ� ���
					addEnd(input);
				}
			}
			
		}
	}
	
	public void addEnd(Member input) { // �������� ����
		if (head  == null) {
			addFirst(input);
		}else {
			Node temp = searchEnd();
			Node node = new Node(input,null);
			temp.setLink(node);
		}
	}
	
	
//	public Node search(String id) { //��带 ����Ű�� ������ ���� ����
//		Node x = head;
//		while(x.getLink() !=null) {
//			if(x.getData().getId().equals(id)) {
//				return x;
//			}
//			x = x.getLink();
//		}
//		System.out.println("�ش� id�� ���� �����Ͱ� �����ϴ�");
//		return null;
//	}

	public Node search(String id) { //id ��带 ����Ű�� ������ ���� ����
		if (head == null) {System.out.println("����Ʈ�� �����Ͱ� �������� �ʽ��ϴ�"); return null;} // ����ִ� ���¿��� ���� ��
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
		System.out.println("�ش� id�� ���� �����Ͱ� �����ϴ�");
		return null;
	}
	
	public Node searchEnd() { //��������带 ����Ű�� ������ ���� ����
		Node x = head;
		while(x.getLink() !=null) {
			x = x.getLink();
		}
		return x;
	}
	
	public Node searchSemiEnd() { //������ �� ��带 ����Ű�� ������ ���� ����
		Node x = head;
		while(x.getLink().getLink() != null) {
			x.setLink(x.getLink().getLink());
		}
		return x;
	}
	
	public void removeFirst() { //ù��� ����
		Node temp = head;
		head = temp.getLink();
		temp.setLink(null);
	}
	
	public void removeMid(String index) { //�߰� ��� ����
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
		System.out.println("ã�� ���� �����ϴ�!");		
	}
	
	public void removeEnd() { //������ ��� ����
		Node temp1 = searchSemiEnd();
		temp1.setLink(null);
		
	}
	
	
	
	
	
	
	/**���� */
	
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
			System.out.println("�Էµ� �����Ͱ� �����ϴ�");
		}else {
			Node x = head;
			int a = 1;
			System.out.println("�̸� : " + x.getData().getName() + ", " +"��ȭ��ȣ : " + x.getData().getPhoneNum()+ ", " +"�й� : " + x.getData().getId() + ", " +"���� : " + x.getData().getMajor());
			while(a == 1) {
				x = x.getLink();
				System.out.println("�̸� : " + x.getData().getName() + ", " +"��ȭ��ȣ : " + x.getData().getPhoneNum()+ ", " +"�й� : " + x.getData().getId() + ", " +"���� : " + x.getData().getMajor());
				if(x.getLink() == null) {
					a = 0;
				}
			}
		}
	}
	
	

}
