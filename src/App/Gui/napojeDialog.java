package App.Gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import App.Napoje.*;

import App.*;

public class napojeDialog extends JFrame {
    private Produkt Napoj;
    private javax.swing.JButton colaButton;
    private javax.swing.JButton fantaButton;
    private javax.swing.JButton liptonButton;
    private javax.swing.JButton malinovkaButton;
    private javax.swing.JLabel napojeLabel;
    private javax.swing.JButton spriteButton;
    private javax.swing.JButton vineaButton;
    private javax.swing.JButton vodaButton;

    public napojeDialog() {
        initComponents();
    }

    private void initComponents() {

        napojeLabel = new javax.swing.JLabel();
        colaButton = new javax.swing.JButton();
        fantaButton = new javax.swing.JButton();
        spriteButton = new javax.swing.JButton();
        malinovkaButton = new javax.swing.JButton();
        liptonButton = new javax.swing.JButton();
        vodaButton = new javax.swing.JButton();
        vineaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        napojeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        napojeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        napojeLabel.setText("NÁPOJE");

        colaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        colaButton.setText("<html> CocaCola<br><center>39 Kč</center></html>");
        colaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colaButtonMouseClicked(evt);
            }
        });

        fantaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fantaButton.setText("<html> Fanta<br><center>39 Kč</center></html>");
        fantaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fantaButtonMouseClicked(evt);
            }
        });

        spriteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        spriteButton.setText("<html> Sprite<br><center>39 Kč</center></html>");
        spriteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spriteButtonMouseClicked(evt);
            }
        });

        malinovkaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        malinovkaButton.setText("<html> Malinovka<br><center>33 Kč</center></html>");
        malinovkaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                malinovkaButtonMouseClicked(evt);
            }
        });

        liptonButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        liptonButton.setText("<html> Lipton<br><center>39 Kč</center></html>");
        liptonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                liptonButtonMouseClicked(evt);
            }
        });

        vodaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vodaButton.setText("<html> Voda<br><center>29 Kč</center></html>");
        vodaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vodaButtonMouseClicked(evt);
            }
        });

        vineaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vineaButton.setText("<html> Vinea<br><center>39 Kč</center></html>");
        vineaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vineaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(napojeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vineaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fantaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(spriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(liptonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(malinovkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(napojeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(malinovkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liptonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vineaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void colaButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Cocacola();
        
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void fantaButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Fanta();
        
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void spriteButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Sprite();
       
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void vodaButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Voda();
        
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void malinovkaButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Malinovka();
        
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void liptonButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Lipton();
       
        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void vineaButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Napoj = new Vinea();

        bezLedu();
        JOptionPane.showMessageDialog(this, "Objednávka úspěšně přidána do košíku!", "Úspěch", JOptionPane.INFORMATION_MESSAGE);
        hlavniMenuFrame hlFr = new hlavniMenuFrame();
        this.dispose();
        hlFr.setVisible(true);
    }

    private void bezLedu() {
        Object[] volbyDialog = { "  Ano  ", "  Ne " };
            int rozhodnuti = JOptionPane.showOptionDialog(this, "Přeješ si k nápoji led?", "Potvrzení",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, volbyDialog, volbyDialog[0]);
            if (rozhodnuti == JOptionPane.NO_OPTION) {
                Napoj = new LedPridavek(Napoj);
            }
            ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).setPolozka(Napoj.getNazev(), Napoj.cena());
            Napoj = null;
    }
}
