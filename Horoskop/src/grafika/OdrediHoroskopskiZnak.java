/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author MyPC
 */
public class OdrediHoroskopskiZnak extends javax.swing.JFrame {

    /**
     * Creates new form PogodiZnak
     */
    Timer timer;
    
    
    public OdrediHoroskopskiZnak() {
        initComponents();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            // Sat
            Date date = new Date();
            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String time = timeFormat.format(date);
            lblVreme.setText(time);
            
            // Datum
            Date date1 = new Date();
            DateFormat timeFormat1 = new SimpleDateFormat("dd:MM:yyyy");
            String time1 = timeFormat1.format(date1);
            lblDatum.setText(time1);
            
            
            }
            };
            timer = new Timer(1000, actionListener);
            timer.setInitialDelay(0);
            timer.start();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVreme = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDan = new javax.swing.JTextField();
        txtMesec = new javax.swing.JTextField();
        btnPrikazi = new javax.swing.JButton();
        txtRezultat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horoskop");
        setBackground(new java.awt.Color(153, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 0, 153));

        lblVreme.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVreme.setText("HH:mm:ss");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Dan");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Mesec");

        txtDan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDanKeyTyped(evt);
            }
        });

        txtMesec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesecKeyTyped(evt);
            }
        });

        btnPrikazi.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnPrikazi.setText("Prikazi");
        btnPrikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrikaziZnak(evt);
            }
        });

        txtRezultat.setEditable(false);
        txtRezultat.setBackground(new java.awt.Color(255, 255, 255));
        txtRezultat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Vas Znak ");

        lblDatum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatum.setText("dd:MM:yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtRezultat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMesec, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnPrikazi)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lblVreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblVreme)
                .addGap(9, 9, 9)
                .addComponent(lblDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrikazi))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrikaziZnak(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrikaziZnak
        int dan = Integer.parseInt(txtDan.getText());
        int mesec = Integer.parseInt(txtMesec.getText());
        
        // Jarac
        if ((mesec == 12 && dan >= 22 && dan <= 31) ||
            (mesec ==  1 && dan >= 1 && dan <= 20))
            txtRezultat.setText("Jarac");  
        // Vodolija
        if ((mesec == 1 && dan >= 21 && dan <= 31) ||
            (mesec ==  2 && dan >= 1 && dan <= 19))
            txtRezultat.setText("Vodolija");
        // Ribe
        if ((mesec == 2 && dan >= 20 && dan <= 28) ||
            (mesec ==  3 && dan >= 1 && dan <= 20))
            txtRezultat.setText("Ribe");
        // Ovan
        if ((mesec == 3 && dan >= 21 && dan <= 31) ||
            (mesec ==  4 && dan >= 1 && dan <= 20))
            txtRezultat.setText("Ovan");
        // Bik
        if ((mesec == 4 && dan >= 21 && dan <= 30) ||
            (mesec ==  5 && dan >= 1 && dan <= 21))
            txtRezultat.setText("Bik");
        // Blizanci
        if ((mesec == 5 && dan >= 22 && dan <= 31) ||
            (mesec ==  6 && dan >= 1 && dan <= 21))
            txtRezultat.setText("Blizanci");
        // Rak
        if ((mesec == 6 && dan >= 22 && dan <= 30) ||
            (mesec == 7 && dan >= 1 && dan <= 22))
            txtRezultat.setText("Rak");
        // Lav
        if ((mesec == 7 && dan >= 23 && dan <= 31) ||
            (mesec ==  8 && dan >= 1 && dan <= 22))
            txtRezultat.setText("Lav");
        // Devica
        if ((mesec == 8 && dan >= 23 && dan <= 31) ||
            (mesec ==  9 && dan >= 1 && dan <= 22))
            txtRezultat.setText("Devica");
        // Vaga
        if ((mesec == 9 && dan >= 23 && dan <= 30) ||
            (mesec ==  10 && dan >= 1 && dan <= 23))
            txtRezultat.setText("Vaga");
        // Skorpija
        if ((mesec == 10 && dan >= 24 && dan <= 31) ||
            (mesec ==  11 && dan >= 1 && dan <= 22))
            txtRezultat.setText("Skorpija");
        // Strelac
        if ((mesec == 11 && dan >= 23 && dan <= 30) ||
            (mesec ==  12 && dan >= 1 && dan <= 21))
            txtRezultat.setText("Strelac");
    }//GEN-LAST:event_PrikaziZnak

    private void txtDanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDanKeyTyped
        String dan = txtDan.getText();
         String regexDan = "^\\d{1,2}$";
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || 
            c == KeyEvent.VK_BACKSPACE) ||
            c == KeyEvent.VK_DELETE) {

            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDanKeyTyped

    private void txtMesecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesecKeyTyped
         String mesec = txtMesec.getText();
         String regexMesec = "^\\d{1,2}$";
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || 
            c == KeyEvent.VK_BACKSPACE) ||
            c == KeyEvent.VK_DELETE) {

            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMesecKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrikazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblVreme;
    private javax.swing.JTextField txtDan;
    private javax.swing.JTextField txtMesec;
    private javax.swing.JTextField txtRezultat;
    // End of variables declaration//GEN-END:variables
}
