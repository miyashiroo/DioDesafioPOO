import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JavaScript");
        curso1.setDescricao("Aprenda JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Banco Pan");
        mentoria.setDescricao("Trabalhe no banco Pan");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp De Java back end");
        bootcamp.setDescricao("Descrição Bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devShiro = new Dev();
        devShiro.setNome("Rodrigo miyashiro");
        devShiro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev Shiro: " + devShiro.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Dev Shiro: " + devShiro.getConteudosConcluidos());
        devShiro.progredir();
        System.out.println("Conteudos inscritos Dev Shiro: " + devShiro.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Dev Shiro: " + devShiro.getConteudosConcluidos());
        System.out.println("XP: " + devShiro.calcularTotalXp());

        System.out.println("=============================================================");


        Dev devRisos = new Dev();
        devRisos.setNome("Risos Soares");
        devRisos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev Risos: " + devRisos.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Dev Risos: " + devRisos.getConteudosConcluidos());
        devRisos.progredir();
        System.out.println("Conteudos inscritos Dev Risos: " + devRisos.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Dev Risos: " + devRisos.getConteudosConcluidos());

    }
}