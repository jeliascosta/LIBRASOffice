/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.awt.MouseEvent;
import com.sun.star.awt.XMouseMotionListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xMM implements XMouseMotionListener{

    public void mouseDragged(MouseEvent arg0) {
        System.out.println("xMM "+arg0.ClickCount);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseMoved(MouseEvent arg0) {
        System.out.println("xMM "+arg0.ClickCount);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
        System.out.println("xMM disp "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
