package App.Gui;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import App.ObjednavkySeznam;
import App.Produkt;
import App.Ostatni.*;

public class ostatniDialog extends JFrame {

    private Produkt Ostatni;

    private javax.swing.JButton flurryButton;
    private javax.swing.JButton hranolkyButton;
    private javax.swing.JButton kecupButton;
    private javax.swing.JLabel ostatniLabel;
    private javax.swing.JButton sladkokyselaButton;
    private javax.swing.JButton syrovaButton;
    private javax.swing.JButton tastickaButton;

    public ostatniDialog() {
        initComponents();
    }

    private void initComponents() {

        ostatniLabel = new javax.swing.JLabel();
        flurryButton = new javax.swing.JButton();
        tastickaButton = new javax.swing.JButton();
        sladkokyselaButton = new javax.swing.JButton();
        hranolkyButton = new javax.swing.JButton();
        syrovaButton = new javax.swing.JButton();
        kecupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ostatniLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ostatniLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ostatniLabel.setText("OSTATNÍ");

        flurryButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        flurryButton.setText("<html> McFlurry<br><center>55 Kč</center></html>");
        flurryButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flurryButton(evt);
            }
        });

        tastickaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tastickaButton.setText("<html> Taštička<br><center>29 Kč</center></html>");
        tastickaButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tastickaButton(evt);
            }
        });

        sladkokyselaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sladkokyselaButton.setText("<html> Sladkokyselá<br><center>omáčka 10 Kč</center></html>");
        sladkokyselaButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sladkokyselaButton(evt);
            }
        });

        hranolkyButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hranolkyButton.setText("<html> <center>Hranolky</center><center>35 Kč</center></html>");
        hranolkyButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hranolkyButton(evt);
            }
        });

        syrovaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        syrovaButton.setText("<html> <center>Sýrová</center><center>omáčka 15 Kč</center></html>");
        syrovaButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syrovaButton(evt);
            }
        });

        kecupButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kecupButton.setText("<html> Kečup<br><center>5 Kč</center></html>");
        kecupButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kecupButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ostatniLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(flurryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tastickaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sladkokyselaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(hranolkyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(syrovaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kecupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(ostatniLabel).addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(flurryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tastickaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sladkokyselaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hranolkyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(syrovaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kecupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE)));

        pack();
    }

    private void flurryButton(java.awt.event.ActionEvent evt) {
        
        flurryPridavkyDialog flPr = new flurryPridavkyDialog();
        this.dispose(); 
        flPr.setVisible(true);
    }

    private void tastickaButton(java.awt.event.ActionEvent evt) {
        Ostatni = new Tasticka();
        dokoncit();
    }

    private void hranolkyButton(java.awt.event.ActionEvent evt) {
        Ostatni = new Hranolky();
        dokoncit();
    }

    private void sladkokyselaButton(java.awt.event.ActionEvent evt) {
        Ostatni = new SladkokyselaOmacka();
        dokoncit();
    }

    private void kecupButton(java.awt.event.ActionEvent evt) {
        Ostatni = new Kecup();
        dokoncit();
    }

    private void syrovaButton(java.awt.event.ActionEvent evt) {
        Ostatni = new SyrovaOmacka();
        dokoncit();
    }

    private void dokoncit() {
        ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).setPolozka(Ostatni.getNazev(), Ostatni.cena());

        Ostatni = null;

        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch!",
                JOptionPane.INFORMATION_MESSAGE);

        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }
}
