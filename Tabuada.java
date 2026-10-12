import java.util.Scanner;
public class Tabuada{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int numero = sc.nextInt();
        for (int i =1 ; i <= 12; i ++){
            int  resultado = i * numero;
           System.out.println(numero   + " * " +  i +  " = " +  resultado  );
        }


    }
}