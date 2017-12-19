package state;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No { // de nó

    private Set<No> adjacentes = new HashSet<>();
    private Cor cor;
    private String name;

    public No(String name) {
        this.name = name;
        cor = new Branco();
    }

    public void buscarProfundidade(List<No> list) {
        cor.busca(this, list);
    }

    public Set<No> getAdjacentes() {
        return this.adjacentes;
    }

    public void addAdjacentes(No adj) {
        this.adjacentes.add(adj);
    }

    public void setCor(Cor cor, List<No> list) {
        this.cor = cor;
        cor.assumiu(this, list);
    }

    public String toString() {
        return this.name;
    }
}
