package samples.websocket.tomcat.divider;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

public class Divider {

    public int divide(int n1, int n2){
        return n1 / n2;
    }

}
