import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String  [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);   
        }
        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso com o candidato " + candidato + " na " + tentativasRealizadas + " tentativa");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com o candidato " + candidato + " em " + tentativasRealizadas + " tentativas");
        else
            System.out.println("Não conseguimos contato com o candidato " + candidato + ", número máximo de tentativas " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;  
    }

    static void imprimirSelecionados(){
        String  [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato " + candidatos[i] + " foi selecionado");
        }
    }

    static void selecaoCandidato() {
        String [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela" , "Daniela", "Jorge" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido)
            {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");    
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase)
            System.out.println("Ligar para o candidato");
        else if(salarioPretendido == salarioBase)
            System.out.println("Ligar para o candidato com contra proposta");
        else
            System.out.println("Aguardando o resultado dos demais candidatos");
        
    }
}