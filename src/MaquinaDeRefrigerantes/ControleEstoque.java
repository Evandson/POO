package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public interface ControleEstoque {

    void consultarEstoque();
    void inserirRefrigerante(int quantidade);
    void retirarRefrigerante();

}
