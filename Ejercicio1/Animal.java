package Ejercicio1;

public class Animal {
    // atributo
    String nombre;

    // constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // metodo
    public void hacerSonido() {

    }
}

class perro extends Animal {

    public perro(String nombre) {
        super(nombre);
    }

    public void ladrido() {

    }

}
