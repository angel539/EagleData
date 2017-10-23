/*
 * generated by Xtext 2.9.2
 */
grammar InternalAnnotationsDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uam.eagledata.dsl.annotations.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uam.eagledata.dsl.annotations.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uam.eagledata.dsl.annotations.services.AnnotationsDslGrammarAccess;

}
@parser::members {
	private AnnotationsDslGrammarAccess grammarAccess;

	public void setGrammarAccess(AnnotationsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRepositoryManager
entryRuleRepositoryManager
:
{ before(grammarAccess.getRepositoryManagerRule()); }
	 ruleRepositoryManager
{ after(grammarAccess.getRepositoryManagerRule()); } 
	 EOF 
;

// Rule RepositoryManager
ruleRepositoryManager 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRepositoryManagerAccess().getGroup()); }
		(rule__RepositoryManager__Group__0)
		{ after(grammarAccess.getRepositoryManagerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getAlternatives()); }
		(rule__Annotation__Alternatives)
		{ after(grammarAccess.getAnnotationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleAnnotation
entryRuleSimpleAnnotation
:
{ before(grammarAccess.getSimpleAnnotationRule()); }
	 ruleSimpleAnnotation
{ after(grammarAccess.getSimpleAnnotationRule()); } 
	 EOF 
;

// Rule SimpleAnnotation
ruleSimpleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleAnnotationAccess().getGroup()); }
		(rule__SimpleAnnotation__Group__0)
		{ after(grammarAccess.getSimpleAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotationHierarchy
entryRuleAnnotationHierarchy
:
{ before(grammarAccess.getAnnotationHierarchyRule()); }
	 ruleAnnotationHierarchy
{ after(grammarAccess.getAnnotationHierarchyRule()); } 
	 EOF 
;

// Rule AnnotationHierarchy
ruleAnnotationHierarchy 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationHierarchyAccess().getGroup()); }
		(rule__AnnotationHierarchy__Group__0)
		{ after(grammarAccess.getAnnotationHierarchyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotationInstance
entryRuleAnnotationInstance
:
{ before(grammarAccess.getAnnotationInstanceRule()); }
	 ruleAnnotationInstance
{ after(grammarAccess.getAnnotationInstanceRule()); } 
	 EOF 
;

// Rule AnnotationInstance
ruleAnnotationInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationInstanceAccess().getGroup()); }
		(rule__AnnotationInstance__Group__0)
		{ after(grammarAccess.getAnnotationInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getSimpleAnnotationParserRuleCall_0()); }
		ruleSimpleAnnotation
		{ after(grammarAccess.getAnnotationAccess().getSimpleAnnotationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAnnotationAccess().getAnnotationHierarchyParserRuleCall_1()); }
		ruleAnnotationHierarchy
		{ after(grammarAccess.getAnnotationAccess().getAnnotationHierarchyParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAnnotationAccess().getAnnotationInstanceParserRuleCall_2()); }
		ruleAnnotationInstance
		{ after(grammarAccess.getAnnotationAccess().getAnnotationInstanceParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RepositoryManager__Group__0__Impl
	rule__RepositoryManager__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); }
	()
	{ after(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RepositoryManager__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepositoryManagerAccess().getGroup_1()); }
	(rule__RepositoryManager__Group_1__0)?
	{ after(grammarAccess.getRepositoryManagerAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RepositoryManager__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RepositoryManager__Group_1__0__Impl
	rule__RepositoryManager__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_0()); }
	(rule__RepositoryManager__AnnotationsAssignment_1_0)
	{ after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RepositoryManager__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_1()); }
	(rule__RepositoryManager__AnnotationsAssignment_1_1)*
	{ after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleAnnotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleAnnotation__Group__0__Impl
	rule__SimpleAnnotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAnnotationAccess().getAnnotationAction_0()); }
	()
	{ after(grammarAccess.getSimpleAnnotationAccess().getAnnotationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleAnnotation__Group__1__Impl
	rule__SimpleAnnotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAnnotationAccess().getCommercialAtKeyword_1()); }
	'@'
	{ after(grammarAccess.getSimpleAnnotationAccess().getCommercialAtKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleAnnotation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAnnotationAccess().getNameAssignment_2()); }
	(rule__SimpleAnnotation__NameAssignment_2)
	{ after(grammarAccess.getSimpleAnnotationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationHierarchy__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group__0__Impl
	rule__AnnotationHierarchy__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getAnnotationAction_0()); }
	()
	{ after(grammarAccess.getAnnotationHierarchyAccess().getAnnotationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group__1__Impl
	rule__AnnotationHierarchy__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_1()); }
	'@'
	{ after(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group__2__Impl
	rule__AnnotationHierarchy__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getNameAssignment_2()); }
	(rule__AnnotationHierarchy__NameAssignment_2)
	{ after(grammarAccess.getAnnotationHierarchyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getGroup_3()); }
	(rule__AnnotationHierarchy__Group_3__0)
	{ after(grammarAccess.getAnnotationHierarchyAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationHierarchy__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group_3__0__Impl
	rule__AnnotationHierarchy__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_0()); }
	'<'
	{ after(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group_3__1__Impl
	rule__AnnotationHierarchy__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_1()); }
	(rule__AnnotationHierarchy__SupersAssignment_3_1)
	{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getGroup_3_2()); }
	(rule__AnnotationHierarchy__Group_3_2__0)*
	{ after(grammarAccess.getAnnotationHierarchyAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationHierarchy__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group_3_2__0__Impl
	rule__AnnotationHierarchy__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_2_0()); }
	'<'
	{ after(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationHierarchy__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_2_1()); }
	(rule__AnnotationHierarchy__SupersAssignment_3_2_1)
	{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group__0__Impl
	rule__AnnotationInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getAnnotationAction_0()); }
	()
	{ after(grammarAccess.getAnnotationInstanceAccess().getAnnotationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group__1__Impl
	rule__AnnotationInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_1()); }
	'@'
	{ after(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group__2__Impl
	rule__AnnotationInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getNameAssignment_2()); }
	(rule__AnnotationInstance__NameAssignment_2)
	{ after(grammarAccess.getAnnotationInstanceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getGroup_3()); }
	(rule__AnnotationInstance__Group_3__0)
	{ after(grammarAccess.getAnnotationInstanceAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationInstance__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group_3__0__Impl
	rule__AnnotationInstance__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_0()); }
	':'
	{ after(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group_3__1__Impl
	rule__AnnotationInstance__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_1()); }
	(rule__AnnotationInstance__DescriptorsAssignment_3_1)
	{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getGroup_3_2()); }
	(rule__AnnotationInstance__Group_3_2__0)*
	{ after(grammarAccess.getAnnotationInstanceAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationInstance__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group_3_2__0__Impl
	rule__AnnotationInstance__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_2_0()); }
	':'
	{ after(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationInstance__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_2_1()); }
	(rule__AnnotationInstance__DescriptorsAssignment_3_2_1)
	{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RepositoryManager__AnnotationsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RepositoryManager__AnnotationsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); }
		ruleAnnotation
		{ after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleAnnotation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAnnotationAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getSimpleAnnotationAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationHierarchyAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getAnnotationHierarchyAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__SupersAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationHierarchy__SupersAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_2_1_0()); }
		(
			{ before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationInstanceAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getAnnotationInstanceAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__DescriptorsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationInstance__DescriptorsAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_2_1_0()); }
		(
			{ before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
