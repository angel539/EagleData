/*
 * generated by Xtext 2.9.2
 */
grammar InternalEventSetManagerDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uam.eagledata.dsl.events.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uam.eagledata.dsl.events.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uam.eagledata.dsl.events.services.EventSetManagerDslGrammarAccess;

}

@parser::members {

 	private EventSetManagerDslGrammarAccess grammarAccess;

    public InternalEventSetManagerDslParser(TokenStream input, EventSetManagerDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EventSetManager";
   	}

   	@Override
   	protected EventSetManagerDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEventSetManager
entryRuleEventSetManager returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventSetManagerRule()); }
	iv_ruleEventSetManager=ruleEventSetManager
	{ $current=$iv_ruleEventSetManager.current; }
	EOF;

// Rule EventSetManager
ruleEventSetManager returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_0_0());
				}
				lv_events_0_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
					}
					add(
						$current,
						"events",
						lv_events_0_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_1_0());
				}
				lv_events_1_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
					}
					add(
						$current,
						"events",
						lv_events_1_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEventAccess().getPatternEventParserRuleCall());
	}
	this_PatternEvent_0=rulePatternEvent
	{
		$current = $this_PatternEvent_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePatternEvent
entryRulePatternEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternEventRule()); }
	iv_rulePatternEvent=rulePatternEvent
	{ $current=$iv_rulePatternEvent.current; }
	EOF;

// Rule PatternEvent
rulePatternEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPatternEventAccess().getPatternEventAction_0(),
					$current);
			}
		)
		otherlv_1='pattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getPatternEventAccess().getPatternKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternEventAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternEventRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPatternEventAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_4_0());
				}
				lv_concepts_4_0=ruleConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternEventRule());
					}
					add(
						$current,
						"concepts",
						lv_concepts_4_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_5_0());
				}
				lv_concepts_5_0=ruleConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternEventRule());
					}
					add(
						$current,
						"concepts",
						lv_concepts_5_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPatternEventAccess().getRightCurlyBracketKeyword_6());
		}
		(
			otherlv_7='if'
			{
				newLeafNode(otherlv_7, grammarAccess.getPatternEventAccess().getIfKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternEventAccess().getWhenConditionParserRuleCall_7_1_0());
					}
					lv_when_8_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternEventRule());
						}
						set(
							$current,
							"when",
							lv_when_8_0,
							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='then'
			{
				newLeafNode(otherlv_9, grammarAccess.getPatternEventAccess().getThenKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_1_0());
					}
					lv_triggers_10_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternEventRule());
						}
						add(
							$current,
							"triggers",
							lv_triggers_10_0,
							"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_2_0());
					}
					lv_triggers_11_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternEventRule());
						}
						add(
							$current,
							"triggers",
							lv_triggers_11_0,
							"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionAccess().getBinaryExpressionParserRuleCall_0());
		}
		this_BinaryExpression_0=ruleBinaryExpression
		{
			$current = $this_BinaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getBooleanExpressionParserRuleCall_1());
		}
		this_BooleanExpression_1=ruleBooleanExpression
		{
			$current = $this_BooleanExpression_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBinaryExpression
entryRuleBinaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryExpressionRule()); }
	iv_ruleBinaryExpression=ruleBinaryExpression
	{ $current=$iv_ruleBinaryExpression.current; }
	EOF;

// Rule BinaryExpression
ruleBinaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinaryExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=' = '
		{
			newLeafNode(otherlv_1, grammarAccess.getBinaryExpressionAccess().getSpaceEqualsSignSpaceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightLiteralParserRuleCall_2_0());
				}
				lv_right_2_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_0());
			}
			lv_value_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleBooleanExpression
entryRuleBooleanExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanExpressionRule()); }
	iv_ruleBooleanExpression=ruleBooleanExpression
	{ $current=$iv_ruleBooleanExpression.current; }
	EOF;

// Rule BooleanExpression
ruleBooleanExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_expression_0_0=RULE_BOOLEAN
			{
				newLeafNode(lv_expression_0_0, grammarAccess.getBooleanExpressionAccess().getExpressionBOOLEANTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getBooleanExpressionRule());
				}
				setWithLastConsumed(
					$current,
					"expression",
					lv_expression_0_0,
					"uam.eagledata.dsl.events.EventSetManagerDsl.BOOLEAN");
			}
		)
	)
;

// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConceptAccess().getKeyConceptParserRuleCall_0());
		}
		this_KeyConcept_0=ruleKeyConcept
		{
			$current = $this_KeyConcept_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConceptAccess().getRegexConceptParserRuleCall_1());
		}
		this_RegexConcept_1=ruleRegexConcept
		{
			$current = $this_RegexConcept_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKeyConcept
entryRuleKeyConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyConceptRule()); }
	iv_ruleKeyConcept=ruleKeyConcept
	{ $current=$iv_ruleKeyConcept.current; }
	EOF;

// Rule KeyConcept
ruleKeyConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyConceptRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyConceptAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyConceptRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRegexConcept
entryRuleRegexConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegexConceptRule()); }
	iv_ruleRegexConcept=ruleRegexConcept
	{ $current=$iv_ruleRegexConcept.current; }
	EOF;

// Rule RegexConcept
ruleRegexConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegexConceptRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegexConceptRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegexConceptAccess().getRegexEStringParserRuleCall_4_0());
				}
				lv_regex_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegexConceptRule());
					}
					set(
						$current,
						"regex",
						lv_regex_4_0,
						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='String'
			{
				$current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Int'
			{
				$current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Float'
			{
				$current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
