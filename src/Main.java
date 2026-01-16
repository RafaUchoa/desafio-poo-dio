import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso completo de java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Curso muito bacana");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Muito boa");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());

        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rafael: " + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
