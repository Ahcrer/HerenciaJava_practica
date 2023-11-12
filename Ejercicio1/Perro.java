package Ejercicio1;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String raza, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void ladrido() {
        System.out.println(nombre + " el perro " + raza + " de " + edad + " años de edad hace gua guau");
    }

}
