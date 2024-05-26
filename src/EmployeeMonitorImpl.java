import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMonitorImpl extends UnicastRemoteObject implements EmployeeMonitor {
    private List<String> onlineEmployees;

    public EmployeeMonitorImpl() throws RemoteException {
        super();
        onlineEmployees = new ArrayList<>();
    }



    @Override
    public int handshake() throws RemoteException {
        return 0;
    }

    @Override
    public void receveorder(String service) throws RemoteException {

    }

    @Override
    public byte[] captureImage() throws RemoteException {
        return new byte[0];
    }

    @Override
    public byte[] takeScreenshot() throws RemoteException {
        return new byte[0];
    }

    @Override
    public void sendMessage(String message) throws RemoteException {

    }

//    @Override
//    public void executeService(String employeeId, String service) throws RemoteException {
//        // قم بالتوصل إلى جهاز الموظف باستخدام معرف الموظف وتنفيذ الخدمة المحددة
//    }
}