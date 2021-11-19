public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("------------- Excepeción Única -------------");
    try{
      String mensajes[] = {"uno", "dos", "tres"}; //arreglo      
      for(int i=0; i<=3; i++){ //ínfdces 0,1,2
        System.out.println(mensajes[i]);
      }
    }catch(ArrayIndexOutOfBoundsException e){
      //System.out.println("Error: "+e);
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("Línea final");

    System.out.println("------------- Excepeciones Anidadas -------------");
    try{
      Integer denominador = null; //wrapper 
      float equis = 5/denominador;
      System.out.println(equis);

    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: " + e.getMessage());
    }catch(ArithmeticException e){
      System.out.println("Error: " + e.getMessage());
    }catch(Exception e){ //caso general
      System.out.println("Error: fallo desconocido");
    }

    System.out.println("------------- Propagación de Excepeciones -------------");
    try{
      imprimirArray();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error-> " + e.getMessage());
    }finally{
      System.out.println("línea de a huevo");
    }

    System.out.println("------------- Creación de Excepeciones -------------");
    Cuenta account = new Cuenta();
    try{
      account.depositar(2000);
      account.consultaSaldo();
      account.retirar(800);
      account.consultaSaldo();
      account.retirar(1100);
      account.consultaSaldo();
      //las siguientes dos líneas arrojan la exepción: SaldoInsuficienteException()
      account.retirar(500);
      account.consultaSaldo();      
      //si se descomentan estas líneas, se arroja la exepción: MontoLimiteException()
      //account.depositar(25000);
      //account.consultaSaldo();
            
      //si se descomentan estas líneas, se arroja la exepción: MaximoRetirosExcedidos()
      //account.retirar(5);
      //account.consultaSaldo();

    }catch(SaldoInsuficienteException e){
      System.out.println("Error: "+e.getMessage());
      ofrecerCrecito();    
    }catch(MontoLimiteException e){
      System.out.println("Error: "+e.getMessage());
    }catch(MaximoRetirosExcedidos e){
      System.out.println("Error: "+e.getMessage());
    }
    
  }  

  public static void imprimirArray() throws ArrayIndexOutOfBoundsException{
    String mensajes[] = {"uno", "dos", "tres"}; //arreglo         
    for(int i=0; i<=3; i++){ //ínfdces 0,1,2
      System.out.println(mensajes[i]);
    }
  }

  public static void ofrecerCrecito(){
    System.out.println("¿Te interesa una tarjeta de crédito?");
  }
}

