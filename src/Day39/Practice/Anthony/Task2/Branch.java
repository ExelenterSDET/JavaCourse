package Day39.Practice.Anthony.Task2;

public class Branch {

    int branchId;
    String location;
    int zipCode;

//    public Branch(int branchId, String location, int zipCode) {
//        this.branchId = branchId;
//        this.location = location;
//        this.zipCode = zipCode;
//   }

    public Branch() {

    }

    public Branch(int branchId) {
        this.branchId = branchId;
    }

    public Branch(int branchId, String location, int zipCode) {
        this(branchId);
        this.location = location;
        this.zipCode = zipCode;
    }
//    public void print (){
//        for(Branch branch : this.branches);
//        System.out.println(branch);
//    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", location='" + location + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
