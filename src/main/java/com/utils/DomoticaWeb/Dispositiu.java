package com.utils.DomoticaWeb;

public class Dispositiu {
    int identificador;
    String descripcio;
    int Status;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
    public Dispositiu() {
        setDescripcio("");
        setIdentificador(0);
        setStatus(0);
    }
}
