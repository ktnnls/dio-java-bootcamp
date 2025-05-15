package candidatura;

import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] nomesCandidatos = {
            "Ana", "Bruno", "Carlos", "Daniela",
            "Eduardo", "Fernanda", "Gabriel", "Helena"
        };

        double[] salariosPretendidos = {
            1900.0, 2200.0, 2000.0, 2100.0,
            1990.0, 1800.0, 1950.0, 2300.0
        };

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        List<String> selecionados = new ArrayList<>();

        for (int i = 0; i < salariosPretendidos.length; i++) {
            String nome = nomesCandidatos[i];
            double salario = salariosPretendidos[i];

            if (salario <= salarioBase) {
                analisarCandidato(nome, salario);
                selecionados.add(nome);
                candidatosSelecionados++;
            }

            if (candidatosSelecionados == 5) {
                break;
            }
        }

        System.out.println("\n📞 Lista de candidatos selecionados para o RH entrar em contato:");
        for (String nome : selecionados) {
            System.out.println("- " + nome);
        }

        System.out.println("\n📱 Tentando contato com os candidatos selecionados:");
        for (String nome : selecionados) {
            entrarEmContato(nome);
        }
    }

    static void analisarCandidato(String nome, double salarioPretendido) {
        double salarioBase = 2000.0;

        System.out.println("Analisando candidato " + nome + " com salário pretendido de R$" + salarioPretendido);

        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA " + nome + "!");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA " + nome + " COM UMA CONTRA-PROPOSTA!");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

        System.out.println();
    }

    static void entrarEmContato(String nome) {
        boolean atendeu = false;
        int tentativasRealizadas = 0;
        int maxTentativas = 3;

        while (tentativasRealizadas < maxTentativas) {
            tentativasRealizadas++;
            // Simulando se o candidato atendeu: 1 em 3 chances de sucesso
            if (Math.random() < 0.5) {
                atendeu = true;
                break;
            }
        }

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + nome + " APÓS " + tentativasRealizadas + " TENTATIVA(S)");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + nome);
        }
    }
}
