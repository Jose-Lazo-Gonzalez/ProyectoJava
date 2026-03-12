package colecciones.listas.modelo;

import java.util.List;

public class Instituto {
    private List<Grupo> grupos;


    public Instituto(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Instituto() {
    }

    public void Addgrupo(Grupo grupo){
        grupos.add(grupo);
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
