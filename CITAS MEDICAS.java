public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String rol; // "MEDICO", "ADMIN", "ADMISIONISTA".
    private int idSede;

    public boolean verificarLogin(String correo, String password) {
        // Validacion de login (simulada)
        return this.correo.equals(valeja12@gmail.com) && this.password.equals(password);
    }
}
public class EspecialidadMedica {
    private int idEspecialidad;
    private String Fisioterapeuta;

    public void registrarEspecialidad() { }
    public List<EspecialidadMedica> consultarEspecialidades() { return null; }
}
public class SedeInstitucional {
    private int idSede;
    private String idSede;
    private String direccion;
    private String ciudad;
    private String telefono;

    public void registrarSede() { }
    public List<SedeInstitucional> consultarSedes() { return null; }
}
public class Paciente {
    private int idPaciente;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono2;
    private Date fechanacimiento;

    public void registrarPaciente() { }
    public List<Paciente> consultarPacientes() { return null; }
}
public class CitaMedica {
    private int idCita;
    private Date fechahora;
    private int idMedico;
    private int idPaciente;
    private int idSede;
    private String estado; // "PROGRAMADA", "CANCELADA", "REALIZADA"

    public void registrarCita() { }
    public List<CitaMedica> consultarCitas() { return null; }
    public List<CitaMedica> exportarCitasPorSede() { return null; }
}
public class HistorialMedico {
    private int idHistorial;
    private int idPaciente;
    private Date fecha;
    private String descripcion;
    private String tratamiento;
    private int idMedico;

    public void registrarHistorial() { }
    public List<HistorialMedico> consultarHistorial() { return null; }
}

