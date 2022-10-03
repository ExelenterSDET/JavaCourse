package Day39.Practice.Sebahattin.Practice.BankAndBranch;

public class Branch {
    int branchId;
    int zipcode;


    // Constructors

    public Branch(){
    }
    public Branch(int branchId){
        this.branchId = branchId;
    }

    public Branch(int branchId, int zipcode) {
        this(branchId);
        this.zipcode = zipcode;    //   same
    }

    public String toString() {
        return "Branch{" +
                "branchId='" + branchId +
                ", zipcode='" + zipcode +
                '}';
    }
}
