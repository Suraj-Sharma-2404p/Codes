package ExternalisationExample;

import java.io.*;

public class ParentObject implements Externalizable {
    private int parentId;
    private String parentName;
    transient private ChildObject childObject;

    public ParentObject(Integer parentId,String parentName, ChildObject childObject) {
        this.parentId = parentId;
        this.parentName = parentName;
        this.childObject = childObject;
    }

    public ParentObject() {
    }

    public String getParentName() {
        return parentName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public ChildObject getChildObject() {
        return childObject;
    }

    public void setChildObject(ChildObject childObject) {
        this.childObject = childObject;
    }

    @Override
    public String toString() {
        return "ParentObject{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", childObject=" + childObject +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(parentId);
        out.writeBytes(parentName);
        out.writeObject(childObject);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        parentId = in.readInt();
        parentName = in.readLine();
        childObject = (ChildObject) in.readObject();
    }
}
