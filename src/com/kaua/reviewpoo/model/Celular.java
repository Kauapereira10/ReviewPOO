package com.kaua.reviewpoo.model;

import com.kaua.reviewpoo.interfaces.CelularInterface;

public class Celular implements CelularInterface {

    private int volume;
    private boolean ligado;
    private int volumeAnterior;

    private static final int VOLUME_MAX = 10;
    private static final int VOLUME_MIN = 0;
    private static final int VOLUME_PADRAO = 5;

    public Celular() {
        this.volume = VOLUME_PADRAO;
        this.ligado = false;
    }

    public Celular(boolean ligado, int volume) {
        this.ligado = ligado;
        setVolume(volume);
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    private void setVolume(int volume) {
        if (volume >= VOLUME_MIN && volume <= VOLUME_MAX) {
            this.volume = volume;
        }
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void abrirMenu() {
        if (!ligado) {
            System.out.println("Celular desligado. Não é possível abrir o menu.");
            return;
        }

        System.out.println("------ MENU ------");
        System.out.println("Ligado: " + ligado);
        System.out.println("Volume: " + volume);
    }

    @Override
    public void fecharMenu() {
        if (ligado) {
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void ligar() {
        if (!ligado) {
            setLigado(true);
            System.out.println("Celular ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            setLigado(false);
            System.out.println("Celular desligado.");
        }
    }

    @Override
    public void reiniciar() {
        if (ligado) {
            System.out.println("Reiniciando celular...");
            desligar();
            ligar();
        }
    }

    @Override
    public void aumentarVolume() {
        if (ligado && volume < VOLUME_MAX) {
            setVolume(volume + 1);
            System.out.println("Volume [" + volume + "]");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado && volume > VOLUME_MIN) {
            setVolume(volume - 1);
            System.out.println("Volume [" + volume + "]");
        }
    }

    @Override
    public void ligarMudo() {
        if (ligado && volume > VOLUME_MIN) {
            volumeAnterior = volume;
            setVolume(VOLUME_MIN);
            System.out.println("Celular está no mudo.");
        }
    }

    @Override
    public void desligarMudo() {
        if (ligado && volume == VOLUME_MIN) {
            setVolume(volumeAnterior);
            System.out.println("Mudo desativado.");
        }
    }
}
