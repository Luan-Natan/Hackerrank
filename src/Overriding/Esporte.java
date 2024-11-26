package Overriding;

public class Esporte
{
    String getName(){
        return  "Esportes Genéricos" ;
    }

    void  getNumberOfTeamMembers (){
        System.out.println( "Cada time tem n jogadores em " + getName() );
    }
}
