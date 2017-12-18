package TemplateMethodExample;

public class ClassePrincipal {

    public static void main(String[] args) {
       // Treinos treinosInicio = new TreinosNoInicioDaTemporada();
        Treinos treinosInicio = new TreinosNoMeioDaTemporada();

        treinosInicio.treinosDiarios();
    }
}
