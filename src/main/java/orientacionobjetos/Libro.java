package orientacionobjetos;

public class Libro {

    String titulo;
    String autor;
    int num_paginas;

    public Libro(String titulo, String autor, int num_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.num_paginas = 0;
    }
}

