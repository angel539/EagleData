package eagledata.ui.views.fragments;

import eagledata.ui.views.fragments.model.FragmentParent;

public class FragmentsViewDrawingProvider {
	public static void drawEntityParentContent(FragmentParent entityParent) {
		drawSuperClasses(entityParent);
		drawSubclasses(entityParent);
		drawReferences(entityParent);
		drawProperties(entityParent);
	}
	
	public static void drawSuperClasses(FragmentParent parent){
		//int superClassesCount = 0;
		
		/*if(parent.getSemanticElement() instanceof ISemanticClass){
			superClassesCount = superClassesCount + ((ISemanticClass) parent.getSemanticElement()).getSuperclasses().size();
		}
		if(superClassesCount > 0){
			FolderParent supersChild = new FolderParent("supers");
			
			if(parent.getSemanticElement() instanceof ISemanticClass){
				for(ISemanticClass superClass : ((ISemanticClass) parent.getSemanticElement()).getSuperclasses()){
					EntityParent entitySuperClass = new EntityParent(superClass);
					supersChild.addChild(entitySuperClass);
				}
			}
			
			parent.addChild(supersChild);
		}*/
	}
	
	public static void drawSubclasses(FragmentParent parent){
		int subClassesCount = 0;

		/*if(parent.getSemanticElement() instanceof ISemanticClass){
			subClassesCount = subClassesCount + ((ISemanticClass) parent.getSemanticElement()).getSubclasses().size();
		}
		if(subClassesCount > 0){
			FolderParent subsChild = new FolderParent("subs");
			
			if(parent.getSemanticElement() instanceof ISemanticClass){
				for(ISemanticClass subClass : ((ISemanticClass) parent.getSemanticElement()).getSubclasses()){
					EntityParent entitySubClass = new EntityParent(subClass);
					subsChild.addChild(entitySubClass);
				}
			}
			
			parent.addChild(subsChild);
		}*/
		
	}
	
	public static void drawReferences(FragmentParent parent){
		int referencesCount = 0;
		
		/*
		if(parent.getSemanticElement() instanceof ISemanticClass){
			referencesCount = referencesCount + ((ISemanticClass) parent.getSemanticElement()).getReferences().size();
		}
		if(referencesCount > 0 ){
			FolderParent referencesChild = new FolderParent("references");
			
			if(parent.getSemanticElement() instanceof ISemanticClass){
		
				for(IObjectProperty reference : ((ISemanticClass) parent.getSemanticElement()).getReferences()){
					PropertyParent entitySuper = new PropertyParent(reference);
					referencesChild.addChild(entitySuper);
					
				}
			}
			
			parent.addChild(referencesChild);
		}
		*/
	}
	
	private static void drawProperties(FragmentParent parent){
		int propertiesCount = 0;
		
		/*
		if(parent.getSemanticElement() instanceof ISemanticClass){
			propertiesCount = propertiesCount + ((ISemanticClass) parent.getSemanticElement()).getProperties().size();
		}
		if(propertiesCount > 0){
			AttrFolderParent referencesChild = new AttrFolderParent("attributes");
			
			if(parent.getSemanticElement() instanceof ISemanticClass){
				for(IDataProperty attribute : ((ISemanticClass) parent.getSemanticElement()).getProperties()){
					DataPropertyObject entitySuper = new DataPropertyObject(attribute);
					referencesChild.addChild(entitySuper);
				}
			}
			
			parent.addChild(referencesChild);
		}
		*/
	}
}
