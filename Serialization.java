import java.io.*;
public class Serialization {
    public static void main(String []args) throws Exception{
        student s=new student(33,"sanjib","ktm");
        FileOutputStream fos=new FileOutputStream("student.txt");
        ObjectOutputStream f=new ObjectOutputStream(fos);
        f.writeObject(s);
        System.out.println("Complete");
        f.close();
        fos.close();

    }
}
