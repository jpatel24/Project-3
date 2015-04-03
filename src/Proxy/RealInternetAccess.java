package Proxy;

/**
 * Created by Jeel on 4/2/15.
 */
public class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
        }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet access granted to " + employeeName);
    }
}
