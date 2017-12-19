package state;

import java.util.List;

public class Cinza extends Cor {

    public void assumiu(No no, List<No> list) {
        no.getAdjacentes().stream().forEach(adj -> {
            adj.buscarProfundidade(list);
            no.setCor(new Preto(), list);
        });
    }

}
