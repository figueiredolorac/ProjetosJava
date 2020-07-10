package br.com.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer ows = new OutputStreamWriter(fos);
        //BufferedWriter bw =  new BufferedWriter(ows);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Arquivo lido");
        bw.newLine();
        bw.newLine();
        bw.write("arquivo reescrito");

        bw.close();
    }
}
