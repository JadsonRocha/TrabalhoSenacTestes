/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomensagemsenac;


import Model.Mensagem;
import java.io.IOException;
import javax.swing.JFrame;
import Views.Tela;


/**
 *
 * @author 182210124
 */
public class TrabalhoMensagemSenac {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

    }
   
}
