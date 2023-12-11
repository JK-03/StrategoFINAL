package Stratego;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class UsuariosInfo {

    String usuarioG, contraG;
    int puntos, partidasVillanos=0, partidasHeroes = 0;
    boolean Activo=true;

    public UsuariosInfo(String usuario, String contra) {
        usuarioG = usuario;
        contraG = contra;
    }

    public String getUsuarioG() {
        return usuarioG;
    }

    public String getContraG() {
        return contraG;
    }

    public void setContraG(String contraG) {
        this.contraG = contraG;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidasVillanos() {
        return partidasVillanos;
    }

    public void setPartidasVillanos(int partidasVillanos) {
        this.partidasVillanos = partidasVillanos;
    }

    public int getPartidasHeroes() {
        return partidasHeroes;
    }

    public void setPartidasHeroes(int partidasHeroes) {
        this.partidasHeroes = partidasHeroes;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
}