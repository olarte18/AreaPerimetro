package modelo;
public class ejemplo
{
    // Definición de la interfaz
interface Saludo {
    void saludar(String nombre);
}

// Implementación de la interfaz en una clase concreta
class SaludoEnIngles implements Saludo {
    @Override
    public void saludar(String nombre) {
        System.out.println("Hello, " + nombre + "!");
    }
}

class SaludoEnEspañol implements Saludo {
    @Override
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ".");
    }
}

public class Test {
    public static void main(String[] args) {
        // Crear objetos de las clases que implementan la interfaz
        Saludo saludoEnIngles = new SaludoEnIngles();
        Saludo saludoEnEspanol = new SaludoEnEspañol();

        // Llamar a los métodos a través de las referencias de la interfaz
        saludoEnIngles.saludar("John");
        saludoEnEspanol.saludar("María");
    }
}

}