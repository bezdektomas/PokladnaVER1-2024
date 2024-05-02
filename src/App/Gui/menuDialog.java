package App.Gui;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import App.ObjednavkySeznam;
import App.Produkt;
import App.Menu.*;

public class menuDialog extends JFrame {
        private JDialog frame;

        private Produkt Menu;

        private javax.swing.JCheckBox bezleduBox;
        private javax.swing.JRadioButton bigmacButton;
        private javax.swing.ButtonGroup chodGroup;
        private javax.swing.JLabel chodLabel;
        private javax.swing.JRadioButton colaButton;
        private javax.swing.JRadioButton fantaButton;
        private javax.swing.JRadioButton hranolkyButton;
        private javax.swing.JButton pridatButton;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JCheckBox kecupBox;
        private javax.swing.JRadioButton malinovkaButton;
        private javax.swing.JRadioButton mcchickenButton;
        private javax.swing.JRadioButton mcroyalButton;
        private javax.swing.JLabel menuNadpisLabel;
        private javax.swing.JLabel navicLabel;
        private javax.swing.JRadioButton nugetsMenu;
        private javax.swing.ButtonGroup pitiGroup;
        private javax.swing.ButtonGroup prilohaGroup;
        private javax.swing.JLabel prilohaLabel;
        private javax.swing.JRadioButton salatButton;
        private javax.swing.JRadioButton salatprilohaButton;
        private javax.swing.JCheckBox sladkokyselaBox;
        private javax.swing.JRadioButton spriteButton;
        private javax.swing.JCheckBox syryBox;
        private javax.swing.JCheckBox tastickaBox;
        private javax.swing.JRadioButton westButton;

        public menuDialog(/* java.awt.Frame parent, boolean modal */) {

                // super(parent, modal);
                // frame = this;

                setDefaultCloseOperation(HIDE_ON_CLOSE);
                setSize(300, 300);
                setTitle("MC MENU");

                initComponents();
        }

