package sheet2.Question7;

public class AddExpr implements Expr {
	
	private Expr lhs;
	private Expr rhs;
	
	public AddExpr(Expr lhs, Expr rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public int eval() {
		return lhs.eval() + rhs.eval();
	}

	@Override
	public int literalCount() {
		return lhs.literalCount() + rhs.literalCount();
	}
	
	@Override
	public int depth() {
		return 1 + Math.max(lhs.depth(), rhs.depth());
	}

}
