package Day03;

public class Lingkaran extends BangunDatar {
   
    public int jariJari;
    
    public Lingkaran() {
        super();
    }

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public float keliling(){
        if(jariJari % 7 == 0) return 2 *  jariJari  * 22 / 7;
        return 2 * 3.14f * jariJari;
    }

    public float luas(){
        if(jariJari % 7 == 0) return  jariJari * jariJari * 22 / 7;
        return  3.14f * jariJari + jariJari;
    }
}
