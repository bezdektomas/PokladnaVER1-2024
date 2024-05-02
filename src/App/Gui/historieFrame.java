package App.Gui;

import App.*;

import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class historieFrame extends JDialog {

        private JDialog frame;

        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JComboBox<String> objednavkaSelectBox;
        private javax.swing.JButton tiskZnovuButton;
        private javax.swing.JTextArea vypisObjednavky;
        private javax.swing.JButton zpetButton;

        public historieFrame(java.awt.Frame parent, boolean modal) {

                super(parent, modal);
                frame = this;
                setDefaultCloseOperation(HIDE_ON_CLOSE);
                setTitle("POKLADNA - HISTORIE OBJEDNÁVEK");
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                objednavkaSelectBox = new javax.swing.JComboBox<>();
                jScrollPane1 = new javax.swing.JScrollPane();
                vypisObjednavky = new javax.swing.JTextArea();
                tiskZnovuButton = new javax.swing.JButton();
                zpetButton = new javax.swing.JButton();

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("HISTORIE OBJEDNÁVEK");

                objednavkaSelectBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                objednavkaSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Objednávka 1",
                                "Objednávka 2", "Objednávka 3", "Objednávka 4", "Objednávka 5", "Objednávka 6",
                                "Objednávka 7", "Objednávka 8", "Objednávka 9", "Objednávka 10" }));
                objednavkaSelectBox.addActionListener(new ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                zmenaObjednavky(evt);
                        }
                });

                vypisObjednavky.setEditable(false);
                vypisObjednavky.setFont(new java.awt.Font("Consolas", 0, 18));
                jScrollPane1.setViewportView(vypisObjednavky);

                tiskZnovuButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                tiskZnovuButton.setText("VYTISKNOUT ZNOVU");
                tiskZnovuButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tiskZnovuButton(evt);
                        }
                });

                zpetButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                zpetButton.setText("ZPĚT DO HLAVNÍ NABÍDKY");
                zpetButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                zpetButton(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(
                                                                jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574,
                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(objednavkaSelectBox, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1)
                                                                                .addComponent(tiskZnovuButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(zpetButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(37, 37, 37)))
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(objednavkaSelectBox,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tiskZnovuButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(zpetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                pack();
                zmena();
        }

        private void zmenaObjednavky(java.awt.event.ActionEvent evt) {
                zmena();

        }

        private void zmena() {
                try {
                        tiskZnovuButton.setEnabled(true);
                        int vyber = objednavkaSelectBox.getSelectedIndex();
                        String objednavkaVypis = "";
                        String nazevPol;

                        for (int i = 0; i < ObjednavkySeznam.ziskat(vyber).pocetPolozek(); i++) {
                                objednavkaVypis += ObjednavkySeznam.ziskat(vyber).getPolozka(i).nazev();
                                objednavkaVypis = objednavkaVypis.replace("+", "\n");
                                nazevPol = ObjednavkySeznam.ziskat(vyber).getPolozka(i).nazev();
                                for (int j = 0; j < (40
                                                - nazevPol.substring(nazevPol.lastIndexOf("+") + 1).length()); j++) {
                                        objednavkaVypis += ("\u00A0");
                                }
                                objednavkaVypis += ObjednavkySeznam.ziskat(vyber).getPolozka(i).cena() + " Kč\n\n";

                        }

                        objednavkaVypis += "\nCelková cena: " + ObjednavkySeznam.ziskat(vyber).celkovaCena() + " Kč";
                        vypisObjednavky.setText(objednavkaVypis.replace("+", "\n"));

                } catch (Exception e) {
                        tiskZnovuButton.setEnabled(false);
                        vypisObjednavky.setText(
                                        "Dosud nebyla vytvořena žádná objednávka\ns uvedeným pořadovým číslem!");
                }
        }

        private void tiskZnovuButton(java.awt.event.ActionEvent evt) {
                Tiskarna pr = Tiskarna.getTiskarna();
                pr.ucetenka(ObjednavkySeznam.ziskat(objednavkaSelectBox.getSelectedIndex()),
                                objednavkaSelectBox.getSelectedIndex());
                JOptionPane.showMessageDialog(this,
                                "Objednávka " + (objednavkaSelectBox.getSelectedIndex() + 1) + " úspěšně vytisknuta!",
                                "Tisk", JOptionPane.INFORMATION_MESSAGE);
        }

        private void zpetButton(java.awt.event.ActionEvent evt) {
                this.dispose();
        }
}
