package ModeloCarro;

import Carro.Carro;

public class ModeloCarro extends Carro {
    private int anoModelo1;
    private int getAnoModelo2;
    private int getAnoModelo3;

    //Setters

    public void setAnoModelo1(int anoModelo1) {
        this.anoModelo1 = anoModelo1;
    }

    public void setGetAnoModelo2(int getAnoModelo2) {
        this.getAnoModelo2 = getAnoModelo2;
    }

    public void setGetAnoModelo3(int getAnoModelo3) {
        this.getAnoModelo3 = getAnoModelo3;
    }

    //Getters
    public int getAnoModelo1() {
        return anoModelo1;
    }

    public int getGetAnoModelo3() {
        return getAnoModelo3;
    }

    public int getGetAnoModelo2() {
        return getAnoModelo2;
    }
}
