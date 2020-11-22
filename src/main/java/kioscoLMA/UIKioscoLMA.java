
package kioscoLMA;

import javax.swing.JOptionPane;

/**
 *
 * @author jacob
 */
public class UIKioscoLMA extends javax.swing.JFrame {

    public UIKioscoLMA() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        btnGrpTipoPedido = new javax.swing.ButtonGroup();
        pnlTipoPedido = new javax.swing.JPanel();
        rdCompleto = new javax.swing.JRadioButton();
        rdSandwich = new javax.swing.JRadioButton();
        rdPizza = new javax.swing.JRadioButton();
        pnlTamano = new javax.swing.JPanel();
        cbTamano = new javax.swing.JComboBox<>();
        pnlBebida = new javax.swing.JPanel();
        cbBebida = new javax.swing.JComboBox<>();
        pnlOpcion = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlAgregadoCompletoSandwich = new javax.swing.JPanel();
        cbxMayo = new javax.swing.JCheckBox();
        cbxKetchup = new javax.swing.JCheckBox();
        cbxMostza = new javax.swing.JCheckBox();
        cbxSalsaAmericana = new javax.swing.JCheckBox();
        cbxTomate = new javax.swing.JCheckBox();
        cbxPalta = new javax.swing.JCheckBox();
        cbxChucrut = new javax.swing.JCheckBox();
        pnlAgregadoPizza = new javax.swing.JPanel();
        cbxExtraQueso = new javax.swing.JCheckBox();
        cbxCarne = new javax.swing.JCheckBox();
        cbxChoricillo = new javax.swing.JCheckBox();
        cbxChoclo = new javax.swing.JCheckBox();
        cbxPalmitos = new javax.swing.JCheckBox();
        cbxEsparragos = new javax.swing.JCheckBox();
        pnlCantidad = new javax.swing.JPanel();
        spnCantidad = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        pnlTotalPagar = new javax.swing.JScrollPane();
        txtAreaTotalPagar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La mandíbula atómica");

        pnlTipoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo pedido"));

