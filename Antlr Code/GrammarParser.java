// $ANTLR 3.5.2 Grammar.g 2020-05-12 20:08:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENTS", "ID", "INT", "OP", 
		"STRING", "WS", "'('", "')'", "'+'", "','", "':'", "'='", "'['", "']'", 
		"'and'", "'for'", "'if'", "'in'", "'not'", "'or'", "'print'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grammar.g"; }


		ActionRoutines AR = new ActionRoutines();



	// $ANTLR start "prog"
	// Grammar.g:7:1: prog : ( stmt )+ ;
	public final void prog() throws RecognitionException {
		try {
			// Grammar.g:7:5: ( ( stmt )+ )
			// Grammar.g:7:8: ( stmt )+
			{
			// Grammar.g:7:8: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==24) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammar.g:7:9: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog16);
					stmt();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// Grammar.g:10:1: stmt : ( assignment | print );
	public final void stmt() throws RecognitionException {
		try {
			// Grammar.g:10:5: ( assignment | print )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			else if ( (LA2_0==24) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Grammar.g:10:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_stmt27);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// Grammar.g:11:4: print
					{
					pushFollow(FOLLOW_print_in_stmt32);
					print();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "assignment"
	// Grammar.g:14:1: assignment : ( ID '=' assignment_tail[$ID.text] | ID '[' INT ']' '=' value );
	public final void assignment() throws RecognitionException {
		Token ID1=null;
		Token ID2=null;
		Token INT3=null;
		Object value4 =null;

		try {
			// Grammar.g:14:11: ( ID '=' assignment_tail[$ID.text] | ID '[' INT ']' '=' value )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==15) ) {
					alt3=1;
				}
				else if ( (LA3_1==16) ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Grammar.g:15:2: ID '=' assignment_tail[$ID.text]
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_assignment43); 
					match(input,15,FOLLOW_15_in_assignment45); 
					 AR.createList((ID1!=null?ID1.getText():null)); 
					pushFollow(FOLLOW_assignment_tail_in_assignment49);
					assignment_tail((ID1!=null?ID1.getText():null));
					state._fsp--;

					}
					break;
				case 2 :
					// Grammar.g:17:2: ID '[' INT ']' '=' value
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_assignment57); 
					match(input,16,FOLLOW_16_in_assignment59); 
					INT3=(Token)match(input,INT,FOLLOW_INT_in_assignment61); 
					match(input,17,FOLLOW_17_in_assignment63); 
					match(input,15,FOLLOW_15_in_assignment65); 
					pushFollow(FOLLOW_value_in_assignment67);
					value4=value();
					state._fsp--;

					 AR.updateValue((ID2!=null?ID2.getText():null), Integer.parseInt((INT3!=null?INT3.getText():null)), value4); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignment_tail"
	// Grammar.g:21:1: assignment_tail[String listID] : ( '[' value_list[$listID] ']' |id1= ID ( '+' id2= ID )* | ID '[' (i1= INT )? ':' (i2= INT )? ']' | '[' 'for' x= ID 'in' l= ID 'if' condition ']' );
	public final void assignment_tail(String listID) throws RecognitionException {
		Token id1=null;
		Token id2=null;
		Token i1=null;
		Token i2=null;
		Token x=null;
		Token l=null;
		Token ID5=null;

		try {
			// Grammar.g:21:32: ( '[' value_list[$listID] ']' |id1= ID ( '+' id2= ID )* | ID '[' (i1= INT )? ':' (i2= INT )? ']' | '[' 'for' x= ID 'in' l= ID 'if' condition ']' )
			int alt7=4;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==16) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==19) ) {
					alt7=4;
				}
				else if ( ((LA7_1 >= ID && LA7_1 <= INT)||LA7_1==STRING||LA7_1==17) ) {
					alt7=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA7_0==ID) ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2==16) ) {
					alt7=3;
				}
				else if ( (LA7_2==EOF||LA7_2==ID||LA7_2==12||LA7_2==24) ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Grammar.g:22:2: '[' value_list[$listID] ']'
					{
					match(input,16,FOLLOW_16_in_assignment_tail83); 
					pushFollow(FOLLOW_value_list_in_assignment_tail85);
					value_list(listID);
					state._fsp--;

					match(input,17,FOLLOW_17_in_assignment_tail88); 
					}
					break;
				case 2 :
					// Grammar.g:24:2: id1= ID ( '+' id2= ID )*
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail96); 
					 AR.concList(listID, (id1!=null?id1.getText():null)); 
					// Grammar.g:24:46: ( '+' id2= ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==12) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Grammar.g:24:47: '+' id2= ID
							{
							match(input,12,FOLLOW_12_in_assignment_tail101); 
							id2=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail105); 
							 AR.concList(listID, (id2!=null?id2.getText():null)); 
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 3 :
					// Grammar.g:26:2: ID '[' (i1= INT )? ':' (i2= INT )? ']'
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail116); 
					match(input,16,FOLLOW_16_in_assignment_tail118); 
					// Grammar.g:26:9: (i1= INT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Grammar.g:26:10: i1= INT
							{
							i1=(Token)match(input,INT,FOLLOW_INT_in_assignment_tail123); 
							}
							break;

					}

					match(input,14,FOLLOW_14_in_assignment_tail127); 
					// Grammar.g:26:23: (i2= INT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==INT) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Grammar.g:26:24: i2= INT
							{
							i2=(Token)match(input,INT,FOLLOW_INT_in_assignment_tail132); 
							}
							break;

					}

					match(input,17,FOLLOW_17_in_assignment_tail136); 
					 AR.sliceList(listID, (ID5!=null?ID5.getText():null), (i1!=null?i1.getText():null), (i2!=null?i2.getText():null)); 
					}
					break;
				case 4 :
					// Grammar.g:28:2: '[' 'for' x= ID 'in' l= ID 'if' condition ']'
					{
					match(input,16,FOLLOW_16_in_assignment_tail144); 
					match(input,19,FOLLOW_19_in_assignment_tail146); 
					x=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail150); 
					match(input,21,FOLLOW_21_in_assignment_tail152); 
					l=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail156); 
					match(input,20,FOLLOW_20_in_assignment_tail158); 
					 AR.setUpConditions(listID, (l!=null?l.getText():null), (x!=null?x.getText():null)); 
					pushFollow(FOLLOW_condition_in_assignment_tail162);
					condition();
					state._fsp--;

					match(input,17,FOLLOW_17_in_assignment_tail164); 
					 AR.applyConditions(listID, (l!=null?l.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment_tail"



	// $ANTLR start "condition"
	// Grammar.g:31:1: condition : ( '(' c1= condition o= ( 'or' | 'and' ) c2= condition ')' | 'not' condition | check );
	public final void condition() throws RecognitionException {
		Token o=null;

		try {
			// Grammar.g:31:10: ( '(' c1= condition o= ( 'or' | 'and' ) c2= condition ')' | 'not' condition | check )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==10) ) {
				int LA8_1 = input.LA(2);
				if ( ((LA8_1 >= ID && LA8_1 <= INT)) ) {
					alt8=3;
				}
				else if ( (LA8_1==10||LA8_1==22) ) {
					alt8=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA8_0==22) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Grammar.g:32:2: '(' c1= condition o= ( 'or' | 'and' ) c2= condition ')'
					{
					match(input,10,FOLLOW_10_in_condition178); 
					pushFollow(FOLLOW_condition_in_condition182);
					condition();
					state._fsp--;

					o=input.LT(1);
					if ( input.LA(1)==18||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_condition_in_condition194);
					condition();
					state._fsp--;

					match(input,11,FOLLOW_11_in_condition196); 
					 AR.combine((o!=null?o.getText():null)); 
					}
					break;
				case 2 :
					// Grammar.g:34:2: 'not' condition
					{
					match(input,22,FOLLOW_22_in_condition204); 
					pushFollow(FOLLOW_condition_in_condition206);
					condition();
					state._fsp--;

					 AR.flip(); 
					}
					break;
				case 3 :
					// Grammar.g:36:2: check
					{
					pushFollow(FOLLOW_check_in_condition214);
					check();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition"



	// $ANTLR start "check"
	// Grammar.g:39:1: check : '(' o1= ( ID | INT ) OP o2= ( ID | INT ) ')' ;
	public final void check() throws RecognitionException {
		Token o1=null;
		Token o2=null;
		Token OP6=null;

		try {
			// Grammar.g:39:6: ( '(' o1= ( ID | INT ) OP o2= ( ID | INT ) ')' )
			// Grammar.g:39:9: '(' o1= ( ID | INT ) OP o2= ( ID | INT ) ')'
			{
			match(input,10,FOLLOW_10_in_check225); 
			o1=input.LT(1);
			if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			OP6=(Token)match(input,OP,FOLLOW_OP_in_check235); 
			o2=input.LT(1);
			if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,11,FOLLOW_11_in_check245); 
			 AR.evaluate((o1!=null?o1.getText():null), (OP6!=null?OP6.getText():null), (o2!=null?o2.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "check"



	// $ANTLR start "value_list"
	// Grammar.g:42:1: value_list[String listID] : (v1= value ( ',' v2= value )* |);
	public final void value_list(String listID) throws RecognitionException {
		Object v1 =null;
		Object v2 =null;

		try {
			// Grammar.g:42:27: (v1= value ( ',' v2= value )* |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= ID && LA10_0 <= INT)||LA10_0==STRING) ) {
				alt10=1;
			}
			else if ( (LA10_0==17) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Grammar.g:43:2: v1= value ( ',' v2= value )*
					{
					pushFollow(FOLLOW_value_in_value_list266);
					v1=value();
					state._fsp--;

					 AR.addValue(listID, v1); 
					// Grammar.g:43:48: ( ',' v2= value )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==13) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// Grammar.g:43:49: ',' v2= value
							{
							match(input,13,FOLLOW_13_in_value_list271); 
							pushFollow(FOLLOW_value_in_value_list277);
							v2=value();
							state._fsp--;

							 AR.addValue(listID, v2); 
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;
				case 2 :
					// Grammar.g:45:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value_list"



	// $ANTLR start "value"
	// Grammar.g:47:1: value returns [Object val] : ( STRING | INT | ID );
	public final Object value() throws RecognitionException {
		Object val = null;


		Token STRING7=null;
		Token INT8=null;
		Token ID9=null;

		try {
			// Grammar.g:47:26: ( STRING | INT | ID )
			int alt11=3;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt11=1;
				}
				break;
			case INT:
				{
				alt11=2;
				}
				break;
			case ID:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Grammar.g:48:2: STRING
					{
					STRING7=(Token)match(input,STRING,FOLLOW_STRING_in_value299); 
					 val = new String((STRING7!=null?STRING7.getText():null)); 
					}
					break;
				case 2 :
					// Grammar.g:49:4: INT
					{
					INT8=(Token)match(input,INT,FOLLOW_INT_in_value306); 
					 val = Integer.parseInt((INT8!=null?INT8.getText():null)); 
					}
					break;
				case 3 :
					// Grammar.g:50:4: ID
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_value313); 
					 val = new String((ID9!=null?ID9.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "value"



	// $ANTLR start "print"
	// Grammar.g:53:1: print : 'print' '(' ID ')' ;
	public final void print() throws RecognitionException {
		Token ID10=null;

		try {
			// Grammar.g:53:6: ( 'print' '(' ID ')' )
			// Grammar.g:53:8: 'print' '(' ID ')'
			{
			match(input,24,FOLLOW_24_in_print324); 
			match(input,10,FOLLOW_10_in_print326); 
			ID10=(Token)match(input,ID,FOLLOW_ID_in_print328); 
			match(input,11,FOLLOW_11_in_print330); 
			 AR.printList((ID10!=null?ID10.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_in_prog16 = new BitSet(new long[]{0x0000000001000022L});
	public static final BitSet FOLLOW_assignment_in_stmt27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_stmt32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment43 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment45 = new BitSet(new long[]{0x0000000000010020L});
	public static final BitSet FOLLOW_assignment_tail_in_assignment49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment57 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment59 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assignment61 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment63 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment65 = new BitSet(new long[]{0x0000000000000160L});
	public static final BitSet FOLLOW_value_in_assignment67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_assignment_tail83 = new BitSet(new long[]{0x0000000000020160L});
	public static final BitSet FOLLOW_value_list_in_assignment_tail85 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment_tail88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment_tail96 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_assignment_tail101 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail105 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ID_in_assignment_tail116 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment_tail118 = new BitSet(new long[]{0x0000000000004040L});
	public static final BitSet FOLLOW_INT_in_assignment_tail123 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment_tail127 = new BitSet(new long[]{0x0000000000020040L});
	public static final BitSet FOLLOW_INT_in_assignment_tail132 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment_tail136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_assignment_tail144 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_assignment_tail146 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail150 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_assignment_tail152 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail156 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignment_tail158 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_condition_in_assignment_tail162 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment_tail164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_condition178 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_condition_in_condition182 = new BitSet(new long[]{0x0000000000840000L});
	public static final BitSet FOLLOW_set_in_condition186 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_condition_in_condition194 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_condition196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_condition204 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_condition_in_condition206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check_in_condition214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_check225 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_check229 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_OP_in_check235 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_check239 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_check245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_value_list266 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_value_list271 = new BitSet(new long[]{0x0000000000000160L});
	public static final BitSet FOLLOW_value_in_value_list277 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_STRING_in_value299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_print324 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print326 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_print328 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print330 = new BitSet(new long[]{0x0000000000000002L});
}
