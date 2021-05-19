import java.util.Scanner;

class calculadora{
    
    public static void main(String args){
        Scanner input = new Scanner(System.in);    
        
        double n1 = 0, n2 = 0, result = 0; 
        String again = "";
        
        while(true){
        if (again == "N" || again == "n")
            break;
        
            System.out.print("> Primeiro termo: ");
        n1 = input.nextDouble();
        System.out.print("> Segundo termo: ");
        n2 = input.nextDouble();
        
        System.out.print("> Deseja fazer outra operacao? (N/S)");
        again = input.nextLine();
        }
        
        
        input.close();
    }
}