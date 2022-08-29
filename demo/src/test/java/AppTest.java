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
}
