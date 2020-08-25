// $ANTLR 3.5.2 Grammar.g 2020-05-12 20:08:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int COMMENTS=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int OP=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammarLexer() {} 
	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Grammar.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:2:7: ( '(' )
			// Grammar.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:3:7: ( ')' )
			// Grammar.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:4:7: ( '+' )
			// Grammar.g:4:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:5:7: ( ',' )
			// Grammar.g:5:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:6:7: ( ':' )
			// Grammar.g:6:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:7:7: ( '=' )
			// Grammar.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:8:7: ( '[' )
			// Grammar.g:8:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:9:7: ( ']' )
			// Grammar.g:9:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:10:7: ( 'and' )
			// Grammar.g:10:9: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:11:7: ( 'for' )
			// Grammar.g:11:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:12:7: ( 'if' )
			// Grammar.g:12:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:13:7: ( 'in' )
			// Grammar.g:13:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:14:7: ( 'not' )
			// Grammar.g:14:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:15:7: ( 'or' )
			// Grammar.g:15:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:16:7: ( 'print' )
			// Grammar.g:16:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:57:3: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
			// Grammar.g:57:5: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
			{
			// Grammar.g:57:5: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			case '<':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='=') ) {
					alt1=4;
				}

				else {
					alt1=3;
				}

				}
				break;
			case '>':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='=') ) {
					alt1=6;
				}

				else {
					alt1=5;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Grammar.g:57:6: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// Grammar.g:57:13: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// Grammar.g:57:20: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// Grammar.g:57:26: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// Grammar.g:57:33: '>'
					{
					match('>'); 
					}
					break;
				case 6 :
					// Grammar.g:57:39: '>='
					{
					match(">="); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:58:7: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\'' )
			// Grammar.g:58:9: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\''
			{
			match('\''); 
			// Grammar.g:58:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:59:4: ( ( '-' )? ( '0' .. '9' )+ )
			// Grammar.g:59:6: ( '-' )? ( '0' .. '9' )+
			{
			// Grammar.g:59:6: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Grammar.g:59:7: '-'
					{
					match('-'); 
					}
					break;

			}

			// Grammar.g:59:13: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:60:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )* )
			// Grammar.g:60:5: ( 'a' .. 'z' | 'A' .. 'Z' | '\\_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Grammar.g:60:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:62:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// Grammar.g:62:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// Grammar.g:62:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENTS"
	public final void mCOMMENTS() throws RecognitionException {
		try {
			int _type = COMMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:63:9: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* )
			// Grammar.g:63:10: ( '//' ) (~ ( '\\n' | '\\r' ) )*
			{
			// Grammar.g:63:10: ( '//' )
			// Grammar.g:63:11: '//'
			{
			match("//"); 

			}

			// Grammar.g:63:17: (~ ( '\\n' | '\\r' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENTS"

	@Override
	public void mTokens() throws RecognitionException {
		// Grammar.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | OP | STRING | INT | ID | WS | COMMENTS )
		int alt8=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt8=1;
			}
			break;
		case ')':
			{
			alt8=2;
			}
			break;
		case '+':
			{
			alt8=3;
			}
			break;
		case ',':
			{
			alt8=4;
			}
			break;
		case ':':
			{
			alt8=5;
			}
			break;
		case '=':
			{
			int LA8_6 = input.LA(2);
			if ( (LA8_6=='=') ) {
				alt8=16;
			}

			else {
				alt8=6;
			}

			}
			break;
		case '[':
			{
			alt8=7;
			}
			break;
		case ']':
			{
			alt8=8;
			}
			break;
		case 'a':
			{
			int LA8_9 = input.LA(2);
			if ( (LA8_9=='n') ) {
				int LA8_22 = input.LA(3);
				if ( (LA8_22=='d') ) {
					int LA8_29 = input.LA(4);
					if ( ((LA8_29 >= '0' && LA8_29 <= '9')||(LA8_29 >= 'A' && LA8_29 <= 'Z')||LA8_29=='_'||(LA8_29 >= 'a' && LA8_29 <= 'z')) ) {
						alt8=19;
					}

					else {
						alt8=9;
					}

				}

				else {
					alt8=19;
				}

			}

			else {
				alt8=19;
			}

			}
			break;
		case 'f':
			{
			int LA8_10 = input.LA(2);
			if ( (LA8_10=='o') ) {
				int LA8_23 = input.LA(3);
				if ( (LA8_23=='r') ) {
					int LA8_30 = input.LA(4);
					if ( ((LA8_30 >= '0' && LA8_30 <= '9')||(LA8_30 >= 'A' && LA8_30 <= 'Z')||LA8_30=='_'||(LA8_30 >= 'a' && LA8_30 <= 'z')) ) {
						alt8=19;
					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=19;
				}

			}

			else {
				alt8=19;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA8_24 = input.LA(3);
				if ( ((LA8_24 >= '0' && LA8_24 <= '9')||(LA8_24 >= 'A' && LA8_24 <= 'Z')||LA8_24=='_'||(LA8_24 >= 'a' && LA8_24 <= 'z')) ) {
					alt8=19;
				}

				else {
					alt8=11;
				}

				}
				break;
			case 'n':
				{
				int LA8_25 = input.LA(3);
				if ( ((LA8_25 >= '0' && LA8_25 <= '9')||(LA8_25 >= 'A' && LA8_25 <= 'Z')||LA8_25=='_'||(LA8_25 >= 'a' && LA8_25 <= 'z')) ) {
					alt8=19;
				}

				else {
					alt8=12;
				}

				}
				break;
			default:
				alt8=19;
			}
			}
			break;
		case 'n':
			{
			int LA8_12 = input.LA(2);
			if ( (LA8_12=='o') ) {
				int LA8_26 = input.LA(3);
				if ( (LA8_26=='t') ) {
					int LA8_33 = input.LA(4);
					if ( ((LA8_33 >= '0' && LA8_33 <= '9')||(LA8_33 >= 'A' && LA8_33 <= 'Z')||LA8_33=='_'||(LA8_33 >= 'a' && LA8_33 <= 'z')) ) {
						alt8=19;
					}

					else {
						alt8=13;
					}

				}

				else {
					alt8=19;
				}

			}

			else {
				alt8=19;
			}

			}
			break;
		case 'o':
			{
			int LA8_13 = input.LA(2);
			if ( (LA8_13=='r') ) {
				int LA8_27 = input.LA(3);
				if ( ((LA8_27 >= '0' && LA8_27 <= '9')||(LA8_27 >= 'A' && LA8_27 <= 'Z')||LA8_27=='_'||(LA8_27 >= 'a' && LA8_27 <= 'z')) ) {
					alt8=19;
				}

				else {
					alt8=14;
				}

			}

			else {
				alt8=19;
			}

			}
			break;
		case 'p':
			{
			int LA8_14 = input.LA(2);
			if ( (LA8_14=='r') ) {
				int LA8_28 = input.LA(3);
				if ( (LA8_28=='i') ) {
					int LA8_35 = input.LA(4);
					if ( (LA8_35=='n') ) {
						int LA8_39 = input.LA(5);
						if ( (LA8_39=='t') ) {
							int LA8_40 = input.LA(6);
							if ( ((LA8_40 >= '0' && LA8_40 <= '9')||(LA8_40 >= 'A' && LA8_40 <= 'Z')||LA8_40=='_'||(LA8_40 >= 'a' && LA8_40 <= 'z')) ) {
								alt8=19;
							}

							else {
								alt8=15;
							}

						}

						else {
							alt8=19;
						}

					}

					else {
						alt8=19;
					}

				}

				else {
					alt8=19;
				}

			}

			else {
				alt8=19;
			}

			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt8=16;
			}
			break;
		case '\'':
			{
			alt8=17;
			}
			break;
		case '-':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt8=18;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt8=19;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt8=20;
			}
			break;
		case '/':
			{
			alt8=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// Grammar.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// Grammar.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// Grammar.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// Grammar.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// Grammar.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// Grammar.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// Grammar.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// Grammar.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// Grammar.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// Grammar.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// Grammar.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// Grammar.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// Grammar.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// Grammar.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// Grammar.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// Grammar.g:1:100: OP
				{
				mOP(); 

				}
				break;
			case 17 :
				// Grammar.g:1:103: STRING
				{
				mSTRING(); 

				}
				break;
			case 18 :
				// Grammar.g:1:110: INT
				{
				mINT(); 

				}
				break;
			case 19 :
				// Grammar.g:1:114: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// Grammar.g:1:117: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// Grammar.g:1:120: COMMENTS
				{
				mCOMMENTS(); 

				}
				break;

		}
	}



}
