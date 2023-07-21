package Serialisation;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        TransientObject transientObject = new TransientObject(2, "bandya");
        SerialisationExample serialisationExample = new SerialisationExample();
        serialisationExample.setId(1);
        serialisationExample.setName("Suraj");
        serialisationExample.setTransientObject(transientObject);

        try{
            FileOutputStream outputStream = new FileOutputStream("D:\\New folder\\suraj.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(serialisationExample);
            objectOutputStream.close();
            System.out.println("serialisation completed!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("serialisation failed!!");
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("D:\\New folder\\suraj.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerialisationExample recoveredObject = (SerialisationExample) objectInputStream.readObject();
            System.out.println("rcovered object is : ->" + recoveredObject);
            objectInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("deserialisation completed!!");
        }


    }
}
