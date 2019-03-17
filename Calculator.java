import java.io.InputStream;
import java.io.IOException;

class Calculator {
//1&(2&(2^8)&(2^3))
	private int lookaheadToken;
	private int tempSum;
	private int openPar;
	private InputStream in;

	public Calculator(InputStream in) throws IOException {
		this.in = in;
		this.tempSum = 0;
		this.openPar = 0;
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
	    System.out.println("EXPR");
		int a;
		//if(lookaheadToken < '0' || lookaheadToken > '9')
		//    throw new ParseError();
		a = lookaheadToken - '0';
		//consume(lookaheadToken);
		Term();
		Expr2();
		return;
	}

	private void Expr2() throws IOException, ParseError {
        System.out.println("EXPR2");
        if(lookaheadToken == ')' ){
            openPar--;
            consume(lookaheadToken);
            return;
        }
        if( lookaheadToken == '\n' || lookaheadToken == -1)
			return;

		if(lookaheadToken != '&')
			return;
		consume(lookaheadToken);
		Term();
		Expr2();
	}

	private void Term() throws IOException, ParseError {
        System.out.println("TERM");
		int a;
		if (lookaheadToken >= '0' && lookaheadToken <= '9')
            consume(lookaheadToken);
        else if (lookaheadToken=='(') {
            openPar++;
            consume(lookaheadToken);
            Expr();
        }
		if ((lookaheadToken < '0' || lookaheadToken > '9') && lookaheadToken!='(')
		    Term2();
		return;
	}

	private void Term2() throws IOException, ParseError {
        System.out.println("TERM2");
		int a;
        if(lookaheadToken == ')' ){
            openPar--;
            consume(lookaheadToken);
            return;
        }
        if( lookaheadToken == '\n' || lookaheadToken == -1)
            return;
		if(lookaheadToken != '^')
			return;
		consume(lookaheadToken);
		if (lookaheadToken == '('){
            consume(lookaheadToken);
            openPar++;
			Expr();
			return;
		}
		else if (lookaheadToken < '0' || lookaheadToken > '9')
			throw new ParseError();
		else
    		consume(lookaheadToken);
		Term2();
		return;
	}

	public void parse() throws IOException, ParseError {
        System.out.println("PARSE");
		Expr();
		if ((lookaheadToken != '\n' && lookaheadToken != -1) || openPar!=0)
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