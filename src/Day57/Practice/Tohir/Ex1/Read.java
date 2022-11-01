package Day57.Tohir.Ex1;

public interface Read {
    void read1();
}
interface Write extends Read{
    void write1();
}

class A implements Write{

    @Override
    public void read1() {

    }

    @Override
    public void write1() {

    }
}

class B1 extends A{
    
}

class B extends C{

    @Override
    public void read1() {

    }

    @Override
    public void write1() {

    }

    @Override
    void doSMt() {

    }
}

abstract class C implements Write{
    abstract void doSMt();
}