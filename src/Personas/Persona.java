package Personas;

public class Persona {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private String numeroIdentificacion;
    private int edad;
    private String ciudad;

    public Persona(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String genero, String numeroIdentificacion, int edad, String ciudad) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Getters
    public String getPrimerNombre() { return primerNombre; }
    public String getSegundoNombre() { return segundoNombre; }
    public String getPrimerApellido() { return primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public int getEdad() { return edad; }
    public String getCiudad() { return ciudad; }
}


