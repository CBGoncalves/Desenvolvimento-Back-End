package revisao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // String de exemplo
        String texto = "Olá-Mundo";

        // Padrão regex com traço como separador
        String padraoRegex = "^(\\S+)-";
        Pattern padrao = Pattern.compile(padraoRegex);

        // Criar um objeto Matcher
        Matcher matcher = padrao.matcher(texto);

        // Verificar se há correspondência
        if (matcher.find()) {
            // Obter o resultado do grupo de captura
            String resultado = matcher.group(1);
            System.out.println("Palavra antes do traço: " + resultado);
        } else {
            System.out.println("Nenhuma correspondência encontrada.");
        }
    }
}
