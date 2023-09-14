/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author 771000343
 */
public class MensagemController {
    public String buscaMensagem(int aleatorio) throws IOException {
        //BufferedReader buffRead = new BufferedReader(new FileReader("Mensagem.txt"));
        String linha = Files.readAllLines(Paths.get("Mensagem.txt")).get(aleatorio);
        /*
        while (true) {
                if (linha != null) {
                        System.out.println(linha);

                } else
                        break;
                linha = buffRead.readLine();
        }
        buffRead.close();*/
        return linha;
    }
}
