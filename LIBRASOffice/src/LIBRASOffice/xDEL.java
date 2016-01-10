/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.document.DocumentEvent;
import com.sun.star.document.XDocumentEventListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xDEL implements XDocumentEventListener{

    public void documentEventOccured(DocumentEvent arg0) {
        System.out.println("xDEL "+arg0.EventName);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
        System.out.println("xDEL disp "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
