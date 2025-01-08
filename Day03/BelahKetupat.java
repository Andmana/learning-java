package Day03;

public class BelahKetupat extends BangunDatar {
    public int diagonal2;

    public BelahKetupat() {
        super();
    }

    public BelahKetupat(int diagonal, int diagonal2, int sisi) {
        this.diagonal = diagonal;
        this.diagonal2 = diagonal2;
        this.vertikal = sisi;
        this.horizontal = sisi;
    }

    public float keliling(){
        return 4 * horizontal;
    }

    public float luas(){
        return diagonal * diagonal2 / 2;
    }
    
}
