package view;

import dao.CidadeDao;
import dao.ClienteDao;
import dao.DaoMestre;
import dao.EstadoDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Cliente;
import model.Endereco;
import model.Estado;
import model.Usuario;

public class IfrCliente extends javax.swing.JInternalFrame {

    private List<Estado> listaEstados = null;

    public IfrCliente() {
        initComponents();
        tfdId.setVisible(false);
        tfdIdEstado.setVisible(false);
        tfdIdCidade.setVisible(false);
        tfdIdEstado.setText("");
        this.listaEstados = EstadoDao.getInstance().pegarTodosEstados(jcbEstado);
        ClienteDao.popularTabela(tblCliente, "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbCliente = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfdId = new javax.swing.JTextField();
        bntCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<String>();
        jcbCidade = new javax.swing.JComboBox<String>();
        tfdIdCidade = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        jtfCpf = new javax.swing.JTextField();
        jtfdNome = new javax.swing.JTextField();
        jtfdTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdIdEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfRua = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jsNumero = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jpwSenha = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        nomePesquisa = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCancelarPesquisa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cepPesquisa = new javax.swing.JTextField();
        jcbStatusPesquisa = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();

        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        tfdId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdId.setEnabled(false);

        bntCancelar.setBackground(new java.awt.Color(255, 255, 255));
        bntCancelar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelarColorido.png"))); // NOI18N
        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/floppy-disk.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/id.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/email.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/folder.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/telephone.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/options.png"))); // NOI18N

        jcbStatus.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        jcbStatus.setBorder(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/australia.png"))); // NOI18N

        jcbEstado.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estado" }));
        jcbEstado.setBorder(null);
        jcbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbEstadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseReleased(evt);
            }
        });
        jcbEstado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseMoved(evt);
            }
        });
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        jcbEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbEstadoFocusLost(evt);
            }
        });

        jcbCidade.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cidade" }));
        jcbCidade.setBorder(null);
        jcbCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbCidadeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseReleased(evt);
            }
        });
        jcbCidade.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseMoved(evt);
            }
        });
        jcbCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbCidadeFocusLost(evt);
            }
        });

        tfdIdCidade.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdCidade.setEnabled(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Endereço");

        tfdEmail.setBackground(new java.awt.Color(0, 102, 255));
        tfdEmail.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tfdEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfdEmail.setText("Digite o e-mail do cliente");
        tfdEmail.setBorder(null);
        tfdEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdEmailFocusLost(evt);
            }
        });

        jtfCpf.setBackground(new java.awt.Color(0, 102, 255));
        jtfCpf.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfCpf.setForeground(new java.awt.Color(255, 255, 255));
        jtfCpf.setText("Digite o cpf do cliente");
        jtfCpf.setBorder(null);
        jtfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfActionPerformed(evt);
            }
        });
        jtfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCpfFocusLost(evt);
            }
        });

        jtfdNome.setBackground(new java.awt.Color(0, 102, 255));
        jtfdNome.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfdNome.setForeground(new java.awt.Color(255, 255, 255));
        jtfdNome.setText("Digite o nome do cliente");
        jtfdNome.setBorder(null);
        jtfdNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfdNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfdNomeFocusLost(evt);
            }
        });

        jtfdTelefone.setBackground(new java.awt.Color(0, 102, 255));
        jtfdTelefone.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfdTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jtfdTelefone.setText("Digite o telefone do cliente");
        jtfdTelefone.setBorder(null);
        jtfdTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfdTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfdTelefoneFocusLost(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/architecture-and-city.png"))); // NOI18N

        tfdIdEstado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdEstado.setEnabled(false);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Informações do Cliente");

        jtfRua.setBackground(new java.awt.Color(0, 102, 255));
        jtfRua.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfRua.setForeground(new java.awt.Color(255, 255, 255));
        jtfRua.setText("Rua do cliente");
        jtfRua.setBorder(null);
        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });
        jtfRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRuaFocusLost(evt);
            }
        });

        jsNumero.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jsNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        jsNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jsNumeroFocusGained(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/work-tools.png"))); // NOI18N

        jtfCep.setBackground(new java.awt.Color(0, 102, 255));
        jtfCep.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfCep.setForeground(new java.awt.Color(255, 255, 255));
        jtfCep.setText("Digite o cep do cliente");
        jtfCep.setBorder(null);
        jtfCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCepFocusLost(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/zip-code.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("|");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nº");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/password.png"))); // NOI18N

        jpwSenha.setBackground(new java.awt.Color(0, 102, 255));
        jpwSenha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jpwSenha.setForeground(new java.awt.Color(255, 255, 255));
        jpwSenha.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Senha");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("|");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator9)
                            .addComponent(jtfCep)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsNumero)))))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(tfdIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tfdIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jcbCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jsNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(7, 7, 7)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntCancelar)
                                    .addComponent(btnSalvar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jpwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel8.getAccessibleContext().setAccessibleDescription("");

        jtbCliente.addTab("Cadastro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome");

        tblCliente.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblCliente);

        nomePesquisa.setBackground(new java.awt.Color(0, 102, 255));
        nomePesquisa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        nomePesquisa.setForeground(new java.awt.Color(255, 255, 255));
        nomePesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/trash.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/edit.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/loupe.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnCancelarPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        btnCancelarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPesquisaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CEP");

        cepPesquisa.setBackground(new java.awt.Color(0, 102, 255));
        cepPesquisa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        cepPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        cepPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbStatusPesquisa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbStatusPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        jcbStatusPesquisa.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cepPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jcbStatusPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelarPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(16, 16, 16)
                        .addComponent(btnEditar))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cepPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbStatusPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel10))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jtbCliente.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbCliente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String id = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));
        ClienteDao.deletar(ClienteDao.getInstance().pegarClientePeloId(Integer.parseInt(id)));
        ClienteDao.popularTabela(tblCliente, nomePesquisa.getText(), cepPesquisa.getText(), "");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ClienteDao.popularTabela(tblCliente, nomePesquisa.getText(), cepPesquisa.getText(), String.valueOf(jcbStatusPesquisa.getSelectedItem()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String id = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));

        Cliente cliente = ClienteDao.getInstance().pegarClientePeloId(Integer.parseInt(id));

        if (cliente != null) {

            CidadeDao.getInstance().popularCidades(jcbCidade, cliente.getEndereco().getCidade().getEstado().getId());
            jtfCpf.setText(cliente.getCpf());
            tfdEmail.setText(cliente.getUsuario().getEmail());
            jtfdNome.setText(cliente.getNome());
            jtfdTelefone.setText(cliente.getTelefone());
            jcbStatus.setSelectedIndex(cliente.getUsuario().getStatus() == true ? 0 : 1);
            jcbEstado.setSelectedItem(cliente.getEndereco().getCidade().getEstado().getNome());
            jcbCidade.setSelectedItem(cliente.getEndereco().getCidade().getNome());
            jtfRua.setText(cliente.getEndereco().getRua());
            jsNumero.setValue(Integer.parseInt(cliente.getEndereco().getNumero()));
            jtfCep.setText(cliente.getEndereco().getCep());
            jpwSenha.setText(cliente.getUsuario().getSenha());
            tfdId.setText(String.valueOf(cliente.getId()));

            jtbCliente.setSelectedIndex(0);

        } else {
            System.out.println("erro na consulta");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Endereco e = new Endereco();
            Cliente c = new Cliente();
            Usuario u = new Usuario();

            u.setId(null);
            u.setEmail(tfdEmail.getText());
            u.setSenha(jpwSenha.getText());
            u.setStatus((jcbStatus.getSelectedItem() == "Ativo"));

            if (DaoMestre.getInstance().inserir(u)) {
                e.setId(null);
                e.setCep(jtfCep.getText());
                e.setNumero(String.valueOf(jsNumero.getValue()));
                e.setRua(jtfRua.getText());
                e.setCidade(CidadeDao.getInstance().pegarCidadePeloId(Integer.parseInt(tfdIdCidade.getText())));
                if (DaoMestre.getInstance().inserir(e)) {
                    c.setId(null);
                    c.setCpf(jtfCpf.getText());
                    c.setNome(jtfdNome.getText());
                    c.setTelefone(jtfdTelefone.getText());
                    c.setUsuario(u);
                    c.setEndereco(e);
                }
            }

            if (tfdId.getText().equals("") && DaoMestre.getInstance().inserir(c)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else {
                ClienteDao.getInstance().atualizarCliente(c, Integer.parseInt(tfdId.getText()));
                JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
            }

            jtfCpf.setText("Digite o cnpj do cliente");
            tfdEmail.setText("Digite o e-mail do cliente");
            jtfdNome.setText("Digite o nome do cliente");
            jtfdTelefone.setText("Digite o telefone do cliente");
            jcbStatus.setSelectedIndex(0);
            jcbEstado.addItem("Estado");
            jcbEstado.setSelectedItem("Estado");
            jcbCidade.removeAllItems();
            jcbCidade.addItem("Cidade");
            jcbCidade.setSelectedItem("Cidade");
            jtfRua.setText("Rua do cliente");
            jsNumero.setValue(0);
            jpwSenha.setText("");
            jtfCep.setText("Digite o cep do cliente");
            tfdId.setText("");

            ClienteDao.popularTabela(tblCliente, "", "", "");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void btnCancelarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPesquisaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarPesquisaActionPerformed

    private void tfdEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdEmailFocusGained
        if (tfdEmail.getText().equals("Digite o e-mail do cliente")) {
            tfdEmail.setText("");
        }
    }//GEN-LAST:event_tfdEmailFocusGained

    private void tfdEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdEmailFocusLost
        if (tfdEmail.getText().equals("")) {
            tfdEmail.setText("Digite o e-mail do cliente");
        }
    }//GEN-LAST:event_tfdEmailFocusLost

    private void jcbEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbEstadoFocusLost
        for (Estado estado : this.listaEstados) {
            if (jcbEstado.getSelectedItem().equals(estado.getNome())) {
                tfdIdEstado.setText(String.valueOf(estado.getId()));
            }
        }
        if (!tfdIdEstado.equals("")) {
            jcbCidade.removeAllItems();
            jcbCidade.addItem("Cidade");
            CidadeDao.getInstance().popularCidades(jcbCidade, Integer.parseInt(tfdIdEstado.getText()));
        }
    }//GEN-LAST:event_jcbEstadoFocusLost

    private void jcbCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbCidadeFocusGained

    }//GEN-LAST:event_jcbCidadeFocusGained

    private void jcbEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbEstadoFocusGained

    }//GEN-LAST:event_jcbEstadoFocusGained

    private void jtfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCpfFocusGained
        if (jtfCpf.getText().equals("Digite o cpf do cliente")) {
            jtfCpf.setText("");
        }
    }//GEN-LAST:event_jtfCpfFocusGained

    private void jtfCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCpfFocusLost
        if (jtfCpf.getText().equals("")) {
            jtfCpf.setText("Digite o cpf do cliente");
        }
    }//GEN-LAST:event_jtfCpfFocusLost

    private void jtfdNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdNomeFocusGained
        if (jtfdNome.getText().equals("Digite o nome do cliente")) {
            jtfdNome.setText("");
        }
    }//GEN-LAST:event_jtfdNomeFocusGained

    private void jtfdNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdNomeFocusLost
        if (jtfdNome.getText().equals("")) {
            jtfdNome.setText("Digite o nome do cliente");
        }
    }//GEN-LAST:event_jtfdNomeFocusLost

    private void jtfdTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdTelefoneFocusGained
        if (jtfdTelefone.getText().equals("Digite o telefone do cliente")) {
            jtfdTelefone.setText("");
        }
    }//GEN-LAST:event_jtfdTelefoneFocusGained

    private void jtfdTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdTelefoneFocusLost
        if (jtfdTelefone.getText().equals("")) {
            jtfdTelefone.setText("Digite o telefone do cliente");
        }
    }//GEN-LAST:event_jtfdTelefoneFocusLost

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed

    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jcbEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseClicked

    }//GEN-LAST:event_jcbEstadoMouseClicked

    private void jcbEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseExited
        if (!jcbEstado.getSelectedItem().equals("Estado")) {
            jcbEstado.removeItem("Estado");
        }
    }//GEN-LAST:event_jcbEstadoMouseExited

    private void jcbCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseClicked

    }//GEN-LAST:event_jcbCidadeMouseClicked

    private void jcbEstadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseReleased

    }//GEN-LAST:event_jcbEstadoMouseReleased

    private void jcbCidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseExited

    }//GEN-LAST:event_jcbCidadeMouseExited

    private void jcbCidadeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseMoved

    }//GEN-LAST:event_jcbCidadeMouseMoved

    private void jcbCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbCidadeFocusLost

    }//GEN-LAST:event_jcbCidadeFocusLost

    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed

    }//GEN-LAST:event_jtfRuaActionPerformed

    private void jsNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsNumeroFocusGained

    }//GEN-LAST:event_jsNumeroFocusGained

    private void jcbEstadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseMoved

    }//GEN-LAST:event_jcbEstadoMouseMoved

    private void jcbEstadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseDragged

    }//GEN-LAST:event_jcbEstadoMouseDragged

    private void jcbEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMousePressed

    }//GEN-LAST:event_jcbEstadoMousePressed

    private void jtfRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRuaFocusGained
        if (jtfRua.getText().equals("Rua do cliente")) {
            jtfRua.setText("");
        }
    }//GEN-LAST:event_jtfRuaFocusGained

    private void jtfRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRuaFocusLost
        if (jtfRua.getText().equals("")) {
            jtfRua.setText("Rua do cliente");
        }
    }//GEN-LAST:event_jtfRuaFocusLost

    private void jtfCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCepFocusGained
        if (jtfCep.getText().equals("Digite o cep do cliente")) {
            jtfCep.setText("");
        }
    }//GEN-LAST:event_jtfCepFocusGained

    private void jtfCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCepFocusLost
        if (jtfCep.getText().equals("")) {
            jtfCep.setText("Digite o cep do cliente");
        }
    }//GEN-LAST:event_jtfCepFocusLost

    private void jcbCidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseReleased

    }//GEN-LAST:event_jcbCidadeMouseReleased

    private void jcbCidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMousePressed

    }//GEN-LAST:event_jcbCidadeMousePressed

    private void jcbCidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseEntered

    }//GEN-LAST:event_jcbCidadeMouseEntered

    private void jcbCidadeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseDragged

    }//GEN-LAST:event_jcbCidadeMouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (!jcbCidade.getSelectedItem().equals("Cidade")) {
            jcbCidade.removeItem("Cidade");
            for (Cidade cidade : CidadeDao.getInstance().pegarTodasCidades()) {
                if (jcbCidade.getSelectedItem().equals(cidade.getNome())) {
                    tfdIdCidade.setText(String.valueOf(cidade.getId()));
                }
            }
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jtfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnCancelarPesquisa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cepPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JComboBox jcbStatusPesquisa;
    private javax.swing.JPasswordField jpwSenha;
    private javax.swing.JSpinner jsNumero;
    private javax.swing.JTabbedPane jtbCliente;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfdNome;
    private javax.swing.JTextField jtfdTelefone;
    private javax.swing.JTextField nomePesquisa;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdIdCidade;
    private javax.swing.JTextField tfdIdEstado;
    // End of variables declaration//GEN-END:variables
}
