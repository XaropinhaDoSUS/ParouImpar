import java.util.Scanner;

 class ImparPar{
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira o número:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

        scanner.close();
    }
}