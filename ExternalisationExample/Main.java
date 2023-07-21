package ExternalisationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        ChildObject childObject = new ChildObject(1, "childName");
        ParentObject parentObject = new ParentObject(2,"IMParent",childObject);
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\New folder\\suraj.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(parentObject);
            outputStream.close();
            objectOutputStream.close();
            System.out.println("Externalisation completed!!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Externalisation failed!!");
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\New folder\\suraj.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ParentObject recoveredObject = (ParentObject) objectInputStream.readObject();
            System.out.println("Externalisation recovery completed!! -> " + recoveredObject);
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Externalisation recovery failed!!");
        }
    }
}
