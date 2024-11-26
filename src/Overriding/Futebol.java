package Overriding;

public class Futebol extends Esporte
{
    @Override
    String getName (){
        return "Classe Futebol" ;
    }

    void  getNumberOfTeamMembers (){
        System.out.println( "Cada time tem 11 jogadores em " + getName() );
    }
}
