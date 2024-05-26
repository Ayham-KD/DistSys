import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            System.out.println("1.Admin\n2.user");
            Scanner in =new Scanner(System.in);
            String a= in.next();
            if(a== "1")
            {
                DeviceManager deviceManager = (DeviceManager) registry.lookup("DeviceManager");

                byte[] image = deviceManager.captureImage();
                // قم بمعالجة الصورة الملتقطة

                byte[] screenshot = deviceManager.takeScreenshot();
                // قم بمعالجة لقطة الشاشة الملتقطة

                deviceManager.sendMessage("Hello, device!");
                // قم بإرسال رسالة إلى الأجهزة
            }
            else{
                EmployeeMonitor deviceManager = (EmployeeMonitor) registry.lookup("DeviceManager");

                byte[] image = deviceManager.captureImage();
                // قم بمعالجة الصورة الملتقطة

                byte[] screenshot = deviceManager.takeScreenshot();
                // قم بمعالجة لقطة الشاشة الملتقطة

                deviceManager.sendMessage("Hello, device!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}