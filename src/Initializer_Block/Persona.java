package Initializer_Block;

public class Persona {

    // Static Initializer Block
	// Con este solo se ejecuta una vez, ya que es parte de la clase persona
    static {

        System.out.println("Bloque estático ejecutado");
    }

    // Initializer Block normal
    // Este se repetirá a la misma vez que cree los objetos
    {

        System.out.println("Bloque normal ejecutado");
    }

    // Constructor
    // Este se repetirá cada vez que cree un nuevo objeto
    public Persona() {

        System.out.println("Constructor ejecutado");
    }
}
