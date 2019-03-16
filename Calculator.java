import java.io.InputStream;
import java.io.IOException;

class Calculator {

	private int lookaheadToken;
	private int tempSum;
	private InputStream in;

	public Calculator(InputStream in) throws IOException {
		this.in = in;
		this.tempSum = 0;
		lookaheadToken = in.read();
	}

	private void consume(int symbol) throws IOException, ParseError {
		if (lookaheadToken != symbol)
			throw new ParseError();
		lookaheadToken = in.read();
	}

	public int calc( int a, int op, int b) throws IOException, ParseError {
		switch(op){
			case '&':
				return ( a & b );
			case '^':
				return ( a ^ b );
			default:
				throw new ParseError();
		}
	}

	private void Expr() throws IOException, ParseError {
		int a;
		if(lookaheadToken < '0' || lookaheadToken > '9')
		    throw new ParseError();
		a = lookaheadToken - '0';
		consume(lookaheadToken);
		if (lookaheadToken == ')')
			return;
		else{
			Term();
			Expr2();
			return;
		}
	}

	private void Expr2() throws IOException, ParseError {
		if(lookaheadToken == ')' || lookaheadToken == '\n' || lookaheadToken == -1)
			return;
		if(lookaheadToken != '&')
			throw new ParseError();
		consume('&');
		Term();
		Expr2();
	}

	private void Term() throws IOException, ParseError {
		int a;
		if(lookaheadToken < '0' || lookaheadToken > '9')
		    throw new ParseError();
		a = lookaheadToken - '0';
		consume(lookaheadToken);
		Term2();
	}

	private void Term2() throws IOException, ParseError {
		int a;
		if(lookaheadToken == ')' || lookaheadToken == '\n' || lookaheadToken == -1)
			return;
		if(lookaheadToken != '^')
			throw new ParseError();
		consume('^');
		if (lookaheadToken == '('){
			Expr();
			return;
		}
		else if (lookaheadToken < '0' || lookaheadToken > '9'){
			throw new ParseError();
		}
		a = lookaheadToken - '0'; 
		Term2();
	}

	public void parse() throws IOException, ParseError {
		Expr();
		if (lookaheadToken != '\n' && lookaheadToken != -1)
			throw new ParseError();
	}

	public static void main(String[] args) {
		try {
			Calculator parser = new Calculator(System.in);
			parser.parse();
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		catch(ParseError err){
			System.err.println(err.getMessage());
		}
	}
}