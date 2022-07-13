
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.cartao = new Cartao(cliente);
    }

}
