package example;

import com.sun.corba.se.spi.activation.Server;
import mypackage.ServerSOAP;
import mypackage.ServerSOAPService;

public class ClientSOAP {
    public static void main(String[] argv){
        mypackage.ServerSOAP service = new ServerSOAPService().getPort(ServerSOAP.class);
        service.addition(5,5);
        System.out.println(service.addition(5,5));
    }
}
