package uam.eagledata.dsl.query.scoping

class QueryDslScopeProvider extends AbstractQueryDslScopeProvider {
	/*@Inject IQualifiedNameProvider nameProvider
	
	override getScope(EObject context, EReference reference) {
		if (QueryPackage.Literals.SELECT__SELECTION == reference) {
			if (context instanceof Select) {
				val scope = <IEObjectDescription>newArrayList()
				for (selection : context.selection) {
					scope.add(new AliasedEObjectDescription(QualifiedName.create(selection.name), EObjectDescription.create(nameProvider.getFullyQualifiedName(selection), selection)))
				}
				return new SimpleScope(IScope.NULLSCOPE, scope, false)
			}
		}
		return super.getScope(context, reference)
	}*/
}