/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uam.eagledata.dsl.query.parser.antlr.internal.InternalQueryDslParser;
import uam.eagledata.dsl.query.services.QueryDslGrammarAccess;

public class QueryDslParser extends AbstractAntlrParser {

	@Inject
	private QueryDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalQueryDslParser createParser(XtextTokenStream stream) {
		return new InternalQueryDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "QuerySet";
	}

	public QueryDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QueryDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}