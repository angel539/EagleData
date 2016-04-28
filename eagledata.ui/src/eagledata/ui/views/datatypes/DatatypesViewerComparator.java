package eagledata.ui.views.datatypes;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import eagledata.ui.views.fragments.model.FragmentParent;
import eagledata.ui.views.fragments.model.FragmentParent;

public class DatatypesViewerComparator extends ViewerComparator{
	@Override
	public int compare(Viewer viewer, Object element1, Object element2) {
		int weight1 = 0;
		int weight2 = 0;
		
		/*if(element1 instanceof EntityParent){
			ISemanticElement semanticElement1 = ((EntityParent) element1).getSemanticElement();
			if(semanticElement1 instanceof ISemanticClass)
				weight1 = ((ISemanticClass) semanticElement1).getWeight();	
		}
		
		if(element1 instanceof EntityParentGroup){
			weight1 = ((EntityParentGroup) element1).getMax_weight();	
		}
		
		if(element2 instanceof EntityParentGroup){
			weight2 = ((EntityParentGroup) element2).getMax_weight();	
		}
		
		if(element2 instanceof EntityParent){
			ISemanticElement semanticElement2 = ((EntityParent) element2).getSemanticElement();
			if(semanticElement2 instanceof ISemanticClass)
				weight2 = ((ISemanticClass) semanticElement2).getWeight();	
		}
		
		if(weight1 < weight2) return 1;
		if(weight1 == weight2) return 0;
		if(weight1 > weight2) return -1;
		*/
		return 0;
	}
}
