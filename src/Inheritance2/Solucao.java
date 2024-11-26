package Inheritance2;

public class Solucao
{
    public static void main(String []args){
        Somador a = new Somador();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
