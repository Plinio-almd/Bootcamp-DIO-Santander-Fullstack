import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;


@Getter@Setter
public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Cartao cartao;


    protected Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
        if (this.saldo > 0 && this.saldo - valor >= 0){
        this.setSaldo(getSaldo()-valor);
        }else {
            System.out.println("Saldo insuficiente para completar a operação");
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo()+valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo = " + this.saldo);
        System.out.println("Entradas = " + this.saldo);
        System.out.println("Saídas = " + this.saldo);
    }

    @Override
    public void pagarComCartao(double valor, int numParcelas) {
        if(this.cartao.numeroCartao != 0
                && numParcelas > 0 && numParcelas <=12
                && valor <= cartao.limiteCartao && valor > 0) {
            this.cartao.setLimiteCartao(cartao.getLimiteCartao() - valor);
            double valorParcela = valor/numParcelas;
            BigDecimal bd = new BigDecimal(valorParcela).setScale(2, RoundingMode.HALF_UP);
            double bdValorParcela = bd.doubleValue();
            sacar(bdValorParcela);
            System.out.println("Ainda restam "+ (numParcelas-1) + " parcelas a serem pagas");
        }else {
            System.out.println("Operação inválida");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", cartao=" + cartao +
                '}';
    }
}