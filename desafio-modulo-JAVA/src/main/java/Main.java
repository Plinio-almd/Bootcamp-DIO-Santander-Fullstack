public class Main {
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        cl.setNome("Aurelio Dicionario");
        cl.setDocumento(20221107);

        Conta cnt = new ContaCorrente(cl);

        cnt.depositar(400);
        System.out.println(cnt.toString());

        cnt.pagarComCartao(200,3);

        System.out.println(cnt.toString());

    }
}
