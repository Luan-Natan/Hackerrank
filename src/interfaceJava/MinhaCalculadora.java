package interfaceJava;

class MinhaCalculadora implements AritmeticaAvancada
{

    @Override
    public int divisor_soma(int n)
    {
        int soma = 0;

        if(n>100) return soma;

        for (int i = 1; i <= n; i++)
        {
            if((n % i) == 0) soma += i;
        }

        return soma;
    }
}
