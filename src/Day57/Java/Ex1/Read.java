package Day57.Java.Ex1;

public interface Read {
    void read1();
}

interface Write extends Read{
    void write1();
}

// public > protected > default > private (you can not narrow the access modifiers in the methods.)

class A implements Write{

    @Override
    public void read1() {

    }

    @Override
    public void write1() {

    }
}

class B extends C {

    @Override
    public void read1() {

    }

    @Override
    public void write1() {

    }

    @Override
    void doSmtg() {

    }
}

abstract class C implements Write{
    abstract void doSmtg();
}
