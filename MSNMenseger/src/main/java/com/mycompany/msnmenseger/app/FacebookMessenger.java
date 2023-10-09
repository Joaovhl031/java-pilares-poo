/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.msnmenseger.app;

/**
 *
 * @author joaoh
 */
public class FacebookMessenger extends ServicoPai {

    @Override
    public void enviarMensagem() {
        validarConctadoInterent();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
