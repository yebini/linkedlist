
public class Node {
	private Member data;
	private Node link;
	
	public Node() {
		
	}
	
	public Node(Member input, Node before) {
		this.data = input;
		this.setLink(before);
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Member getData() {
		return data;
	}

	public void setData(Member data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	


}
