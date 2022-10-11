package interfaceDemo;

import java.net.SocketTimeoutException;

public class RobotWorker implements IWorkable, IMaintanable {

    @Override
    public void work() {
        System.out.println("Our robots work non-stop/(7/24/)");

    }

    @Override
    public void maintain() {
        // TODO Auto-generated method stub

    }

}
