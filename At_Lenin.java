
package exemploscondicionais;

import java.util.Scanner;

public class ProjetoLenin {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        int[] id = new int[3]; 
        String[] nome = new String[3];
        String nm = "";
        int mn = Integer.MAX_VALUE;
        int op = 0;
        String sd = "S";
        String opClient = "S";
        double[] pratos = new double[3], sobre = new double[3];
        double[] total =  new double[3];
        
           while(sd.equals("S") && sd.equals("s")){
                System.out.println("---------------------------");
                System.out.println("|     Menu de Clientes    |");
                System.out.println("| 1. Cadastro de Clientes |");
                System.out.println("| 2. Listagem de Clientes |");
                System.out.println("| 3. Procurar Cliente     |");
                System.out.println("---------------------------");
                op = leia.nextInt();
                leia.nextLine();
                
                
                switch(op){
                case 1://CADASTRO
                    
                    
                     
                     for(int i = 0; i< id.length; i++){
                        
                        // ESTRUTURA DE REPETIÇÃO PARA ADICIONAR CLIENTE, NO MÁXIMO 10 CLIENTES 
                        while(opClient.equals("S")){
                        System.out.print("Digite o nome e sobrenome do " + i + "° client: " );
                        nome[i] = leia.nextLine();
                        
                         
                         System.out.println("-------Menu de Cardápio-------");
                         
                         // 1° MENU DE PRATOS
                         System.out.println("Pratos");
                         System.out.println("0. Vegetariano – R$ 50,00");   
                         System.out.println("1. Peixe – R$ 40,00"); 
                         System.out.println("2. Frango – R$ 50,00"); 
                         System.out.println("3. Carnes – R$ 80,00");
                         System.out.print("Digite o código do prato que deseja: ");
                         pratos[i] = leia.nextDouble();
                         
                         // TOTALIZANDO OS PRATOS
                         if(pratos[i] == 0){
                             total[i] += 50; 
                         }else if(pratos[i] == 1){
                             total[i] += 40;
                         }else if(pratos[i] == 2){
                             total[i] += 50;
                         }else if(pratos[i] == 3){
                             total[i] += 50;
                         }else{
                             System.out.println("Você digitou um código que não está presente no cardápio");
                         }
                         
                         
                         // SOBREMESAS
                         System.out.println("Sobremesa");
                         System.out.println("0. Bolo de Abacaxi – R$ 30,00");   
                         System.out.println("1. Sorvete diet – R$ 15,00"); 
                         System.out.println("2. Mouse diet – R$ 18,00"); 
                         System.out.println("3. Mouse chocolate – R$ 20,00");
                         System.out.print("Digite o código do prato que deseja: ");
                         sobre[i] = leia.nextDouble();
                         
                         
                         // TOTALIZANDO OS SOBREMESAS
                         if(sobre[i] == 0){
                             total[i] += 30; 
                         }else if(sobre[i] == 1){
                             total[i] += 15;
                         }else if(sobre[i] == 2){
                             total[i] += 18;
                         }else if(sobre[i] == 3){
                             total[i] += 20;
                         }else{
                             System.out.println("Você digitou um código que não está presente no cardápio");
                         }
                         
                         // BEBIDAS
                         System.out.println("Bebidas");
                         System.out.println("0. Chá – R$ 7,00");   
                         System.out.println("1. Suco de laranja – R$ 15,00"); 
                         System.out.println("2. Suco de melão – R$ 13,00"); 
                         System.out.println("3. Refrigerante diet – R$ 18,00");
                         System.out.print("Digite o código do prato que deseja: ");
                         sobre[i] = leia.nextDouble();
                         
                         // TOTALIZANDO OS BEBIDAS
                         if(sobre[i] == 0){
                             total[i] += 7; 
                         }else if(sobre[i] == 1){
                             total[i] += 15;
                         }else if(sobre[i] == 2){
                             total[i] += 13;
                         }else if(sobre[i] == 3){
                             total[i] += 18;
                         }else{
                             System.out.println("Você digitou um código que não está presente no cardápio");
                         }
                     }    
                            // RETORNO PARA ADICIONAR MAIS UM CLIENTE
                            System.out.println("Deseja adicionar mais algum cliente? [S]/[N]");
                            opClient = leia.nextLine();
                        
                     }
                     break;
                case 2://LISTAGEM
                    System.out.println("A lista dos nomes cadastrados: ");
                    for(int i =0; i < id.length; i++){
                        System.out.println(i + "." +nome[i]);
                    }
                    break;
                case 3://BUSCA
                    System.out.print("Digite o código de um cliente para buscar: ");
                    int busca = leia.nextInt();
                    System.out.println(nome[busca]);
                    break;
                    
                default:
                    System.out.println("Você digitou o código errado!");
                    break;
                    
            }
                
                
            }
            
         }
}
