
package Modelo;

public class Medico {
    
    int cod_Medico = 0;
    String primer_Nombre = "";
    String segundo_Nombre = "";
    String tercer_Nombre = "";
    String primer_Apellido = "";
    String segundo_Apellido = "";
    String num_Telefono = "";
    String correo = "";

    public Medico() {
    }

    public Medico(int cod_Medico, String primer_Nombre, String segundo_Nombre, String tercer_Nombre, String primer_Apellido, String segundo_Apellido, String num_Telefono, String correo) {
        this.cod_Medico = cod_Medico;
        this.primer_Nombre = primer_Nombre;
        this.segundo_Nombre = segundo_Nombre;
        this.tercer_Nombre = tercer_Nombre;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
        this.num_Telefono = num_Telefono;
        this.correo = correo;
    }

    public int getCod_Medico() {
        return cod_Medico;
    }

    public void setCod_Medico(int cod_Medico) {
        this.cod_Medico = cod_Medico;
    }

    public String getPrimer_Nombre() {
        return primer_Nombre;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre;
    }

    public String getSegundo_Nombre() {
        return segundo_Nombre;
    }

    public void setSegundo_Nombre(String segundo_Nombre) {
        this.segundo_Nombre = segundo_Nombre;
    }

    public String getTercer_Nombre() {
        return tercer_Nombre;
    }

    public void setTercer_Nombre(String tercer_Nombre) {
        this.tercer_Nombre = tercer_Nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }

    public String getNum_Telefono() {
        return num_Telefono;
    }

    public void setNum_Telefono(String num_Telefono) {
        this.num_Telefono = num_Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
