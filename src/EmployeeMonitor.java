import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface EmployeeMonitor extends Remote {
    int handshake() throws RemoteException;
    void receveorder(String service) throws RemoteException;
    byte[] captureImage() throws RemoteException;
    byte[] takeScreenshot() throws RemoteException;
    void sendMessage(String message) throws RemoteException;
}