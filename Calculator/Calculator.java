import java.io.InputStream;
import java.io.IOException;

class Calculator {

	private int lookaheadToken;
	private int openPar;
	private InputStream in;

	public Calculator(InputStream in) throws IOException {
		this.in = in;
		this.openPar = 0;
		lookaheadToken = in.read();
	}

	private void consume(int symbol) throws IOException, ParseError {
		if (lookaheadToken != symbol)
			throw new ParseError();
		lookaheadToken = in.read();
	}

	private int Expr() throws IOException, ParseError {
        int termVal=0, expr2Val=0;
        termVal = Term();
        if ((expr2Val = Expr2())>=0)
            termVal ^= expr2Val;
		return termVal;
	}

	private int Expr2() throws IOException, ParseError {
        int termVal=0, expr2Val=0;
        if(lookaheadToken == ')' ){
            openPar--;
            consume(lookaheadToken);
            return -1;
        }
        if( lookaheadToken == '\n' || lookaheadToken == -1)
			return -1;

		if(lookaheadToken != '^')
			return -1;
		consume(lookaheadToken);
		termVal = Term();
		if ((expr2Val = Expr2())>=0)
		    termVal ^= expr2Val;
		return termVal;
	}

	private int Term() throws IOException, ParseError {
		int factorVal = factor(), recVal=-1;
		if ((recVal=Term2())>=0)
		    factorVal &=recVal;
		return factorVal;
	}

	private int Term2() throws IOException, ParseError {
		int factorVal=0,recVal=-1;
        if(lookaheadToken == ')' ){
            openPar--;
            consume(lookaheadToken);
            return -1;
        }
        if( lookaheadToken == '\n' || lookaheadToken == -1)
            return -1;
		if(lookaheadToken != '&')
			return -1;
		consume(lookaheadToken);
        factorVal=factor();
		if ((recVal=Term2())>=0)
		    factorVal &=recVal;
		return factorVal;
	}

	private int factor() throws IOException, ParseError {
        int factorVal=0;
		if (lookaheadToken >= '0' && lookaheadToken <= '9') {
            factorVal = lookaheadToken - '0';
            consume(lookaheadToken);
        }
		else if (lookaheadToken=='(') {
            openPar++;
            consume(lookaheadToken);
            factorVal=Expr();
        }
        else
            throw new ParseError();
        return factorVal;
    }

	public void parse() throws IOException, ParseError { ;
		int exprVal = 0 ;
        exprVal = Expr();
		if ((lookaheadToken != '\n' && lookaheadToken != -1) || openPar!=0)
			throw new ParseError();
		else
            System.out.println(exprVal);
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