package Day39.Practice.Andrea.Constructors;

public class Branch {

    int branchID;
    int zipCode;

    public Branch() {
    }

    public Branch(int branchID) {
        this.branchID = branchID;
    }

    public Branch(int branchID, int zipCode) {
        this(branchID);
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchID=" + branchID +
                ", zipCode=" + zipCode +
                '}';
    }
}


