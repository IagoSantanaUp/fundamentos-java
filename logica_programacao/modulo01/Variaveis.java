package logica_programacao.modulo01;

public class Variaveis {
    public static void main(String[] args) {
        //VARIAVEIS - Uma variável é um nome associado a uma área lógica de
        // armazenamento capaz de representar um valor durante a execução do programa.

        //tipo nome           valor
        String customerName = "Iago";

        //Declaração - Declarar uma variável significa informar seu tipo e seu nome.
        int quantity;

        //Inicialização - Inicializar significa atribuir o primeiro valor à variável.
        quantity = 3;

        //Atribuição - Atribuição significa colocar ou substituir um valor na variável.
        quantity = 5;

        //Sintaxe geral:
        int quantityy = 10;
        long userId = 100L;
        double percentage = 0.15;
        boolean active = true;
        char category = 'A';
        String email = "user@example.com";

        //Variaveis de referencia - Uma variável de referência não armazena
        // diretamente o objeto completo. Ela armazena uma referência para um objeto.

        String name = "Iuri";


        //Constantes e final - Uma variável marcada com final só pode receber atribuição uma vez.
        final int maximumAttempts = 5;

        //A convenção para constantes públicas ou de classe é:
        final int MAX_LOGIN_ATTEMPTS = 3;

        //Variáveis frequentemente precisam ser convertidas.

        //Conversão implícita - Quando não há risco de perda relevante, Java pode promover automaticamente:
        int age = 10;
        long largeQuantity = quantity;

        //Conversão explícita - Quando pode haver perda de dados, é necessário realizar cast:
        double price = 19.99;
        int integerPrice = (int) price;


    }
}
