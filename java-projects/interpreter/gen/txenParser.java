// Generated from F:/github/xenFork/T-XEN-Interpreter/java-projects/interpreter/g4\txenParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class txenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, LPAREN=2, RPAREN=3, LBRACE=4, RBRACE=5, LBRACK=6, RBRACK=7, 
		SEMI=8, COMMA=9, DOT=10, LL=11, RL=12, STRING=13, TEXT=14, NULL=15, BOOL=16, 
		FLOAT=17, HEX_FLOAT=18, CHAR=19, WS=20, COMMENT=21, LINE_COMMENT=22, DECIMAL_LITERAL=23, 
		HEX_LITERAL=24, OCT_LITERAL=25, BINARY_LITERAL=26;
	public static final int
		RULE_main = 0, RULE_field = 1, RULE_integer = 2, RULE_float = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "field", "integer", "float"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "'->'", "'<-'", null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "LL", "RL", "STRING", "TEXT", "NULL", "BOOL", 
			"FLOAT", "HEX_FLOAT", "CHAR", "WS", "COMMENT", "LINE_COMMENT", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL"
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
	public String getGrammarFileName() { return "txenParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public txenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof txenParserVisitor ) return ((txenParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(txenParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(txenParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(txenParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(txenParser.NULL, 0); }
		public TerminalNode TEXT() { return getToken(txenParser.TEXT, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof txenParserVisitor ) return ((txenParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				integer();
				}
				break;
			case FLOAT:
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				float_();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				match(BOOL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(15);
				match(NULL);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(16);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(txenParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(txenParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(txenParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(txenParser.BINARY_LITERAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof txenParserVisitor ) return ((txenParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(txenParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(txenParser.HEX_FLOAT, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof txenParserListener ) ((txenParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof txenParserVisitor ) return ((txenParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==HEX_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\u001a\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0002\u0001\u0000\u0017\u001a\u0001\u0000\u0011\u0012\u0019\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0013\u0001"+
		"\u0000\u0000\u0000\u0006\u0015\u0001\u0000\u0000\u0000\b\t\u0001\u0000"+
		"\u0000\u0000\t\u0001\u0001\u0000\u0000\u0000\n\u0012\u0003\u0004\u0002"+
		"\u0000\u000b\u0012\u0003\u0006\u0003\u0000\f\u0012\u0005\u0013\u0000\u0000"+
		"\r\u0012\u0005\r\u0000\u0000\u000e\u0012\u0005\u0010\u0000\u0000\u000f"+
		"\u0012\u0005\u000f\u0000\u0000\u0010\u0012\u0005\u000e\u0000\u0000\u0011"+
		"\n\u0001\u0000\u0000\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0011\f"+
		"\u0001\u0000\u0000\u0000\u0011\r\u0001\u0000\u0000\u0000\u0011\u000e\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0007"+
		"\u0000\u0000\u0000\u0014\u0005\u0001\u0000\u0000\u0000\u0015\u0016\u0007"+
		"\u0001\u0000\u0000\u0016\u0007\u0001\u0000\u0000\u0000\u0001\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}