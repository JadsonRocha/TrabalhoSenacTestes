/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 771000343
 */
public class Mensagem {
    public String buscaMensagem(int aleatorio) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("Mensagem.txt"));
        String linha = "";
        while (true) {
                if (linha != null) {
                        System.out.println(linha);

                } else
                        break;
                linha = buffRead.readLine();
        }
        buffRead.close();
        return linha;
    }
}
