public class Main {
    public static void main(String[] args) {
        int zeroInt = 0;
        int anInt = 10;
        
        try{
            int divResult = anInt/zeroInt;
            System.out.println("Hasilnya adalah" + divResult);
        } catch (ArithmeticException e) {
            // menangkap kesalahan div-by-zero
            System.out.println("Terjadi pembagian dengan nol");
            System.out.println("Diatas blok penanganan sendiri");
        } finally {
            System.out.println("Kalimat di finally");
        }
        System.out.println("Kalimat di luar blok try-catch-finally");
    }
}
