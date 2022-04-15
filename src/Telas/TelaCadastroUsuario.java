
package Telas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaCadastroUsuario extends javax.swing.JFrame {

    
  
      public TelaCadastroUsuario() {
          initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        lblRepitaSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtRepitaSenha = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Usuários");
        setBackground(new java.awt.Color(221, 221, 221));
        setSize(new java.awt.Dimension(522, 308));
        getContentPane().setLayout(null);

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 80, 100, 40);

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário: ");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 20, 100, 40);

        lblCargo.setBackground(new java.awt.Color(255, 255, 255));
        lblCargo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(20, 200, 100, 40);

        btnSalvar.setBackground(new java.awt.Color(4, 211, 97));
        btnSalvar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 290, 120, 50);

        cmbCargo.setBackground(new java.awt.Color(18, 18, 20));
        cmbCargo.setForeground(new java.awt.Color(255, 255, 255));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Caixa", "Balconista" }));
        cmbCargo.setBorder(null);
        cmbCargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCargoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCargoFocusLost(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(180, 200, 210, 40);

        lblRepitaSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblRepitaSenha.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblRepitaSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblRepitaSenha.setText("Repita a senha: ");
        getContentPane().add(lblRepitaSenha);
        lblRepitaSenha.setBounds(20, 140, 160, 40);

        txtUsuario.setBackground(new java.awt.Color(18, 18, 20));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 20, 210, 40);

        txtRepitaSenha.setBackground(new java.awt.Color(18, 18, 20));
        txtRepitaSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtRepitaSenha.setBorder(null);
        txtRepitaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRepitaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRepitaSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepitaSenhaFocusLost(evt);
            }
        });
        txtRepitaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepitaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRepitaSenha);
        txtRepitaSenha.setBounds(180, 140, 210, 40);

        txtSenha.setBackground(new java.awt.Color(18, 18, 20));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 80, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1024px-Black_flag.svg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, -70, 590, 490);

        setSize(new java.awt.Dimension(523, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        
        try {
            dispose();
            // Banco de dados
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoPadaria", "root", "b9310u54");
            if (txtSenha.getText().equals(txtRepitaSenha.getText())) {
                st = conexao.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?)");
                st.setString(1, txtUsuario.getText().trim().toLowerCase());
                st.setString(2, txtSenha.getText().trim().toLowerCase());
                st.setString(3, cmbCargo.getSelectedItem().toString());
                st.executeUpdate(); //Executa o comando INSERT
                JOptionPane.showMessageDialog(btnSalvar, "Dados salvos com sucesso");
                txtUsuario.setText("");
                txtSenha.setText("");
                txtRepitaSenha.setText("");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem");
                txtSenha.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnSalvar, "Você não tem o driver na biblioteca!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnSalvar, "Algum parametro do banco de dados está incorreto");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtRepitaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepitaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepitaSenhaActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));
                // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        txtSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));
                // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtRepitaSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepitaSenhaFocusGained
        txtRepitaSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));
                // TODO add your handling code here:
    }//GEN-LAST:event_txtRepitaSenhaFocusGained

    private void cmbCargoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCargoFocusGained
        cmbCargo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));
                // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        txtUsuario.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        txtSenha.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtRepitaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepitaSenhaFocusLost
        txtRepitaSenha.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepitaSenhaFocusLost

    private void cmbCargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCargoFocusLost
        cmbCargo.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoFocusLost

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtRepitaSenha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
