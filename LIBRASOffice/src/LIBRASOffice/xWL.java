/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.awt.WindowEvent;
import com.sun.star.awt.XWindowListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xWL implements XWindowListener {

    public void windowResized(WindowEvent arg0) {
                System.out.println("xWL "+arg0.Height);
   
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void windowMoved(WindowEvent arg0) {
                        System.out.println("xWL "+arg0.Height);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void windowShown(EventObject arg0) {
                        System.out.println("xWL "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void windowHidden(EventObject arg0) {
                        System.out.println("xWL "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
                        System.out.println("xWL disp");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
