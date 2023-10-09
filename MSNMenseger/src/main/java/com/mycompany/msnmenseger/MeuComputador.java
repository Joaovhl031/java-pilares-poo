/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.msnmenseger;
import com.mycompany.msnmenseger.app.FacebookMessenger;
import com.mycompany.msnmenseger.app.MSNMenseger;
import com.mycompany.msnmenseger.app.Telegram;
import com.mycompany.msnmenseger.app.ServicoPai;

/**
 *
 * @author joaoh
 */
public class MeuComputador {

    public static void main(String[] args) {
        ServicoPai sMsn = null;
        
        //escolhendo um app
        String appEscolhido="msn";
        
        if(appEscolhido.equals("msn"))
           sMsn = new MSNMenseger();
        else if(appEscolhido.equals("fcb"))
            sMsn = new FacebookMessenger();
        else if(appEscolhido.equals("tel"))
            sMsn = new Telegram();
        
        sMsn.receberMensagem();
        sMsn.enviarMensagem();
        
    }

}
