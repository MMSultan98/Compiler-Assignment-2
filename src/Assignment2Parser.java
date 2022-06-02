import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Assignment2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, B=2, E=3, P=4, U=5, C=6, S=7, LP=8, RP=9;
	public static final int
		RULE_s = 0, RULE_r = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'a'", "'b'", "'e'", "'p'", "'U'", "'.'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "B", "E", "P", "U", "C", "S", "LP", "RP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Assignment2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		/**
		 * Compares two integer numbers
		 *
		 * @param x the first number to compare
		 * @param y the second number to compare
		 * @return 1 if x is equal to y, and 0 otherwise
		 */
		public static int equals(int x, int y) {
		    return x == y ? 1 : 0;
		}

	public Assignment2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public int check;
		public RContext r;
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((SContext)_localctx).r = r();
			 ((SContext)_localctx).check =  ((SContext)_localctx).r.check; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RContext extends ParserRuleContext {
		public int a;
		public int b;
		public int check;
		public RContext r1;
		public RContext r2;
		public RContext r;
		public TerminalNode E() { return getToken(Assignment2Parser.E, 0); }
		public TerminalNode P() { return getToken(Assignment2Parser.P, 0); }
		public TerminalNode A() { return getToken(Assignment2Parser.A, 0); }
		public TerminalNode B() { return getToken(Assignment2Parser.B, 0); }
		public TerminalNode LP() { return getToken(Assignment2Parser.LP, 0); }
		public TerminalNode U() { return getToken(Assignment2Parser.U, 0); }
		public TerminalNode RP() { return getToken(Assignment2Parser.RP, 0); }
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public TerminalNode C() { return getToken(Assignment2Parser.C, 0); }
		public TerminalNode S() { return getToken(Assignment2Parser.S, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(E);
				 ((RContext)_localctx).a =  0; ((RContext)_localctx).b =  0; ((RContext)_localctx).check =  1; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(P);
				 ((RContext)_localctx).a =  0; ((RContext)_localctx).b =  0; ((RContext)_localctx).check =  1; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(A);
				 ((RContext)_localctx).a =  1; ((RContext)_localctx).b =  0; ((RContext)_localctx).check =  1; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(B);
				 ((RContext)_localctx).a =  0; ((RContext)_localctx).b =  1; ((RContext)_localctx).check =  1; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(LP);
				setState(16);
				((RContext)_localctx).r1 = r();
				setState(17);
				match(U);
				setState(18);
				((RContext)_localctx).r2 = r();
				setState(19);
				match(RP);
				 ((RContext)_localctx).a =  ((RContext)_localctx).r1.a + ((RContext)_localctx).r2.a; ((RContext)_localctx).b =  ((RContext)_localctx).r1.b + ((RContext)_localctx).r2.b; ((RContext)_localctx).check =  ((RContext)_localctx).r1.check * ((RContext)_localctx).r2.check * equals(((RContext)_localctx).r1.a, ((RContext)_localctx).r2.b); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(22);
				match(LP);
				setState(23);
				((RContext)_localctx).r1 = r();
				setState(24);
				match(C);
				setState(25);
				((RContext)_localctx).r2 = r();
				setState(26);
				match(RP);
				 ((RContext)_localctx).a =  ((RContext)_localctx).r1.a + ((RContext)_localctx).r2.a; ((RContext)_localctx).b =  ((RContext)_localctx).r1.b + ((RContext)_localctx).r2.b; ((RContext)_localctx).check =  ((RContext)_localctx).r1.check * ((RContext)_localctx).r2.check; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(29);
				match(LP);
				setState(30);
				((RContext)_localctx).r = r();
				setState(31);
				match(S);
				setState(32);
				match(RP);
				 ((RContext)_localctx).a =  ((RContext)_localctx).r.a; ((RContext)_localctx).b =  ((RContext)_localctx).r.b; ((RContext)_localctx).check =  ((RContext)_localctx).r.check; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13(\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3\3\3"+
		"\2\2\4\2\4\2\2\2+\2\6\3\2\2\2\4%\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\3\3"+
		"\2\2\2\t\n\7\5\2\2\n&\b\3\1\2\13\f\7\6\2\2\f&\b\3\1\2\r\16\7\3\2\2\16"+
		"&\b\3\1\2\17\20\7\4\2\2\20&\b\3\1\2\21\22\7\n\2\2\22\23\5\4\3\2\23\24"+
		"\7\7\2\2\24\25\5\4\3\2\25\26\7\13\2\2\26\27\b\3\1\2\27&\3\2\2\2\30\31"+
		"\7\n\2\2\31\32\5\4\3\2\32\33\7\b\2\2\33\34\5\4\3\2\34\35\7\13\2\2\35\36"+
		"\b\3\1\2\36&\3\2\2\2\37 \7\n\2\2 !\5\4\3\2!\"\7\t\2\2\"#\7\13\2\2#$\b"+
		"\3\1\2$&\3\2\2\2%\t\3\2\2\2%\13\3\2\2\2%\r\3\2\2\2%\17\3\2\2\2%\21\3\2"+
		"\2\2%\30\3\2\2\2%\37\3\2\2\2&\5\3\2\2\2\3%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}