import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do Curso");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Spring");
        curso2.setDescricao("Descricao do Curso");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da Mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);
//        System.out.println(curso);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJuan = new Dev();
        devJuan.setNome("Juan");
        devJuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devJuan.getConteudosInscritos());
        devJuan.progredir();
        devJuan.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos Inscritos:" + devJuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devJuan.getConteudosConcluidos());
        System.out.println("XP: " + devJuan.calcularTotalXp());

        System.out.println("------------------------------------------------");

        Dev devCassiano = new Dev();
        devCassiano.setNome("Cassiano");
        devCassiano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devCassiano.getConteudosInscritos());
        devCassiano.progredir();
        devCassiano.progredir();
        devCassiano.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos Inscritos:" + devCassiano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devCassiano.getConteudosConcluidos());
        System.out.println("XP: " + devCassiano.calcularTotalXp());


    }
}