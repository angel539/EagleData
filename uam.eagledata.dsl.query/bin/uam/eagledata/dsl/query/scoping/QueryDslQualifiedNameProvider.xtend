package uam.eagledata.dsl.query.scoping

import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import semanticmanager.Repository
import semanticmanager.RepositoryManager
import semanticmanager.SemanticNode
import semanticmanager.SemanticmanagerPackage

class QueryDslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	/*override protected qualifiedName(Object ele) {
		if(ele instanceof SemanticNode){
			val SemanticNode semanticNode = ele;
			val RepositoryManager repositoryManager = EcoreUtil.getRootContainer(semanticNode, true) as RepositoryManager;
			val List<Repository> repositories = EcoreUtil.getObjectsByType(repositoryManager.eContents, SemanticmanagerPackage.Literals.REPOSITORY) as List<Repository>;

			for(Repository repository : repositories){
				if(EcoreUtil.isAncestor(repository, semanticNode)){	
					return getConverter().toQualifiedName(repository.name).append(ele.getName());
				}
				else {
					return QualifiedName.create(ele.getName());
				}
			}
		}
	}*/
}