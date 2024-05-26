
import java.rmi.RemoteException;
        import java.rmi.server.UnicastRemoteObject;
        import java.util.ArrayList;
        import java.util.List;

public class NormalEmployee extends UnicastRemoteObject implements EmployeeMonitor {
    private int ip;

    public NormalEmployee() throws RemoteException {
        super();
        ip = 0;
    }

    @Override
    public int handshake() throws RemoteException {
        return ip;
    }

    @Override
    public void receveorder(String service) throws RemoteException{
        switch (service){
            case "screen":
                this.takeScreenshot();
                break;
            case "Image":
                this.captureImage();
                break;
            default:
                    System.out.println("wrong Service");
        }
    }

    @Override
    public byte[] captureImage() throws RemoteException {
        System.out.println("Image");
        return new byte[0];
    }

    @Override
    public byte[] takeScreenshot() throws RemoteException {
        // قم بتنفيذ الكود الخاص بأخذ لقطة للشاشة وإرجاعها كمصفوفة بايتات
        return new byte[0];
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        // قم بتنفيذ الكود الخاص بإرسال الرسالة إلى الأجهزة
    }
}