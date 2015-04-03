package Proxy;

/**
 * Created by Jeel on 4/2/15.
 */
public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;

    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 3) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet Access for employees below level 3");
        }
    }

    private int getRole(String employeeName) {
        if (employeeName.toLowerCase().equals("jeel") || employeeName.toLowerCase().equals("ethan"))
            return 4;
        else return 0;
    }
}

