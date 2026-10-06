import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class Main {
     


    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java");
bootcamp.setDescricao("Aprendendo Java e orientação a objetos");

bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev dev = new Dev();
dev.setNome("Larissa");
dev.inscreverBootcamp(bootcamp);
System.out.println("Inscritos: " + dev.getConteudosInscritos());

dev.progredir();
dev.progredir();
dev.progredir();

System.out.println("Concluídos: " + dev.getConteudosConcluidos());
System.out.println("XP: " + dev.calcularTotalXp());
        System.out.println(curso1);
        
        System.out.println(curso2);

        System.out.println(mentoria);
    }


}
    
