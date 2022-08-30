import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

/********************************************[CASOS DE SUCESSO]******************************************/

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
    public void testeBuscaProfMarcelo(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor marcelo = app.buscaProf(30); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Marcelo", marcelo.getNome());
        assertEquals(19, marcelo.getHorarioDeAtendimento());
        assertEquals("noturno", marcelo.getPeriodo());
    }


/*********************************************[CASOS DE FALHA]********************************************/

    @Test
    public void testeBuscaFalhaNome(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaNome = app.buscaProf(0);

        assertEquals("Erro", falhaNome.getNome());
        assertEquals(19, falhaNome.getHorarioDeAtendimento());
        assertEquals("noturno", falhaNome.getPeriodo());
    }

    @Test
    public void testeBuscaFalhaHorario(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaHorario = app.buscaProf(1);

        assertEquals("Marcelo", falhaHorario.getNome());
        assertNotSame(19, falhaHorario.getHorarioDeAtendimento()); //o horario correto seria 19h
                                                                              //ou seja, para ocorrer erro
                                                                              //deve vir qualquer coisa menos 19
        assertEquals("noturno", falhaHorario.getPeriodo());
    }

    @Test
    public void testeBuscaFalhaPeriodo(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaPeriodo = app.buscaProf(2);

        assertEquals("Renzo", falhaPeriodo.getNome());
        assertEquals(17, falhaPeriodo.getHorarioDeAtendimento());
        assertEquals("manha", falhaPeriodo.getPeriodo());
    }

}
