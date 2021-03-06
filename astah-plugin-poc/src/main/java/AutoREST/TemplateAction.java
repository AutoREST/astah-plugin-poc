package AutoREST;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

import com.change_vision.jude.api.inf.AstahAPI;
import com.change_vision.jude.api.inf.editor.ClassDiagramEditor;
import com.change_vision.jude.api.inf.exception.ProjectNotFoundException;
import com.change_vision.jude.api.inf.model.IClassDiagram;
import com.change_vision.jude.api.inf.model.IDiagram;
import com.change_vision.jude.api.inf.model.INamedElement;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.ui.IPluginActionDelegate;
import com.change_vision.jude.api.inf.ui.IWindow;

public class TemplateAction implements IPluginActionDelegate {

	public Object run(IWindow window) throws UnExpectedException {
	    try {
	        AstahAPI api = AstahAPI.getAstahAPI();
	        ProjectAccessor projectAccessor = api.getProjectAccessor();
	        List<INamedElement> elems = new ArrayList<INamedElement>();
	        for(INamedElement el : projectAccessor.getProject().getOwnedElements()){
	        	if(el instanceof IClassDiagram){
	        		
	        	}
	        }
	        /*
	        IDiagram[] diagrams = projectAccessor.getProject().getDiagrams();
	        String s = "";
	        String classDiagramClass = "vY";//don't know why, but this is it o.O
	        
	        for (IDiagram iD : diagrams) {
	        	//s+="\t"+iD.getClass().toString()+"\n";
	        	if(iD.getClass().getName().equals(classDiagramClass)){
	        		s += iD.toString()+"\n";		        		
	        	}
	        	//s+="\n";
			}
	        //*/
	        JOptionPane.showMessageDialog(window.getParent(),"Hello friend, diagrams count: " + diagrams.length+"\nClass Diagrams:\n"+s);
	    } catch (ProjectNotFoundException e) {
	        String message = "Project is not opened.Please open the project or create new project.";
			JOptionPane.showMessageDialog(window.getParent(), message, "Warning", JOptionPane.WARNING_MESSAGE); 
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(window.getParent(), "Unexpected error has occurred.", "Alert", JOptionPane.ERROR_MESSAGE); 
	        throw new UnExpectedException();
	    }
	    return null;
	}


}
