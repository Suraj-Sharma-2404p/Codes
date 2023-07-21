package Serialisation;

import java.beans.Transient;
import java.io.Serializable;

public class SerialisationExample implements Serializable {

    private static final long serialVersionUID = -1659838597963187035L;
    private int id;
    private  String name;

    private  TransientObject transientObject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public TransientObject getTransientObject() {
        return transientObject;
    }

    public void setTransientObject(TransientObject transientObject) {
        this.transientObject = transientObject;
    }

    public SerialisationExample(int id, String name, TransientObject transientObject) {
        this.id = id;
        this.name = name;
        this.transientObject = transientObject;
    }

    public SerialisationExample() {
    }

    @Override
    public String toString() {
        return "SerialisationExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transientObject=" + transientObject +
                '}';
    }
}
