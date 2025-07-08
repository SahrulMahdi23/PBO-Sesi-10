public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0); // Ini akan memicu ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Pesan error:");
            System.out.println(e.getMessage()); // Menampilkan pesan error, biasanya "/ by zero"
            System.out.println("Info stack trace:");
            e.printStackTrace(); // Menampilkan stack trace ke console standar (System.err)
            e.printStackTrace(System.out); // Menampilkan stack trace ke console standar output (System.out)
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
