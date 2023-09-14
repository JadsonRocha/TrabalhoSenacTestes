/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author 771000343
 */
public class Mensagem {
    public String buscaMensagem(int aleatorio) throws IOException {
        String linha = Files.readAllLines(Paths.get("mensagens.txt")).get(aleatorio);
        return linha;
    }
}
