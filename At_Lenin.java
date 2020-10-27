import java.util.Scanner;

public class Teste2 {
    
    public static void menu(){
                System.out.println("---------------------------");
                System.out.println("|     Menu de Clientes    |");
                System.out.println("| 1. Cadastro de Clientes |");
                System.out.println("| 2. Listagem de Clientes |");
                System.out.println("| 3. Procurar Cliente     |");
                System.out.println("---------------------------");
                System.out.print("Digite qual opção vai querer: ");
                
    }

    
    public static void prato(){
        // 1° MENU DE PRATOS
                         System.out.println("Pratos");
                         System.out.println("0. Vegetariano – R$ 50,00");   
                         System.out.println("1. Peixe – R$ 40,00"); 
                         System.out.println("2. Frango – R$ 50,00"); 
                         System.out.println("3. Carnes – R$ 80,00");
                         System.out.print("Digite o código do prato que deseja: ");
    }
    
    public static void sobremesa(){
        // SOBREMESAS
                         System.out.println("Sobremesa");
                         System.out.println("0. Bolo de Abacaxi – R$ 30,00");   
                         System.out.println("1. Sorvete diet – R$ 15,00"); 
                         System.out.println("2. Mouse diet – R$ 18,00"); 
                         System.out.println("3. Mouse chocolate – R$ 20,00");
                         System.out.print("Digite o código do prato que deseja: ");
    }
    
    public static void bebida(){
        // BEBIDAS
                         System.out.println("Bebidas");
                         System.out.println("0. Chá – R$ 7,00");   
                         System.out.println("1. Suco de laranja – R$ 15,00"); 
                         System.out.println("2. Suco de melão – R$ 13,00"); 
                         System.out.println("3. Refrigerante diet – R$ 18,00");
                         System.out.print("Digite o código do prato que deseja: ");
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        int rp=1;
        //int i = 0, 
        int ctd =1, ctf = 0;
         
        int[] pt = {50,40,50,80}, sb = {30,15,18,20}, bb = {7,15,13,18};
        int[] total = new int[3];
        String[] nome = new String[3];
        int[] pratos = new int[3], sobre = new int[3], bebidas = new int[3];
        
        do{
            
            menu();
            opcao = leia.nextInt();
            leia.nextLine();
           
            
            switch(opcao){
            case 1:
                
                 
                for(int i = 0; rp == 1 ; i++){                
                    
                    
                   for(int j = 0; j< nome[i].length(); j++){
                    System.out.print("Digite o nome e sobrenome do " + ctd + "° cliente: " );
                    nome[i] = leia.nextLine();
                    
                    prato();
                    pratos[i] = leia.nextInt();
                    leia.nextLine();
                    total[i] += pt[pratos[i]];
                    
                    sobremesa();
                    sobre[i] = leia.nextInt();
                    leia.nextLine();
                    total[i] += sb[sobre[i]];
                    
                    bebida();
                    bebidas[i] = leia.nextInt();
                    leia.nextLine();
                    total[i] += bb[bebidas[i]];
                   
                   System.out.println("Deseja adicionar mais algum? 1-Sim / 0-Não");
                   rp = leia.nextInt();
                   
                   i++;
                   ctd ++;
                   ctf++;
                }
                }
                break;
                
            case 2:
                System.out.println("A lista dos nomes cadastrados: ");
                 
                for(int i =0; i < ctf; i++){
                        System.out.println(i + "." +nome[i]);
                }
                break;
                
            case 3:
                System.out.print("Digite o id do nome que deseja procurar: ");
                int id = leia.nextInt();
                System.out.println("O cliente "+nome[id]+" deverá pagar a conta no total de R$"+ total[id]);
                
                break;
                
            default:
                System.out.println("Essa opção não está no menu");
            }
        } while(opcao != 0);
    }
}
