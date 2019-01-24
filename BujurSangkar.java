public class BujurSangkar {
    public static void main(String[] args) {
        BujurSangkar y = new BujurSangkar();
        y.Keliling();
    }

    public int sisi = 6;
    public double kelilingbs;


    public void Keliling() {
        kelilingbs = 4 * sisi;
        System.out.println("keliling bujur sangkar adalah " + kelilingbs);
    }
}
