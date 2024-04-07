
package contactos;

public class Nodo {

    String nombre;
    String telefono;
    String celular;
    String direccion;
    String correo;

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }
    
    
    Nodo siguiente; //apuntador a otro Nodo

    public Nodo() {
        this.nombre = "";
        this.telefono = "";
        this.celular = "";
        this.direccion = "";
        this.correo = "";
    }

    public Nodo(String nombre, String telefono, String celular, String direccion, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void actualizar(String nombre, String telefono, String celular, String direccion, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }
 
}
