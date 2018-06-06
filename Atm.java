import java.util.Scanner;

public class Atm{
  public static void main(String args[]){
    Scanner user = new Scanner(System.in);
    int op = 0;
    float saldo = 5000, operaciones = 0, retiro = 0, ingreso = 0, mretiro = 0;
    String nombre = "";

    do{    
      System.out.println("PorFavor Ingrese Su Nombre");
      nombre = user.nextLine();
      System.out.println(nombre);
      System.out.println("Bienvenido a Serrano´s Bank");
      System.out.println("Bienvenido " + nombre);
      System.out.println("Menu De Opciones");
      System.out.println("1.- Consultar Saldo");
      System.out.println("2.- Retiros");
      System.out.println("3.- Depositos");
      System.out.println("4.- Salir");
      System.out.println("PorFavor Ingrese Una Opcion Valida");
      op = user.nextInt();
    }while(op<1 || op>4);

    switch(op){
      case 1:
      System.out.println("Consulta De Saldo");
      System.out.println("Su Saldo Actual Es De: $" + saldo );
      break;

      case 2: 
      System.out.println("Retiros");
      System.out.println("Tu Saldo Actual Es De: $" + saldo);
      System.out.println("Se Te Cobrara Una Comision De $15");
      mretiro = saldo - 15;
      System.out.println("Saldo Maximo Para Retiro: $" + mretiro);
      System.out.println("¿Cuanto Deseas Retirar?");
      do{
        retiro = user.nextFloat();
      }while(retiro>mretiro); 
      saldo = saldo - retiro;
      System.out.println("Retiro Realisado Con Exito");
      System.out.println("Tu Saldo Actual Es De: $" + saldo);
      break;

      case 3:
      System.out.println("Depositos");
      System.out.println("¿Cuanto Deseas Depositar?");
      ingreso = user.nextFloat();
      saldo = saldo + ingreso;
      System.out.println("Tu Saldo Actual Es De: $" + saldo);
      break;

      case 4: 
      break;
    }

  }
}