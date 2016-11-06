package eagledata.core.dsl.datadesc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import eagledata.core.dsl.datadesc.dataDsl.Package

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */

class DataDslGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/*for (e : resource.allContents.toIterable.filter(Package)) {
			fsa.generateFile(
                e.name + ".log", "")
			}
		}*/
			
            //fsa.generateFile(
            //    e.fullyQualifiedName.toString("/") + ".java",
            //    e.compile)
		//for (e : resource.allContents.toIterable.filter(Package)) {
			//for(f : e.elements.filter(DataFragment)){
			//	val JSONObject fragmentJsonObject = JsonFragment.fragment2json(f);
			
				/*if(JsonFragment.post(fragmentJsonObject)){
					println("se ha subido");
				}else{
					println("no se ha subido");
				}*/
			//}
			
            //fsa.generateFile(e.fullyQualifiedName.toString("/") + ".java", e.compile)
        //}
        
        
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	/*def compile(Package e) ''' 
        «IF e.eContainer.fullyQualifiedName != null»
            package «e.eContainer.fullyQualifiedName»;
        «ENDIF»
    '''*/

    }
}
