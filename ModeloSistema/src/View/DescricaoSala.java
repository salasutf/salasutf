/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Database.ReservaDao;
import Database.HorarioDao;
import Model.Horario;
import Model.Reserva;
import Model.Sala;
import Util.Auth;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class DescricaoSala extends javax.swing.JPanel {
    private Sala sala;
    private String data;
    /**
     * Creates new form DescSala
     */
    public DescricaoSala(Sala objeto, String data) {
        initComponents();
        
        this.sala = objeto;
        this.data = data;
        
        jlNomeSala1.setText(objeto.getCodigo());
        jlDescSala.setText("<html>"+objeto.getEquipamentos().replace("\n", "<br />\n")+"<html>");

        constructTable();
    }
    
    private void constructTable () {
        // Buscar os horários disponíveis e mostrar na janela
        ReservaDao resd = new ReservaDao();
        List<Reserva> listaReservas = resd.getBySalaEData(sala, data);
        Reserva[] arrReservas = new Reserva[listaReservas.size()];
        listaReservas.toArray(arrReservas);
        
        try{
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date newDate = dateFormat.parse(data);
            String dataEscolhida = new SimpleDateFormat("dd/MM/yyyy").format(newDate);
            jlHorariosDisponiveis.setText("Reservar para "+dataEscolhida);
        } catch(Exception e) {}
        
        HorarioDao hd = new HorarioDao();
        List<Horario> listHorarios = hd.getAllAtivos();
        Horario[] arrHorarios = new Horario[listHorarios.size()];
        listHorarios.toArray(arrHorarios);
        Object[][] matrizValores = new Object[listHorarios.size()][2];
        
        for(int i = 0; i<listHorarios.size(); i++){
            boolean reservado = false;
            for(int j = 0; j<listaReservas.size(); j++){
                if(arrReservas[j].getHorario().equals(arrHorarios[i].getId())){
                    reservado = true;
                }
            }
            
            if(reservado){
                matrizValores[i] = new String[]{arrHorarios[i].getId(), "Não disponível"};
            } else {
                matrizValores[i] = new Object[]{arrHorarios[i].getId(), "Disponível"};
            }
        }


        jtabHorariosDisponiveis1.setModel(new javax.swing.table.DefaultTableModel(
            matrizValores,
            new String [] {
                "Horário", "Selecionar"
            }
        ));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNomeSala1 = new javax.swing.JLabel();
        jlDescricao1 = new javax.swing.JLabel();
        jlHorariosDisponiveis = new javax.swing.JLabel();
        jpResultadoHorarios1 = new java.awt.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtabHorariosDisponiveis1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        jbReservar1 = new javax.swing.JButton();
        jldescricaoHorario1 = new javax.swing.JLabel();
        jlDescSala = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(367, 571));
        setMinimumSize(new java.awt.Dimension(367, 571));

        jlNomeSala1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlNomeSala1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeSala1.setText("SALA X");

        jlDescricao1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlDescricao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDescricao1.setText("Descrição da sala selecionada");

        jlHorariosDisponiveis.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlHorariosDisponiveis.setText("Reservar esta sala");

        jpResultadoHorarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jtabHorariosDisponiveis1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabHorariosDisponiveis1.setShowVerticalLines(false);
        jtabHorariosDisponiveis1.getTableHeader().setReorderingAllowed(false);
        jtabHorariosDisponiveis1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtabHorariosDisponiveis1ComponentAdded(evt);
            }
        });
        jScrollPane4.setViewportView(jtabHorariosDisponiveis1);

        javax.swing.GroupLayout jpResultadoHorarios1Layout = new javax.swing.GroupLayout(jpResultadoHorarios1);
        jpResultadoHorarios1.setLayout(jpResultadoHorarios1Layout);
        jpResultadoHorarios1Layout.setHorizontalGroup(
            jpResultadoHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoHorarios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpResultadoHorarios1Layout.setVerticalGroup(
            jpResultadoHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoHorarios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbReservar1.setText("Reservar");
        jbReservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservar1ActionPerformed(evt);
            }
        });

        jldescricaoHorario1.setBackground(new java.awt.Color(255, 102, 102));
        jldescricaoHorario1.setText("<html>Selecione um ou mais horários disponíveis que deseja reservar <i>(Ctrl + Clique sobre a linha da tabela)</i></html>");

        jlDescSala.setText("<html>X computadores...</html>");
        jlDescSala.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbReservar1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlHorariosDisponiveis)
                            .addComponent(jldescricaoHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jlDescSala, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeSala1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDescricao1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jpResultadoHorarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNomeSala1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescricao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescSala, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlHorariosDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jldescricaoHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultadoHorarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbReservar1)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtabHorariosDisponiveis1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtabHorariosDisponiveis1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtabHorariosDisponiveis1ComponentAdded

    private void jbReservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservar1ActionPerformed
        int[] linhasSelecionadas = jtabHorariosDisponiveis1.getSelectedRows();
        
        Horario[] arrSelecao = new Horario[linhasSelecionadas.length];
        HorarioDao hd = new HorarioDao();
        
        for (int i = 0; i < linhasSelecionadas.length; i++){
            String item = jtabHorariosDisponiveis1.getModel().getValueAt(linhasSelecionadas[i], 0).toString();
            
            Horario h = new Horario();
            h.setId(item);
            
            Horario horario = hd.get(h, "id");
            arrSelecao[i] = horario;
        }
        
        // Obtém a lista de reservas praquela sala naquele dia
        ReservaDao resd = new ReservaDao();
        List<Reserva> listaReservas = resd.getBySalaEData(sala, data);
        Reserva[] arrReservas = new Reserva[listaReservas.size()];
        listaReservas.toArray(arrReservas);
        
        boolean reservado = false;
        
        for(int i = 0; i < arrSelecao.length; i++){
            for(int j = 0; j<listaReservas.size(); j++){
                if(arrReservas[j].getHorario().equals(arrSelecao[i].getId())){
                    reservado = true;
                }
            }
        }
        
        if(reservado){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a reserva. Algum dos horários selecionados não está mais disponível", "Erro", JOptionPane.PLAIN_MESSAGE);
            constructTable();
        } else {
            boolean sucesso = true;
            for (int i = 0; i < arrSelecao.length; i++){
                Reserva reserva = new Reserva();
                reserva.setAtivo(true);
                reserva.setDataUso(data);
                reserva.setIdSala(sala.getId());
                reserva.setIdProfessor(Auth.getLoggedUser().getLogin());
                reserva.setHorario(arrSelecao[i].getId());
                if(!resd.insert(reserva))
                    sucesso = false;
            }
            
            if(sucesso){
                JOptionPane.showMessageDialog(null, "Suas reservas foram realizadas", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Houve um problema ao realizar suas reservas", "Ero", JOptionPane.PLAIN_MESSAGE);
            }
            
            constructTable();
        }
    }//GEN-LAST:event_jbReservar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbReservar1;
    private javax.swing.JLabel jlDescSala;
    private javax.swing.JLabel jlDescricao1;
    private javax.swing.JLabel jlHorariosDisponiveis;
    private javax.swing.JLabel jlNomeSala1;
    private javax.swing.JLabel jldescricaoHorario1;
    private java.awt.Panel jpResultadoHorarios1;
    private javax.swing.JTable jtabHorariosDisponiveis1;
    // End of variables declaration//GEN-END:variables
}
