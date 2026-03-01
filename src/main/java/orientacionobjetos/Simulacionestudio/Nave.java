package orientacionobjetos.Simulacionestudio;

import java.util.Objects;

public class Nave {
    private String codregistro;
    private String modelo;
    private int horasVuelo;

    public Nave(String codregistro, String modelo, int horasVuelo) {
        this.codregistro = codregistro;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;

    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodregistro() {
        return codregistro;
    }

    public void setCodregistro(String codregistro) {
        this.codregistro = codregistro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(getCodregistro(), nave.getCodregistro());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodregistro());
    }

}
