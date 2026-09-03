package logica_programacao.modulo01;

import java.util.ArrayList;
import java.util.List;

public class TiposDeDados {
    public static void main(String[] args) {
     // Tipo de dados - Um tipo de dado é uma classificação que define:
        //O conjunto de valores possíveis;
        //As operações válidas;
        //A representação do valor;
        //As regras de conversão;
        //O comportamento do dado no programa.

        //Tipo PRIMITIVO
        byte retryCount = 3;
        short port = 8080;
        int productQuantity = 20;
        long userId = 10_000_000_000L;
        float temperature = 36.5f;
        double temperatura = 36.5;
        char initial = 'A';
        boolean accountActive = true;

        //Tipos de referência
        String customerName = "Ana";
        int[] quantities = {2, 5, 10};
        List<String> roles = new ArrayList<>();
        roles.add("CUSTOMER");
        roles.add("ADMIN");
        // public enum OrderStatus {
        //    CREATED,
        //    PAID,
        //    SHIPPED,
        //    DELIVERED,
        //    CANCELLED
       // }
        Object value = "Java";
        Object anotherValue = 10;


    }
}
