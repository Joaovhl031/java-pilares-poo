/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fabricaimpressoras;

import com.mycompany.fabricaimpressoras.impressora.Impressora;
import com.mycompany.fabricaimpressoras.copiadora.Copiadora;
import com.mycompany.fabricaimpressoras.digitalizadora.Digitalizadoraa;
import com.mycompany.fabricaimpressoras.multifuncional.Multifuncional;

/**
 *
 * @author joaoh
 */
public class FabricaImpressoras {

    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();
        Impressora impressora = em;
        Digitalizadoraa digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimr();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
