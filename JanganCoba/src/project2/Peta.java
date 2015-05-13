package project2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.LinkedList;

public class Peta extends javax.swing.JFrame {
    LinkedList<Lokasi> kumpulanLokasi = new LinkedList<Lokasi>();
    LinkedList<Jalan> kumpulanJalan = new LinkedList<Jalan>();
    double MAP_WIDTH=800;
    double MAP_HEIGHT=800;
    double xHome,yHome;
    double skala=3000;
    double xMargin=100, yMargin=100;
    int icari = -1;
    private double xGeser = 0;
    private double yGeser = 0;
    Lokasi Saya = new Lokasi(-7.257682, 112.795501, "Saya");
    
    public Peta() {
        initComponents();
        isiDatalokasi();
        tentukanHome();
        isiDataJalan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Zoom in");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Zoom out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Atas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bawah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Kanan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Kiri");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(76, 76, 76)
                .addComponent(jButton7)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String dicari = "McD";
        icari = carilokasi(dicari);
        if(icari > 0){
            repaint();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        skala*=1.2;
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        skala*=0.8;
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        xGeser += 20;
        repaint();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        xGeser -= 20;
        repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        yGeser -= 20;
        repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        yGeser += 20;
        repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void paint (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Lokasi A;
    double x,y;
    double xv,yv;
    int xi, yi;
    
    g2.setColor(Color.WHITE);
    g2.fillRect(0,0, getWidth(), getHeight());
    g2.setColor(Color.BLACK);
    
    A = Saya;
            
            xv=konversiLonKeScreen(A.getLon());
            yv=konversiLatkeScreen(A.getLat());
            g2.fillOval((int) xv, (int) yv, 20, 20);
            g2.setColor(Color.BLUE);
            
            
            
        for (int i = 0; i < kumpulanLokasi.size(); i++) {
            A = kumpulanLokasi.get(i);
            
            xv=konversiLonKeScreen(A.getLon());
            yv=konversiLatkeScreen(A.getLat());
            
            g2.draw(new Ellipse2D.Double(xv, yv,
                             5,
                             5));
            xi=(int)xv;
            yi=(int)yv;
            g2.drawString(A.getLabel(),xi, yi);
            }
        
        Jalan B;
        Lokasi awal, akhir;
        double x1, y1, x2, y2;
        
        for (int i = 0; i < kumpulanJalan.size(); i++) {
            B = kumpulanJalan.get(i);
            awal = kumpulanLokasi.get(B.getAwal());
            akhir = kumpulanLokasi.get(B.getAkhir());
            x1=konversiLonKeScreen(awal.getLon());
            y1=konversiLatkeScreen(awal.getLat());
            x2=konversiLonKeScreen(akhir.getLon());
            y2=konversiLatkeScreen(akhir.getLat());
            
            Double jarak = hitungJarak(awal.getLon(), awal.getLat(), akhir.getLon(), akhir.getLat());
            
            if(i<5){
                g2.setColor(Color.RED);
            } else {
                g2.setColor(Color.BLUE);
            }
            g2.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
            g2.drawString(B.getNama()+" "+jarak.toString(), (int)(x1+x2)/2, (int) (y1+y2)/2);
        }
        
        if(icari >= 0){
        Lokasi D = kumpulanLokasi.get(icari);
        double xxv=konversiLonKeScreen(D.getLon());
        double yyv=konversiLatkeScreen(D.getLat());
        g2.draw(new Ellipse2D.Double(xxv, yyv,
                             20,
                             20));
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
            java.util.logging.Logger.getLogger(Peta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables

    private void isiDatalokasi() {
        kumpulanLokasi.add(new Lokasi(-7.109848, 112.403267, "pojok kiri atas"));
        kumpulanLokasi.add(new Lokasi(-7.119047, 112.402624, "Jl. Raya Kertajaya"));
        kumpulanLokasi.add(new Lokasi(-7.121091, 112.416485, "SAS Cafe and Resto"));
        kumpulanLokasi.add(new Lokasi(-7.112957, 112.417301, "Nasi Kuning Bakar"));
        kumpulanLokasi.add(new Lokasi(-7.128709, 112.415117, "SD Islam Al-Azhar"));
        kumpulanLokasi.add(new Lokasi(-7.275154, 112.793727, "Warung bu risa"));
        kumpulanLokasi.add(new Lokasi(-7.266640, 112.796592, "McD"));
        kumpulanLokasi.add(new Lokasi(-7.266289, 112.796335, "Pizza Hut"));
    }

    private double konversiLonKeX(double lon) {
       double x = (double) ((MAP_WIDTH/360.0)*(180+lon));  
        return x;
    }

    private double konversiLatKeY(double lat) {
        double y = (double) ((MAP_HEIGHT/180.0)*(90-lat)); 
        return y;
    }

    private void tentukanHome() {
        Lokasi A;
        
            A = kumpulanLokasi.get(0);
            xHome=konversiLonKeX (A.getLon());
            yHome=konversiLatKeY (A.getLat());
        }

    private void isiDataJalan() {
        kumpulanJalan.add(new Jalan(0,1,"Jalan Apel"));
        kumpulanJalan.add(new Jalan(0,6,"Jalan Rambutan"));
        kumpulanJalan.add(new Jalan(6,1,"Jalan Nangka"));
        kumpulanJalan.add(new Jalan(1,2,"Jalan Pepeaya"));
        kumpulanJalan.add(new Jalan(2,3,"Jalan Durian"));
        kumpulanJalan.add(new Jalan(3,4,"Jalan Strawberry"));
        kumpulanJalan.add(new Jalan(4,5,"Jalan Anggur"));
        kumpulanJalan.add(new Jalan(5,6,"Jalan Ceri"));
        
    }

    private double konversiLonKeScreen(double lon) {
        double x=konversiLonKeX (lon);
        double xv=(x-xHome)*skala+xMargin + xGeser;
        return xv;
    }

    private double konversiLatkeScreen(double lat) {
       double y=konversiLatKeY (lat);
       double yv=(y-yHome)*skala+yMargin + yGeser;    
       return yv;
       
    }

    private int carilokasi(String dicari) {
        int hasil = -1;
        for (int i = 0; i < kumpulanLokasi.size(); i++) {
            Lokasi c = kumpulanLokasi.get(i);
            if(dicari.equalsIgnoreCase(c.getLabel())){
            hasil = i;
            }
            
        }
        return hasil;
    }

    private double hitungJarak(double lon1, double lat1, double lon2, double lat2) {
        final double R = 6372.8; // In kilometers
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
    }
