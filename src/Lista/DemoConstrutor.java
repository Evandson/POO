package Lista;

/**
 * Created by Evandson Maranhão on 08/05/2016.
 */
class DemoConstrutor
{
    private int a, b;

    DemoConstrutor()
    {
        System.out.println("No construtor sem argumentos");
        //DemoConstrutor(0,0); Não permitido
        //DemoConstrutor dm = new DemoConstrutor(0,0);
    }
    DemoConstrutor(int xa, int xb)
    {
        System.out.println("No construtor com argumentos...");
        a = xa; b = xb;
    }
}
