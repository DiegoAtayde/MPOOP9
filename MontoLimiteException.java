/**
*   Excepcion de monto limite.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class MontoLimiteException extends Exception{
    
  public MontoLimiteException(){
    super("Monto límite excedido");
  }
}
