/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.awt.KeyEvent;
import com.sun.star.awt.XKeyListener;
import com.sun.star.lang.EventObject;

/**
 *
 * @author jonathanelias
 */
public class xKL implements XKeyListener{

    public void keyPressed(KeyEvent arg0) {
        System.out.println("xKL "+arg0.KeyChar);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyReleased(KeyEvent arg0) {
        System.out.println("xKL "+arg0.KeyChar);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void disposing(EventObject arg0) {
        System.out.println("xKL "+arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
