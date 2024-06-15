package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int tamanho = sc.nextInt();
        
        double menorAltura = Double.MAX_VALUE, maiorAltura = Double.MIN_VALUE;
        
        Pessoa[] vectorPerson = new Pessoa[tamanho];
        double[] vectorAltura = new double[tamanho];
        double[] vetAltFem = new double[tamanho];
        
        int qtdeMas = 0;
        int qtdeFem = 0;
        
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            double altura = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha
            System.out.printf("Genero da %dª pessoa: ", i + 1);
            String genero = sc.nextLine();
            
            vectorPerson[i] = new Pessoa(altura, genero);
            
            if(genero.equalsIgnoreCase("Feminino")) {
                vetAltFem[qtdeFem] = vectorPerson[i].getAltura(); 
                qtdeFem++;
            } else {
                qtdeMas++;
            }
            
            vectorAltura[i] = vectorPerson[i].getAltura();
            if(vectorAltura[i] < menorAltura) {
                menorAltura = vectorAltura[i];
            }
            if(vectorAltura[i] > maiorAltura) {
                maiorAltura = vectorAltura[i];
            }
        }
        
        double somaAltFem = 0.0;
        for(int i = 0; i < qtdeFem; i++) {
            somaAltFem += vetAltFem[i];
        }
        
        double mediaAltFem = (qtdeFem > 0) ? somaAltFem / qtdeFem : 0.0;
        
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media de altura das mulheres: %.2f\n", mediaAltFem);
        System.out.println("Numero de homens: " + qtdeMas);
        
        sc.close();
    }
}
