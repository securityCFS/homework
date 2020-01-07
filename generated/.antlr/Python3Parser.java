// Generated from e:\putintest\bighomework2\Python_Assignment-master\generated\Python3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, INTEGER=3, DEF=4, RETURN=5, IF=6, ELIF=7, ELSE=8, 
		WHILE=9, FOR=10, IN=11, OR=12, AND=13, NOT=14, NONE=15, TRUE=16, FALSE=17, 
		CONTINUE=18, BREAK=19, NEWLINE=20, NAME=21, STRING_LITERAL=22, BYTES_LITERAL=23, 
		DECIMAL_INTEGER=24, OCT_INTEGER=25, HEX_INTEGER=26, BIN_INTEGER=27, FLOAT_NUMBER=28, 
		IMAG_NUMBER=29, DOT=30, ELLIPSIS=31, STAR=32, OPEN_PAREN=33, CLOSE_PAREN=34, 
		COMMA=35, COLON=36, SEMI_COLON=37, POWER=38, ASSIGN=39, OPEN_BRACK=40, 
		CLOSE_BRACK=41, OR_OP=42, XOR=43, AND_OP=44, LEFT_SHIFT=45, RIGHT_SHIFT=46, 
		ADD=47, MINUS=48, DIV=49, MOD=50, IDIV=51, NOT_OP=52, OPEN_BRACE=53, CLOSE_BRACE=54, 
		LESS_THAN=55, GREATER_THAN=56, EQUALS=57, GT_EQ=58, LT_EQ=59, NOT_EQ_1=60, 
		NOT_EQ_2=61, AT=62, ARROW=63, ADD_ASSIGN=64, SUB_ASSIGN=65, MULT_ASSIGN=66, 
		AT_ASSIGN=67, DIV_ASSIGN=68, MOD_ASSIGN=69, AND_ASSIGN=70, OR_ASSIGN=71, 
		XOR_ASSIGN=72, LEFT_SHIFT_ASSIGN=73, RIGHT_SHIFT_ASSIGN=74, POWER_ASSIGN=75, 
		IDIV_ASSIGN=76, SKIP_=77, UNKNOWN_CHAR=78, INDENT=79, DEDENT=80;
	public static final int
		RULE_file_input = 0, RULE_funcdef = 1, RULE_parameters = 2, RULE_typedargslist = 3, 
		RULE_tfpdef = 4, RULE_stmt = 5, RULE_simple_stmt = 6, RULE_small_stmt = 7, 
		RULE_expr_stmt = 8, RULE_augassign = 9, RULE_flow_stmt = 10, RULE_break_stmt = 11, 
		RULE_continue_stmt = 12, RULE_return_stmt = 13, RULE_compound_stmt = 14, 
		RULE_if_stmt = 15, RULE_while_stmt = 16, RULE_suite = 17, RULE_test = 18, 
		RULE_or_test = 19, RULE_and_test = 20, RULE_not_test = 21, RULE_comparison = 22, 
		RULE_comp_op = 23, RULE_arith_expr = 24, RULE_term = 25, RULE_factor = 26, 
		RULE_atom_expr = 27, RULE_trailer = 28, RULE_atom = 29, RULE_testlist = 30, 
		RULE_arglist = 31, RULE_argument = 32;
	public static final String[] ruleNames = {
		"file_input", "funcdef", "parameters", "typedargslist", "tfpdef", "stmt", 
		"simple_stmt", "small_stmt", "expr_stmt", "augassign", "flow_stmt", "break_stmt", 
		"continue_stmt", "return_stmt", "compound_stmt", "if_stmt", "while_stmt", 
		"suite", "test", "or_test", "and_test", "not_test", "comparison", "comp_op", 
		"arith_expr", "term", "factor", "atom_expr", "trailer", "atom", "testlist", 
		"arglist", "argument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'def'", "'return'", "'if'", "'elif'", "'else'", 
		"'while'", "'for'", "'in'", "'or'", "'and'", "'not'", "'None'", "'True'", 
		"'False'", "'continue'", "'break'", null, null, null, null, null, null, 
		null, null, null, null, "'.'", "'...'", "'*'", "'('", "')'", "','", "':'", 
		"';'", "'**'", "'='", "'['", "']'", "'|'", "'^'", "'&'", "'<<'", "'>>'", 
		"'+'", "'-'", "'/'", "'%'", "'//'", "'~'", "'{'", "'}'", "'<'", "'>'", 
		"'=='", "'>='", "'<='", "'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", 
		"'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
		"'**='", "'//='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "INTEGER", "DEF", "RETURN", "IF", "ELIF", "ELSE", 
		"WHILE", "FOR", "IN", "OR", "AND", "NOT", "NONE", "TRUE", "FALSE", "CONTINUE", 
		"BREAK", "NEWLINE", "NAME", "STRING_LITERAL", "BYTES_LITERAL", "DECIMAL_INTEGER", 
		"OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "FLOAT_NUMBER", "IMAG_NUMBER", 
		"DOT", "ELLIPSIS", "STAR", "OPEN_PAREN", "CLOSE_PAREN", "COMMA", "COLON", 
		"SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", "OR_OP", 
		"XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", "DIV", "MOD", 
		"IDIV", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", "GREATER_THAN", 
		"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
		"POWER_ASSIGN", "IDIV_ASSIGN", "SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
	};
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
	public String getGrammarFileName() { return "Python3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Python3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEWLINE) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << ADD) | (1L << MINUS))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(66);
					match(NEWLINE);
					}
					break;
				case STRING:
				case NUMBER:
				case DEF:
				case RETURN:
				case IF:
				case WHILE:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case CONTINUE:
				case BREAK:
				case NAME:
				case OPEN_PAREN:
				case ADD:
				case MINUS:
					{
					setState(67);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(EOF);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DEF);
			setState(76);
			match(NAME);
			setState(77);
			parameters();
			setState(78);
			match(COLON);
			setState(79);
			suite();
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

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OPEN_PAREN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(82);
				typedargslist();
				}
			}

			setState(85);
			match(CLOSE_PAREN);
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

	public static class TypedargslistContext extends ParserRuleContext {
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			tfpdef();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(88);
				match(ASSIGN);
				setState(89);
				test();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				tfpdef();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(94);
					match(ASSIGN);
					setState(95);
					test();
					}
				}

				}
				}
				setState(102);
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

	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(NAME);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case RETURN:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case CONTINUE:
			case BREAK:
			case NAME:
			case OPEN_PAREN:
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				compound_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public Small_stmtContext small_stmt() {
			return getRuleContext(Small_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			small_stmt();
			setState(110);
			match(NEWLINE);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_small_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case OPEN_PAREN:
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				expr_stmt();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				flow_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public List<TestlistContext> testlist() {
			return getRuleContexts(TestlistContext.class);
		}
		public TestlistContext testlist(int i) {
			return getRuleContext(TestlistContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			testlist();
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case IDIV_ASSIGN:
				{
				{
				setState(117);
				augassign();
				setState(118);
				testlist();
				}
				}
				break;
			case NEWLINE:
			case ASSIGN:
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(120);
					match(ASSIGN);
					setState(121);
					testlist();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MULT_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (MOD_ASSIGN - 64)) | (1L << (IDIV_ASSIGN - 64)))) != 0)) ) {
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

	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_flow_stmt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				return_stmt();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(BREAK);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CONTINUE);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(RETURN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << ADD) | (1L << MINUS))) != 0)) {
				{
				setState(141);
				testlist();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compound_stmt);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				while_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				funcdef();
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

	public static class If_stmtContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			test();
			setState(151);
			match(COLON);
			setState(152);
			suite();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(153);
				match(ELIF);
				setState(154);
				test();
				setState(155);
				match(COLON);
				setState(156);
				suite();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(163);
				match(ELSE);
				setState(164);
				match(COLON);
				setState(165);
				suite();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			test();
			setState(170);
			match(COLON);
			setState(171);
			suite();
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

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(Python3Parser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(Python3Parser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_suite);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case RETURN:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case CONTINUE:
			case BREAK:
			case NAME:
			case OPEN_PAREN:
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NEWLINE);
				setState(175);
				match(INDENT);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					stmt();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CONTINUE) | (1L << BREAK) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << ADD) | (1L << MINUS))) != 0) );
				setState(181);
				match(DEDENT);
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

	public static class TestContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			or_test();
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

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			and_test();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(188);
				match(OR);
				setState(189);
				and_test();
				}
				}
				setState(194);
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

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			not_test();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(196);
				match(AND);
				setState(197);
				not_test();
				}
				}
				setState(202);
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

	public static class Not_testContext extends ParserRuleContext {
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_not_test);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(NOT);
				setState(204);
				not_test();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case OPEN_PAREN:
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			arith_expr();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(209);
				comp_op();
				setState(210);
				arith_expr();
				}
				}
				setState(216);
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

	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_2))) != 0)) ) {
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

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			term();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				term();
				}
				}
				setState(226);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			factor();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << IDIV))) != 0)) {
				{
				{
				setState(228);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << IDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				factor();
				}
				}
				setState(234);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				factor();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				atom_expr();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TrailerContext trailer() {
			return getRuleContext(TrailerContext.class,0);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			atom();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(241);
				trailer();
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

	public static class TrailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_trailer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(OPEN_PAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << ADD) | (1L << MINUS))) != 0)) {
				{
				setState(245);
				arglist();
				}
			}

			setState(248);
			match(CLOSE_PAREN);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(Python3Parser.NUMBER, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(Python3Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Python3Parser.STRING, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(250);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				setState(251);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					match(STRING);
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				{
				setState(257);
				match(NONE);
				}
				break;
			case TRUE:
				{
				setState(258);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(259);
				match(FALSE);
				}
				break;
			case OPEN_PAREN:
				{
				{
				setState(260);
				match(OPEN_PAREN);
				setState(261);
				test();
				setState(262);
				match(CLOSE_PAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			test();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					test();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(274);
				match(COMMA);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			argument();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(COMMA);
					setState(279);
					argument();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(285);
				match(COMMA);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(288);
				test();
				}
				break;
			case 2:
				{
				setState(289);
				match(NAME);
				setState(290);
				match(ASSIGN);
				setState(291);
				test();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\4V\n\4\3\4\3\4\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\5\5"+
		"\5c\n\5\7\5e\n\5\f\5\16\5h\13\5\3\6\3\6\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3"+
		"\t\3\t\5\tu\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\5"+
		"\n\u0082\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\5\17\u0091\n\17\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a1\n\21\f\21\16\21\u00a4\13\21\3"+
		"\21\3\21\3\21\5\21\u00a9\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\6\23\u00b4\n\23\r\23\16\23\u00b5\3\23\3\23\5\23\u00ba\n\23\3\24"+
		"\3\24\3\25\3\25\3\25\7\25\u00c1\n\25\f\25\16\25\u00c4\13\25\3\26\3\26"+
		"\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc\13\26\3\27\3\27\3\27\5\27\u00d1"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16\30\u00da\13\30\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u00e1\n\32\f\32\16\32\u00e4\13\32\3\33\3\33"+
		"\3\33\7\33\u00e9\n\33\f\33\16\33\u00ec\13\33\3\34\3\34\3\34\5\34\u00f1"+
		"\n\34\3\35\3\35\5\35\u00f5\n\35\3\36\3\36\5\36\u00f9\n\36\3\36\3\36\3"+
		"\37\3\37\3\37\6\37\u0100\n\37\r\37\16\37\u0101\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u010b\n\37\3 \3 \3 \7 \u0110\n \f \16 \u0113\13 \3 \5"+
		" \u0116\n \3!\3!\3!\7!\u011b\n!\f!\16!\u011e\13!\3!\5!\u0121\n!\3\"\3"+
		"\"\3\"\3\"\5\"\u0127\n\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@B\2\6\5\2BDFGNN\4\29=??\3\2\61\62\4\2\"\""+
		"\63\65\2\u012f\2H\3\2\2\2\4M\3\2\2\2\6S\3\2\2\2\bY\3\2\2\2\ni\3\2\2\2"+
		"\fm\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24\u0083\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36\u0095\3"+
		"\2\2\2 \u0097\3\2\2\2\"\u00aa\3\2\2\2$\u00b9\3\2\2\2&\u00bb\3\2\2\2(\u00bd"+
		"\3\2\2\2*\u00c5\3\2\2\2,\u00d0\3\2\2\2.\u00d2\3\2\2\2\60\u00db\3\2\2\2"+
		"\62\u00dd\3\2\2\2\64\u00e5\3\2\2\2\66\u00f0\3\2\2\28\u00f2\3\2\2\2:\u00f6"+
		"\3\2\2\2<\u010a\3\2\2\2>\u010c\3\2\2\2@\u0117\3\2\2\2B\u0126\3\2\2\2D"+
		"G\7\26\2\2EG\5\f\7\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2JH\3\2\2\2KL\7\2\2\3L\3\3\2\2\2MN\7\6\2\2NO\7\27\2\2OP\5\6\4"+
		"\2PQ\7&\2\2QR\5$\23\2R\5\3\2\2\2SU\7#\2\2TV\5\b\5\2UT\3\2\2\2UV\3\2\2"+
		"\2VW\3\2\2\2WX\7$\2\2X\7\3\2\2\2Y\\\5\n\6\2Z[\7)\2\2[]\5&\24\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]f\3\2\2\2^_\7%\2\2_b\5\n\6\2`a\7)\2\2ac\5&\24\2b`\3\2"+
		"\2\2bc\3\2\2\2ce\3\2\2\2d^\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3"+
		"\2\2\2hf\3\2\2\2ij\7\27\2\2j\13\3\2\2\2kn\5\16\b\2ln\5\36\20\2mk\3\2\2"+
		"\2ml\3\2\2\2n\r\3\2\2\2op\5\20\t\2pq\7\26\2\2q\17\3\2\2\2ru\5\22\n\2s"+
		"u\5\26\f\2tr\3\2\2\2ts\3\2\2\2u\21\3\2\2\2v\u0081\5> \2wx\5\24\13\2xy"+
		"\5> \2y\u0082\3\2\2\2z{\7)\2\2{}\5> \2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081w\3\2\2\2\u0081"+
		"~\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\t\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0089\5\30\r\2\u0086\u0089\5\32\16\2\u0087\u0089\5\34\17\2\u0088\u0085"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\27\3\2\2\2\u008a"+
		"\u008b\7\25\2\2\u008b\31\3\2\2\2\u008c\u008d\7\24\2\2\u008d\33\3\2\2\2"+
		"\u008e\u0090\7\7\2\2\u008f\u0091\5> \2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\35\3\2\2\2\u0092\u0096\5 \21\2\u0093\u0096\5\"\22\2\u0094"+
		"\u0096\5\4\3\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\37\3\2\2\2\u0097\u0098\7\b\2\2\u0098\u0099\5&\24\2\u0099\u009a"+
		"\7&\2\2\u009a\u00a2\5$\23\2\u009b\u009c\7\t\2\2\u009c\u009d\5&\24\2\u009d"+
		"\u009e\7&\2\2\u009e\u009f\5$\23\2\u009f\u00a1\3\2\2\2\u00a0\u009b\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a8\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\7&"+
		"\2\2\u00a7\u00a9\5$\23\2\u00a8\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"!\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7&\2\2"+
		"\u00ad\u00ae\5$\23\2\u00ae#\3\2\2\2\u00af\u00ba\5\16\b\2\u00b0\u00b1\7"+
		"\26\2\2\u00b1\u00b3\7Q\2\2\u00b2\u00b4\5\f\7\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\7R\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00b0\3\2\2\2\u00ba%\3\2\2\2\u00bb\u00bc\5(\25\2\u00bc\'\3\2\2\2\u00bd"+
		"\u00c2\5*\26\2\u00be\u00bf\7\16\2\2\u00bf\u00c1\5*\26\2\u00c0\u00be\3"+
		"\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		")\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\5,\27\2\u00c6\u00c7\7\17\2\2"+
		"\u00c7\u00c9\5,\27\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb+\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\20\2\2\u00ce\u00d1\5,\27\2\u00cf\u00d1\5.\30\2\u00d0\u00cd\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1-\3\2\2\2\u00d2\u00d8\5\62\32\2\u00d3"+
		"\u00d4\5\60\31\2\u00d4\u00d5\5\62\32\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"/\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc\61\3\2\2\2\u00dd"+
		"\u00e2\5\64\33\2\u00de\u00df\t\4\2\2\u00df\u00e1\5\64\33\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\63\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\5\66\34\2\u00e6\u00e7\t\5"+
		"\2\2\u00e7\u00e9\5\66\34\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\65\3\2\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00ee\t\4\2\2\u00ee\u00f1\5\66\34\2\u00ef\u00f1\58\35\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\67\3\2\2\2\u00f2\u00f4\5<\37"+
		"\2\u00f3\u00f5\5:\36\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f59"+
		"\3\2\2\2\u00f6\u00f8\7#\2\2\u00f7\u00f9\5@!\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb;\3\2\2\2\u00fc"+
		"\u010b\7\27\2\2\u00fd\u010b\7\4\2\2\u00fe\u0100\7\3\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u010b\3\2\2\2\u0103\u010b\7\21\2\2\u0104\u010b\7\22\2\2\u0105\u010b\7"+
		"\23\2\2\u0106\u0107\7#\2\2\u0107\u0108\5&\24\2\u0108\u0109\7$\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u00ff\3\2"+
		"\2\2\u010a\u0103\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a"+
		"\u0106\3\2\2\2\u010b=\3\2\2\2\u010c\u0111\5&\24\2\u010d\u010e\7%\2\2\u010e"+
		"\u0110\5&\24\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0116\7%\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116?\3\2\2\2\u0117"+
		"\u011c\5B\"\2\u0118\u0119\7%\2\2\u0119\u011b\5B\"\2\u011a\u0118\3\2\2"+
		"\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7%\2\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121A\3\2\2\2\u0122\u0127\5&\24\2\u0123\u0124\7\27\2\2"+
		"\u0124\u0125\7)\2\2\u0125\u0127\5&\24\2\u0126\u0122\3\2\2\2\u0126\u0123"+
		"\3\2\2\2\u0127C\3\2\2\2#FHU\\bfmt~\u0081\u0088\u0090\u0095\u00a2\u00a8"+
		"\u00b5\u00b9\u00c2\u00ca\u00d0\u00d8\u00e2\u00ea\u00f0\u00f4\u00f8\u0101"+
		"\u010a\u0111\u0115\u011c\u0120\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}