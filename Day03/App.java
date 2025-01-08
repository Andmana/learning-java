package Day03;

public class App {
    public static void main(String[] args) {
        Persegi square = new Persegi(10);
        System.out.println("Luas Persegi \t\t= " + square.luas());
        System.out.println("Keliling Persegi \t= " + square.keliling());

        System.out.println();

        PersegiPanjang rectangle = new PersegiPanjang(10, 40);
        System.out.println("Luas PersegiPanjang \t= " + rectangle.luas());
        System.out.println("Keliling PersegiPanjang = " + rectangle.keliling());

        System.out.println();

        SegitigaSiku triangle = new SegitigaSiku(3, 4);
        System.out.println("Luas SegitigaSiku \t= " + triangle.luas());
        System.out.println("Keliling SegitigaSiku \t= " + triangle.keliling());
        
        System.out.println();

        Lingkaran circle = new Lingkaran(7);
        System.out.println("Luas Lingkaran \t\t= " + circle.luas());
        System.out.println("Keliling Lingkaran \t= " + circle.keliling());

        System.out.println();

        BelahKetupat rhombus = new BelahKetupat(8, 6, 10);
        System.out.println("Luas BelahKetupat \t= " + rhombus.luas());
        System.out.println("Keliling BelahKetupat \t= " + rhombus.keliling());
    }
}
 