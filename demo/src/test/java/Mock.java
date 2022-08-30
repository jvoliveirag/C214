public class Mock implements Service{ //"IMITA" as funcionalidades do real
    
    @Override
    public String busca(int id) { //Vai retornar as infos diretamente sem precisar ir buscar externamente

        if (id == 10){
            return ProfessorConst.RENZO;
        }
        if (id == 20){
            return ProfessorConst.CHRIS;
        }
        if (id == 0){
            return ProfessorConst.ERRO;
        }
        return null;
    }
}
