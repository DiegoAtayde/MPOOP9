/**
*   Excepcion de maximo de retiros excedidos.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class MaximoRetirosExcedidos extends Exception {
    
  public MaximoRetirosExcedidos(){
    super("Máximo de retiros diarios alcanzado");
  }
}
