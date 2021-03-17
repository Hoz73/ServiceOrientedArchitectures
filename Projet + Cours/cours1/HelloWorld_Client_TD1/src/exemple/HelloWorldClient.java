package exemple;

import mypackage.HelloWorld;
import mypackage.HelloWorldService;

public class HelloWorldClient {
    public static void main(String[] argv){
        mypackage.HelloWorld service = new HelloWorldService().getPort(HelloWorld.class);
        service.sayHelloWorldFrom("from Client");
        service.addition(5,5);
        System.out.println(service.addition(5,5));
    }
}
