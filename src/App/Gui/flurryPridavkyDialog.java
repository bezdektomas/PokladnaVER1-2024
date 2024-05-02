package App.Gui;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import App.ObjednavkySeznam;
import App.Produkt;
import App.Ostatni.Flurry;
import App.Ostatni.FlurryPridavky.*;

public class flurryPridavkyDialog extends JFrame {

        private Produkt Ostatni;

        private javax.swing.JRadioButton boruvkyBox;
        private javax.swing.JRadioButton cokoladaBox;
        private javax.swing.JRadioButton jahodaBox;
        private javax.swing.JRadioButton karamelBox;
        private javax.swing.JRadioButton kitkatBox;
        private javax.swing.JRadioButton lentilkyBox;
        private javax.swing.JRadioButton lotusBox;
        private javax.swing.JLabel nadpisLabel;
        private javax.swing.ButtonGroup polevaGroup;
        private javax.swing.JLabel polevaLabel;
        private javax.swing.ButtonGroup posypkaGroup;
        private javax.swing.JLabel posypkaLabel;
        private javax.swing.JRadioButton snickersBox;
        private javax.swing.JButton vybratButton;

        public flurryPridavkyDialog() {
                initComponents();
        }

        private void initComponents() {

                polevaGroup = new javax.swing.ButtonGroup();
                posypkaGroup = new javax.swing.ButtonGroup();
                nadpisLabel = new javax.swing.JLabel();
                cokoladaBox = new javax.swing.JRadioButton();
                polevaLabel = new javax.swing.JLabel();
                posypkaLabel = new javax.swing.JLabel();
                jahodaBox = new javax.swing.JRadioButton();
                karamelBox = new javax.swing.JRadioButton();
                boruvkyBox = new javax.swing.JRadioButton();
                kitkatBox = new javax.swing.JRadioButton();
                lentilkyBox = new javax.swing.JRadioButton();
                snickersBox = new javax.swing.JRadioButton();
                lotusBox = new javax.swing.JRadioButton();
                vybratButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                nadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                nadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                nadpisLabel.setText("VYBER SI INGREDIENCE");

                polevaGroup.add(cokoladaBox);
                cokoladaBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                cokoladaBox.setText("Čokoládová");
                cokoladaBox.setActionCommand("Čokoládová poleva");

                polevaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                polevaLabel.setText("Poleva:");

                posypkaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                posypkaLabel.setText("Posypka:");

                polevaGroup.add(jahodaBox);
                jahodaBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jahodaBox.setText("Jahodová");
                jahodaBox.setActionCommand("Jahodová poleva");

                polevaGroup.add(karamelBox);
                karamelBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                karamelBox.setText("Karamel");
                karamelBox.setActionCommand("Karamelová poleva");

                polevaGroup.add(boruvkyBox);
                boruvkyBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                boruvkyBox.setText("Borůvková");
                boruvkyBox.setActionCommand("Borůvková poleva");

                posypkaGroup.add(kitkatBox);
                kitkatBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                kitkatBox.setText("KitKat");
                kitkatBox.setActionCommand("KitKat posypka");

                posypkaGroup.add(lentilkyBox);
                lentilkyBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                lentilkyBox.setText("Lentilky");
                lentilkyBox.setActionCommand("Lentilky posypka");

                posypkaGroup.add(snickersBox);
                snickersBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                snickersBox.setText("Snickers + 5 Kč");
                snickersBox.setActionCommand("Snickers posypka");

                posypkaGroup.add(lotusBox);
                lotusBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                lotusBox.setText("Lotus");
                lotusBox.setActionCommand("Lotus posypka");

                vybratButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                vybratButton.setText("VYBRAT");
                vybratButton.addActionListener(new ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                vybratButton(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(vybratButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(nadpisLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                layout.createSequentialGroup().addGroup(
                                                                                                layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(cokoladaBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                199,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(polevaLabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                113,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jahodaBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                199,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(karamelBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                199,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(boruvkyBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                199,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(45, 45, 45)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(lotusBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                162,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(snickersBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                162,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(lentilkyBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                162,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(posypkaLabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                113,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(kitkatBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                162,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(nadpisLabel)
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(polevaLabel).addComponent(posypkaLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cokoladaBox).addComponent(kitkatBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jahodaBox).addComponent(lentilkyBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(karamelBox).addComponent(snickersBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(boruvkyBox).addComponent(lotusBox))
                                                .addGap(27, 27, 27)
                                                .addComponent(vybratButton, javax.swing.GroupLayout.DEFAULT_SIZE, 59,
                                                                Short.MAX_VALUE)
                                                .addContainerGap()));

                pack();
        }

        private void vybratButton(java.awt.event.ActionEvent evt) {
                try {

                        if (polevaGroup.getSelection() != null && posypkaGroup.getSelection() != null) {
                                Ostatni = new Flurry();
                                JOptionPane.showMessageDialog(this, "McFlurry byla úspěšně přidána do košíku!", "ÚSPĚCH!",
                                        JOptionPane.INFORMATION_MESSAGE);
                        }

                        
                        if (boruvkyBox.isSelected()) {
                                Ostatni = new BoruvkyPridavek(Ostatni);
                        }

                        if (cokoladaBox.isSelected()) {
                                Ostatni = new CokoladaPridavek(Ostatni);
                        }

                        if (jahodaBox.isSelected()) {
                                Ostatni = new JahodaPridavek(Ostatni);
                        }

                        if (karamelBox.isSelected()) {
                                Ostatni = new KaramelPridavek(Ostatni);
                        }

                        if (kitkatBox.isSelected()) {
                                Ostatni = new KitkatPridavek(Ostatni);
                        }

                        if (lentilkyBox.isSelected()) {
                                Ostatni = new LentilkyPridavek(Ostatni);
                        }

                        if (lotusBox.isSelected()) {
                                Ostatni = new LotusPridavek(Ostatni);
                        }

                        if (snickersBox.isSelected()) {
                                Ostatni = new SnickersPridavek(Ostatni);
                        }

                        

                        ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).setPolozka(Ostatni.getNazev(),
                                        Ostatni.cena());
                        Ostatni = null;
                        hlavniMenuFrame hlFr = new hlavniMenuFrame();
                        this.dispose();
                        hlFr.setVisible(true);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Pro dokončení objednávky vyber polevu i posypku!", "CHYBA",
                                        JOptionPane.WARNING_MESSAGE);
                }
        }

}
