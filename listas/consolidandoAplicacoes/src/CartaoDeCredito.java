import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
