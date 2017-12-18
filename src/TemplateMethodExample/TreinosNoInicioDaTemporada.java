package TemplateMethodExample;

public class TreinosNoInicioDaTemporada extends Treinos{

    @Override
    protected void preparoFisico() {
        System.out.println("Preparo físico leve.");
    }

    @Override
    protected void jogoTreino() {
        System.out.println("Jogo treino com equipe júnior.");
    }
}
