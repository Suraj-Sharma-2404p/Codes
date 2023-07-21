package ExternalisationExample;

import java.io.*;

public class ChildObject implements Externalizable {
    private int number;
    transient private String childName;

    public ChildObject() {
    }

    public ChildObject(int number, String childName) {
        this.number = number;
        this.childName = childName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "ChildObject{" +
                "number=" + number +
                ", childName='" + childName + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(number);
        out.writeBytes(childName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        number = in.readInt();
        childName = in.readLine();
    }
}
