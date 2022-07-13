import lombok.Getter;
import lombok.Setter;

import java.util.Random;
@Getter@Setter
public class Cartao {

    protected Cliente cliente;
    protected int numeroCartao;

    protected double limiteCartao;

    public Cartao(Cliente cliente) {
        this.cliente = cliente;
        this.numeroCartao = setNumeroCartao();
        this.limiteCartao = 2000;
    }

    public int setNumeroCartao() {
        Random gerarNumero = new Random();
        return gerarNumero.nextInt(1000000);
    }


    @Override
    public String toString() {
        return " "+numeroCartao;
    }
}
