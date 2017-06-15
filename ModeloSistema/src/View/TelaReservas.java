/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Renato
 */
public class TelaReservas extends javax.swing.JPanel {

    /**
     * Creates new form TelaReservas
     */
    public TelaReservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpConsultar = new javax.swing.JPanel();
        jpHistoricodeReservas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabHistóricodeReservas = new javax.swing.JTable();
        jpConsultarReservas = new javax.swing.JPanel();
        jlDigiteCod = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jlDataReserva = new javax.swing.JLabel();
        jCalendarConsulta = new com.toedter.calendar.JCalendar();
        jbConsultar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 430));

        jpConsultar.setPreferredSize(new java.awt.Dimension(647, 398));

        jpHistoricodeReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTÓRICO DE RESERVAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jtabHistóricodeReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Salas", "Data", "Horário"
            }
        ));
        jtabHistóricodeReservas.setCellSelectionEnabled(true);
        jtabHistóricodeReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabHistóricodeReservas.setDropMode(javax.swing.DropMode.ON);
        jScrollPane2.setViewportView(jtabHistóricodeReservas);

        javax.swing.GroupLayout jpHistoricodeReservasLayout = new javax.swing.GroupLayout(jpHistoricodeReservas);
        jpHistoricodeReservas.setLayout(jpHistoricodeReservasLayout);
        jpHistoricodeReservasLayout.setHorizontalGroup(
            jpHistoricodeReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHistoricodeReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpHistoricodeReservasLayout.setVerticalGroup(
            jpHistoricodeReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHistoricodeReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpConsultarReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAR RESERVAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jlDigiteCod.setText("Digite o Código da sala ou preencha a data da reserva");

        jtCodigo.setToolTipText("Dados da sala");
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jlDataReserva.setText("Data da reserva");

        jbConsultar.setText("Consultar");

        javax.swing.GroupLayout jpConsultarReservasLayout = new javax.swing.GroupLayout(jpConsultarReservas);
        jpConsultarReservas.setLayout(jpConsultarReservasLayout);
        jpConsultarReservasLayout.setHorizontalGroup(
            jpConsultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarReservasLayout.createSequentialGroup()
                .addGroup(jpConsultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpConsultarReservasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConsultar))
                    .addGroup(jpConsultarReservasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpConsultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jtCodigo)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConsultarReservasLayout.createSequentialGroup()
                                .addGroup(jpConsultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDigiteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDataReserva))
                                .addGap(0, 80, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpConsultarReservasLayout.setVerticalGroup(
            jpConsultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarReservasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlDigiteCod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlDataReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpConsultarLayout = new javax.swing.GroupLayout(jpConsultar);
        jpConsultar.setLayout(jpConsultarLayout);
        jpConsultarLayout.setHorizontalGroup(
            jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jpHistoricodeReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpConsultarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpConsultarLayout.setVerticalGroup(
            jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpConsultarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpHistoricodeReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendarConsulta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JLabel jlDataReserva;
    private javax.swing.JLabel jlDigiteCod;
    private javax.swing.JPanel jpConsultar;
    private javax.swing.JPanel jpConsultarReservas;
    private javax.swing.JPanel jpHistoricodeReservas;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTable jtabHistóricodeReservas;
    // End of variables declaration//GEN-END:variables
}
