/**
*   Clase general que contiene las características principales de una cuenta bancaria.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Cuenta {
  private double saldo;
  private int retiros = 0;

  /**
  * Constructor que inicializa el saldo.
  */
  public Cuenta(){
    saldo = 0; //redundante pues todas las var primitivas se inicializan en 0
  }

  /**
  * Agrega saldo a la cuenta con un maximo de 20,000.
  * @param monto depositado.
  */
  public void depositar(double monto) throws MontoLimiteException{
    System.out.println("Depositando...");
    if(monto>20000)
      throw new MontoLimiteException();
    else
      saldo += monto;
  }

  /**
  * Retira saldo de la cuenta con un maximo de 3 retiros por dia.
  * @param monto a retirar.
  */
  public void retirar(double monto) throws SaldoInsuficienteException, MaximoRetirosExcedidos{
    System.out.println("Retirando...");
    //revisa que el no. de retiros sea menor o igual a 3
    if(this.retiros<3){
      if(saldo<monto)
        throw new SaldoInsuficienteException();
      else{ //si retira, aumenta el no. de retiros al día
        saldo -= monto;
        this.retiros++;
      }
    }else{
      throw new MaximoRetirosExcedidos();
    }
  }

  /**
  * Regresa el saldo total de la cuenta.
  * @return saldo.
  */
  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }
}
