import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DeviceManager extends Remote {
    List<Integer> getOnlineEmployees() throws RemoteException;
    void handshake(int ip) throws RemoteException;
    void executeService(String employeeId, String service) throws RemoteException;
    byte[] captureImage() throws RemoteException;
    byte[] takeScreenshot() throws RemoteException;
    void sendMessage(String message) throws RemoteException;
}