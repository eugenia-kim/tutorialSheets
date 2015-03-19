package sheet2.Question7;

public class Demo {

public static void main(String[] args) {
		
		Expr a = new AddExpr(
						new LiteralExpr(1),
						new FactExpr(new AddExpr(new LiteralExpr(2), new LiteralExpr(3)))
				     );
		Expr b = new MultExpr(
						new LiteralExpr(3),
						new LiteralExpr(4)
					 );
		
		Expr c = new MultExpr(a, b);
		
		System.out.println("Evaluates to: " + c.eval());
		System.out.println("Literal count: " + c.literalCount());
		System.out.println("Depth: " + c.depth());
		
	}

}
