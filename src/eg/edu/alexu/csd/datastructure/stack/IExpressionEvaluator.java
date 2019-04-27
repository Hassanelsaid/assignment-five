package eg.edu.alexu.csd.datastructure.stack;

public interface IExpressionEvaluator {
	
	public String infixToPostfix(String expression);
	public int evaluate(String expression);
}
