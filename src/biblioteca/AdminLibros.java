package biblioteca;

public class AdminLibros {
    public static void main (String[] args){

        Libro libroUno = new Libro("Yo Antes de Ti", "Jojo Moyes",496,2014);
        Libro libroDos = new Libro("El Principito", "Antoine de Saint",120,1943);


        System.out.println("Datos libro 1");
        libroUno.mostrarDatosLibro();
        System.out.println("Nombre libro 1: "+ libroUno.getTitulo());
        System.out.println("Autor libro 1: "+ libroUno.getAutor());
        System.out.println("Numero de paginas libro 1: "+ libroUno.getNumeroDePaginas());
        System.out.println("Ano de publicacion libro 1: "+ libroUno.getAnoDePublicacion());
        System.out.println("------------------------------------------------------------");
        System.out.println("Datos libro 2");
        libroDos.mostrarDatosLibro();
        System.out.println("Nombre libro 2: "+ libroDos.getTitulo());
        System.out.println("Autor libro 2: "+ libroDos.getAutor());
        System.out.println("Numero de paginas libro 2: "+ libroDos.getNumeroDePaginas());
        System.out.println("Ano de publicacion libro 2: "+ libroDos.getAnoDePublicacion());


        libroUno.setNumeroDePaginas(500);

        //modificacion();
        //System.out.println("numero de paginas libro 1 modificado: " + libroUno.getNumeroDePaginas());
    }
}
