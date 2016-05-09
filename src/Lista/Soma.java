package Lista;

/**
 * Created by Evandson Maranhão on 08/05/2016.
 */
class Soma
{
    public	int	doisValores(int	a, int b)
    {
       return a + b;
    }
    public double doisValores(double a, int b)
    {
        return a + b;
    }
    public double doisValores(double a, double b)
    {
        return a + b;
    }
}

class TesteSoma
{
    public static void main(String[] args)
   {
       Soma soma = new Soma();
       byte	b = 20;
       short s = 99;
       int	i = 1000;
       long	l = 1234L;
       float f	= 3.1416f;
       double d	= 2000;

       System.out.println(soma.doisValores(b,s));// primeiro
       System.out.println(soma.doisValores(i,s));//primeiro
       System.out.println(soma.doisValores(i,i));//primeiro
       System.out.println(soma.doisValores(l,b));//segundo
       System.out.println(soma.doisValores(f,s));//segundo
       System.out.println(soma.doisValores(d,b));//segundo
       System.out.println(soma.doisValores(b,d));//segundo
       System.out.println(soma.doisValores(i,l));//segundo
       System.out.println(soma.doisValores(l,l));//terceiro
       System.out.println(soma.doisValores(d,f));//terceiro
   }
}