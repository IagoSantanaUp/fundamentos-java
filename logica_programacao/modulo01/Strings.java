package logica_programacao.modulo01;

public class Strings {
    public static void main(String[] args) {
        //Strings - é uma classe da API padrão do Java que representa uma sequência de caracteres.
        String name = "Ana";

        //String é um tipo de referência.
        //Isso significa que uma variável String armazena uma referência para um objeto textual.

        //String com NEW
        String nome = new String("Ana");

        //String vazia
        String text = ""; //é um objeto textual sem caracteres
        //Tamanho 0;

        //A característica mais importante de String é a imutabilidade.
        String status = "CREATED";
        status.toLowerCase();
        System.out.println(status); //Continua UpperCase;

        //Usando o equals para comparar Strings;
        String first = new String("PAID");
        String second = new String("PAID");

        System.out.println(first.equals(second));

        //Para comparar ignorando maiúsculas:
        String input = "paid";

        if ("PAID".equalsIgnoreCase(input)) {
            System.out.println("Pagamento aprovado");
        }

        //Alguns métodos fundamentais

        int size = first.length(); //Retorna o a quantidade de caracter.
        System.out.println(size);


        text = "";
        if (text.isEmpty()) { //Verifica se o tamanho é zero;
            System.out.println("Texto vazio");
        }

        input = "  Ana  ";
        String result = input.trim(); //Remove os espaços
        System.out.println(result);

        String email = "ana@example.com";
        if (email.contains("@")) { //Verifica se uma sequência aparece dentro da string
            System.out.println("Possui arroba");
        }

        email = "ana@example.com";
        int position = email.indexOf("@"); //Retorna a posição de uma ocorrência
        System.out.println(position);

        String code = "ORDER-900";
        String prefix = code.substring(0, 5); //Extrai uma parte da string
        String number = code.substring(6);

        code = "ABC";
        char firstt = code.charAt(0); //Obtem o caracter de determinada posição
        System.out.println(first);


    }

}
