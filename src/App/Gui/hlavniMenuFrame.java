package App.Gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import App.ObjednavkySeznam;
import java.util.Arrays;

public class hlavniMenuFrame extends JFrame {

    String[] objednavkaVypis = new String[0];

    private static final long serialVersionUID = 1L;

    private javax.swing.JButton burgeryButton;
    private javax.swing.JLabel cenaObjednavkyLabel;
    private javax.swing.JButton dokoncitButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel nadpisLabel;
    private javax.swing.JButton napojeButton;
    private javax.swing.JLabel objednanePolozkyLabel;
    private javax.swing.JButton ostatniButton;
    private javax.swing.JList<String> polozkyList;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton smazatPolozkuButton;

    public hlavniMenuFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("POKLADNA - OBJEDNÁVKA");

        initComponents();
    }

    private void initComponents() {

        dokoncitButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        nadpisLabel = new javax.swing.JLabel();
        burgeryButton = new javax.swing.JButton();
        napojeButton = new javax.swing.JButton();
        ostatniButton = new javax.swing.JButton();
        cenaObjednavkyLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        polozkyList = new javax.swing.JList<>();
        objednanePolozkyLabel = new javax.swing.JLabel();
        smazatPolozkuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dokoncitButton.setBackground(new java.awt.Color(255, 255, 255));
        dokoncitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dokoncitButton.setText("DOKONČIT OBJEDNÁVKU");
        dokoncitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dokoncitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokoncitButtonActionPerformed(evt);
            }
        });

        menuButton.setFont(new java.awt.Font("Tahoma", 0, 21));
        menuButton.setText("MENU");
        menuButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        nadpisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nadpisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nadpisLabel.setText("OBJEDNÁVKA");

        burgeryButton.setFont(new java.awt.Font("Tahoma", 0, 21));
        burgeryButton.setText("BURGERY");
        burgeryButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        burgeryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgeryButtonActionPerformed(evt);
            }
        });

        napojeButton.setFont(new java.awt.Font("Tahoma", 0, 21));
        napojeButton.setText("NÁPOJE");
        napojeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        napojeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                napojeButtonActionPerformed(evt);
            }
        });

        ostatniButton.setFont(new java.awt.Font("Tahoma", 0, 21));
        ostatniButton.setText("OSTATNÍ");
        ostatniButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ostatniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostatniButtonActionPerformed(evt);
            }
        });

        cenaObjednavkyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cenaObjednavkyLabel.setText("Cena objednávky: 0 Kč");

        polozkyList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Zatím nebyla vytvořena žádná objednávka!" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        polozkyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(polozkyList);

        objednanePolozkyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        objednanePolozkyLabel.setText("Objednané položky");

        smazatPolozkuButton.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        smazatPolozkuButton.setText("Smazat vybranou položku");
        smazatPolozkuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smazatPolozkuButtonActionPerformed(evt);
            }
        });
        smazatPolozkuButton.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(ostatniButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(burgeryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(napojeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(smazatPolozkuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 279,
                                        Short.MAX_VALUE)
                                .addComponent(scrollPane).addComponent(objednanePolozkyLabel))
                        .addGap(23, 23, 23))
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(nadpisLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(90, 90, 90).addComponent(dokoncitButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cenaObjednavkyLabel).addGap(328, 328, 328)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap().addComponent(nadpisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addComponent(objednanePolozkyLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 288,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(smazatPolozkuButton))
                                .addGroup(layout.createSequentialGroup().addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(burgeryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(napojeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(91, 91, 91).addComponent(ostatniButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(cenaObjednavkyLabel).addGap(18, 18, 18).addComponent(dokoncitButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)));

        pack();

        if (ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek() != 0) {
            smazatPolozkuButton.setEnabled(true);
            System.out.println("Délka pole před změnou: " + objednavkaVypis.length);
            objednavkaVypis = Arrays.copyOf(objednavkaVypis,
                    ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek());
            System.out.println("Délka pole po změně: " + objednavkaVypis.length);
            cenaObjednavkyLabel.setText("Celková cena: "
                    + ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).celkovaCena() + " Kč");

            String nazevObjednavky = "<html><b>";
            for (int i = 0; i < ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek(); i++) {
                nazevObjednavky += ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).getPolozka(i).nazev();
                nazevObjednavky += "</b><br>&nbsp;</html>";
                nazevObjednavky = nazevObjednavky.replace("+", "<br>&nbsp;&nbsp;");
                objednavkaVypis[i] = nazevObjednavky;
                System.out.println(objednavkaVypis[i]);
                nazevObjednavky = "<html><b>";

            }
            polozkyList.setModel(new javax.swing.AbstractListModel<String>() {
                // String[] strings = { "Zatím nebyla vytvořena žádná objednávka!" };
                public int getSize() {
                    return objednavkaVypis.length;
                }

                public String getElementAt(int i) {
                    return objednavkaVypis[i];
                }
            });
        }
    }

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        menuDialog menuDia = new menuDialog();
        menuDia.setVisible(true);

    }

    private void burgeryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        burgeryDialog burgDia = new burgeryDialog();
        burgDia.setVisible(true);

    }

    private void napojeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        napojeDialog napDia = new napojeDialog();
        napDia.setVisible(true);

    }

    private void ostatniButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        ostatniDialog ostDia = new ostatniDialog();
        ostDia.setVisible(true);

    }

    private void dokoncitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek() != 0) {
            objednavkaDokonceniDialog objDoDia = new objednavkaDokonceniDialog();
            objDoDia.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Objednávka je prázdná!", "CHYBA", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void smazatPolozkuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            JOptionPane.showMessageDialog(this,
                    "Položka: " + ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek())
                            .getPolozka(polozkyList.getSelectedIndex()).nazev() + " odstraněna z košíku.",
                    "Odebráno", JOptionPane.INFORMATION_MESSAGE);
            ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).removePolozka(polozkyList.getSelectedIndex());

            System.out.println("Délka pole před změnou: " + objednavkaVypis.length);
            objednavkaVypis = Arrays.copyOf(objednavkaVypis,
                    ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek());
            System.out.println("Délka pole po změně: " + objednavkaVypis.length);
            cenaObjednavkyLabel.setText("Celková cena: "
                    + ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).celkovaCena() + " Kč");

            String nazevObjednavky = "<html><b>";
            for (int i = 0; i < ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek(); i++) {
                nazevObjednavky += ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).getPolozka(i).nazev();
                nazevObjednavky += "</b><br>&nbsp;</html>";
                nazevObjednavky = nazevObjednavky.replace("+", "<br>&nbsp;&nbsp;");
                objednavkaVypis[i] = nazevObjednavky;
                System.out.println(objednavkaVypis[i]);
                nazevObjednavky = "<html><b>";

            }

            if (ObjednavkySeznam.ziskat(ObjednavkySeznam.pocetObjednavek()).pocetPolozek() == 0) {
                polozkyList.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = { "Zatím nebyla vytvořena žádná objednávka!" };

                    public int getSize() {
                        return strings.length;
                    }

                    public String getElementAt(int i) {
                        return strings[i];
                    }
                });
                smazatPolozkuButton.setEnabled(false);
            } else {
                polozkyList.setModel(new javax.swing.AbstractListModel<String>() {
                    public int getSize() {
                        return objednavkaVypis.length;
                    }

                    public String getElementAt(int i) {
                        return objednavkaVypis[i];
                    }
                });
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Nevybral si položku k odstranění!", "CHYBA", JOptionPane.WARNING_MESSAGE);
        }
    }
}
