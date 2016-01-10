/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.document.XEventListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xEL implements XEventListener{
                
    public void notifyEvent(com.sun.star.document.EventObject arg0) {
        System.out.println("xEL "+arg0.EventName);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
        System.out.println("xEL disp "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
