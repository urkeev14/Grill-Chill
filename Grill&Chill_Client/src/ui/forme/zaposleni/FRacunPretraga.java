/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.forme.zaposleni;

import com.sun.java.swing.plaf.windows.resources.windows;
import domen.Racun;
import domen.Zaposleni;
import hint.HintTextFieldUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.KontrolerGUI;
import ui.forme.mode.ModeForm;
import ui.modeli.ModelTabeleRacunPretraga;

/**
 *
 * @author urosv
 */
public class FRacunPretraga extends javax.swing.JDialog {

    ModeForm mode;

    /**
     * Creates new form FRacunPretraga
     */
    public FRacunPretraga(java.awt.Frame parent, boolean modal, ModeForm mode) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.mode = mode;
        srediTabelu();
        postaviHint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbgPretragaPo = new javax.swing.ButtonGroup();
        jpnlPretragaRacuna = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtKreiraoZaposleni = new javax.swing.JTextField();
        jlblPomocZaPretragu = new javax.swing.JLabel();
        jbtnPretrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRacun = new javax.swing.JTable();
        jbtnPrikazi = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Zaposleni ID: ");

        jtxtKreiraoZaposleni.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlblPomocZaPretragu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbtnPretrazi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPretrazi.setText("PRETRAZI");
        jbtnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPretraziActionPerformed(evt);
            }
        });

        jtblRacun.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblRacun);

        jbtnPrikazi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrikazi.setText("PRIKAZI");
        jbtnPrikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrikaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlPretragaRacunaLayout = new javax.swing.GroupLayout(jpnlPretragaRacuna);
        jpnlPretragaRacuna.setLayout(jpnlPretragaRacunaLayout);
        jpnlPretragaRacunaLayout.setHorizontalGroup(
            jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPretragaRacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPretragaRacunaLayout.createSequentialGroup()
                        .addGroup(jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jpnlPretragaRacunaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtKreiraoZaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPretragaRacunaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPretragaRacunaLayout.createSequentialGroup()
                                .addComponent(jlblPomocZaPretragu, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPretragaRacunaLayout.createSequentialGroup()
                                .addComponent(jbtnPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPretragaRacunaLayout.createSequentialGroup()
                                .addComponent(jbtnPrikazi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(304, 304, 304))))))
        );
        jpnlPretragaRacunaLayout.setVerticalGroup(
            jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPretragaRacunaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlblPomocZaPretragu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlPretragaRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtKreiraoZaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jbtnPretrazi)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnPrikazi)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlPretragaRacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlPretragaRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPretraziActionPerformed

        String zaposleniID = jtxtKreiraoZaposleni.getText();

        if (!zaposleniID.isEmpty()) {
            Zaposleni zaposleni = new Zaposleni(Integer.parseInt(zaposleniID), null, null, null, false, null);
            ArrayList<Racun> lista = KontrolerGUI.getInstanca().pretraziRacune(zaposleni);

            if (!lista.isEmpty()) {
                popuniTabelu(lista);
                JOptionPane.showMessageDialog(this, "Sistem je pronasao racune po zadatoj vrednosti.");
            } else {
                JOptionPane.showMessageDialog(this, "Sistem nije uspeo da pronadje racune po zadatoj vrednosti.");
                isprazniTabelu();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Unesite vrednost ID-a za zaposlenog.");
        }


    }//GEN-LAST:event_jbtnPretraziActionPerformed

    private void jbtnPrikaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrikaziActionPerformed
        ModelTabeleRacunPretraga mt = (ModelTabeleRacunPretraga) jtblRacun.getModel();
        Racun racun = mt.getRacun(jtblRacun.getSelectedRow());
        
        FRacun fRacun = new FRacun(null, true, ModeForm.FORM_PRETRAZI, racun);
        fRacun.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnPrikaziActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.ButtonGroup jbgPretragaPo;
    private javax.swing.JButton jbtnPretrazi;
    private javax.swing.JButton jbtnPrikazi;
    private javax.swing.JLabel jlblPomocZaPretragu;
    private javax.swing.JPanel jpnlPretragaRacuna;
    private javax.swing.JTable jtblRacun;
    private javax.swing.JTextField jtxtKreiraoZaposleni;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {
        ModelTabeleRacunPretraga mtr = new ModelTabeleRacunPretraga();
        jtblRacun.setModel(mtr);
    }

    private void postaviHint() {
        jtxtKreiraoZaposleni.setUI(new HintTextFieldUI("Unesite ID zaposlenog", true));
    }

    private void osveziTabelu() {
        ModelTabeleRacunPretraga mt = (ModelTabeleRacunPretraga) jtblRacun.getModel();
        mt.fireTableDataChanged();
    }

    private void isprazniTabelu() {
        ModelTabeleRacunPretraga mt = (ModelTabeleRacunPretraga) jtblRacun.getModel();
        mt.setListaRacuna(new ArrayList<>());
    }

    private void popuniTabelu(ArrayList<Racun> lista) {
        ModelTabeleRacunPretraga mt = (ModelTabeleRacunPretraga) jtblRacun.getModel();
        mt.setListaRacuna(lista);
    }

}
