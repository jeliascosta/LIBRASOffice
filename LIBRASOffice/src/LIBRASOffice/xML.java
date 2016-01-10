/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.awt.MouseEvent;
import com.sun.star.awt.XMouseListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xML implements XMouseListener {

    public void mousePressed(MouseEvent arg0) {
        System.out.println("xML Pressed "+arg0.getClass().getName());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent arg0) {
        System.out.println("xML Released"+arg0.Buttons);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent arg0) {
        System.out.println("xML Entered"+arg0.Buttons);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent arg0) {
        System.out.println("xML Exited"+arg0.Buttons);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
        System.out.println("xML disp "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
