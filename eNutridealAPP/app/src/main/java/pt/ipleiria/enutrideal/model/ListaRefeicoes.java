package pt.ipleiria.enutrideal.model;

import java.util.ArrayList;

public class ListaRefeicoes {
    private ArrayList<Refeicao> refeicoes;

    public ListaRefeicoes() {
        this.refeicoes = new ArrayList<>();
    }

    public void addRefeicao(Refeicao refeicao) {
        if (containsItem(refeicao.getItem())) {
            throw new RuntimeException("Não é possivel adicionar esta refeição pois já existe.");
        }
        refeicoes.add(refeicao);
    }

    public boolean containsItem(String item) {
        for (Refeicao r : refeicoes) {
            if (r.getItem() == item) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Refeicao> searchRefeicaoPorItem(String item) {
        ArrayList<Refeicao> res = new ArrayList<>();
        for (Refeicao r : refeicoes) {
            if (r.getItem() == item) {
                res.add(r);
            }
        }
        return res;
    }

    public ArrayList<Refeicao> searchRefeicaoPorRestaurante(String restaurante) {
        ArrayList<Refeicao> res = new ArrayList<>();
        for (Refeicao r : refeicoes) {
            if (r.getRestaurante().contains(restaurante)) {
                res.add(r);
            }
        }
        return res;
    }

    public ArrayList<Refeicao> getRefeicoes() {
        return refeicoes;
    }

    @Override
    public String toString() {
        String res = "";
        for (Refeicao r : refeicoes) {
            res += r + "\n";
        }
        return res;
    }
}

