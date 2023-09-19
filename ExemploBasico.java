public class ExemploBasico{
   public static void main(String[] args) {
    //repetição controlada por contador

    // int cont = 1;

    // while(cont <= 3){
    //     System.out.print(cont);
    //     cont = cont + 1;

    // }
    
    // for(int cont = 1; cont <= 3; cont = cont + 1){
    //     System.out.print(cont);

    // }

        int cont = 1;
        do{
            // %d é um placeholder
          System.out.printf("valor da vez: %d.\n ", cont); 
          cont += 1; //cont = cont + 1;
        }while(cont <= 3);

   } 
}