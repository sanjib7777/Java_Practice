import java.net.InetAddress;
import java.net.UnknownHostException;

public class local {
    public static void main(String []args) throws UnknownHostException {
        InetAddress po=InetAddress.getByName("www.sanjibshah.com.np");
        System.out.println("host="+po.getHostName());
        System.out.println(po.getAddress());
        System.out.println("ip address="+po.getHostAddress());

        InetAddress lo=InetAddress.getLocalHost();
        System.out.print("hostname="+lo.getHostName());
        System.out.print("Ip address="+lo.getHostAddress());
        System.out.println("is it a loopbackaddress="+lo.isLoopbackAddress());
        System.out.println("is it a loopbackaddress="+po.isLoopbackAddress());
        System.out.println("is it a loopbackaddress="+lo.isMulticastAddress());
        System.out.println("is it a loopbackaddress="+po.isMulticastAddress());


    }
}
