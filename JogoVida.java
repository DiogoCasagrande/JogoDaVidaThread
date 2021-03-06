package JogoDaVida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class JogoVida {

    static int contLive;
    static int nGeracoes;
    static int m;
    static int[][] matrizA;
    static int[][] matrizB;
    static Scanner entrada;

    static ThreadMatriz threads[];

    public static void main(String[] args) throws InterruptedException{
        //entrada (.txt + quantidade de geracoes)
        try {
            Input(args[0]);

            nGeracoes = Integer.parseInt(args[1]);
            LoadMatriz();

            for (int i = 0; i < nGeracoes; i++) {

                //quebrar matriz e passar as partes como parametro.
                threads[0].start(X);
                threads[1].start(X);
                
                threads[0].join();
                threads[1].join();
            }
            
            //metodo pra concatenar a matriz.
            //concat();
            
            Write();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado, favor tentar novamente :)");
        }
    }

    static void Input(String txt) throws FileNotFoundException {
        entrada = new Scanner(new File(txt));

        m = Integer.parseInt(entrada.nextLine());

        matrizA = new int[m][m];
        matrizB = new int[m][m];
        contLive = 0;
    }

    private static void LoadMatriz() {
        String[] temp = new String[matrizA.length];

        for (int i = 0; i < matrizA.length; i++) {
            temp[i] = entrada.nextLine();
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = Character.getNumericValue(temp[i].charAt(j));
            }
        }
    }

    private static void Write() throws FileNotFoundException {
        PrintStream destino = new PrintStream("result.txt");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                destino.print(matrizA[i][j]);
            }
            destino.println();
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
