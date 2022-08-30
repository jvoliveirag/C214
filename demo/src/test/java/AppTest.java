import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testeBuscaProfRenzo(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor renzo = app.buscaProf(10); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Renzo", renzo.getNome());
        assertEquals(17, renzo.getHorarioDeAtendimento());
        assertEquals("integral", renzo.getPeriodo());
    }



    @Test
    public void testeBuscaProfChris(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor chris = app.buscaProf(20); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Christopher", chris.getNome());
        assertEquals(15, chris.getHorarioDeAtendimento());
        assertEquals("integral", chris.getPeriodo());
    }


    
    @Test
    public void testeBuscaFalhaNome(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falha = app.buscaProf(30);

        assertEquals("Erro", falha.getNome());
        assertEquals(19, falha.getHorarioDeAtendimento());
        assertEquals("noturno", falha.getPeriodo());
    }
}
