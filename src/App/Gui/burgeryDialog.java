package App.Gui;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import App.*;
import App.Burgery.*;

public class burgeryDialog extends JFrame {
    private javax.swing.JButton bigMacButton;
    private javax.swing.JButton cheeseburgerButton;
    private javax.swing.JButton hamburgerButton;
    private javax.swing.JLabel nadpisLabel;
    private javax.swing.JButton tastyCheeseBurger;
    private javax.swing.JButton tastyChickenBurger;

    private Produkt Burger;

    public burgeryDialog() {
        initComponents();
    }

    private void initComponents() {

        nadpisLabel = new javax.swing.JLabel();
        hamburgerButton = new javax.swing.JButton();
        cheeseburgerButton = new javax.swing.JButton();
        tastyChickenBurger = new javax.swing.JButton();
        tastyCheeseBurger = new javax.swing.JButton();
        bigMacButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nadpisLabel.setText("BURGERY");

        hamburgerButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hamburgerButton.setText("<html> Hamburger<br><center>33 Kč</center></html>");
        hamburgerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburgerButton(evt);
                ;
            }
        });

        cheeseburgerButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cheeseburgerButton.setText("<html> Cheeseburger<br><center>33 Kč</center></html>");
        cheeseburgerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeseburgerButton(evt);
            }
        });

        tastyChickenBurger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tastyChickenBurger.setText("<html> Tasty Chicken<br><center>39 Kč</center></html>");
        tastyChickenBurger.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tastyChickenButton(evt);
            }
        });

        tastyCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tastyCheeseBurger.setText("<html> Tasty Cheese<br><center>39 Kč</center></html>");
        tastyCheeseBurger.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tastyCheeseButton(evt);
            }
        });

        bigMacButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bigMacButton.setText("<html> Big Mac<br><center>89 Kč</center></html>");
        bigMacButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigMacButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(hamburgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cheeseburgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tastyChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tastyCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nadpisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 525,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bigMacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(nadpisLabel).addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hamburgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cheeseburgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tastyChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tastyCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bigMacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE)));

        pack();
    }

    private void hamburgerButton(java.awt.event.ActionEvent evt) {
        Burger = new Hamburger();

        pridavkyBurgerDialog prBurg = new pridavkyBurgerDialog(Burger);
        this.dispose();
        prBurg.setVisible(true);
        Burger = null;
    }

    private void cheeseburgerButton(java.awt.event.ActionEvent evt) {
        Burger = new Cheeseburger();

        pridavkyBurgerDialog prBurg = new pridavkyBurgerDialog(Burger);
        this.dispose();
        prBurg.setVisible(true);
        Burger = null;
    }

    private void tastyChickenButton(java.awt.event.ActionEvent evt) {
        Burger = new Tastychicken();

        pridavkyBurgerDialog prBurg = new pridavkyBurgerDialog(Burger);
        this.dispose();
        prBurg.setVisible(true);
        Burger = null;
    }

    private void tastyCheeseButton(java.awt.event.ActionEvent evt) {
        Burger = new Tastycheese();

        pridavkyBurgerDialog prBurg = new pridavkyBurgerDialog(Burger);
        this.dispose();
        prBurg.setVisible(true);
        Burger = null;
    }

    private void bigMacButton(java.awt.event.ActionEvent evt) {
        Burger = new Bigmac();

        pridavkyBurgerDialog prBurg = new pridavkyBurgerDialog(Burger);
        this.dispose();
        prBurg.setVisible(true);
        Burger = null;
    }

}
