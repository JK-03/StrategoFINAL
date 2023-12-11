package Stratego;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author jenniferbueso
 */
public class MiPerfil extends javax.swing.JFrame {
    ArrayList<UsuariosInfo> listaUsuarios;
    ArrayList<LogsInfo> listaLogs;
    ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminados;
    
    //Atributos por Default de la Cuenta
    private boolean modoTutorial = true;
    
    //Atributos de Mostrar
    String usuarioGPerfil;
    int puntos, partidasVillanos, partidasHeroes;
    
    /**
     * Creates new form MiPerfil
     */
    public MiPerfil(ArrayList<UsuariosInfo> listaUsuariosExterna, ArrayList<LogsInfo> listaLogsExterna, String nombreUsuario, ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminadosExterna, boolean ModoJuego) {

        // Asignar valores a las variables de instancia
        usuarioGPerfil = nombreUsuario;
        this.listaUsuarios = listaUsuariosExterna;
        this.listaLogs = listaLogsExterna;
        this.listaUsuariosEliminados = listaUsuariosEliminadosExterna;
        this.modoTutorial = ModoJuego;

        // Iterar sobre la lista de usuarios para obtener información del usuario actual
        for (int i = 0; i < listaUsuarios.size(); i++) {
            // Verificar si el usuario actual coincide con el nombre de usuario proporcionado
            if (this.listaUsuarios.get(i).getUsuarioG().equals(usuarioGPerfil)) {
                puntos = this.listaUsuarios.get(i).getPuntos();
            }

            // Asignar partidas de héroes y villanos del usuario actual a las variables de instancia correspondientes
            partidasHeroes = this.listaUsuarios.get(i).getPartidasHeroes();
            partidasVillanos = this.listaUsuarios.get(i).getPartidasVillanos();
        }
        
        initComponents();
        
        //Centrar Ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1180, 626);
        setLocationRelativeTo(null);
        setVisible(true);
        
        //Asignar Valores Correspondientes para Salida de Pantalla
        UsernameLabel.setText(nombreUsuario);
        PartidasHeroesLabel.setText(Integer.toString(partidasHeroes));
        PartidasVillanosLabel.setText(Integer.toString(partidasVillanos));
        PuntosJugador.setText(Integer.toString(puntos));
        
        //Verificar Lista
        StringBuilder historialUsuariosBuilder = new StringBuilder();
        for (UsuariosEliminadosInfo usuario : listaUsuariosEliminados) {
            historialUsuariosBuilder.append(usuario.getUsuariosEliminado());  // Corregir el método para obtener el usuario eliminado
            historialUsuariosBuilder.append("\n");
        }
        System.out.println(historialUsuariosBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonCambiarPassword = new javax.swing.JLabel();
        BotonEliminarMiCuenta = new javax.swing.JLabel();
        BotonLogs = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PartidasHeroesLabel = new javax.swing.JLabel();
        PartidasVillanosLabel = new javax.swing.JLabel();
        PuntosJugador = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCambiarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonCambiarPassword.png"))); // NOI18N
        BotonCambiarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCambiarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCambiarPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCambiarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        BotonEliminarMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonEliminarMiCuenta.png"))); // NOI18N
        BotonEliminarMiCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMiCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(BotonEliminarMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 270, -1));

        BotonLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonLogs.png"))); // NOI18N
        BotonLogs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLogsMouseClicked(evt);
            }
        });
        jPanel1.add(BotonLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonRegresar.png"))); // NOI18N
        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 70, -1, -1));

        UsernameLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        UsernameLabel.setText("Username");
        jPanel1.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 239, 320, -1));

        PartidasHeroesLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        PartidasHeroesLabel.setText("Heroes");
        jPanel1.add(PartidasHeroesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 287, 220, -1));

        PartidasVillanosLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        PartidasVillanosLabel.setText("Villanos");
        jPanel1.add(PartidasVillanosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 334, 270, -1));

        PuntosJugador.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        PuntosJugador.setText("Puntos");
        jPanel1.add(PuntosJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 383, 310, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/MiPerfil.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal(this.listaUsuarios,this.listaLogs, usuarioGPerfil,this.listaUsuariosEliminados,modoTutorial);
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonCambiarPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCambiarPasswordMouseClicked
        // Solicitar la contraseña actual al usuario
        String contraActual = JOptionPane.showInputDialog(null, "Ingrese la contraseña actual:");

        // Buscar el usuario actual en la lista
        UsuariosInfo usuarioActual = buscarUsuario(usuarioGPerfil);

        // Verificar si se encontró el usuario
        if (usuarioActual != null) {
            // Verificar si la contraseña actual coincide con la almacenada
            if (usuarioActual.getContraG().equals(contraActual)) {
                // Solicitar y validar la nueva contraseña
                String contraNueva = solicitarNuevaContraseña();

                // Actualizar la contraseña del usuario en la lista
                usuarioActual.setContraG(contraNueva);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog( null,"¡Contraseña actualizada con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar mensaje si la contraseña actual es incorrecta
                JOptionPane.showMessageDialog( null, "Contraseña incorrecta. Intente nuevamente.", "Error",  JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar mensaje si no se encuentra el usuario
            JOptionPane.showMessageDialog(  null,"Error: Usuario no encontrado.", "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonCambiarPasswordMouseClicked
    
    // Método para buscar un usuario en la lista
    private UsuariosInfo buscarUsuario(String nombreUsuario) {
        for (UsuariosInfo usuario : listaUsuarios) {
            if (usuario.getUsuarioG().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;  // Usuario no encontrado
    }

    // Método para solicitar y validar una nueva contraseña
    private String solicitarNuevaContraseña() {
        String contraNueva;
        do {
            // Solicitar la nueva contraseña al usuario
            contraNueva = JOptionPane.showInputDialog(null, "Ingrese la nueva contraseña: ");

            // Verificar si la longitud de la contraseña es diferente de 5 caracteres
            if (contraNueva.length() != 5) {
                JOptionPane.showMessageDialog(null, "Contraseña inválida, ingrese una de 5 caracteres");
            }
        } while (contraNueva.length() != 5);  // Repetir hasta que la contraseña sea válida

        return contraNueva;
    }
    
    private void BotonEliminarMiCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMiCuentaMouseClicked
       // Variable para verificar si se encontró y eliminó el usuario
        boolean usuarioEliminado = false;

        // Solicitar la contraseña actual al usuario
        String contraActual = JOptionPane.showInputDialog(null, "Ingrese la contraseña actual:");
         // Buscar el usuario actual en la lista
        UsuariosInfo usuarioActual = buscarUsuario(usuarioGPerfil);
        
        // Verificar si se encontró el usuario
        if (usuarioActual != null) {
            
            if (usuarioActual.getContraG().equals(contraActual)) {
                // Iterar sobre la lista de usuarios
                for (int indice = 0; indice < listaUsuarios.size(); indice++) {
                    // Verificar si el usuario actual coincide con el usuario del perfil
                    if (this.listaUsuarios.get(indice).getUsuarioG().equals(this.usuarioGPerfil)) {
                        // Eliminar el usuario del perfil
                        this.listaUsuarios.remove(indice);
                        usuarioEliminado = true;
                        break;  // Salir del bucle después de eliminar el usuario
                    }
                }

                // Verificar si se encontró y eliminó el usuario
                if (usuarioEliminado) {
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(null, "¡Usuario Eliminado con éxito!", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                    // Crear una nueva instancia de PantallaPrincipal
                    PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(this.listaUsuarios, this.listaLogs, this.listaUsuariosEliminados,modoTutorial);
                    pantallaPrincipal.setVisible(true);
                    this.setVisible(false);

                    } else {
                        // Mostrar mensaje si el usuario no fue encontrado
                        JOptionPane.showMessageDialog(null, "Error: Usuario no encontrado.", "Error de Eliminación", JOptionPane.ERROR_MESSAGE);
                    }
            } else {
             // Mostrar mensaje si la contraseña actual es incorrecta
             JOptionPane.showMessageDialog( null, "Contraseña incorrecta. Intente nuevamente.", "Error",  JOptionPane.ERROR_MESSAGE);
            }
        } else {
         // Mostrar mensaje si no se encuentra el usuario
         JOptionPane.showMessageDialog(  null,"Error: Usuario no encontrado.", "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonEliminarMiCuentaMouseClicked

    private void BotonLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLogsMouseClicked
        PantallaLogs logs = new PantallaLogs(this.listaUsuarios, this.listaLogs, usuarioGPerfil, this.listaUsuariosEliminados, modoTutorial);
        logs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonLogsMouseClicked

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
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPerfil(null,null,null,null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCambiarPassword;
    private javax.swing.JLabel BotonEliminarMiCuenta;
    private javax.swing.JLabel BotonLogs;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel PartidasHeroesLabel;
    private javax.swing.JLabel PartidasVillanosLabel;
    private javax.swing.JLabel PuntosJugador;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
