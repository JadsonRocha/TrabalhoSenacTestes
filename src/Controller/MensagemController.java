/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Mensagem;
import java.util.Random;
import java.io.IOException;
/**
 *
 * @author 771000343
 */
public class MensagemController {
    public String buscaMensagem() throws IOException {
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(8);
        Mensagem m=new Mensagem();
        return m.buscaMensagem(aleatorio);
    }
}
