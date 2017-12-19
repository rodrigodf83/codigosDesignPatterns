package templatemethod;

public class TreinosNoMeioDaTemporada extends Treinos {

    @Override
    protected void preparoFisico() {
        System.out.println("Preparo Físico Intenso.");
    }

    @Override
    protected void jogoTreino() {
        System.out.println("Jogo Treino com equipe reserva");
    }
}
