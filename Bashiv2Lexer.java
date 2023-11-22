// Generated from Bashiv2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Bashiv2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WORD=19, ARG=20, STRING=21, NUMBER=22, WS=23, NEWLINE=24, COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "WORD", "ARG", "STRING", "NUMBER", "WS", "NEWLINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "','", "'do'", 
			"'done'", "'while'", "'='", "'declare'", "' -a'", "'['", "']'", "'&&'", 
			"'||'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WORD", "ARG", "STRING", "NUMBER", 
			"WS", "NEWLINE", "COMMENT"
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


	public Bashiv2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bashiv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012w\b\u0012\n\u0012\f\u0012"+
		"z\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013~\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0085\b\u0015\u0001"+
		"\u0015\u0004\u0015\u0088\b\u0015\u000b\u0015\f\u0015\u0089\u0001\u0016"+
		"\u0004\u0016\u008d\b\u0016\u000b\u0016\f\u0016\u008e\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0003\u0017\u0094\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u009a\b\u0018\n\u0018\f\u0018\u009d\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az"+
		"\u0001\u0000\"\"\u0002\u0000++--\u0001\u000009\u0003\u0000\t\n\r\r  \u0003"+
		"\u0000\n\n\r\r//\u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00013\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005"+
		";\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tC\u0001\u0000"+
		"\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000"+
		"\u000fL\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000\u0000\u0013T"+
		"\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001"+
		"\u0000\u0000\u0000\u0019d\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000"+
		"\u0000\u001dj\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!"+
		"o\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000"+
		"\u0000\'}\u0001\u0000\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+\u0084"+
		"\u0001\u0000\u0000\u0000-\u008c\u0001\u0000\u0000\u0000/\u0093\u0001\u0000"+
		"\u0000\u00001\u0097\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005"+
		"f\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005t\u0000\u000078\u0005"+
		"h\u0000\u000089\u0005e\u0000\u00009:\u0005n\u0000\u0000:\u0004\u0001\u0000"+
		"\u0000\u0000;<\u0005e\u0000\u0000<=\u0005l\u0000\u0000=>\u0005s\u0000"+
		"\u0000>?\u0005e\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005f\u0000"+
		"\u0000AB\u0005i\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005f\u0000"+
		"\u0000DE\u0005o\u0000\u0000EF\u0005r\u0000\u0000F\n\u0001\u0000\u0000"+
		"\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000I\f\u0001\u0000\u0000"+
		"\u0000JK\u0005,\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005d\u0000"+
		"\u0000MN\u0005o\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OP\u0005d\u0000"+
		"\u0000PQ\u0005o\u0000\u0000QR\u0005n\u0000\u0000RS\u0005e\u0000\u0000"+
		"S\u0012\u0001\u0000\u0000\u0000TU\u0005w\u0000\u0000UV\u0005h\u0000\u0000"+
		"VW\u0005i\u0000\u0000WX\u0005l\u0000\u0000XY\u0005e\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005=\u0000\u0000[\u0016\u0001\u0000\u0000"+
		"\u0000\\]\u0005d\u0000\u0000]^\u0005e\u0000\u0000^_\u0005c\u0000\u0000"+
		"_`\u0005l\u0000\u0000`a\u0005a\u0000\u0000ab\u0005r\u0000\u0000bc\u0005"+
		"e\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005 \u0000\u0000ef\u0005"+
		"-\u0000\u0000fg\u0005a\u0000\u0000g\u001a\u0001\u0000\u0000\u0000hi\u0005"+
		"[\u0000\u0000i\u001c\u0001\u0000\u0000\u0000jk\u0005]\u0000\u0000k\u001e"+
		"\u0001\u0000\u0000\u0000lm\u0005&\u0000\u0000mn\u0005&\u0000\u0000n \u0001"+
		"\u0000\u0000\u0000op\u0005|\u0000\u0000pq\u0005|\u0000\u0000q\"\u0001"+
		"\u0000\u0000\u0000rs\u0005$\u0000\u0000s$\u0001\u0000\u0000\u0000tx\u0007"+
		"\u0000\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y&\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{~\u0003%\u0012"+
		"\u0000|~\u0003)\u0014\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~(\u0001\u0000\u0000\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080"+
		"\u0081\b\u0002\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082*\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0007\u0003\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0007\u0004\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a,\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0007\u0005\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0006\u0016\u0000\u0000\u0091.\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0005\r\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u00960\u0001\u0000\u0000\u0000\u0097"+
		"\u009b\u0005#\u0000\u0000\u0098\u009a\b\u0006\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0003/\u0017\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006"+
		"\u0018\u0000\u0000\u00a12\u0001\u0000\u0000\u0000\b\u0000x}\u0084\u0089"+
		"\u008e\u0093\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}