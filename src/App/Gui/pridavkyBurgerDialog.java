package App.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import App.*;
import App.Burgery.*;

public class pridavkyBurgerDialog extends JFrame {

    private Produkt Burger;
    private javax.swing.JCheckBox bulkaButton;
    private javax.swing.JLabel nadpisLabel;
    private javax.swing.JCheckBox okurkaBox;
    private javax.swing.JButton pokracovatButton;
    private javax.swing.JCheckBox rajceBox;
    private javax.swing.JCheckBox slaninaBox;
    private javax.swing.JCheckBox syrButton;
    private javax.swing.JLabel jLabel1;

    public pridavkyBurgerDialog(Produkt Burger) {
        initComponents();
        this.Burger = Burger;
    }

    private void initComponents() {

        nadpisLabel = new javax.swing.JLabel();
        slaninaBox = new javax.swing.JCheckBox();
        rajceBox = new javax.swing.JCheckBox();
        okurkaBox = new javax.swing.JCheckBox();
        syrButton = new javax.swing.JCheckBox();
        pokracovatButton = new javax.swing.JButton();
        bulkaButton = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nadpisLabel.setText("DEJ SI NĚCO NAVÍC!");

        slaninaBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slaninaBox.setText("Slanina                + 15 Kč");

        rajceBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rajceBox.setText("Rajče                   + 10 Kč");

        okurkaBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okurkaBox.setText("Okurka                + 10 Kč");

        syrButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        syrButton.setText("Sýr                      + 10 Kč");

        pokracovatButton.setText("POKRAČOVAT");
        pokracovatButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokracovatButtonMouseClicked(evt);
            }
        });

        bulkaButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bulkaButton.setText("Bezlepková bulka + 15 Kč");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pokud nechceš nic navíc, klikni na pokračovat.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pokracovatButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nadpisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bulkaButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(slaninaBox, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rajceBox, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(okurkaBox, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(syrButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(128, 128, 128)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(nadpisLabel).addGap(9, 9, 9)
                        .addComponent(slaninaBox).addGap(18, 18, 18).addComponent(rajceBox).addGap(18, 18, 18)
                        .addComponent(okurkaBox).addGap(18, 18, 18).addComponent(syrButton).addGap(14, 14, 14)
                        .addComponent(bulkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokracovatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));

        pack();
    }

    private void pokracovatButtonMouseClicked(ActionEvent evt) {
        if (slaninaBox.isSelected() || rajceBox.isSelected() || okurkaBox.isSelected() || syrButton.isSelected()
                || bulkaButton.isSelected()) {
            if (slaninaBox.isSelected()) {
                Burger = new SlaninaPridavek(Burger);
            }

            if (rajceBox.isSelected()) {
                Burger = new RajcePridavek(Burger);
            }

            if (okurkaBox.isSelected()) {
                Burger = new OkurkaPridavek(Burger);
            }

            if (syrButton.isSelected()) {
                Burger = new SyrPridavek(Burger);
            }

            if (bulkaButton.isSelected()) {
                Burger = new BezlepkovaBulkaPridavek(Burger);
            }

            JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            Object[] volbyDialog = { "  Už jsem si to rozmyslel! Chci!  ", "  Ne  " };
            int rozhodnuti = JOptionPane.showOptionDialog(this, "Opravdu nehceš žádný přídavek?", "Potvrzení",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, volbyDialog, volbyDialog[0]);
            if (rozhodnuti == JOptionPane.NO_OPTION) {

            }
        }
        ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).setPolozka(Burger.getNazev(), Burger.cena());
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);

        Burger = null;
    }
}
