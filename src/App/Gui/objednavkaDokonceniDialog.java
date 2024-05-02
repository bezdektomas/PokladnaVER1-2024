package App.Gui;

import App.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class objednavkaDokonceniDialog extends JFrame {

        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel nadpisLabel;
        private javax.swing.JTextArea objednavkaVypisArea;
        private javax.swing.JButton potvrditButton;
        private javax.swing.JButton zahoditButton;

        public objednavkaDokonceniDialog() {
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setTitle("POKLADNA - POTVRZENÍ OBJEDNÁVKY");
                initComponents();
        }

        private void initComponents() {

                nadpisLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                objednavkaVypisArea = new javax.swing.JTextArea();
                potvrditButton = new javax.swing.JButton();
                zahoditButton = new javax.swing.JButton();

                nadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                nadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                nadpisLabel.setText("POTVRZENÍ OBJEDNÁVKY");

                objednavkaVypisArea.setEditable(false);
                objednavkaVypisArea.setColumns(20);
                objednavkaVypisArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
                objednavkaVypisArea.setRows(5);

                String objednavkaVypis = "";
                String nazevPol;

                for (int i = 0; i < ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek(); i++) {
                                objednavkaVypis += ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).getPolozka(i).nazev();
                                objednavkaVypis = objednavkaVypis.replace("+", "\n");
                                nazevPol = ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).getPolozka(i).nazev();
                                for (int j = 0; j < (40 - nazevPol.substring(nazevPol.lastIndexOf("+")+1).length()); j++) {
                                        objednavkaVypis += ("\u00A0");
                                    }
                                    objednavkaVypis += ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).getPolozka(i).cena() + " Kč\n\n";
                }

                objednavkaVypis += "\nCelková cena: " + ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).celkovaCena() + " Kč";
                objednavkaVypisArea.setText(objednavkaVypis);

                jScrollPane1.setViewportView(objednavkaVypisArea);

                potvrditButton.setText("POTVRDIT");
                potvrditButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                potvrditButtonMouseClicked(evt);
                        }
                });

                zahoditButton.setText("ZAHODIT");
                zahoditButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                zahoditButtonMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                .addComponent(jScrollPane1).addComponent(nadpisLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                488, Short.MAX_VALUE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addComponent(potvrditButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(zahoditButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                229,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(nadpisLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(zahoditButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                68, Short.MAX_VALUE)
                                                                .addComponent(potvrditButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addContainerGap()));

                pack();
        }

        private void zahoditButtonMouseClicked(java.awt.event.MouseEvent evt) {

                Object[] volbyDialog = { "  Ano  ", "  Ne  " };
                int rozhodnuti = JOptionPane.showOptionDialog(this, "Opravdu chceš zahodit tuto objednávku?",
                                "Potvrzení", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, volbyDialog,
                                volbyDialog[0]);
                if (rozhodnuti == JOptionPane.YES_OPTION) {
                        if (ObjednavkySeznam.getOpakovaniObjednavek() == false) {
                                ObjednavkySeznam.smazatPosledni();
                        } else {
                                ObjednavkySeznam.odebratPosledni();
                        }

                        startFrame startFr = new startFrame();

                        this.dispose();
                        startFr.setVisible(true);
                }
        }

        private void potvrditButtonMouseClicked(java.awt.event.MouseEvent evt) {
                Tiskarna pr = Tiskarna.getTiskarna();

                pr.ucetenka(ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()),
                                ObjednavkySeznam.pocetObjednavek());

                startFrame startFr = new startFrame();
                JOptionPane.showMessageDialog(this,
                                "Úspěšně objednáno! Účtenka byla vytisknuta a uložena\n jako objednávka "
                                                + (ObjednavkySeznam.pocetObjednavek() + 1) + ".",
                                "ÚSPĚCH", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                startFr.setVisible(true);

        }

}
