import java.io.*;
public class student implements Serializable {
    String name,address;
    int roll;
    public student(int roll,String name,String address){
        this.roll=roll;
        this.name=name;
        this.address=address;

    }

}
