
package reto4;



public class Libro {
   //Libro: nombre, tipo (novela, teatro, poesía, ensayo), editorial, año y autor.
    String nombre="";
    String tipo="";
    String editorial="";
    String año="";
    String autor="";
 
    
    public Libro(String nombre, String tipo, String editorial, String año, String autor) {
        this.nombre=nombre;
        this.tipo=tipo;
        this.editorial=editorial;
        this.año=año;
        this.autor=autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", a\u00f1o=" + año + ", autor=" + autor + '}';
    }
    
    
    
}
