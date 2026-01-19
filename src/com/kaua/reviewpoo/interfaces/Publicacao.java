package com.kaua.reviewpoo.interfaces;

public interface Publicacao {
    void abrir();
    void fechar();
    void folhear(int qdtPag);
    void avancarPage();
    void voltarPage(int voltarPag);
}
