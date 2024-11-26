package Overriding2;

class Motocicleta extends Bicicleta
{
    String define_me(){
        return "a cycle with an engine.";
    }

    Motocicleta() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        String temp = super.define_me();

        System.out.println("My ancestor is a cycle who is " + temp );
    }
}
