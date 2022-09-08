package Day22.Java;

public class OCA5 {
    public static void main(String[] args) {

        int nums1[] = {1,2,3};
        int nums2[] = {1,2,3,4,5};
        nums2 = nums1;
        for(int x : nums2){
            System.out.print(x + ":");
        }
        System.out.println();

        nums2[1] = 100;
        nums2[0] = 50;


        for(int x : nums1){
            System.out.print(x + ":");
        }
        System.out.println();
        nums1[0] = 5000;
        for(int x : nums2){
            System.out.print(x + ":");
        }

    }
}
