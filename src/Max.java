
public class Max {
	
	public int max(Tree t, int depth) {
		if(t.left != null) {
			max(t.left,depth++);
		} else {
			depthL = depth; 
		}
		if (t.right != null) {
			max(t.right,depth++);
		} else {
			depthR = depth;
		}
		
		return max(depthL, depthR)
	}
	
	public boolean isBalance() {
		int depth = 0;
		return (max(this, depth) - min(this, depth) < 2);
	}
}
