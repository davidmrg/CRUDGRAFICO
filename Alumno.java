
package crudarraylist;

/**
 *
 * @author davidmramirez
 */
public class Alumno {
    
    String Nombre,Apellido,Id,Telefono;

    public Alumno(String Nombre, String Apellido, String Id, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Id = Id;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
