/*
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
