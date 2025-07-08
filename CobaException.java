public class CobaException {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100; // Index ke-5 tidak ada (karena indeks array dari 0-4)
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
