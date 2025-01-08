package Day03;

public class PersegiPanjang extends BangunDatar {
    
    public PersegiPanjang() {
        super();
    }

    public PersegiPanjang(int horizontal, int vertikal) {
        this.horizontal = horizontal;
        this.vertikal = vertikal;
    }

    public float keliling(){
        return 2 * (horizontal + vertikal);
    }

    public float luas(){
        return horizontal * vertikal;
    }    
}
