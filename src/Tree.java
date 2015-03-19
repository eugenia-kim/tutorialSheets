
public class Tree {

	
	public int minDepth(Tree t,int depth) {
		
		if (t.left != null) {
		  	int left = minDepth(t.left,depth++);
		} else {
			left = depth;
		}
		
		if (t.left != null) {
			int right = minDepth(t.right,depth++);
			
		} else {
			right = depth;
		}
		return math.min(left,right);
	}
	
	public static void some() {
		
		int minDepth = 0;
		minDepth = minDepth(this,minDepth);
		
		
	}
	
	
}

