public class Professor {

    private String nome;
    private int horarioDeAtendimento;
    private String periodo;


    //CONSTRUTOR
    public Professor(String nome, int horarioDeAtendimento, String periodo) {
        this.nome = nome;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }


    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorarioDeAtendimento(int horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
