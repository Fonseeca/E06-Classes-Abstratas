import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Criando pessoas físicas
        PessoaFisica maria = new PessoaFisica("Maria", "Rua das Flores", "123.456.789-00", 25, 'f');
        PessoaFisica joao = new PessoaFisica("João", "Avenida Central", "987.654.321-11", 30, 'm');

        // Criando pessoas jurídicas
        PessoaJuridica empresaX = new PessoaJuridica("Empresa X", "Rua do Comércio", "44.333.222-11", 15, "Comércio");
        PessoaJuridica empresaY = new PessoaJuridica("Empresa Y", "Avenida Paulista", "55.444.333-22", 10, "Indústria");

        // Criando contas
        Conta conta1 = new Conta(1001, empresaX, 1000, 5000);
        Conta conta2 = new Conta(1002, maria, 500, 2000);

        // Realizando operações bancárias
        conta1.depositar(2000);
        conta1.sacar(500);
        conta1.transferir(conta2, 1000);

        conta2.depositar(300);
        conta2.sacar(200);

        // Imprimindo informações das contas e pessoas
        System.out.println(conta2);
        conta1.imprimirExtrato();

        System.out.println(maria);
        System.out.println(empresaX);

        // Calculando a média de operações por conta (opcional)
        @SuppressWarnings("unused")
        int mediaOperacoesPorConta = Operacao.getTotalOperacoes() / Conta.getTotalContas();

        // Comparando objetos
        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("maria == joao ? " + maria.equals(joao));
        System.out.println("empresaX == empresaY ? " + empresaX.equals(empresaY));
    }
}

