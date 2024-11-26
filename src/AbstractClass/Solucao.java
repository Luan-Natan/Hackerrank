package AbstractClass;

import java.util.Scanner;

public class Solucao
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        MeuLivro new_novel = new MeuLivro();
        new_novel.setTitulo(title);

        System.out.println("The title is: " + new_novel.getTitulo());
        sc.close();
    }
}
