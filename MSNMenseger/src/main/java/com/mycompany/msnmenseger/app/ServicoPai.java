/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.msnmenseger.app;

/**
 *
 * @author joaoh
 */
public abstract class ServicoPai {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConctadoInterent() {
        System.out.println("validando Conexão");
    }

}
