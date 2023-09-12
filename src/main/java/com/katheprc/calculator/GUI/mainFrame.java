package com.katheprc.calculator.GUI;

/**
 *
 * @author KathePrc
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        visor.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cButton = new javax.swing.JButton();
        n9Button = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        moduleButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        n8Button = new javax.swing.JButton();
        n7Button = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        n6Button = new javax.swing.JButton();
        n5Button = new javax.swing.JButton();
        n4Button = new javax.swing.JButton();
        n3Button = new javax.swing.JButton();
        n1button = new javax.swing.JButton();
        n2Button = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        puntoButton = new javax.swing.JButton();
        n0Button = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        x2Button = new javax.swing.JButton();
        x3Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        visor = new javax.swing.JTextField();
        history = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        cButton.setBackground(new java.awt.Color(86, 86, 86));
        cButton.setForeground(new java.awt.Color(255, 255, 255));
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        n9Button.setBackground(new java.awt.Color(102, 102, 102));
        n9Button.setForeground(new java.awt.Color(255, 255, 255));
        n9Button.setText("9");
        n9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ButtonActionPerformed(evt);
            }
        });

        delButton.setBackground(new java.awt.Color(86, 86, 86));
        delButton.setForeground(new java.awt.Color(255, 255, 255));
        delButton.setText("<–");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        moduleButton.setBackground(new java.awt.Color(86, 86, 86));
        moduleButton.setForeground(new java.awt.Color(255, 255, 255));
        moduleButton.setText("%");
        moduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleButtonActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(255, 102, 0));
        plusButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plusButton.setForeground(new java.awt.Color(255, 255, 255));
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        n8Button.setBackground(new java.awt.Color(102, 102, 102));
        n8Button.setForeground(new java.awt.Color(255, 255, 255));
        n8Button.setText("8");
        n8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ButtonActionPerformed(evt);
            }
        });

        n7Button.setBackground(new java.awt.Color(102, 102, 102));
        n7Button.setForeground(new java.awt.Color(255, 255, 255));
        n7Button.setText("7");
        n7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(255, 102, 0));
        minusButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        minusButton.setForeground(new java.awt.Color(255, 255, 255));
        minusButton.setText("–");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        n6Button.setBackground(new java.awt.Color(102, 102, 102));
        n6Button.setForeground(new java.awt.Color(255, 255, 255));
        n6Button.setText("6");
        n6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ButtonActionPerformed(evt);
            }
        });

        n5Button.setBackground(new java.awt.Color(102, 102, 102));
        n5Button.setForeground(new java.awt.Color(255, 255, 255));
        n5Button.setText("5");
        n5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ButtonActionPerformed(evt);
            }
        });

        n4Button.setBackground(new java.awt.Color(102, 102, 102));
        n4Button.setForeground(new java.awt.Color(255, 255, 255));
        n4Button.setText("4");
        n4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ButtonActionPerformed(evt);
            }
        });

        n3Button.setBackground(new java.awt.Color(102, 102, 102));
        n3Button.setForeground(new java.awt.Color(255, 255, 255));
        n3Button.setText("3");
        n3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ButtonActionPerformed(evt);
            }
        });

        n1button.setBackground(new java.awt.Color(102, 102, 102));
        n1button.setForeground(new java.awt.Color(255, 255, 255));
        n1button.setText("1");
        n1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1buttonActionPerformed(evt);
            }
        });

        n2Button.setBackground(new java.awt.Color(102, 102, 102));
        n2Button.setForeground(new java.awt.Color(255, 255, 255));
        n2Button.setText("2");
        n2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ButtonActionPerformed(evt);
            }
        });

        multButton.setBackground(new java.awt.Color(255, 102, 0));
        multButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multButton.setForeground(new java.awt.Color(255, 255, 255));
        multButton.setText("x");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        equalButton.setBackground(new java.awt.Color(153, 153, 153));
        equalButton.setForeground(new java.awt.Color(0, 0, 0));
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        puntoButton.setBackground(new java.awt.Color(86, 86, 86));
        puntoButton.setForeground(new java.awt.Color(255, 255, 255));
        puntoButton.setText(".");
        puntoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoButtonActionPerformed(evt);
            }
        });

        n0Button.setBackground(new java.awt.Color(102, 102, 102));
        n0Button.setForeground(new java.awt.Color(255, 255, 255));
        n0Button.setText("0");
        n0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ButtonActionPerformed(evt);
            }
        });

        divButton.setBackground(new java.awt.Color(255, 102, 0));
        divButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divButton.setForeground(new java.awt.Color(255, 255, 255));
        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        rootButton.setBackground(new java.awt.Color(86, 86, 86));
        rootButton.setForeground(new java.awt.Color(255, 255, 255));
        rootButton.setText("²√x");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        x2Button.setBackground(new java.awt.Color(86, 86, 86));
        x2Button.setForeground(new java.awt.Color(255, 255, 255));
        x2Button.setText("x²");
        x2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ButtonActionPerformed(evt);
            }
        });

        x3Button.setBackground(new java.awt.Color(86, 86, 86));
        x3Button.setForeground(new java.awt.Color(255, 255, 255));
        x3Button.setText("x³");
        x3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(puntoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(n4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(n5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(n1button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(n2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(n3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        visor.setBackground(new java.awt.Color(51, 51, 51));
        visor.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        visor.setForeground(new java.awt.Color(255, 255, 255));
        visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visor.setFocusable(false);

        history.setBackground(new java.awt.Color(51, 51, 51));
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        history.setFocusable(false);

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default color", "Blue", "Green", "Red", "White" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(visor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 283, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleButtonActionPerformed

        disableAllOperators();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("%"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("%"));
        }

    }//GEN-LAST:event_moduleButtonActionPerformed

    private boolean ultimaLetra() {
        if (visor.getText().substring((visor.getText().length() - 1), visor.getText().length()).equalsIgnoreCase("1") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("2") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("3") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("4") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("5") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("6") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("7") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("8") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("9") || visor.getText().substring(visor.getText().length() - 1, visor.getText().length()).equalsIgnoreCase("0")
                || visor.getText().substring((visor.getText().length() - 1), visor.getText().length()).equalsIgnoreCase("²")
                || visor.getText().substring((visor.getText().length() - 1), visor.getText().length()).equalsIgnoreCase("³")) {
            return true;
        } else {
            return false;
        }
    }

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        disableAllOperators();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("+"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("+"));
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed

        disableAllOperators();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("-"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("-"));
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButtonActionPerformed
        disableAllOperators();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("x"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("x"));
        }
    }//GEN-LAST:event_multButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        disableAllOperators();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("/"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("/"));
        }
    }//GEN-LAST:event_divButtonActionPerformed

    private void n0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ButtonActionPerformed

        if (isZero()) {
            visor.setText("0");
        } else {
            visor.setText(visor.getText().concat("0"));
        }
    }//GEN-LAST:event_n0ButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        if (!ultimaLetra() || visor.getText().substring((visor.getText().length() - 1), visor.getText().length()).equalsIgnoreCase("²")
                || visor.getText().substring((visor.getText().length() - 1), visor.getText().length()).equalsIgnoreCase("³")) {
            enableAllOperators();
            enableAllNumbers();
            removeLast();
        } else {
            enableAllNumbers();
            removeLast();
        }
    }//GEN-LAST:event_delButtonActionPerformed

    private void puntoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoButtonActionPerformed

        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("."));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("."));
        }
    }//GEN-LAST:event_puntoButtonActionPerformed

    private void n1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1buttonActionPerformed
        if (isZero()) {
            visor.setText("1");
        } else {
            visor.setText(visor.getText().concat("1"));
        }
    }//GEN-LAST:event_n1buttonActionPerformed

    private void n2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ButtonActionPerformed
        if (isZero()) {
            visor.setText("2");
        } else {
            visor.setText(visor.getText().concat("2"));
        }
    }//GEN-LAST:event_n2ButtonActionPerformed

    private void n3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ButtonActionPerformed
        if (isZero()) {
            visor.setText("3");
        } else {
            visor.setText(visor.getText().concat("3"));
        }
    }//GEN-LAST:event_n3ButtonActionPerformed

    private void n4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ButtonActionPerformed
        if (isZero()) {
            visor.setText("4");
        } else {
            visor.setText(visor.getText().concat("4"));
        }
    }//GEN-LAST:event_n4ButtonActionPerformed

    private void n5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ButtonActionPerformed
        if (isZero()) {
            visor.setText("5");
        } else {
            visor.setText(visor.getText().concat("5"));
        }
    }//GEN-LAST:event_n5ButtonActionPerformed

    private void n6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ButtonActionPerformed
        if (isZero()) {
            visor.setText("6");
        } else {
            visor.setText(visor.getText().concat("6"));
        }
    }//GEN-LAST:event_n6ButtonActionPerformed

    private void n7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ButtonActionPerformed
        if (isZero()) {
            visor.setText("7");
        } else {
            visor.setText(visor.getText().concat("7"));
        }
    }//GEN-LAST:event_n7ButtonActionPerformed

    private void n8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ButtonActionPerformed
        if (isZero()) {
            visor.setText("8");
        } else {
            visor.setText(visor.getText().concat("8"));
        }
    }//GEN-LAST:event_n8ButtonActionPerformed

    private void n9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ButtonActionPerformed
        if (isZero()) {
            visor.setText("9");
        } else {
            visor.setText(visor.getText().concat("9"));
        }
    }//GEN-LAST:event_n9ButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        visor.setText("0");
        history.setText("");
        enableAllOperators();
    }//GEN-LAST:event_cButtonActionPerformed

    private void x2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ButtonActionPerformed
        disableAllOperators();
        disableAllNumbers();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("²"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("²"));
        }
    }//GEN-LAST:event_x2ButtonActionPerformed

    private void x3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ButtonActionPerformed
        disableAllOperators();
        disableAllNumbers();
        if (ultimaLetra()) {
            visor.setText(visor.getText().concat("³"));
        } else {
            removeLast();
            visor.setText(visor.getText().concat("³"));
        }
    }//GEN-LAST:event_x3ButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        if (ultimaLetra()) {
            history.setText(visor.getText().concat("="));
            visor.setText(operacion());
            enableAllOperators();
            enableAllNumbers();
        }
    }//GEN-LAST:event_equalButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed
        disableAllOperators();
        visor.setText("√");
    }//GEN-LAST:event_rootButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Default color")) {
            divButton.setBackground(new java.awt.Color(255, 102, 0));
            divButton.setForeground(new java.awt.Color(255, 255, 255));

            multButton.setBackground(new java.awt.Color(255, 102, 0));
            multButton.setForeground(new java.awt.Color(255, 255, 255));

            plusButton.setBackground(new java.awt.Color(255, 102, 0));
            plusButton.setForeground(new java.awt.Color(255, 255, 255));

            minusButton.setBackground(new java.awt.Color(255, 102, 0));
            minusButton.setForeground(new java.awt.Color(255, 255, 255));

        } else if (jComboBox1.getSelectedItem().equals("Blue")) { //[0,102,255]
            divButton.setBackground(new java.awt.Color(0, 102, 255));
            divButton.setForeground(new java.awt.Color(255, 255, 255));

            multButton.setBackground(new java.awt.Color(0, 102, 255));
            multButton.setForeground(new java.awt.Color(255, 255, 255));

            plusButton.setBackground(new java.awt.Color(0, 102, 255));
            plusButton.setForeground(new java.awt.Color(255, 255, 255));

            minusButton.setBackground(new java.awt.Color(0, 102, 255));
            minusButton.setForeground(new java.awt.Color(255, 255, 255));

        } else if (jComboBox1.getSelectedItem().equals("Green")) { //[0,255,102]
            divButton.setBackground(new java.awt.Color(0, 255, 102));
            divButton.setForeground(new java.awt.Color(0, 0, 0));

            multButton.setBackground(new java.awt.Color(0, 255, 102));
            multButton.setForeground(new java.awt.Color(0, 0, 0));

            plusButton.setBackground(new java.awt.Color(0, 255, 102));
            plusButton.setForeground(new java.awt.Color(0, 0, 0));

            minusButton.setBackground(new java.awt.Color(0, 255, 102));
            minusButton.setForeground(new java.awt.Color(0, 0, 0));

        } else if (jComboBox1.getSelectedItem().equals("Red")) {//[255,51,51]
            divButton.setBackground(new java.awt.Color(255, 51, 51));
            divButton.setForeground(new java.awt.Color(255, 255, 255));

            multButton.setBackground(new java.awt.Color(255, 51, 51));
            multButton.setForeground(new java.awt.Color(255, 255, 255));

            plusButton.setBackground(new java.awt.Color(255, 51, 51));
            plusButton.setForeground(new java.awt.Color(255, 255, 255));

            minusButton.setBackground(new java.awt.Color(255, 51, 51));
            minusButton.setForeground(new java.awt.Color(255, 255, 255));

        } else if (jComboBox1.getSelectedItem().equals("White")) {
            divButton.setBackground(new java.awt.Color(255, 255, 255));
            divButton.setForeground(new java.awt.Color(0, 0, 0));

            multButton.setBackground(new java.awt.Color(255, 255, 255));
            multButton.setForeground(new java.awt.Color(0, 0, 0));

            plusButton.setBackground(new java.awt.Color(255, 255, 255));
            plusButton.setForeground(new java.awt.Color(0, 0, 0));

            minusButton.setBackground(new java.awt.Color(255, 255, 255));
            minusButton.setForeground(new java.awt.Color(0, 0, 0));
        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private String operacion() {

        String operacion = visor.getText();
        String termino = "", termino2 = "", operador = "";

        for (int aux = 0; aux < operacion.length(); aux++) {
            if (operacion.substring(0, 1).equals("√")) {
                operador = "sqroot";
                termino = operacion.substring(1, operacion.length());
                break;
            } else if (operacion.substring(aux, aux + 1).equals("%") || operacion.substring(aux, aux + 1).equals("+") || operacion.substring(aux, aux + 1).equals("-") || operacion.substring(aux, aux + 1).equals("/") || operacion.substring(aux, aux + 1).equals("x") || operacion.substring(aux, aux + 1).equals("³") || operacion.substring(aux, aux + 1).equals("²")) {

                termino = operacion.substring(0, aux);
                operador = operacion.substring(aux, aux + 1);
                termino2 = operacion.substring(aux + 1, operacion.length());
                break;

            }
        }

        double result;

        switch (operador) {
            case "-":
                result = Double.parseDouble(termino) - Double.parseDouble(termino2);
                return Double.toString(result);
            case "+":
                result = Double.parseDouble(termino) + Double.parseDouble(termino2);
                return Double.toString(result);
            case "x":
                result = Double.parseDouble(termino) * Double.parseDouble(termino2);
                return Double.toString(result);
            case "/":
                result = Double.parseDouble(termino) / Double.parseDouble(termino2);
                return Double.toString(result);
            case "³":
                result = Double.parseDouble(termino) * Double.parseDouble(termino) * Double.parseDouble(termino);
                return Double.toString(result);
            case "²":
                result = Double.parseDouble(termino) * Double.parseDouble(termino);
                return Double.toString(result);
            case "%":
                result = ((Double.parseDouble(termino) * Double.parseDouble(termino2)) / 100);
                return Double.toString(result);
            case "sqroot":
                result = Math.sqrt(Double.parseDouble(termino));
                return Double.toString(result);
        }

        return "";
    }

    private void removeLast() {
        String result = null;
        if ((visor.getText() != null) && (visor.getText().length() > 0)) {
            result = visor.getText().substring(0, visor.getText().length() - 1);
        }
        visor.setText(result);
    }

    private boolean isZero() {
        if (visor.getText().equals("0")) {
            return true;
        } else {
            return false;
        }
    }

    private void disableAllOperators() {
        divButton.setEnabled(false);
        minusButton.setEnabled(false);
        moduleButton.setEnabled(false);
        multButton.setEnabled(false);
        plusButton.setEnabled(false);
        rootButton.setEnabled(false);
        x2Button.setEnabled(false);
        x3Button.setEnabled(false);
    }

    private void enableAllOperators() {
        divButton.setEnabled(true);
        minusButton.setEnabled(true);
        moduleButton.setEnabled(true);
        multButton.setEnabled(true);
        plusButton.setEnabled(true);
        rootButton.setEnabled(true);
        x2Button.setEnabled(true);
        x3Button.setEnabled(true);
    }

    private void disableAllNumbers() {
        n0Button.setEnabled(false);
        n1button.setEnabled(false);
        n2Button.setEnabled(false);
        n3Button.setEnabled(false);
        n4Button.setEnabled(false);
        n5Button.setEnabled(false);
        n6Button.setEnabled(false);
        n7Button.setEnabled(false);
        n8Button.setEnabled(false);
        n9Button.setEnabled(false);
        puntoButton.setEnabled(false);
    }

    private void enableAllNumbers() {
        n0Button.setEnabled(true);
        n1button.setEnabled(true);
        n2Button.setEnabled(true);
        n3Button.setEnabled(true);
        n4Button.setEnabled(true);
        n5Button.setEnabled(true);
        n6Button.setEnabled(true);
        n7Button.setEnabled(true);
        n8Button.setEnabled(true);
        n9Button.setEnabled(true);
        puntoButton.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JTextField history;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton moduleButton;
    private javax.swing.JButton multButton;
    private javax.swing.JButton n0Button;
    private javax.swing.JButton n1button;
    private javax.swing.JButton n2Button;
    private javax.swing.JButton n3Button;
    private javax.swing.JButton n4Button;
    private javax.swing.JButton n5Button;
    private javax.swing.JButton n6Button;
    private javax.swing.JButton n7Button;
    private javax.swing.JButton n8Button;
    private javax.swing.JButton n9Button;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton puntoButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JTextField visor;
    private javax.swing.JButton x2Button;
    private javax.swing.JButton x3Button;
    // End of variables declaration//GEN-END:variables
}
