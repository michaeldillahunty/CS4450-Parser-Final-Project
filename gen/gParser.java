// Generated from C:/Users/Conor Wood/Documents/GitHub/CS4450-Parser-Final-Project/src\g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INDENT=12, DEDENT=13, TAB=14, NUM=15, INT=16, FLOAT=17, 
		BOOL=18, STRING=19, SINGLE_LINE_COMMENT=20, MULTI_LINE_COMMENT=21, COLON=22, 
		FOR=23, PLUS=24, MINUS=25, MULTIPLY=26, DIVIDE=27, MOD=28, ASSIGN=29, 
		PLUS_EQUAL=30, MINUS_EQUAL=31, MULTI_EQUAL=32, DIVIDE_EQUAL=33, MOD_EQUAL=34, 
		EQUAL_EQUAL=35, DOESNOT_EQUAL=36, LESS_THAN=37, LESS_THAN_EQUAL=38, GREATER_THAN=39, 
		GREATER_THAN_EQUAL=40, AND=41, OR=42, VAR_NAME=43, ANYTHING=44;
	public static final int
		RULE_arithmetic_operations = 0, RULE_assignment_operations = 1, RULE_conditional_statements = 2, 
		RULE_if_else_block = 3, RULE_while_block = 4, RULE_for_block = 5, RULE_comments = 6, 
		RULE_function_args = 7, RULE_function_call_args = 8, RULE_function_call = 9, 
		RULE_function_declaration = 10, RULE_function_block = 11, RULE_block = 12, 
		RULE_statement = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_operations", "assignment_operations", "conditional_statements", 
			"if_else_block", "while_block", "for_block", "comments", "function_args", 
			"function_call_args", "function_call", "function_declaration", "function_block", 
			"block", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'):'", "'\\n'", "'elif'", "'else'", "'while'", 
			"'for ('", "','", "'def '", "'->'", "'<-'", "'   '", null, null, null, 
			null, null, null, null, "':'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INDENT", "DEDENT", "TAB", "NUM", "INT", "FLOAT", "BOOL", "STRING", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "COLON", "FOR", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MOD", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", "MULTI_EQUAL", "DIVIDE_EQUAL", 
			"MOD_EQUAL", "EQUAL_EQUAL", "DOESNOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", 
			"GREATER_THAN", "GREATER_THAN_EQUAL", "AND", "OR", "VAR_NAME", "ANYTHING"
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
	public String getGrammarFileName() { return "src/g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Arithmetic_operationsContext extends ParserRuleContext {
		public List<Arithmetic_operationsContext> arithmetic_operations() {
			return getRuleContexts(Arithmetic_operationsContext.class);
		}
		public Arithmetic_operationsContext arithmetic_operations(int i) {
			return getRuleContext(Arithmetic_operationsContext.class,i);
		}
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode MULTIPLY() { return getToken(gParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(gParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public Arithmetic_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArithmetic_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArithmetic_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArithmetic_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operationsContext arithmetic_operations() throws RecognitionException {
		return arithmetic_operations(0);
	}

	private Arithmetic_operationsContext arithmetic_operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_operationsContext _localctx = new Arithmetic_operationsContext(_ctx, _parentState);
		Arithmetic_operationsContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_arithmetic_operations, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(29);
				match(T__0);
				setState(30);
				arithmetic_operations(0);
				setState(31);
				match(T__1);
				}
				break;
			case NUM:
				{
				setState(33);
				match(NUM);
				}
				break;
			case VAR_NAME:
				{
				setState(34);
				match(VAR_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(37);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(38);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(39);
						arithmetic_operations(5);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(40);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(41);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						arithmetic_operations(4);
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assignment_operationsContext extends ParserRuleContext {
		public List<Assignment_operationsContext> assignment_operations() {
			return getRuleContexts(Assignment_operationsContext.class);
		}
		public Assignment_operationsContext assignment_operations(int i) {
			return getRuleContext(Assignment_operationsContext.class,i);
		}
		public Arithmetic_operationsContext arithmetic_operations() {
			return getRuleContext(Arithmetic_operationsContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public TerminalNode PLUS_EQUAL() { return getToken(gParser.PLUS_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(gParser.MINUS_EQUAL, 0); }
		public TerminalNode MULTI_EQUAL() { return getToken(gParser.MULTI_EQUAL, 0); }
		public TerminalNode DIVIDE_EQUAL() { return getToken(gParser.DIVIDE_EQUAL, 0); }
		public TerminalNode MOD_EQUAL() { return getToken(gParser.MOD_EQUAL, 0); }
		public Assignment_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operationsContext assignment_operations() throws RecognitionException {
		return assignment_operations(0);
	}

	private Assignment_operationsContext assignment_operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assignment_operationsContext _localctx = new Assignment_operationsContext(_ctx, _parentState);
		Assignment_operationsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_assignment_operations, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(49);
				match(T__0);
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(50);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(51);
					arithmetic_operations(0);
					}
					break;
				}
				setState(54);
				match(T__1);
				}
				break;
			case VAR_NAME:
				{
				setState(56);
				match(VAR_NAME);
				}
				break;
			case FLOAT:
				{
				setState(57);
				match(FLOAT);
				}
				break;
			case INT:
				{
				setState(58);
				match(INT);
				}
				break;
			case NUM:
				{
				setState(59);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(60);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(63);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(64);
						match(ASSIGN);
						setState(65);
						assignment_operations(8);
						}
						break;
					case 2:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(66);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(67);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUAL) | (1L << MINUS_EQUAL) | (1L << MULTI_EQUAL) | (1L << DIVIDE_EQUAL) | (1L << MOD_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						assignment_operations(7);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Conditional_statementsContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public List<Conditional_statementsContext> conditional_statements() {
			return getRuleContexts(Conditional_statementsContext.class);
		}
		public Conditional_statementsContext conditional_statements(int i) {
			return getRuleContext(Conditional_statementsContext.class,i);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(gParser.EQUAL_EQUAL, 0); }
		public TerminalNode DOESNOT_EQUAL() { return getToken(gParser.DOESNOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(gParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(gParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(gParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(gParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConditional_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConditional_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConditional_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		return conditional_statements(0);
	}

	private Conditional_statementsContext conditional_statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, _parentState);
		Conditional_statementsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_conditional_statements, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(75);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(76);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(77);
				match(INT);
				}
				break;
			case 5:
				{
				setState(78);
				match(NUM);
				}
				break;
			case 6:
				{
				setState(79);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(82);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(83);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==DOESNOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						conditional_statements(10);
						}
						break;
					case 2:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==LESS_THAN || _la==LESS_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						conditional_statements(9);
						}
						break;
					case 3:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						_la = _input.LA(1);
						if ( !(_la==GREATER_THAN || _la==GREATER_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						conditional_statements(8);
						}
						break;
					case 4:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						conditional_statements(7);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_else_blockContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<If_else_blockContext> if_else_block() {
			return getRuleContexts(If_else_blockContext.class);
		}
		public If_else_blockContext if_else_block(int i) {
			return getRuleContext(If_else_blockContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public If_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_else_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_else_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_else_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_blockContext if_else_block() throws RecognitionException {
		If_else_blockContext _localctx = new If_else_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_else_block);
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__2);
				setState(100);
				match(T__0);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(101);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(102);
					conditional_statements(0);
					}
					break;
				case 3:
					{
					setState(103);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(104);
					match(VAR_NAME);
					}
					break;
				}
				setState(107);
				match(T__3);
				setState(108);
				match(T__4);
				setState(109);
				match(TAB);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << NUM) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(110);
					block();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						if_else_block();
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__5);
				setState(123);
				match(T__0);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(124);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(125);
					conditional_statements(0);
					}
					break;
				case 3:
					{
					setState(126);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(127);
					match(VAR_NAME);
					}
					break;
				}
				setState(130);
				match(T__3);
				setState(131);
				match(T__4);
				setState(132);
				match(TAB);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << NUM) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(133);
					block();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						if_else_block();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__6);
				setState(146);
				match(COLON);
				setState(147);
				match(T__4);
				setState(148);
				match(TAB);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << NUM) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(149);
					block();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						if_else_block();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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

	public static class While_blockContext extends ParserRuleContext {
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_block);
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__7);
				setState(164);
				match(T__0);
				setState(165);
				assignment_operations(0);
				setState(166);
				match(T__3);
				setState(167);
				match(T__4);
				setState(168);
				match(TAB);
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						block();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__7);
				setState(176);
				match(T__0);
				setState(177);
				conditional_statements(0);
				setState(178);
				match(T__3);
				setState(179);
				match(T__4);
				setState(180);
				match(TAB);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						block();
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
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

	public static class For_blockContext extends ParserRuleContext {
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_block);
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__8);
				setState(190);
				assignment_operations(0);
				setState(191);
				match(T__3);
				setState(192);
				match(T__4);
				setState(193);
				match(TAB);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						block();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__8);
				setState(201);
				conditional_statements(0);
				setState(202);
				match(T__3);
				setState(203);
				match(T__4);
				setState(204);
				match(TAB);
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						block();
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
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

	public static class CommentsContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_LINE_COMMENT() { return getTokens(gParser.SINGLE_LINE_COMMENT); }
		public TerminalNode SINGLE_LINE_COMMENT(int i) {
			return getToken(gParser.SINGLE_LINE_COMMENT, i);
		}
		public List<TerminalNode> MULTI_LINE_COMMENT() { return getTokens(gParser.MULTI_LINE_COMMENT); }
		public TerminalNode MULTI_LINE_COMMENT(int i) {
			return getToken(gParser.MULTI_LINE_COMMENT, i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_argsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(gParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(gParser.VAR_NAME, i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			match(VAR_NAME);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(220);
				match(T__9);
				setState(221);
				match(VAR_NAME);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Function_call_argsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(gParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(gParser.VAR_NAME, i);
		}
		public List<TerminalNode> NUM() { return getTokens(gParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gParser.NUM, i);
		}
		public List<TerminalNode> STRING() { return getTokens(gParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(gParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(gParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(gParser.BOOL, i);
		}
		public Function_call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_call_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_call_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_call_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argsContext function_call_args() throws RecognitionException {
		Function_call_argsContext _localctx = new Function_call_argsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_args);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(227);
				match(VAR_NAME);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(228);
					match(T__9);
					setState(229);
					match(VAR_NAME);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(235);
				match(NUM);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(236);
					match(T__9);
					setState(237);
					match(NUM);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(243);
				match(STRING);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(244);
					match(T__9);
					setState(245);
					match(STRING);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(251);
				match(BOOL);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(252);
					match(T__9);
					setState(253);
					match(BOOL);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<Function_call_argsContext> function_call_args() {
			return getRuleContexts(Function_call_argsContext.class);
		}
		public Function_call_argsContext function_call_args(int i) {
			return getRuleContext(Function_call_argsContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(VAR_NAME);
			setState(262);
			match(T__0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(263);
				function_call_args();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__1);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<Function_argsContext> function_args() {
			return getRuleContexts(Function_argsContext.class);
		}
		public Function_argsContext function_args(int i) {
			return getRuleContext(Function_argsContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__10);
			setState(272);
			match(VAR_NAME);
			setState(273);
			match(T__0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME) {
				{
				{
				setState(274);
				function_args();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__3);
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

	public static class Function_blockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public TerminalNode DEDENT() { return getToken(gParser.DEDENT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			function_declaration();
			setState(283);
			match(T__4);
			setState(284);
			match(TAB);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << NUM) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(285);
				block();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(DEDENT);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << NUM) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(293);
				statement();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(T__4);
			setState(300);
			match(TAB);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					statement();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public Arithmetic_operationsContext arithmetic_operations() {
			return getRuleContext(Arithmetic_operationsContext.class,0);
		}
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				while_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				for_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				arithmetic_operations(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				assignment_operations(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(VAR_NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				function_call();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return arithmetic_operations_sempred((Arithmetic_operationsContext)_localctx, predIndex);
		case 1:
			return assignment_operations_sempred((Assignment_operationsContext)_localctx, predIndex);
		case 2:
			return conditional_statements_sempred((Conditional_statementsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_operations_sempred(Arithmetic_operationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean assignment_operations_sempred(Assignment_operationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean conditional_statements_sempred(Conditional_statementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u013c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003p\b\u0003"+
		"\n\u0003\f\u0003s\t\u0003\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003"+
		"y\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0081\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u0087\b\u0003\n\u0003\f\u0003\u008a\t\u0003\u0001"+
		"\u0003\u0005\u0003\u008d\b\u0003\n\u0003\f\u0003\u0090\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0097\b\u0003"+
		"\n\u0003\f\u0003\u009a\t\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003\n"+
		"\u0003\f\u0003\u00a0\t\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00ab\b\u0004\n\u0004\f\u0004\u00ae\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00b7\b\u0004\n\u0004\f\u0004\u00ba\t\u0004\u0003\u0004\u00bc\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00c4\b\u0005\n\u0005\f\u0005\u00c7\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00cf"+
		"\b\u0005\n\u0005\f\u0005\u00d2\t\u0005\u0003\u0005\u00d4\b\u0005\u0001"+
		"\u0006\u0005\u0006\u00d7\b\u0006\n\u0006\f\u0006\u00da\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00df\b\u0007\n\u0007\f\u0007\u00e2"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00e7\b\b\n\b\f\b\u00ea\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00ef\b\b\n\b\f\b\u00f2\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u00f7\b\b\n\b\f\b\u00fa\t\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00ff\b\b\n\b\f\b\u0102\t\b\u0003\b\u0104\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0109\b\t\n\t\f\t\u010c\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0114\b\n\n\n\f\n\u0117\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u011f\b\u000b\n"+
		"\u000b\f\u000b\u0122\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0127"+
		"\b\f\n\f\f\f\u012a\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u012f\b\f\n\f\f"+
		"\f\u0132\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u013a"+
		"\b\r\u0001\r\u0000\u0003\u0000\u0002\u0004\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\b\u0001\u0000\u001a"+
		"\u001c\u0001\u0000\u0018\u0019\u0001\u0000\u001e\"\u0001\u0000#$\u0001"+
		"\u0000%&\u0001\u0000\'(\u0001\u0000)*\u0001\u0000\u0014\u0015\u0169\u0000"+
		"#\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006\u00a1\u0001\u0000\u0000\u0000\b\u00bb\u0001\u0000"+
		"\u0000\u0000\n\u00d3\u0001\u0000\u0000\u0000\f\u00d8\u0001\u0000\u0000"+
		"\u0000\u000e\u00db\u0001\u0000\u0000\u0000\u0010\u0103\u0001\u0000\u0000"+
		"\u0000\u0012\u0105\u0001\u0000\u0000\u0000\u0014\u010f\u0001\u0000\u0000"+
		"\u0000\u0016\u011a\u0001\u0000\u0000\u0000\u0018\u0128\u0001\u0000\u0000"+
		"\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u001d\u0006\u0000\uffff"+
		"\uffff\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0003\u0000"+
		"\u0000\u0000\u001f \u0005\u0002\u0000\u0000 $\u0001\u0000\u0000\u0000"+
		"!$\u0005\u000f\u0000\u0000\"$\u0005+\u0000\u0000#\u001c\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$-\u0001\u0000"+
		"\u0000\u0000%&\n\u0004\u0000\u0000&\'\u0007\u0000\u0000\u0000\',\u0003"+
		"\u0000\u0000\u0005()\n\u0003\u0000\u0000)*\u0007\u0001\u0000\u0000*,\u0003"+
		"\u0000\u0000\u0004+%\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000"+
		",/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.\u0001\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0006"+
		"\u0001\uffff\uffff\u000014\u0005\u0001\u0000\u000025\u0003\u0002\u0001"+
		"\u000035\u0003\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0005\u0002\u0000\u00007>\u0001"+
		"\u0000\u0000\u00008>\u0005+\u0000\u00009>\u0005\u0011\u0000\u0000:>\u0005"+
		"\u0010\u0000\u0000;>\u0005\u000f\u0000\u0000<>\u0005\u0013\u0000\u0000"+
		"=0\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000"+
		"\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>G\u0001\u0000\u0000\u0000?@\n\u0007\u0000\u0000@A\u0005\u001d"+
		"\u0000\u0000AF\u0003\u0002\u0001\bBC\n\u0006\u0000\u0000CD\u0007\u0002"+
		"\u0000\u0000DF\u0003\u0002\u0001\u0007E?\u0001\u0000\u0000\u0000EB\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JQ\u0006\u0002\uffff\uffff\u0000KQ\u0005+\u0000\u0000LQ\u0005"+
		"\u0011\u0000\u0000MQ\u0005\u0010\u0000\u0000NQ\u0005\u000f\u0000\u0000"+
		"OQ\u0005\u0013\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q`\u0001\u0000\u0000\u0000RS\n\t"+
		"\u0000\u0000ST\u0007\u0003\u0000\u0000T_\u0003\u0004\u0002\nUV\n\b\u0000"+
		"\u0000VW\u0007\u0004\u0000\u0000W_\u0003\u0004\u0002\tXY\n\u0007\u0000"+
		"\u0000YZ\u0007\u0005\u0000\u0000Z_\u0003\u0004\u0002\b[\\\n\u0006\u0000"+
		"\u0000\\]\u0007\u0006\u0000\u0000]_\u0003\u0004\u0002\u0007^R\u0001\u0000"+
		"\u0000\u0000^U\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^[\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0003\u0000\u0000di\u0005\u0001\u0000\u0000ej\u0003"+
		"\u0002\u0001\u0000fj\u0003\u0004\u0002\u0000gj\u0005\u0012\u0000\u0000"+
		"hj\u0005+\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0004\u0000\u0000lm\u0005\u0005\u0000\u0000mq\u0005\u000e"+
		"\u0000\u0000np\u0003\u0018\f\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0003\u0006\u0003\u0000"+
		"ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u00a2\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0006\u0000\u0000{\u0080\u0005\u0001\u0000"+
		"\u0000|\u0081\u0003\u0002\u0001\u0000}\u0081\u0003\u0004\u0002\u0000~"+
		"\u0081\u0005\u0012\u0000\u0000\u007f\u0081\u0005+\u0000\u0000\u0080|\u0001"+
		"\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0005\u0005\u0000"+
		"\u0000\u0084\u0088\u0005\u000e\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008e\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0003\u0006\u0003\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u00a2\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0007\u0000\u0000"+
		"\u0092\u0093\u0005\u0016\u0000\u0000\u0093\u0094\u0005\u0005\u0000\u0000"+
		"\u0094\u0098\u0005\u000e\u0000\u0000\u0095\u0097\u0003\u0018\f\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009e\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0003\u0006\u0003\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1c\u0001\u0000\u0000\u0000\u00a1z\u0001"+
		"\u0000\u0000\u0000\u00a1\u0091\u0001\u0000\u0000\u0000\u00a2\u0007\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4\u00a5\u0005\u0001"+
		"\u0000\u0000\u00a5\u00a6\u0003\u0002\u0001\u0000\u00a6\u00a7\u0005\u0004"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00ac\u0005\u000e"+
		"\u0000\u0000\u00a9\u00ab\u0003\u0018\f\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\b\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1\u00b2\u0003\u0004\u0002\u0000"+
		"\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000"+
		"\u00b4\u00b8\u0005\u000e\u0000\u0000\u00b5\u00b7\u0003\u0018\f\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00a3\u0001\u0000\u0000\u0000\u00bb\u00af\u0001\u0000\u0000\u0000\u00bc"+
		"\t\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be\u00bf"+
		"\u0003\u0002\u0001\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0005\u0000\u0000\u00c1\u00c5\u0005\u000e\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0018\f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00d4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\t\u0000\u0000\u00c9\u00ca\u0003\u0004"+
		"\u0002\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000\u00cb\u00cc\u0005\u0005"+
		"\u0000\u0000\u00cc\u00d0\u0005\u000e\u0000\u0000\u00cd\u00cf\u0003\u0018"+
		"\f\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00bd\u0001\u0000\u0000\u0000\u00d3\u00c8\u0001\u0000\u0000"+
		"\u0000\u00d4\u000b\u0001\u0000\u0000\u0000\u00d5\u00d7\u0007\u0007\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\r\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00e0\u0005+\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd"+
		"\u00df\u0005+\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u000f\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e8\u0005+\u0000\u0000\u00e4\u00e5\u0005"+
		"\n\u0000\u0000\u00e5\u00e7\u0005+\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u0104\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00f0\u0005\u000f"+
		"\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ef\u0005\u000f\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u0104\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f8\u0005\u0013\u0000\u0000\u00f4\u00f5\u0005\n\u0000\u0000"+
		"\u00f5\u00f7\u0005\u0013\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0104\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u0100\u0005\u0012\u0000\u0000"+
		"\u00fc\u00fd\u0005\n\u0000\u0000\u00fd\u00ff\u0005\u0012\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u00e3\u0001\u0000\u0000\u0000\u0103\u00eb\u0001\u0000\u0000\u0000\u0103"+
		"\u00f3\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0104"+
		"\u0011\u0001\u0000\u0000\u0000\u0105\u0106\u0005+\u0000\u0000\u0106\u010a"+
		"\u0005\u0001\u0000\u0000\u0107\u0109\u0003\u0010\b\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\u0002\u0000\u0000\u010e\u0013\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u000b\u0000\u0000\u0110\u0111\u0005+\u0000\u0000\u0111\u0115\u0005\u0001"+
		"\u0000\u0000\u0112\u0114\u0003\u000e\u0007\u0000\u0113\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0004"+
		"\u0000\u0000\u0119\u0015\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u0014"+
		"\n\u0000\u011b\u011c\u0005\u0005\u0000\u0000\u011c\u0120\u0005\u000e\u0000"+
		"\u0000\u011d\u011f\u0003\u0018\f\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0005\r\u0000\u0000\u0124"+
		"\u0017\u0001\u0000\u0000\u0000\u0125\u0127\u0003\u001a\r\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005\u0005\u0000\u0000\u012c\u0130\u0005\u000e\u0000\u0000\u012d\u012f"+
		"\u0003\u001a\r\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0019\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0133\u013a\u0003\b\u0004\u0000\u0134\u013a\u0003\n"+
		"\u0005\u0000\u0135\u013a\u0003\u0000\u0000\u0000\u0136\u013a\u0003\u0002"+
		"\u0001\u0000\u0137\u013a\u0005+\u0000\u0000\u0138\u013a\u0003\u0012\t"+
		"\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0134\u0001\u0000\u0000"+
		"\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u001b\u0001\u0000\u0000\u0000&#+-4=EGP^`iqw\u0080\u0088\u008e"+
		"\u0098\u009e\u00a1\u00ac\u00b8\u00bb\u00c5\u00d0\u00d3\u00d8\u00e0\u00e8"+
		"\u00f0\u00f8\u0100\u0103\u010a\u0115\u0120\u0128\u0130\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}