package br.com.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br =  new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer ows = new OutputStreamWriter(fos);
        BufferedWriter bw =  new BufferedWriter(ows);

        String linha = br.readLine();

        while (linha != null && linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha =br.readLine();
        }

        br.close();
        bw.close();
    }
}
