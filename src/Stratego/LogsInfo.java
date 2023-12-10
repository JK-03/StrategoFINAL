package Stratego;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author jenniferbueso
 */
public class LogsInfo {
    String partidaTipoG, registroG, ganadorG;
    
    public LogsInfo(String Registro, String ganador){
        registroG=Registro;
        ganadorG=ganador;
    }

    public String getGanadorG() {
        return ganadorG;
    }

    public String getRegistroG() {
        return registroG;
    }

    public void setRegistroG(String registroG) {
        this.registroG = registroG;
    }

    public void setGanadorG(String ganadorG) {
        this.ganadorG = ganadorG;
    }
}
