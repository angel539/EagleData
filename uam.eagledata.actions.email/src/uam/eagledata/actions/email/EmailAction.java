package uam.eagledata.actions.email;
import java.util.Properties;

import javax.mail.Session;

import org.eclipse.emf.common.util.EList;

import ecarules.Concept;
import ecarules.impl.ExtensibleActionImpl;

public class EmailAction extends ExtensibleActionImpl {
	@Override
	public boolean execute(EList<Concept> inputs) {
		System.out.println("SimpleEmail Start");
		
	    String smtpHostServer = "smtp.gmail.com";
	    String emailID = "angelmoraseg@journaldev.com";
	    
	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", smtpHostServer);
	    Session session = Session.getInstance(props, null);
	    EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
		
	    return true;
	}
}
