package data;

import java.util.List;

public abstract class Postre {
    private Float calorias;
    private List<String> ingredientes;

    public Postre(Float calorias, List<String> ingredientes) {
        this.calorias = calorias;
        this.ingredientes = ingredientes;
    }

    public Postre() {
    }

    public abstract void servirPostre();

    public abstract String mostrarDetalleCalorias();

    public abstract String devolverTipo();

    public Float getCalorias() {
        return this.calorias;
    }

    public void setCalorias(Float calorias) {
        this.calorias = calorias;
    }

    public List<String> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}