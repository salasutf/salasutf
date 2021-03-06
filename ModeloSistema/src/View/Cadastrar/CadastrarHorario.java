/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastrar;

import Database.HorarioDao;
import Model.Horario;
import static Util.Utility.disposeModal;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class CadastrarHorario extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarHorario
     */
    public CadastrarHorario() {
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

        jlTitulo = new javax.swing.JLabel();
        jldescricao = new javax.swing.JLabel();
        jlHorarioInicio = new javax.swing.JLabel();
        jlhorarioFim = new javax.swing.JLabel();
        jlTurno = new javax.swing.JLabel();
        jcbTurno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jthorarioFim = new javax.swing.JTextField();
        jtHorarioInicio = new javax.swing.JTextField();
        jtDescricao = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 252));
        setMinimumSize(new java.awt.Dimension(300, 252));
        setPreferredSize(new java.awt.Dimension(300, 252));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastrar Horários");

        jldescricao.setText("Descrição");

        jlHorarioInicio.setText("Horário de início");

        jlhorarioFim.setText("Horário de fim");

        jlTurno.setText("Turno");

        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        jcbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTurnoActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jthorarioFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jthorarioFimActionPerformed(evt);
            }
        });

        jtHorarioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHorarioInicioActionPerformed(evt);
            }
        });

        jtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlTurno)
                                    .addComponent(jlhorarioFim)))
                            .addComponent(jlHorarioInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jthorarioFim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtHorarioInicio)
                            .addComponent(jcbTurno, 0, 177, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jldescricao)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDescricao)
                            .addComponent(jtId))))
                .addContainerGap())
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jldescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHorarioInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlhorarioFim)
                    .addComponent(jthorarioFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTurno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposeModal(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jthorarioFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jthorarioFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jthorarioFimActionPerformed

    private void jtHorarioInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHorarioInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHorarioInicioActionPerformed

    private void jtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescricaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Horario horario = new Horario();
        horario.setAtivo(true);
        horario.setId(jtId.getText());
        horario.setDescricao(jtDescricao.getText());
        horario.setHorarioInicio(jtHorarioInicio.getText());
        horario.setHorarioFim(jthorarioFim.getText());
        
        if(jcbTurno.getSelectedItem().equals("Manhã")){
            horario.setTurno("0");
        } else if(jcbTurno.getSelectedItem().equals("Tarde")){
            horario.setTurno("1");
        } else{
            horario.setTurno("2");
        }
        
        HorarioDao hd = new HorarioDao();
        if(hd.insert(horario)){
            JOptionPane.showMessageDialog(null, "O horário foi cadastrado", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            disposeModal(this);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível cadstrar o horário", "Erro", JOptionPane.PLAIN_MESSAGE);
            jtDescricao.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTurnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JLabel jlHorarioInicio;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTurno;
    private javax.swing.JLabel jldescricao;
    private javax.swing.JLabel jlhorarioFim;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtHorarioInicio;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jthorarioFim;
    // End of variables declaration//GEN-END:variables
}
