package Stratego;


import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */



public class PantallaPrincipal extends javax.swing.JFrame {
    ArrayList<UsuariosInfo> listaUsuarios;
    ArrayList<LogsInfo> listaLogs;
    ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminados;
    
    //Atributos por Default de la Cuenta
    private boolean modoTutorial = true;

    public PantallaPrincipal(ArrayList<UsuariosInfo> listaUsuariosExterna, ArrayList<LogsInfo> listaLogsExterna, ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminadosExterna, boolean ModoJuego) {
        initComponents();
        
        inicializarListaUsuarios(listaUsuariosExterna);
        inicializarListaLogs(listaLogsExterna);
        inicializarListaUsuariosEliminados(listaUsuariosEliminadosExterna);
        
        //Pantalla al Centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1180, 626);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        XdeSalida = new javax.swing.JLabel();
        BotonLogIn = new javax.swing.JLabel();
        BotonCrearPlayer = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XdeSalida.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        XdeSalida.setForeground(new java.awt.Color(255, 0, 0));
        XdeSalida.setText("X");
        XdeSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XdeSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XdeSalidaMouseClicked(evt);
            }
        });
        jPanel2.add(XdeSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 10, 40, 40));

        BotonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/LogInBoton.png"))); // NOI18N
        BotonLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogIn.setMixingCutoutShape(null);
        BotonLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLogInMouseClicked(evt);
            }
        });
        jPanel2.add(BotonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 320, 80));

        BotonCrearPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonesCrearPlayer.png"))); // NOI18N
        BotonCrearPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrearPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearPlayerMouseClicked(evt);
            }
        });
        jPanel2.add(BotonCrearPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 340, 310, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/PantallaPrincipal (833 x 462 px).png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarListaUsuarios(ArrayList<UsuariosInfo> listaUsuariosExterna) {
        listaUsuarios = (listaUsuariosExterna == null) ? new ArrayList<>() : listaUsuariosExterna;

        /*
        if (listaUsuariosExterna==null) {
            // Agregar algunos usuarios predeterminados
            listaUsuarios.add(new UsuariosInfo("kris3", "kris3"));
            listaUsuarios.add(new UsuariosInfo("karla05", "12345"));
            listaUsuarios.add(new UsuariosInfo("lopez", "hola5"));
            listaUsuarios.add(new UsuariosInfo("a", "12345"));
        }
        */
    }
    
    private void inicializarListaLogs(ArrayList<LogsInfo> listaLogsExterna) {
        listaLogs = (listaLogsExterna == null) ? new ArrayList<>() : listaLogsExterna;
    }
    
    private void inicializarListaUsuariosEliminados(ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminadosExterna) {
        this.listaUsuariosEliminados = (listaUsuariosEliminadosExterna == null) ? new ArrayList<>() : listaUsuariosEliminadosExterna;

        /*
        if (listaUsuariosEliminadosExterna == null) {
            listaUsuariosEliminados.add(new UsuariosEliminadosInfo("kris3", "kris3"));
            listaUsuariosEliminados.add(new UsuariosEliminadosInfo("karla05", "12345"));
            listaUsuariosEliminados.add(new UsuariosEliminadosInfo("lopez", "hola5"));
        }

        //Verificar Lista
        StringBuilder historialUsuariosBuilder = new StringBuilder();
        for (UsuariosEliminadosInfo usuario : listaUsuariosEliminados) {
            historialUsuariosBuilder.append(usuario.getUsuariosEliminado());  // Corregir el método para obtener el usuario eliminado
            historialUsuariosBuilder.append("\n");
        }
        System.out.println(historialUsuariosBuilder.toString());
        */
    }
    
    private void XdeSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XdeSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XdeSalidaMouseClicked

    private void BotonLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLogInMouseClicked
        dispose();
        LogIn logIn = new LogIn(listaUsuarios, listaLogs, listaUsuariosEliminados, modoTutorial);
        logIn.setVisible(true);
    }//GEN-LAST:event_BotonLogInMouseClicked

    private void BotonCrearPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearPlayerMouseClicked
        dispose();
        CrearPlayer crearPlayer = new CrearPlayer(listaUsuarios, listaLogs,listaUsuariosEliminados, modoTutorial);
        crearPlayer.setVisible(true);
    }//GEN-LAST:event_BotonCrearPlayerMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal(null, null,null, true).setVisible(true);
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCrearPlayer;
    private javax.swing.JLabel BotonLogIn;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel XdeSalida;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
