package Day39.Practice.TohirDay39;

public class BranchofBank {
    int Branchid;
    int zipcode;
  /*  public BranchofBank()
    {
        this(Branchid);
        this.zipcode = 1234;
    }*/
    public BranchofBank()
    {
        this.Branchid = 123456;
        this.zipcode = 1234;
    }


    public BranchofBank(int branchid) {
        Branchid = branchid;

    }
 /*   public BranchofBank(int zipcode) {
        this.zipcode = zipcode;
    }*/

    public BranchofBank(int branchid, int zipcode) {
        Branchid = branchid;
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return "BranchofBank{" +
                "Branchid=" + Branchid +
                ", zipcode=" + zipcode +
                '}';
    }
}
