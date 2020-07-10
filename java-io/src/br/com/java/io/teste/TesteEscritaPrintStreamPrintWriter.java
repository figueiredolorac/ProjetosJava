package br.com.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer ows = new OutputStreamWriter(fos);
        //BufferedWriter bw =  new BufferedWriter(ows);
        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        //PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Arquivo lido");
        ps.println();
        ps.println("arquivo reescrito");

        ps.close();
    }
}
