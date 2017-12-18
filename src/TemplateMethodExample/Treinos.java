package TemplateMethodExample;

public abstract class Treinos {

    public final void treinosDiarios() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    protected abstract void preparoFisico();

    protected abstract void jogoTreino();

    private final void treinoTatico() {
        System.out.println("Treino tático");
    }

}
