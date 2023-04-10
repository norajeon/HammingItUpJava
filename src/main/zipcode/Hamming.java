package zipcode;

public class Hamming {
    private String s1;
    private String s2;
    public Hamming(String s1, String s2) throws IllegalArgumentException{
        this.s1 = s1;
        this.s2 = s2;
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int count = 0;


            for (int i = 0; i < s1.length(); i++) {
                if (a[i] != b[i]) {
                    count++;
                }
            }
            return count;

    }
}
