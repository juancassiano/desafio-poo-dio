import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao do Curso");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Spring");
        curso2.setDescricao("Descricao do Curso");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da Mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso);
        System.out.println(curso2);
    }
}