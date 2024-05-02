package App.Gui;

import javax.swing.JFrame;

import App.ObjednavkySeznam;

public class startFrame extends JFrame {

        private static final long serialVersionUID = 1L;

        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;

        public startFrame() {
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setTitle("POKLADNA");
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("POKLADNA");

                jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
                jButton1.setText("NOVÁ OBJEDNÁVKA");

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jButton2.setText("HISTORIE OBJEDNÁVEK");

                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jButton3.setText("UKONČIT");

                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                190,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                80, Short.MAX_VALUE)
                                                                                .addComponent(jButton3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                190,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(51, 51, 51)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addComponent(jLabel1)
                                                .addGap(70, 70, 70)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72,
                                                                Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)));

                pack();
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

                

                System.out.println("POČET OBJ: " + ObjednavkySeznam.pocetObjednavek());

                
                int objednavkaPolozkyToDel = 0;

                if (ObjednavkySeznam.pocetObjednavek() > 8) {
                        ObjednavkySeznam.setOpakovaniObjednavek();
                        ObjednavkySeznam.resetPoradi();
                }
                
                if (ObjednavkySeznam.getOpakovaniObjednavek() == false) {
                        ObjednavkySeznam.novaObjednavka();
                } else {
                        ObjednavkySeznam.opakovaniPridat();
                }
                
                if (ObjednavkySeznam.getOpakovaniObjednavek() == true) {
                        objednavkaPolozkyToDel = ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek();

                        for (int i = 0; i < objednavkaPolozkyToDel; i++) {
                               ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).removePolozka(0);
                        }
                }

                System.out.println(ObjednavkySeznam.pocetObjednavek());

                
                System.out.println("POČET OBJ: " + ObjednavkySeznam.pocetObjednavek());

                hlavniMenuFrame hlMenu = new hlavniMenuFrame();

                hlMenu.setVisible(true);
                this.dispose();

        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                historieFrame historie = new historieFrame(this, true);
                historie.setVisible(true);
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
        }
}
