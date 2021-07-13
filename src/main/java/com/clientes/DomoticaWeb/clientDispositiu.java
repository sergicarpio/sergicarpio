package com.clientes.DomoticaWeb;

import com.utils.DomoticaWeb.Dispositiu;

public class clientDispositiu {
    public static void main(String[] args) {
        Dispositiu nestCam;
        nestCam = new Dispositiu();
        nestCam.setIdentificador(1);
        nestCam.setDescripcio("CamaraProjector");
        nestCam.setStatus(0);
        System.out.println(nestCam.getIdentificador()+nestCam.getDescripcio()+nestCam.getDescripcio());
    }
}
