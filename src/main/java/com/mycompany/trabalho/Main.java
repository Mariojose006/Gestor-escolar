/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;

import com.mycompany.trabalho.adm.Administrador;
import entidades.Arquivo;

/**
 *
 * @author adrian
 */
public class Main {
    public static void main(String[] args) {
        Administrador adm1 = new Administrador("mario", "mario@adm.ufjf.br", "3265585412", "ADMmario", "mario");
        Arquivo.escreverArquivo("./dadosAdministrador.txt", adm1.toJSON());
    }
}
