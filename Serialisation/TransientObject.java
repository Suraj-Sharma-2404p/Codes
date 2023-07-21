package Serialisation;

import java.io.Serializable;

public  class  TransientObject implements Serializable {
    private static final long serialVersionUID = -165935L;
    private int idTransient;
    private String transientName;

    public TransientObject() {
    }

    public TransientObject(int idTransient, String transientName) {
        this.idTransient = idTransient;
        this.transientName = transientName;
    }

    public int getIdTransient() {
        return idTransient;
    }

    public void setIdTransient(int idTransient) {
        this.idTransient = idTransient;
    }

    public String getTransientName() {
        return transientName;
    }

    public void setTransientName(String transientName) {
        this.transientName = transientName;
    }

    @Override
    public String toString() {
        return "TransientObject{" +
                "idTransient=" + idTransient +
                ", transientName='" + transientName + '\'' +
                '}';
    }
}
