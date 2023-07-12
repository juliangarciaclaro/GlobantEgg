
package Entidad;


public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nPaginas;
    
    //constructores

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }
    
    //getters y setters

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    
    
}