        btnGrpTipoPedido.add(rdCompleto);
        rdCompleto.setText("Completo");
        rdCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCompletoActionPerformed(evt);
            }
        });

        btnGrpTipoPedido.add(rdSandwich);
        rdSandwich.setText("Sándwich");
        rdSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSandwichActionPerformed(evt);
            }
        });

        btnGrpTipoPedido.add(rdPizza);
        rdPizza.setText("Pizza");
        rdPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTipoPedidoLayout = new javax.swing.GroupLayout(pnlTipoPedido);
        pnlTipoPedido.setLayout(pnlTipoPedidoLayout);
        pnlTipoPedidoLayout.setHorizontalGroup(
            pnlTipoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoPedidoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlTipoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdPizza)
                    .addComponent(rdSandwich)
                    .addComponent(rdCompleto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTipoPedidoLayout.setVerticalGroup(
            pnlTipoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoPedidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rdCompleto)
                .addGap(18, 18, 18)
                .addComponent(rdSandwich)
                .addGap(18, 18, 18)
                .addComponent(rdPizza)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlTamano.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));

        cbTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Chico", "Mediano", "Grande" }));

        javax.swing.GroupLayout pnlTamanoLayout = new javax.swing.GroupLayout(pnlTamano);
        pnlTamano.setLayout(pnlTamanoLayout);
        pnlTamanoLayout.setHorizontalGroup(
            pnlTamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTamanoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTamano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTamanoLayout.setVerticalGroup(
            pnlTamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamanoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBebida.setBorder(javax.swing.BorderFactory.createTitledBorder("Para beber"));

        cbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Bebida lata", "Jugo natural", "Café", "Té" }));

        javax.swing.GroupLayout pnlBebidaLayout = new javax.swing.GroupLayout(pnlBebida);
        pnlBebida.setLayout(pnlBebidaLayout);
        pnlBebidaLayout.setHorizontalGroup(
            pnlBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBebida, 0, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBebidaLayout.setVerticalGroup(
            pnlBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Opción"));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionLayout = new javax.swing.GroupLayout(pnlOpcion);
        pnlOpcion.setLayout(pnlOpcionLayout);
        pnlOpcionLayout.setHorizontalGroup(
            pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlOpcionLayout.setVerticalGroup(
            pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pnlAgregadoCompletoSandwich.setBorder(javax.swing.BorderFactory.createTitledBorder("Completo/Sándwich"));

        cbxMayo.setText("Mayo");

        cbxKetchup.setText("Ketchup");

        cbxMostza.setText("Mostaza");

        cbxSalsaAmericana.setText("Salsa Americana");

        cbxTomate.setText("Tomte");

        cbxPalta.setText("Palta");

        cbxChucrut.setText("Chucrut");

        javax.swing.GroupLayout pnlAgregadoCompletoSandwichLayout = new javax.swing.GroupLayout(pnlAgregadoCompletoSandwich);
        pnlAgregadoCompletoSandwich.setLayout(pnlAgregadoCompletoSandwichLayout);
        pnlAgregadoCompletoSandwichLayout.setHorizontalGroup(
            pnlAgregadoCompletoSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregadoCompletoSandwichLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregadoCompletoSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMayo)
                    .addComponent(cbxKetchup)
                    .addComponent(cbxMostza)
                    .addComponent(cbxSalsaAmericana)
                    .addComponent(cbxTomate)
                    .addComponent(cbxPalta)
                    .addComponent(cbxChucrut))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlAgregadoCompletoSandwichLayout.setVerticalGroup(
            pnlAgregadoCompletoSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregadoCompletoSandwichLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cbxMayo)
                .addGap(18, 18, 18)
                .addComponent(cbxKetchup)
                .addGap(18, 18, 18)
                .addComponent(cbxMostza)
                .addGap(18, 18, 18)
                .addComponent(cbxSalsaAmericana)
                .addGap(18, 18, 18)
                .addComponent(cbxTomate)
                .addGap(18, 18, 18)
                .addComponent(cbxPalta)
                .addGap(18, 18, 18)
                .addComponent(cbxChucrut)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlAgregadoPizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza"));

        cbxExtraQueso.setText("Extra Queso");

        cbxCarne.setText("Carne");

        cbxChoricillo.setText("Choricillo");

        cbxChoclo.setText("Choclo");

        cbxPalmitos.setText("Palmitos");

        cbxEsparragos.setText("Espárragos");

        javax.swing.GroupLayout pnlAgregadoPizzaLayout = new javax.swing.GroupLayout(pnlAgregadoPizza);
        pnlAgregadoPizza.setLayout(pnlAgregadoPizzaLayout);
        pnlAgregadoPizzaLayout.setHorizontalGroup(
            pnlAgregadoPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregadoPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregadoPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxExtraQueso)
                    .addComponent(cbxCarne)
                    .addComponent(cbxChoricillo)
                    .addComponent(cbxChoclo)
                    .addComponent(cbxPalmitos)
                    .addComponent(cbxEsparragos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAgregadoPizzaLayout.setVerticalGroup(
            pnlAgregadoPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregadoPizzaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cbxExtraQueso)
                .addGap(18, 18, 18)
                .addComponent(cbxCarne)
                .addGap(18, 18, 18)
                .addComponent(cbxChoricillo)
                .addGap(18, 18, 18)
                .addComponent(cbxChoclo)
                .addGap(18, 18, 18)
                .addComponent(cbxPalmitos)
                .addGap(18, 18, 18)
                .addComponent(cbxEsparragos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));

        javax.swing.GroupLayout pnlCantidadLayout = new javax.swing.GroupLayout(pnlCantidad);
        pnlCantidad.setLayout(pnlCantidadLayout);
        pnlCantidadLayout.setHorizontalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCantidadLayout.setVerticalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Total a pagar"));

        txtAreaTotalPagar.setColumns(20);
        txtAreaTotalPagar.setRows(5);
        pnlTotalPagar.setViewportView(txtAreaTotalPagar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTotalPagar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTipoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTamano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAgregadoCompletoSandwich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAgregadoPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTipoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlBebida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTamano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlAgregadoCompletoSandwich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAgregadoPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcularPrecioAndpresupuesto(1);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        calcularPrecioAndpresupuesto(2);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        btnGrpTipoPedido.clearSelection();
        cbTamano.setSelectedIndex(0);
        cbBebida.setSelectedIndex(0);
        //Agregados completo/sandwich
        cbxMayo.setSelected(false);
        cbxKetchup.setSelected(false);
        cbxMostza.setSelected(false);
        cbxSalsaAmericana.setSelected(false);
        cbxTomate.setSelected(false);
        cbxPalta.setSelected(false);
        cbxChucrut.setSelected(false);
        //Agregados pizza
        cbxExtraQueso.setSelected(false);
        cbxCarne.setSelected(false);
        cbxChoricillo.setSelected(false);
        cbxChoclo.setSelected(false);
        cbxPalmitos.setSelected(false);
        cbxEsparragos.setSelected(false);
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rdCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCompletoActionPerformed
        cbxExtraQueso.setEnabled(false);
        cbxCarne.setEnabled(false);
        cbxChoricillo.setEnabled(false);
        cbxChoclo.setEnabled(false);
        cbxPalmitos.setEnabled(false);
        cbxEsparragos.setEnabled(false);
        cbxMayo.setEnabled(true);
        cbxKetchup.setEnabled(true);
        cbxMostza.setEnabled(true);
        cbxSalsaAmericana.setEnabled(true);
        cbxTomate.setEnabled(true);
        cbxPalta.setEnabled(true);
        cbxChucrut.setEnabled(true);
    }//GEN-LAST:event_rdCompletoActionPerformed

    private void rdSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSandwichActionPerformed
        cbxExtraQueso.setEnabled(false);
        cbxCarne.setEnabled(false);
        cbxChoricillo.setEnabled(false);
        cbxChoclo.setEnabled(false);
        cbxPalmitos.setEnabled(false);
        cbxEsparragos.setEnabled(false);
        cbxMayo.setEnabled(true);
        cbxKetchup.setEnabled(true);
        cbxMostza.setEnabled(true);
        cbxSalsaAmericana.setEnabled(true);
        cbxTomate.setEnabled(true);
        cbxPalta.setEnabled(true);
        cbxChucrut.setEnabled(true);
    }//GEN-LAST:event_rdSandwichActionPerformed

    private void rdPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPizzaActionPerformed
        cbxMayo.setEnabled(false);
        cbxKetchup.setEnabled(false);
        cbxMostza.setEnabled(false);
        cbxSalsaAmericana.setEnabled(false);
        cbxTomate.setEnabled(false);
        cbxPalta.setEnabled(false);
        cbxChucrut.setEnabled(false);
        cbxExtraQueso.setEnabled(true);
        cbxCarne.setEnabled(true);
        cbxChoricillo.setEnabled(true);
        cbxChoclo.setEnabled(true);
        cbxPalmitos.setEnabled(true);
        cbxEsparragos.setEnabled(true);
    }//GEN-LAST:event_rdPizzaActionPerformed

    public void calcularPrecioAndpresupuesto(int opcionBoton) {
        int totalPagar = 0;
        boolean banderaTamano = true, banderaPedido = true, banderaBebida = true;
        String msjError = "Debe seleccionar: \n", detalleCompra = "Detalle de la compra: \n\n";
        int cantidad = (int)spnCantidad.getValue();
       
        //Selección de pedido
        if (rdCompleto.isSelected()) {
            totalPagar += 1000;
            detalleCompra += "Completo: $1.000 \n";
            banderaPedido = false;
        } else if (rdSandwich.isSelected()) {
            totalPagar += 1500;
            detalleCompra += "Sandwich: $1.500 \n";
            banderaPedido = false;
        } else if (rdPizza.isSelected()) {
            totalPagar += 2000;
            detalleCompra += "Pizza: $2.000 \n";
            banderaPedido = false;
        } else {
            msjError += "\nTipo de pedido";
        }
        
        //Seleccion de tamaño
        int posicionTamano = cbTamano.getSelectedIndex();
        if(posicionTamano > 0) {
            banderaTamano = false;
            
            switch(posicionTamano) {
                case 1 -> {
                    detalleCompra += "Tamaño chico: $0 \n";
                }
                case 2 -> {
                    totalPagar += 500;
                    detalleCompra += "Tamaño mediano: $500\n";
                }
                case 3 -> {
                    totalPagar += 1000;
                    detalleCompra += "Tamaño grande: $1.000\n";
                }
            }
            
        } else { 
            msjError += "\nTamaño";
        }
        
        //Valores agregados completos y sadwich
        if (cbxMayo.isSelected()) {
            totalPagar += 200;
            detalleCompra += "Mayonesa: $200\n";
        }
        if (cbxKetchup.isSelected()) {
            detalleCompra += "Ketchup: $0\n";
        }
        if (cbxMostza.isSelected()) {
            detalleCompra += "Mostaza: $0\n";
        }
        if (cbxSalsaAmericana.isSelected()) {
            totalPagar += 200;
            detalleCompra += "Salsa americana: $200\n";
        }
        if (cbxTomate.isSelected()) {
            totalPagar += 200;
            detalleCompra += "Tomate: $200\n";
        }
        if (cbxPalta.isSelected()) {
            totalPagar += 300;
            detalleCompra += "Palta: $300\n";
        }
        if (cbxChucrut.isSelected()) {
            totalPagar += 100;
            detalleCompra += "Chucrut: $100\n";
        }
        
        //valores agregados pizza
        if (cbxExtraQueso.isSelected()) {
            totalPagar += 500;
            detalleCompra += "Extra queso: $500\n";
        }
        if (cbxCarne.isSelected()) {
            totalPagar += 1000;
            detalleCompra += "Carne: $1.000\n";
        }
        if (cbxChoricillo.isSelected()) {
            totalPagar += 1200;
            detalleCompra += "Choricillo: $1.200\n";
        }
        if (cbxChoclo.isSelected()) {
            totalPagar += 500;
            detalleCompra += "Choclo: $500\n";
        }
        if (cbxPalmitos.isSelected()) {
            totalPagar += 700;
            detalleCompra += "Palmitos: $700\n";
        }
        if (cbxEsparragos.isSelected()) {
            totalPagar += 800;
            detalleCompra += "Esparragos: $800\n";
        }
        
        //Selección de bebida
        int posicionBebida = cbBebida.getSelectedIndex();
        if (posicionBebida > 0) {
            banderaBebida = false;
            
            switch(posicionBebida) {
                case 1 -> {
                    totalPagar += 800;
                    detalleCompra += "\nBebida lata: $800\n";
                } 
                case 2 -> {
                    totalPagar += 800;
                    detalleCompra += "Jugo natural: $800\n";
                }
                case 3 -> {
                    totalPagar += 1000;
                    detalleCompra += "Café: $1.000\n";
                }
                case 4 -> {
                    totalPagar += 500;
                    detalleCompra += "Té: $500\n";
                }
            }
            
        } else {
            msjError += "\nBebida";
        }
        
        //Verificación cantidad
        if(cantidad <= 0) {
            cantidad = 1;
            spnCantidad.setValue(cantidad);
        }
        
        detalleCompra += "\nCantidad: "+ cantidad + "\n\nTotal a pagar: $" +totalPagar;
        
        if (banderaPedido || banderaTamano || banderaBebida) {
            JOptionPane.showMessageDialog(null, msjError);
        } else if (opcionBoton == 1) {
            JOptionPane.showMessageDialog(null, "Total a pagar: " + (totalPagar * cantidad));
        } else {
            txtAreaTotalPagar.setText(detalleCompra);
        }
    }
    
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
            java.util.logging.Logger.getLogger(UIKioscoLMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIKioscoLMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIKioscoLMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIKioscoLMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIKioscoLMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btnGrpTipoPedido;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbBebida;
    private javax.swing.JComboBox<String> cbTamano;
    private javax.swing.JCheckBox cbxCarne;
    private javax.swing.JCheckBox cbxChoclo;
    private javax.swing.JCheckBox cbxChoricillo;
    private javax.swing.JCheckBox cbxChucrut;
    private javax.swing.JCheckBox cbxEsparragos;
    private javax.swing.JCheckBox cbxExtraQueso;
    private javax.swing.JCheckBox cbxKetchup;
    private javax.swing.JCheckBox cbxMayo;
    private javax.swing.JCheckBox cbxMostza;
    private javax.swing.JCheckBox cbxPalmitos;
    private javax.swing.JCheckBox cbxPalta;
    private javax.swing.JCheckBox cbxSalsaAmericana;
    private javax.swing.JCheckBox cbxTomate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel pnlAgregadoCompletoSandwich;
    private javax.swing.JPanel pnlAgregadoPizza;
    private javax.swing.JPanel pnlBebida;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlOpcion;
    private javax.swing.JPanel pnlTamano;
    private javax.swing.JPanel pnlTipoPedido;
    private javax.swing.JScrollPane pnlTotalPagar;
    private javax.swing.JRadioButton rdCompleto;
    private javax.swing.JRadioButton rdPizza;
    private javax.swing.JRadioButton rdSandwich;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextArea txtAreaTotalPagar;
    // End of variables declaration//GEN-END:variables
}
