package AbstractFactory;


// A interface fábrica abstrata declara um conjunto de métodos
// que retorna diferentes produtos abstratos
public interface Animal {
    String getType();
    String makeSound();
}