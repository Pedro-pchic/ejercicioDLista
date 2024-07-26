package Personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListaPersona {
    private List<Persona> personas;

    public ListaPersona() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerPersonas() {
        return personas;
    }

    public void imprimirNombresCompletos() {
        personas.stream()
                .forEach(p -> System.out.println(p.getPrimerNombre() + " " + p.getSegundoNombre() + " " + p.getPrimerApellido() + " " + p.getSegundoApellido()));
    }

    public List<Persona> obtenerMayoresDeEdad() {
        return personas.stream()
                       .filter(p -> p.getEdad() >= 18)
                       .collect(Collectors.toList());
    }

    public Optional<Persona> obtenerPersonaPorCondiciones() {
        return personas.stream()
                       .filter(p -> p.getEdad() >= 18)
                       .filter(p -> p.getCiudad().equalsIgnoreCase("Guatemala"))
                       .filter(p -> p.getPrimerNombre().contains("Lu"))
                       .findFirst();
    }

    public static void main(String[] args) {
        ListaPersona manager = new ListaPersona();
        
        // Crear instancias de Persona
        manager.agregarPersona(new Persona(1, "Luis", "Alberto", "Perez", "Gomez", "Masculino", "123456789", 25, "Guatemala"));
        manager.agregarPersona(new Persona(2, "Lucia", "Maria", "Lopez", "Martinez", "Femenino", "987654321", 30, "Guatemala"));
        
        // Imprimir nombres completos
        manager.imprimirNombresCompletos();
        
        // Obtener mayores de edad
        List<Persona> mayores = manager.obtenerMayoresDeEdad();
        mayores.forEach(p -> System.out.println(p.getPrimerNombre() + " " + p.getEdad()));
        
        // Obtener persona por condiciones
        Optional<Persona> persona = manager.obtenerPersonaPorCondiciones();
        persona.ifPresent(p -> System.out.println(p.getPrimerNombre() + " " + p.getCiudad()));
    }
}
