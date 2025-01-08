package Day03;

public class SegitigaSiku extends BangunDatar{

    public SegitigaSiku() {
        super();
    }

    public SegitigaSiku(int vertikal, int horizontal) {
        this.vertikal = vertikal;
        this.horizontal = horizontal;
        this.diagonal = (int) Math.sqrt(vertikal*vertikal + horizontal*horizontal);
    }

    public float keliling(){
        return vertikal + horizontal + diagonal;
    }

    public float luas(){
        return horizontal * vertikal / 2;
    }
}
