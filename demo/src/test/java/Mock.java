public class Mock implements Service{ //"IMITA" as funcionalidades do real
    
    @Override
    public String busca(int id) { //Vai retornar as infos diretamente sem precisar ir buscar externamente

        if (id == 10){
            return ProfessorConst.RENZO;
        }
        if (id == 20){
            return ProfessorConst.CHRIS;
        }
        if (id == 30){
            return ProfessorConst.MARCELO;
        }
        if (id == 0){
            return ProfessorConst.ERRO_NOME;
        }
        if (id == 1){
            return ProfessorConst.ERRO_HORARIO;
        }
        if (id == 2){
            return ProfessorConst.ERRO_PERIODO;
        }
        return null;
    }
}
