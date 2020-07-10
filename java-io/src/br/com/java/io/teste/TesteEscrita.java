package br.com.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer ows = new OutputStreamWriter(fos);
        BufferedWriter bw =  new BufferedWriter(ows);

        bw.write("arquivo reescrito");
        bw.newLine();

        bw.close();
    }
}
