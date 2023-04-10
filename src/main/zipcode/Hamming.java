package zipcode;

public class Hamming {
    String s1;
    String s2;
    public Hamming(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getHammingDistance() {

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int count = 0;
//
//        try {
            if (a.length != b.length) {
                throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
            }

            for (int i = 0; i < s1.length(); i++) {
                if (a[i] != b[i]) {
                    count++;
                }
            }
            return count;
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("leftStrand and rightStrand must be of equal length.");
//
//        }
//        return -1;
    }
}
