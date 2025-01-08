package Day03;

public class Persegi extends BangunDatar{

    public Persegi() {
        super();
    }

    public Persegi(int sisi) {
        this.horizontal = sisi;
        this.vertikal = sisi;
    }
    public float keliling(){
        return 4 * vertikal;
    }

    public float luas(){
        return vertikal * vertikal;
    }
    
}
