package Telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
        
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        lblSaudacao.setText("Bem-vindo(a), " + usuario);
        if (cargo.equalsIgnoreCase("caixa") || (cargo.equalsIgnoreCase("balconista"))) {
            itmCadastrarProdutos.setEnabled(false);
            imtAlterarProdutos.setEnabled(false);
            itmExcluirProdutos.setEnabled(false);
            itmCadastrarFuncionarios.setEnabled(false);
            itmAlterarFuncionarios.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false);

        }
        barMenu.setBackground(new java.awt.Color(18, 18, 20));
        barMenu.setBorder(null);
        barMenu.setForeground(new java.awt.Color(255, 255, 255));
        barMenu.setFont(new java.awt.Font("SansSerif", 0, 15));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblPreço = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        imtAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatioriosFuncionarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlCadastrarProdutos.setLayout(null);

        lblCodigo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código: ");
        pnlCadastrarProdutos.add(lblCodigo);
        lblCodigo.setBounds(20, 30, 80, 60);

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome: ");
        pnlCadastrarProdutos.add(lblNome);
        lblNome.setBounds(20, 110, 80, 22);

        lblCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoria:");
        pnlCadastrarProdutos.add(lblCategoria);
        lblCategoria.setBounds(20, 170, 100, 22);

        lblPreço.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblPreço.setForeground(new java.awt.Color(255, 255, 255));
        lblPreço.setText("Preço:");
        pnlCadastrarProdutos.add(lblPreço);
        lblPreço.setBounds(20, 230, 56, 22);

        txtPreco.setBackground(new java.awt.Color(18, 18, 20));
        txtPreco.setForeground(new java.awt.Color(255, 255, 255));
        txtPreco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPreco.setBorder(null);
        txtPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoFocusLost(evt);
            }
        });
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtPreco);
        txtPreco.setBounds(120, 220, 210, 40);

        txtCategoria.setBackground(new java.awt.Color(18, 18, 20));
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCategoria.setBorder(null);
        txtCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusLost(evt);
            }
        });
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtCategoria);
        txtCategoria.setBounds(120, 160, 210, 40);

        txtNome.setBackground(new java.awt.Color(18, 18, 20));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setBorder(null);
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtNome);
        txtNome.setBounds(120, 100, 210, 40);

        txtCodigo.setBackground(new java.awt.Color(18, 18, 20));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setBorder(null);
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtCodigo);
        txtCodigo.setBounds(120, 40, 210, 40);

        btnSalvar.setBackground(new java.awt.Color(4, 211, 97));
        btnSalvar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnSalvar);
        btnSalvar.setBounds(30, 310, 192, 50);

        btnExcluir.setBackground(new java.awt.Color(4, 211, 97));
        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.setActionCommand("");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnExcluir);
        btnExcluir.setBounds(250, 310, 192, 50);

        btnAlterar.setBackground(new java.awt.Color(4, 211, 97));
        btnAlterar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(null);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnAlterar);
        btnAlterar.setBounds(470, 310, 190, 50);

        btnBuscar.setBackground(new java.awt.Color(4, 211, 97));
        btnBuscar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setActionCommand("");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnBuscar);
        btnBuscar.setBounds(360, 40, 192, 50);

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1024px-Black_flag.svg.png"))); // NOI18N
        pnlCadastrarProdutos.add(lblIcon1);
        lblIcon1.setBounds(-50, -40, 1140, 580);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(0, 0, 700, 420);

        lblSaudacao.setBackground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(440, 10, 270, 40);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/121214Background.png"))); // NOI18N
        getContentPane().add(lblIcon);
        lblIcon.setBounds(-60, -40, 1140, 580);

        barMenu.setBackground(new java.awt.Color(18, 18, 20));
        barMenu.setBorder(null);
        barMenu.setForeground(new java.awt.Color(255, 255, 255));
        barMenu.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N

        mnuProdutos.setMnemonic('p');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        itmCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro.png"))); // NOI18N
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        imtAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        imtAlterarProdutos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        imtAlterarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mudanca.png"))); // NOI18N
        imtAlterarProdutos.setText("Alterar");
        imtAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(imtAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        itmExcluirProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excluir.png"))); // NOI18N
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        itmRelatoriosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/relatorio-de-lucro.png"))); // NOI18N
        itmRelatoriosProdutos.setText("Relatorios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('f');
        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro.png"))); // NOI18N
        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mudanca.png"))); // NOI18N
        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excluir.png"))); // NOI18N
        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatioriosFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatioriosFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/relatorio-de-lucro.png"))); // NOI18N
        itmRelatioriosFuncionarios.setText("Relatorios");
        mnuFuncionarios.add(itmRelatioriosFuncionarios);

        barMenu.add(mnuFuncionarios);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(708, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imtAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtAlterarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnBuscar.setVisible(true);
        btnExcluir.setVisible(false);
        btnSalvar.setVisible(false);        
        btnAlterar.setVisible(false);
    }//GEN-LAST:event_imtAlterarProdutosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        pnlCadastrarProdutos.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed

        pnlCadastrarProdutos.setVisible(true);
        btnBuscar.setVisible(false);
        btnExcluir.setVisible(false);
        btnSalvar.setVisible(true);        
        btnAlterar.setVisible(false);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void txtPrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusGained
        txtPreco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));

    }//GEN-LAST:event_txtPrecoFocusGained

    private void txtPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusLost
        txtPreco.setBorder(null);

    }//GEN-LAST:event_txtPrecoFocusLost

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed

    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusGained
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));

    }//GEN-LAST:event_txtCategoriaFocusGained

    private void txtCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusLost
        txtCategoria.setBorder(null);

    }//GEN-LAST:event_txtCategoriaFocusLost

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed

    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));

    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setBorder(null);

    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188), new java.awt.Color(99, 59, 188)));

    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        txtCodigo.setBorder(null);

    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        

        
        if (txtCodigo.getText().equals("")){ 
            JOptionPane.showMessageDialog(null, "Preencha o código do produto");
            txtCodigo.requestFocus();
            return;
        }
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoPadaria", "root", "b9310u54");
            st = conexao.prepareStatement("SELECT * FROM produtos WHERE codigo = ?");
            st.setString(1, txtCodigo.getText());
            resultado = st.executeQuery();
            if (resultado.next()) {
                txtNome.setText(resultado.getString("nome"));
                txtCategoria.setText(resultado.getString("categoria"));
                txtPreco.setText(resultado.getString("preco"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
            } else { 
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
                txtCodigo.requestFocus();
            }            
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(btnBuscar, "Erro entre em contato com o administrador");
        } catch (SQLException ex) {
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(btnBuscar, "Este produto ja está cadastrado");
                } else {
                    JOptionPane.showMessageDialog(btnBuscar, "Erro número " + ex.getMessage() + "entre em contato com o administrador e informe o número do erro");
                    
                }

        }
     

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Connection conexao;
        PreparedStatement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoPadaria", "root", "b9310u54");
            st = conexao.prepareStatement("INSERT INTO produtos VALUES(?, ?, ?, ?)");
            st.setString(1, txtCodigo.getText().trim().toLowerCase());
            st.setString(2, txtNome.getText().trim().toLowerCase());
            st.setString(3, txtCategoria.getText().trim().toLowerCase());
            st.setString(4, txtPreco.getText().trim().toLowerCase());
            st.executeUpdate();
            JOptionPane.showMessageDialog(btnBuscar, "Produto cadastrado com sucesso!");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(btnBuscar, "Erro entre em contato com o administrador");
                    

        } catch (SQLException ex) {
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(btnBuscar, "Este produto ja está cadastrado");
                } else {
                    JOptionPane.showMessageDialog(btnBuscar, "Erro número " + ex.getMessage() + "entre em contato com o administrador e informe o número do erro");
                    
                }

        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnExcluir.setVisible(false);
        btnBuscar.setVisible(true);
        btnAlterar.setVisible(false);

    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Connection conexao;
        PreparedStatement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoPadaria", "root", "b9310u54");
            st = conexao.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
            st.setString(1, txtCodigo.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(btnBuscar, "Produto excluido com sucesso!");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(btnBuscar, "Erro entre em contato com o administrador");
                    

        } catch (SQLException ex) {
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(btnBuscar, "Este produto ja está cadastrado");
                } else {
                    JOptionPane.showMessageDialog(btnBuscar, "Erro número " + ex.getMessage() + "entre em contato com o administrador e informe o número do erro");
                    
                }

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnBuscar.setVisible(true);
        btnExcluir.setVisible(false);        
        btnAlterar.setVisible(false);

    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Connection conexao;
        PreparedStatement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoPadaria", "root", "b9310u54");
            st = conexao.prepareStatement("UPDATE produtos SET nome = ?, categoria = ?, preco = ? WHERE codigo = ? ");
            st.setString(1, txtNome.getText());            
            st.setString(2, txtCategoria.getText());            
            st.setString(3, txtPreco.getText());            
            st.setString(4, txtCodigo.getText());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(btnBuscar, "Erro entre em contato com o administrador");
                    

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(btnBuscar, "Erro número " + ex.getMessage() + "entre em contato com o administrador e informe o número do erro");
                
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem imtAlterarProdutos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmRelatioriosFuncionarios;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
