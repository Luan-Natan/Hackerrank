package Overriding;

public class Solucao
{
    public static void main(String []args){
        Esporte c1 = new Esporte();
        Futebol c2 = new Futebol();

        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();

        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
