package orientacionobjetos.cadenaAlimenticia;

abstract public class Animal {
    private String nombre;
    private String habitat;
    private String [] come=new String[3];
    private String [] Escomido=new String[3];

    public Animal(String nombre, String habitat, String[] come, String[] escomido) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.come = come;
        Escomido = escomido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String[] getCome() {
        return come;
    }

    public void setCome(String[] come) {
        this.come = come;
    }

    public String[] getEscomido() {
        return Escomido;
    }

    public void setEscomido(String[] escomido) {
        Escomido = escomido;
    }

    abstract public void ataca();
        abstract public void huye();





}
