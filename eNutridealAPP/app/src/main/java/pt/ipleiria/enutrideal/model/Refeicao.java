package pt.ipleiria.enutrideal.model;

import java.util.Objects;

public class Refeicao {
    private String restaurante;
    private String item;
    private String quantidade;
    private String calorias;

    public Refeicao(String restaurante, String item, String quantidade, String calorias) {
        this.restaurante = restaurante;
        this.item = item;
        this.quantidade = quantidade;
        this.calorias = calorias;
    }


    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Restaurante: " + restaurante + "\n" +
                "Item: " + item + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Calorias:" + restaurante + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refeicao refeicao = (Refeicao) o;
        return Objects.equals(restaurante, refeicao.restaurante) &&
                Objects.equals(item, refeicao.item) &&
                Objects.equals(quantidade, refeicao.quantidade) &&
                Objects.equals(calorias, refeicao.calorias);
    }

    @Override
    public int hashCode() {

        return Objects.hash(restaurante, item, quantidade, calorias);
    }
}
