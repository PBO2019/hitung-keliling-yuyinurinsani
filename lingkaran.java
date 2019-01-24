public class lingkaran {
    public static void main(String[] args) {
        lingkaran y = new lingkaran();
        y.Keliling();
    }


    public int d = 6;
    public double phi = 22/7;
    public double kelilingL;


    public void Keliling() {
        kelilingL = phi*d;
        System.out.println("keliling lingkaran adalah " + kelilingL);
    }
}
