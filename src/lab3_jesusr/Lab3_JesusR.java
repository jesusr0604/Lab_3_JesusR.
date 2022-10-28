package lab3_jesusr;

import java.util.Scanner;

public class Lab3_JesusR {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Opcion;
        do {
            System.out.println("1<- DIPTONGO!");
            System.out.println("2<- Sumatoria ");
            System.out.println("3<- Figura");
            System.out.println("0<- salida");
            Opcion = leer.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("Iniciando DIPTONGO!");
                    String Palabra;
                    System.out.println("Ingrese una palabra: ");
                    Palabra = leer.next().toLowerCase();
                    int cont = 0;
                    for (int i = 0; i < Palabra.length(); i++) {
                        String letra = "";
                        letra += Palabra.charAt(i);
                        switch (letra) {
                            case "a":
                            case "e":
                            case "i":
                            case "o":
                            case "u":
                                cont++;
                                break;
                            default:
                                cont = 0;

                                break;
                        }//fin Switch
                        if (cont == 2) {
                            break;
                        }
                        letra = "";
                    }//fin for
                    System.out.println(cont);
                    if (cont == 2) {
                        System.out.println("Es Diptongo");
                    }//fin cont
                    else {
                        System.out.println("No es diptongo");
                    }//fin else
                    break;
                case 2:
                    System.out.println("Iniciando sumatoria...");
                    int N;
                    double Tot = 0;
                    System.out.println("Ingrese un numero: ");
                    N = leer.nextInt();
                    for (int i = 0; i < N; i++) {
                        double M1, M2, Sum;
                        M1 = -1;
                        double M3 = Math.pow(M1, i);
                        Sum = (2 * i) + 1;
                        double Div = M3 / Sum;
                        double M4 = 4 * Div;
                        Tot += M4;

                    }//fin while
                    System.out.println("Resultado: " + Tot);
                    break;
                case 3:
                    System.out.println("Iniciando Figura");
                    int Num;
                    System.out.print("Ingrese un numero impar: ");
                    Num = leer.nextInt();
                    int div = Num % 2;
                    if (div != 0) {
                        for(int i =0;i<(Num+1)/2;i++){
                            for(int j =0;j<Num;j++){
                                if(j>=i && j<Num-i){
                                    System.out.print("*");
                                }else
                                {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("");
                        }
                       

      
                    int filamed=((Num+1)/2)-1;
                   for (int i = 2; i <=(Num+1)/2; i++) {
                        //System.out.print(" ");
                        for (int s = 0; s < Num ; s++) {
                            if(s==filamed||(s>filamed-i&&s<filamed+i)){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                          
                        }//fin for
                       
                        System.out.println("");
                    }//fin for      

            }//fin if

            break;
            
            case 0:
              System.out.println("Saliendo...");

        }//fin switch

        }  while(Opcion!=0);//fin switch  
            
        }//main                    
                
    }//fin
    

