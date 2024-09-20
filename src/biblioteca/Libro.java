package biblioteca;

public class Libro {


    String titulo;
    String autor;
    int numeroDePaginas;
    int anoDePublicacion;


//constructor
    public Libro(String titulo, String autor, int numeroDePaginas, int anoDePublicacion){

        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacion = anoDePublicacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getAnoDePublicacion() {
        return anoDePublicacion;
    }

    public void setAnoDePublicacion(int anoDePublicacion) {
        this.anoDePublicacion = anoDePublicacion;
    }


    //mostrar datos libros
    public void mostrarDatosLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas:  " + numeroDePaginas);
        System.out.println("Ano de publicacion:  " + anoDePublicacion);


    }

}
