package src.access;

public class ObjectDemo {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ObjectDemo() {
        super();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo onj=new ObjectDemo();
        System.out.println(onj.hashCode());
    }
}

//override methods- hashcode, clone, equals, toString

//hashcode is random integer value and not address
