import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String []args) throws Exception{
        FileInputStream fis=new FileInputStream("student.txt");
        ObjectInputStream f=new ObjectInputStream(fis);
        student st=(student)f.readObject();
        System.out.println("name="+st.name+"roll="+st.roll);
        f.close();
        fis.close();
    }
}
