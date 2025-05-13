import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            // Usando parse com tratamento de exceção
            Number valor = NumberFormat.getInstance().parse("1.75"); // Corrigido: sem 'a'
            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Erro ao converter o número: " + e.getMessage());
        }

        try {
            // Usando Double.valueOf corretamente
            Double valor2 = Double.valueOf("1.75"); // Corrigido: sem 'a'
            System.out.println(valor2);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para Double: " + e.getMessage());
        }
    }
}
