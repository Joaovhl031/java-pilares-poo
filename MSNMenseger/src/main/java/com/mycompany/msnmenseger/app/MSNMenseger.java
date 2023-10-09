/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.msnmenseger.app;

/**
 *
 * @author joaoh
 */
public class MSNMenseger extends ServicoPai {

    @Override
    public void enviarMensagem() {
        validarConctadoInterent();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

}
