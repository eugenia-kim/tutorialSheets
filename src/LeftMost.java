
public class LeftMost {
	public Pair<Node, int> left(Tree t, int depth) {
		if (t.left != null) {
			return left(t.getLeft, depth++)
		} else {
			return Pair<Node, int>(t.getRoot,depth);
		}
	}
	
	public Pair<Node, int> leftMost(Tree t) {
	
		return left(this, 0);
	}
}


public class RightMost {
	public Node right(Node t) {
		if (t.getRight != null) {
			return right(t.getRight)
		} else {
			return t;
		}
	}
	
	public Node rightMost(Tree t) {
		return right(t.root);
	}
}


}