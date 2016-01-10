/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRASOffice;

import com.sun.star.frame.DispatchDescriptor;
import com.sun.star.frame.XDispatch;
import com.sun.star.frame.XDispatchProvider;
import com.sun.star.frame.XDispatchProviderInterceptor;
import com.sun.star.util.URL;

/**
 *
 * @author jonathanelias
 */
public class xDPI implements XDispatchProviderInterceptor {

    public XDispatchProvider getSlaveDispatchProvider() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSlaveDispatchProvider(XDispatchProvider arg0) {
                System.out.println(arg0.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XDispatchProvider getMasterDispatchProvider() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMasterDispatchProvider(XDispatchProvider arg0) {
        //System.out.println(arg0.);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XDispatch queryDispatch(URL arg0, String arg1, int arg2) {
                System.out.println(arg0.toString()+" "+arg1+" "+arg2);

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XDispatch[] queryDispatches(DispatchDescriptor[] arg0) {
                System.out.println(arg0.toString());

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