        private void initComponents() {

                chodGroup = new javax.swing.ButtonGroup();
                prilohaGroup = new javax.swing.ButtonGroup();
                pitiGroup = new javax.swing.ButtonGroup();
                menuNadpisLabel = new javax.swing.JLabel();
                chodLabel = new javax.swing.JLabel();
                bigmacButton = new javax.swing.JRadioButton();
                mcchickenButton = new javax.swing.JRadioButton();
                mcroyalButton = new javax.swing.JRadioButton();
                nugetsMenu = new javax.swing.JRadioButton();
                salatButton = new javax.swing.JRadioButton();
                westButton = new javax.swing.JRadioButton();
                prilohaLabel = new javax.swing.JLabel();
                hranolkyButton = new javax.swing.JRadioButton();
                salatprilohaButton = new javax.swing.JRadioButton();
                jLabel3 = new javax.swing.JLabel();
                colaButton = new javax.swing.JRadioButton();
                fantaButton = new javax.swing.JRadioButton();
                spriteButton = new javax.swing.JRadioButton();
                malinovkaButton = new javax.swing.JRadioButton();
                navicLabel = new javax.swing.JLabel();
                sladkokyselaBox = new javax.swing.JCheckBox();
                tastickaBox = new javax.swing.JCheckBox();
                syryBox = new javax.swing.JCheckBox();
                kecupBox = new javax.swing.JCheckBox();
                pridatButton = new javax.swing.JButton();
                bezleduBox = new javax.swing.JCheckBox();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                menuNadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                menuNadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                menuNadpisLabel.setText("POSKLÁDEJ SI MENU");

                chodLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                chodLabel.setText("Vyber si hlavní chod");

                chodGroup.add(bigmacButton);
                bigmacButton.setText("Big Mac - 129 Kč");

                chodGroup.add(mcchickenButton);
                mcchickenButton.setText("McChicken - 129 Kč");

                chodGroup.add(mcroyalButton);
                mcroyalButton.setText("McRoyal - 129 Kč");

                chodGroup.add(nugetsMenu);
                nugetsMenu.setText("6 ks McNugets - 129 Kč");

                chodGroup.add(salatButton);
                salatButton.setText("Zahradní salát - 129 Kč");

                chodGroup.add(westButton);
                westButton.setText("West Coast Baken - 169 Kč");

                prilohaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                prilohaLabel.setText("Vyber si přílohu");
                prilohaGroup.add(hranolkyButton);

                hranolkyButton.setText("Hranolky");

                prilohaGroup.add(salatprilohaButton);

                salatprilohaButton.setText("Salát");

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel3.setText("Vyber si pití");

                pitiGroup.add(colaButton);
                colaButton.setText("CocaCola");

                pitiGroup.add(fantaButton);
                fantaButton.setText("Fanta");

                pitiGroup.add(spriteButton);
                spriteButton.setText("Sprite");

                pitiGroup.add(malinovkaButton);
                malinovkaButton.setText("Malinovka");

                navicLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                navicLabel.setText("Dej si něco navíc");

                sladkokyselaBox.setText("Sladkokyselá omáčka + 10 Kč");

                tastickaBox.setText("Taštička + 29 Kč");

                syryBox.setText("Sýrové kroužky + 39 Kč");

                kecupBox.setText("Kečup + 6 Kč");

                pridatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                pridatButton.setText("PŘIDAT DO KOŠÍKU");
                pridatButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                pridatButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                pridatButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                pridatButtonMouseClicked(evt);
                        }
                });

                bezleduBox.setText("Bez ledu");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup().addComponent(menuNadpisLabel,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(17, 17, 17))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                .addComponent(westButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(chodLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(nugetsMenu,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(mcchickenButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(bigmacButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(mcroyalButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(salatButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addGap(67, 67, 67)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(fantaButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                93,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(prilohaLabel,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                123,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(hranolkyButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(salatprilohaButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                123,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(colaButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(spriteButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(malinovkaButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(bezleduBox,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                81,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGap(31, 31, 31)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                layout.createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                                .addComponent(navicLabel,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                123,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(sladkokyselaBox,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(kecupBox,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(tastickaBox,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(syryBox,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                158,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addComponent(pridatButton,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                178,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGap(17, 17, 17)))))));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(menuNadpisLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(chodLabel).addComponent(
                                                                                prilohaLabel)
                                                                .addComponent(navicLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(bigmacButton).addComponent(hranolkyButton)
                                                                .addComponent(sladkokyselaBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(mcchickenButton)
                                                                .addComponent(salatprilohaButton)
                                                                .addComponent(kecupBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(mcroyalButton)
                                                                                .addComponent(jLabel3))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(nugetsMenu)
                                                                                                .addComponent(colaButton)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(tastickaBox)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(syryBox)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(salatButton).addComponent(fantaButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                pridatButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(westButton)
                                                                                .addComponent(spriteButton))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(malinovkaButton)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(bezleduBox)))
                                                .addContainerGap()));

                pack();
        }

        private void pridatButtonMouseClicked(java.awt.event.MouseEvent evt) {

                try {

                        if (westButton.isSelected()) {
                                Menu = new Westcoast();
                        }
                        if (bigmacButton.isSelected()) {
                                Menu = new Bigmac();
                        }

                        if (mcchickenButton.isSelected()) {
                                Menu = new Mcchicken();
                        }

                        if (mcroyalButton.isSelected()) {
                                Menu = new McRoyal();
                        }

                        if (salatButton.isSelected()) {
                                Menu = new Salat();
                        }

                        if (nugetsMenu.isSelected()) {
                                Menu = new Nuggets();
                        }

                        if (hranolkyButton.isSelected()) {
                                Menu = new HranolkyPridavek(Menu);
                        }

                        if (salatprilohaButton.isSelected()) {
                                Menu = new SalatPridavek(Menu);
                        }

                        if (colaButton.isSelected()) {
                                Menu = new CocacolaPridavek(Menu);
                        }

                        if (fantaButton.isSelected()) {
                                Menu = new FantaPridavek(Menu);
                        }

                        if (spriteButton.isSelected()) {
                                Menu = new SpritePridavek(Menu);
                        }

                        if (malinovkaButton.isSelected()) {
                                Menu = new MalinovkaPridavek(Menu);
                        }

                        if (bezleduBox.isSelected()) {
                                Menu = new LedPridavek(Menu);
                        }

                        if (sladkokyselaBox.isSelected()) {
                                Menu = new SladkokyselaPridavek(Menu);
                        }

                        if (kecupBox.isSelected()) {
                                Menu = new KecupPridavek(Menu);
                        }

                        if (tastickaBox.isSelected()) {
                                Menu = new TastickaPridavek(Menu);
                        }

                        if (syryBox.isSelected()) {
                                Menu = new KrouzkyPridavek(Menu);
                        }

                        if (chodGroup.getSelection() == null || prilohaGroup.getSelection() == null
                                        || pitiGroup.getSelection() == null) {
                                JOptionPane.showMessageDialog(this,
                                                "Nevybral si potřebné položky k dokončení objednávky!", "Chyba",
                                                JOptionPane.ERROR_MESSAGE);
                        } else {

                                ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).setPolozka(Menu.getNazev(),
                                                Menu.cena());
                                Menu = null;
                                JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch",
                                                JOptionPane.INFORMATION_MESSAGE);

                                this.dispose();
                                hlavniMenuFrame hlfr = new hlavniMenuFrame();
                                hlfr.setVisible(true);
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Nevybral si potřebné položky k dokončení objednávky!",
                                        "Chyba", JOptionPane.ERROR_MESSAGE);
                }

        }
}
