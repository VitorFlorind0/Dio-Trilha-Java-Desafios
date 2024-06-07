import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DioDominio.Bootcamp;
import DioDominio.Curso;
import DioDominio.Dev;
import DioDominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(11);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Python");
        curso3.setDescricao("Descrição curso Python");
        curso3.setCargaHoraria(20);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso C#");
        curso4.setDescricao("Descrição curso C#");
        curso4.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(mentoria);

        Scanner scanner = new Scanner(System.in);

        Dev dev = new Dev();
        System.out.println("Digite seu nome:");
        dev.setNome(scanner.nextLine());
        dev.inscreverBootcamp(bootcamp);

        List<Curso> cursosDisponiveis = new ArrayList<>();
        for (Object conteudo : bootcamp.getConteudos()) {
            if (conteudo instanceof Curso) {
                cursosDisponiveis.add((Curso) conteudo);
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha um curso para se inscrever:");
            for (int i = 0; i < cursosDisponiveis.size(); i++) {
                Curso curso = cursosDisponiveis.get(i);
                System.out.println((i + 1) + ": " + curso.getTitulo() + " - " + curso.getCargaHoraria() + " horas");
            }
            System.out.println((cursosDisponiveis.size() + 1) + ": Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (escolha > 0 && escolha <= cursosDisponiveis.size()) {
                Curso cursoEscolhido = cursosDisponiveis.get(escolha - 1);
                System.out.println("Você escolheu: " + cursoEscolhido.getTitulo());
                dev.progredir();
            } else if (escolha == cursosDisponiveis.size() + 1) {
                continuar = false;
            } else {
                System.out.println("Escolha inválida, tente novamente.");
            }

            System.out.println("Conteúdos Concluídos: " + dev.getconteudosConcluidos());
            System.out.println("XP: " + dev.calcularXp());
        }

        scanner.close();
    }
}
