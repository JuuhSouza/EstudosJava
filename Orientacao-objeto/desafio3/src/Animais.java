import Animal.Cachorro;
import Animal.Gato;


public class Animais {
    public static void main(String[] args) {
        //2 - Animal
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarORabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.ArranharCoisas();

    }
}
