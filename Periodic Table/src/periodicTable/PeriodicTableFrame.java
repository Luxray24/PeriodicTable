/**
 * 
 */
package periodicTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 * @author Mark
 *
 */
public class PeriodicTableFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int genericInt = 0;
	private int anotherGenericInt = 0;
	private JButton[] elementButtons = new JButton[162];
	private String[] elementButtonLabels = new String[162];
	private JPanel displayPanel = new JPanel();
	private static final Color nonmetalRed = new Color(255, 0, 0);
	private static final Color alkaliMetalGreen = new Color(25, 155, 25);
	private static final Color alkalineEarthMetalGreen = new Color(25, 100, 25);
	private static final Color metalloidViolet = new Color(200, 100, 255);
	private static final Color otherMetalPurple = new Color(100, 0, 100);
	private static final Color halogenPink = new Color(255, 0, 100);
	private static final Color nobleGasOrange = new Color(251, 78, 18);
	private static final Color transitionMetalBlue = new Color(0, 100, 255);
	private static final Color lanthanideBlue = new Color(0, 155, 155);
	private static final Color actinideBlue = new Color(0, 55, 55);
	private static final Color textWhite = new Color(255, 255, 255);
	private static final Color backgroundBlack = new Color(0, 0, 0);
	private NavBar mnuBar = new NavBar();
	private JMenu file = new JMenu("File");
	private NavMenuItem fileExit = new NavMenuItem("Exit");
	private JMenu options = new JMenu("Options");
	private JMenu help = new JMenu("Help");
	private JMenuItem helpAbout = new JMenuItem("About");
	public int switchVal = 1;

	PeriodicTableFrame() {
		UIManager.put("MenuBar.background", backgroundBlack);
		UIManager.put("MenuBar.foreground", textWhite);
		UIManager.put("Menu.background", backgroundBlack);
		UIManager.put("Menu.foreground", textWhite);
		UIManager.put("MenuItem.background", backgroundBlack);
		UIManager.put("MenuItem.foreground", textWhite);
		setLabels();
		setJMenuBar(mnuBar);
		mnuBar.setColor(backgroundBlack);
		mnuBar.setForeground(textWhite);
		mnuBar.add(file);
		file.setForeground(textWhite);
		file.add(fileExit);
		mnuBar.add(options);
		options.setForeground(textWhite);
		mnuBar.add(help);
		help.setForeground(textWhite);
		help.add(helpAbout);

		fileExit.addActionListener(this);
		helpAbout.addActionListener(this);

		fileExit.setActionCommand("Exit");
		helpAbout.setActionCommand("About");

		for (int i = 0; i < 162; i++) {
			elementButtons[i] = new JButton(elementButtonLabels[i]);
		}

		this.setLayout(new BorderLayout());
		displayPanel.setLayout(new GridLayout(9, 19, 5, 5));
		for (int i = 0; i < 162; i++) {
			displayPanel.add(elementButtons[i]);
			if (i > 0 && i < 17) {
				elementButtons[i].setVisible(false);
			}
			if (i > 19 && i < 30) {
				elementButtons[i].setVisible(false);
			}
			if (i > 37 && i < 48) {
				elementButtons[i].setVisible(false);
			}
			if (i > 125 && i < 129) {
				elementButtons[i].setVisible(false);
			}
			if (i > 143 && i < 147) {
				elementButtons[i].setVisible(false);
			}
		}
		for (int i = 0; i < 162; i++) {
			if (i == 0 || (i < 34 && i > 30) || i == 50 || i == 51 || i == 69) {
				elementButtons[i].setBackground(nonmetalRed);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 18 || i == 36 || i == 54 || i == 72 || i == 90 || i == 108) {
				elementButtons[i].setBackground(alkaliMetalGreen);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 19 || i == 37 || i == 55 || i == 73 || i == 91 || i == 109) {
				elementButtons[i].setBackground(alkalineEarthMetalGreen);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 30 || i == 49 || i == 67 || i == 68 || i == 86 || i == 87 || i == 105) {
				elementButtons[i].setBackground(metalloidViolet);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 48 || i == 66 || i == 84 || i == 85 || (i > 101 && i < 105) || (i > 119 && i < 124)) {
				elementButtons[i].setBackground(otherMetalPurple);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 34 || i == 52 || i == 70 || i == 88 || i == 106 || i == 124) {
				elementButtons[i].setBackground(halogenPink);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 17 || i == 35 || i == 53 || i == 71 || i == 89 || i == 107 || i == 125) {
				elementButtons[i].setBackground(nobleGasOrange);
				elementButtons[i].setForeground(textWhite);
			} else if ((i > 55 && i < 66) || (i > 73 && i < 84) || (i > 92 && i < 102) || (i > 110 && i < 120)) {
				elementButtons[i].setBackground(transitionMetalBlue);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 92 || (i > 128 && i < 144)) {
				elementButtons[i].setBackground(lanthanideBlue);
				elementButtons[i].setForeground(textWhite);
			} else if (i == 110 || (i > 146 && i < 162)) {
				elementButtons[i].setBackground(actinideBlue);
				elementButtons[i].setForeground(textWhite);
			}
		}
		add(displayPanel, BorderLayout.CENTER);

		for (int i = 0; i < 162; i++) {
			anotherGenericInt = i;
			if (i != 92 && i != 110) {
				elementButtons[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						genericInt = anotherGenericInt;
						if (genericInt == anotherGenericInt) {
							setVisible(false);
							Frame frame = new Frame();
							JPanel panel = new JPanel();
							JPanel panel2 = new JPanel();
							JScrollPane scroll = new JScrollPane();
							frame.setBounds(0, 0, 500, 500);
							frame.setVisible(true);
							panel.setLayout(new FlowLayout());
							panel2.setLayout(new FlowLayout());
							frame.add(panel, BorderLayout.CENTER);
							panel.add(scroll);
							frame.addWindowListener(new WindowAdapter() {
								public void windowClosing(WindowEvent e) {
									setVisible(true);
									frame.dispose();
								}
							});
						}
					}
				});
			}
			else{
				elementButtons[i].setEnabled(false);
			}
		}
	}

	private void setLabels() {
		elementButtonLabels[0] = "<html><div style=\"text-align: center;\"><strong>" + "1" + "<br>" + "H" + "<br>"
				+ "1.008" + "</strong></html>";
		elementButtonLabels[1] = "";
		elementButtonLabels[2] = "";
		elementButtonLabels[3] = "";
		elementButtonLabels[4] = "";
		elementButtonLabels[5] = "";
		elementButtonLabels[6] = "";
		elementButtonLabels[7] = "";
		elementButtonLabels[8] = "";
		elementButtonLabels[9] = "";
		elementButtonLabels[10] = "";
		elementButtonLabels[11] = "";
		elementButtonLabels[12] = "";
		elementButtonLabels[13] = "";
		elementButtonLabels[14] = "";
		elementButtonLabels[15] = "";
		elementButtonLabels[16] = "";
		elementButtonLabels[17] = "<html><div style=\"text-align: center;\"><strong>" + "2" + "<br>" + "He" + "<br>"
				+ "4.003" + "</strong></html>";
		elementButtonLabels[18] = "<html><div style=\"text-align: center;\"><strong>" + "3" + "<br>" + "Li" + "<br>"
				+ "6.941" + "</strong></html>";
		elementButtonLabels[19] = "<html><div style=\"text-align: center;\"><strong>" + "4" + "<br>" + "Be" + "<br>"
				+ "9.012" + "</strong></html>";
		elementButtonLabels[20] = "";
		elementButtonLabels[21] = "";
		elementButtonLabels[22] = "";
		elementButtonLabels[23] = "";
		elementButtonLabels[24] = "";
		elementButtonLabels[25] = "";
		elementButtonLabels[26] = "";
		elementButtonLabels[27] = "";
		elementButtonLabels[28] = "";
		elementButtonLabels[29] = "";
		elementButtonLabels[30] = "<html><div style=\"text-align: center;\"><strong>" + "5" + "<br>" + "B" + "<br>"
				+ "10.811" + "</strong></html>";
		elementButtonLabels[31] = "<html><div style=\"text-align: center;\"><strong>" + "6" + "<br>" + "C" + "<br>"
				+ "12.011" + "</strong></html>";
		elementButtonLabels[32] = "<html><div style=\"text-align: center;\"><strong>" + "7" + "<br>" + "N" + "<br>"
				+ "14.007" + "</strong></html>";
		elementButtonLabels[33] = "<html><div style=\"text-align: center;\"><strong>" + "8" + "<br>" + "O" + "<br>"
				+ "15.999" + "</strong></html>";
		elementButtonLabels[34] = "<html><div style=\"text-align: center;\"><strong>" + "9" + "<br>" + "F" + "<br>"
				+ "18.998" + "</strong></html>";
		elementButtonLabels[35] = "<html><div style=\"text-align: center;\"><strong>" + "10" + "<br>" + "Ne" + "<br>"
				+ "20.18" + "</strong></html>";
		elementButtonLabels[36] = "<html><div style=\"text-align: center;\"><strong>" + "11" + "<br>" + "Na" + "<br>"
				+ "22.99" + "</strong></html>";
		elementButtonLabels[37] = "<html><div style=\"text-align: center;\"><strong>" + "12" + "<br>" + "Mg" + "<br>"
				+ "24.305" + "</strong></html>";
		elementButtonLabels[38] = "";
		elementButtonLabels[39] = "";
		elementButtonLabels[40] = "";
		elementButtonLabels[41] = "";
		elementButtonLabels[42] = "";
		elementButtonLabels[43] = "";
		elementButtonLabels[44] = "";
		elementButtonLabels[45] = "";
		elementButtonLabels[46] = "";
		elementButtonLabels[47] = "";
		elementButtonLabels[48] = "<html><div style=\"text-align: center;\"><strong>" + "13" + "<br>" + "Al" + "<br>"
				+ "26.982" + "</strong></html>";
		elementButtonLabels[49] = "<html><div style=\"text-align: center;\"><strong>" + "14" + "<br>" + "Si" + "<br>"
				+ "28.086" + "</strong></html>";
		elementButtonLabels[50] = "<html><div style=\"text-align: center;\"><strong>" + "15" + "<br>" + "P" + "<br>"
				+ "30.974" + "</strong></html>";
		elementButtonLabels[51] = "<html><div style=\"text-align: center;\"><strong>" + "16" + "<br>" + "S" + "<br>"
				+ "32.065" + "</strong></html>";
		elementButtonLabels[52] = "<html><div style=\"text-align: center;\"><strong>" + "17" + "<br>" + "Cl" + "<br>"
				+ "35.453" + "</strong></html>";
		elementButtonLabels[53] = "<html><div style=\"text-align: center;\"><strong>" + "18" + "<br>" + "Ar" + "<br>"
				+ "39.948" + "</strong></html>";
		elementButtonLabels[54] = "<html><div style=\"text-align: center;\"><strong>" + "19" + "<br>" + "K" + "<br>"
				+ "39.098" + "</strong></html>";
		elementButtonLabels[55] = "<html><div style=\"text-align: center;\"><strong>" + "20" + "<br>" + "Ca" + "<br>"
				+ "40.078" + "</strong></html>";
		elementButtonLabels[56] = "<html><div style=\"text-align: center;\"><strong>" + "21" + "<br>" + "Sc" + "<br>"
				+ "44.956" + "</strong></html>";
		elementButtonLabels[57] = "<html><div style=\"text-align: center;\"><strong>" + "22" + "<br>" + "Ti" + "<br>"
				+ "47.867" + "</strong></html>";
		elementButtonLabels[58] = "<html><div style=\"text-align: center;\"><strong>" + "23" + "<br>" + "V" + "<br>"
				+ "50.942" + "</strong></html>";
		elementButtonLabels[59] = "<html><div style=\"text-align: center;\"><strong>" + "24" + "<br>" + "Cr" + "<br>"
				+ "51.996" + "</strong></html>";
		elementButtonLabels[60] = "<html><div style=\"text-align: center;\"><strong>" + "25" + "<br>" + "Mn" + "<br>"
				+ "54.938" + "</strong></html>";
		elementButtonLabels[61] = "<html><div style=\"text-align: center;\"><strong>" + "26" + "<br>" + "Fe" + "<br>"
				+ "55.845" + "</strong></html>";
		elementButtonLabels[62] = "<html><div style=\"text-align: center;\"><strong>" + "27" + "<br>" + "Co" + "<br>"
				+ "58.933" + "</strong></html>";
		elementButtonLabels[63] = "<html><div style=\"text-align: center;\"><strong>" + "28" + "<br>" + "Ni" + "<br>"
				+ "58.693" + "</strong></html>";
		elementButtonLabels[64] = "<html><div style=\"text-align: center;\"><strong>" + "29" + "<br>" + "Cu" + "<br>"
				+ "63.546" + "</strong></html>";
		elementButtonLabels[65] = "<html><div style=\"text-align: center;\"><strong>" + "30" + "<br>" + "Zn" + "<br>"
				+ "65.409" + "</strong></html>";
		elementButtonLabels[66] = "<html><div style=\"text-align: center;\"><strong>" + "31" + "<br>" + "Ga" + "<br>"
				+ "69.723" + "</strong></html>";
		elementButtonLabels[67] = "<html><div style=\"text-align: center;\"><strong>" + "32" + "<br>" + "Ge" + "<br>"
				+ "72.64" + "</strong></html>";
		elementButtonLabels[68] = "<html><div style=\"text-align: center;\"><strong>" + "33" + "<br>" + "As" + "<br>"
				+ "74.922" + "</strong></html>";
		elementButtonLabels[69] = "<html><div style=\"text-align: center;\"><strong>" + "34" + "<br>" + "Se" + "<br>"
				+ "78.96" + "</strong></html>";
		elementButtonLabels[70] = "<html><div style=\"text-align: center;\"><strong>" + "35" + "<br>" + "Br" + "<br>"
				+ "79.904" + "</strong></html>";
		elementButtonLabels[71] = "<html><div style=\"text-align: center;\"><strong>" + "36" + "<br>" + "Kr" + "<br>"
				+ "83.798" + "</strong></html>";
		elementButtonLabels[72] = "<html><div style=\"text-align: center;\"><strong>" + "37" + "<br>" + "Rb" + "<br>"
				+ "85.468" + "</strong></html>";
		elementButtonLabels[73] = "<html><div style=\"text-align: center;\"><strong>" + "38" + "<br>" + "Sr" + "<br>"
				+ "87.62" + "</strong></html>";
		elementButtonLabels[74] = "<html><div style=\"text-align: center;\"><strong>" + "39" + "<br>" + "Y" + "<br>"
				+ "88.906" + "</strong></html>";
		elementButtonLabels[75] = "<html><div style=\"text-align: center;\"><strong>" + "40" + "<br>" + "Zr" + "<br>"
				+ "91.224" + "</strong></html>";
		elementButtonLabels[76] = "<html><div style=\"text-align: center;\"><strong>" + "41" + "<br>" + "Nb" + "<br>"
				+ "92.906" + "</strong></html>";
		elementButtonLabels[77] = "<html><div style=\"text-align: center;\"><strong>" + "42" + "<br>" + "Mo" + "<br>"
				+ "95.94" + "</strong></html>";
		elementButtonLabels[78] = "<html><div style=\"text-align: center;\"><strong>" + "43" + "<br>" + "Tc" + "<br>"
				+ "97.907" + "</strong></html>";
		elementButtonLabels[79] = "<html><div style=\"text-align: center;\"><strong>" + "44" + "<br>" + "Ru" + "<br>"
				+ "101.07" + "</strong></html>";
		elementButtonLabels[80] = "<html><div style=\"text-align: center;\"><strong>" + "45" + "<br>" + "Rh" + "<br>"
				+ "102.906" + "</strong></html>";
		elementButtonLabels[81] = "<html><div style=\"text-align: center;\"><strong>" + "46" + "<br>" + "Pd" + "<br>"
				+ "106.42" + "</strong></html>";
		elementButtonLabels[82] = "<html><div style=\"text-align: center;\"><strong>" + "47" + "<br>" + "Ag" + "<br>"
				+ "107.868" + "</strong></html>";
		elementButtonLabels[83] = "<html><div style=\"text-align: center;\"><strong>" + "48" + "<br>" + "Cd" + "<br>"
				+ "112.411" + "</strong></html>";
		elementButtonLabels[84] = "<html><div style=\"text-align: center;\"><strong>" + "49" + "<br>" + "In" + "<br>"
				+ "114.818" + "</strong></html>";
		elementButtonLabels[85] = "<html><div style=\"text-align: center;\"><strong>" + "50" + "<br>" + "Sn" + "<br>"
				+ "118.71" + "</strong></html>";
		elementButtonLabels[86] = "<html><div style=\"text-align: center;\"><strong>" + "51" + "<br>" + "Sb" + "<br>"
				+ "121.76" + "</strong></html>";
		elementButtonLabels[87] = "<html><div style=\"text-align: center;\"><strong>" + "52" + "<br>" + "Te" + "<br>"
				+ "127.6" + "</strong></html>";
		elementButtonLabels[88] = "<html><div style=\"text-align: center;\"><strong>" + "53" + "<br>" + "I" + "<br>"
				+ "126.904" + "</strong></html>";
		elementButtonLabels[89] = "<html><div style=\"text-align: center;\"><strong>" + "54" + "<br>" + "Xe" + "<br>"
				+ "131.293" + "</strong></html>";
		elementButtonLabels[90] = "<html><div style=\"text-align: center;\"><strong>" + "55" + "<br>" + "Cs" + "<br>"
				+ "132.905" + "</strong></html>";
		elementButtonLabels[91] = "<html><div style=\"text-align: center;\"><strong>" + "56" + "<br>" + "Ba" + "<br>"
				+ "137.327" + "</strong></html>";
		elementButtonLabels[92] = "<html><div style=\"text-align: center;\"><strong>" + "*" + "<br>" + "57-71"
				+ "</strong></html>";
		elementButtonLabels[93] = "<html><div style=\"text-align: center;\"><strong>" + "72" + "<br>" + "Hf" + "<br>"
				+ "178.49" + "</strong></html>";
		elementButtonLabels[94] = "<html><div style=\"text-align: center;\"><strong>" + "73" + "<br>" + "Ta" + "<br>"
				+ "180.948" + "</strong></html>";
		elementButtonLabels[95] = "<html><div style=\"text-align: center;\"><strong>" + "74" + "<br>" + "W" + "<br>"
				+ "183.84" + "</strong></html>";
		elementButtonLabels[96] = "<html><div style=\"text-align: center;\"><strong>" + "75" + "<br>" + "Re" + "<br>"
				+ "186.207" + "</strong></html>";
		elementButtonLabels[97] = "<html><div style=\"text-align: center;\"><strong>" + "76" + "<br>" + "Os" + "<br>"
				+ "190.23" + "</strong></html>";
		elementButtonLabels[98] = "<html><div style=\"text-align: center;\"><strong>" + "77" + "<br>" + "Ir" + "<br>"
				+ "192.217" + "</strong></html>";
		elementButtonLabels[99] = "<html><div style=\"text-align: center;\"><strong>" + "78" + "<br>" + "Pt" + "<br>"
				+ "195.078" + "</strong></html>";
		elementButtonLabels[100] = "<html><div style=\"text-align: center;\"><strong>" + "79" + "<br>" + "Au" + "<br>"
				+ "196.967" + "</strong></html>";
		elementButtonLabels[101] = "<html><div style=\"text-align: center;\"><strong>" + "80" + "<br>" + "Hg" + "<br>"
				+ "200.59" + "</strong></html>";
		elementButtonLabels[102] = "<html><div style=\"text-align: center;\"><strong>" + "81" + "<br>" + "Tl" + "<br>"
				+ "204.383" + "</strong></html>";
		elementButtonLabels[103] = "<html><div style=\"text-align: center;\"><strong>" + "82" + "<br>" + "Pb" + "<br>"
				+ "207.2" + "</strong></html>";
		elementButtonLabels[104] = "<html><div style=\"text-align: center;\"><strong>" + "83" + "<br>" + "Bi" + "<br>"
				+ "208.98" + "</strong></html>";
		elementButtonLabels[105] = "<html><div style=\"text-align: center;\"><strong>" + "84" + "<br>" + "Po" + "<br>"
				+ "208.982" + "</strong></html>";
		elementButtonLabels[106] = "<html><div style=\"text-align: center;\"><strong>" + "85" + "<br>" + "At" + "<br>"
				+ "209.987" + "</strong></html>";
		elementButtonLabels[107] = "<html><div style=\"text-align: center;\"><strong>" + "86" + "<br>" + "Rn" + "<br>"
				+ "222.018" + "</strong></html>";
		elementButtonLabels[108] = "<html><div style=\"text-align: center;\"><strong>" + "87" + "<br>" + "Fr" + "<br>"
				+ "223.02" + "</strong></html>";
		elementButtonLabels[109] = "<html><div style=\"text-align: center;\"><strong>" + "88" + "<br>" + "Ra" + "<br>"
				+ "226.025" + "</strong></html>";
		elementButtonLabels[110] = "<html><div style=\"text-align: center;\"><strong>" + "**" + "<br>" + "89-103"
				+ "</strong></html>";
		elementButtonLabels[111] = "<html><div style=\"text-align: center;\"><strong>" + "104" + "<br>" + "Rf" + "<br>"
				+ "261.109" + "</strong></html>";
		elementButtonLabels[112] = "<html><div style=\"text-align: center;\"><strong>" + "105" + "<br>" + "Db" + "<br>"
				+ "262.114" + "</strong></html>";
		elementButtonLabels[113] = "<html><div style=\"text-align: center;\"><strong>" + "106" + "<br>" + "Sg" + "<br>"
				+ "266.122" + "</strong></html>";
		elementButtonLabels[114] = "<html><div style=\"text-align: center;\"><strong>" + "107" + "<br>" + "Bh" + "<br>"
				+ "264.125" + "</strong></html>";
		elementButtonLabels[115] = "<html><div style=\"text-align: center;\"><strong>" + "108" + "<br>" + "Hs" + "<br>"
				+ "(277)" + "</strong></html>";
		elementButtonLabels[116] = "<html><div style=\"text-align: center;\"><strong>" + "109" + "<br>" + "Mt" + "<br>"
				+ "268.139" + "</strong></html>";
		elementButtonLabels[117] = "<html><div style=\"text-align: center;\"><strong>" + "110" + "<br>" + "Ds" + "<br>"
				+ "(281)" + "</strong></html>";
		elementButtonLabels[118] = "<html><div style=\"text-align: center;\"><strong>" + "111" + "<br>" + "Rg" + "<br>"
				+ "(280)" + "</strong></html>";
		elementButtonLabels[119] = "<html><div style=\"text-align: center;\"><strong>" + "112" + "<br>" + "Cn" + "<br>"
				+ "(285)" + "</strong></html>";
		elementButtonLabels[120] = "<html><div style=\"text-align: center;\"><strong>" + "113" + "<br>" + "Uut" + "<br>"
				+ "(284)" + "</strong></html>";
		elementButtonLabels[121] = "<html><div style=\"text-align: center;\"><strong>" + "114" + "<br>" + "Fl" + "<br>"
				+ "(287)" + "</strong></html>";
		elementButtonLabels[122] = "<html><div style=\"text-align: center;\"><strong>" + "115" + "<br>" + "Uup" + "<br>"
				+ "(288)" + "</strong></html>";
		elementButtonLabels[123] = "<html><div style=\"text-align: center;\"><strong>" + "116" + "<br>" + "Lv" + "<br>"
				+ "(291)" + "</strong></html>";
		elementButtonLabels[124] = "<html><div style=\"text-align: center;\"><strong>" + "117" + "<br>" + "Uus" + "<br>"
				+ "(294)" + "</strong></html>";
		elementButtonLabels[125] = "<html><div style=\"text-align: center;\"><strong>" + "118" + "<br>" + "Uuo" + "<br>"
				+ "(294)" + "</strong></html>";
		elementButtonLabels[126] = "";
		elementButtonLabels[127] = "";
		elementButtonLabels[128] = "";
		elementButtonLabels[129] = "<html><div style=\"text-align: center;\"><strong>" + "57" + "<br>" + "La" + "<br>"
				+ "138.905" + "</strong></html>";
		elementButtonLabels[130] = "<html><div style=\"text-align: center;\"><strong>" + "58" + "<br>" + "Ce" + "<br>"
				+ "140.116" + "</strong></html>";
		elementButtonLabels[131] = "<html><div style=\"text-align: center;\"><strong>" + "59" + "<br>" + "Pr" + "<br>"
				+ "140.908" + "</strong></html>";
		elementButtonLabels[132] = "<html><div style=\"text-align: center;\"><strong>" + "60" + "<br>" + "Nd" + "<br>"
				+ "144.242" + "</strong></html>";
		elementButtonLabels[133] = "<html><div style=\"text-align: center;\"><strong>" + "61" + "<br>" + "Pm" + "<br>"
				+ "144.913" + "</strong></html>";
		elementButtonLabels[134] = "<html><div style=\"text-align: center;\"><strong>" + "62" + "<br>" + "Sm" + "<br>"
				+ "150.36" + "</strong></html>";
		elementButtonLabels[135] = "<html><div style=\"text-align: center;\"><strong>" + "63" + "<br>" + "Eu" + "<br>"
				+ "151.964" + "</strong></html>";
		elementButtonLabels[136] = "<html><div style=\"text-align: center;\"><strong>" + "64" + "<br>" + "Gd" + "<br>"
				+ "157.25" + "</strong></html>";
		elementButtonLabels[137] = "<html><div style=\"text-align: center;\"><strong>" + "65" + "<br>" + "Tb" + "<br>"
				+ "158.925" + "</strong></html>";
		elementButtonLabels[138] = "<html><div style=\"text-align: center;\"><strong>" + "66" + "<br>" + "Dy" + "<br>"
				+ "162.5" + "</strong></html>";
		elementButtonLabels[139] = "<html><div style=\"text-align: center;\"><strong>" + "67" + "<br>" + "Ho" + "<br>"
				+ "164.93" + "</strong></html>";
		elementButtonLabels[140] = "<html><div style=\"text-align: center;\"><strong>" + "68" + "<br>" + "Er" + "<br>"
				+ "167.259" + "</strong></html>";
		elementButtonLabels[141] = "<html><div style=\"text-align: center;\"><strong>" + "69" + "<br>" + "Tm" + "<br>"
				+ "168.934" + "</strong></html>";
		elementButtonLabels[142] = "<html><div style=\"text-align: center;\"><strong>" + "70" + "<br>" + "Yb" + "<br>"
				+ "173.04" + "</strong></html>";
		elementButtonLabels[143] = "<html><div style=\"text-align: center;\"><strong>" + "71" + "<br>" + "Lu" + "<br>"
				+ "174.967" + "</strong></html>";
		elementButtonLabels[144] = "";
		elementButtonLabels[145] = "";
		elementButtonLabels[146] = "";
		elementButtonLabels[147] = "<html><div style=\"text-align: center;\"><strong>" + "89" + "<br>" + "Ac" + "<br>"
				+ "227.028" + "</strong></html>";
		elementButtonLabels[148] = "<html><div style=\"text-align: center;\"><strong>" + "90" + "<br>" + "Th" + "<br>"
				+ "232.038" + "</strong></html>";
		elementButtonLabels[149] = "<html><div style=\"text-align: center;\"><strong>" + "91" + "<br>" + "Pa" + "<br>"
				+ "231.036" + "</strong></html>";
		elementButtonLabels[150] = "<html><div style=\"text-align: center;\"><strong>" + "92" + "<br>" + "U" + "<br>"
				+ "238.029" + "</strong></html>";
		elementButtonLabels[151] = "<html><div style=\"text-align: center;\"><strong>" + "93" + "<br>" + "Np" + "<br>"
				+ "237.048" + "</strong></html>";
		elementButtonLabels[152] = "<html><div style=\"text-align: center;\"><strong>" + "94" + "<br>" + "Pu" + "<br>"
				+ "244.064" + "</strong></html>";
		elementButtonLabels[153] = "<html><div style=\"text-align: center;\"><strong>" + "95" + "<br>" + "Am" + "<br>"
				+ "243.061" + "</strong></html>";
		elementButtonLabels[154] = "<html><div style=\"text-align: center;\"><strong>" + "96" + "<br>" + "Cm" + "<br>"
				+ "247.07" + "</strong></html>";
		elementButtonLabels[155] = "<html><div style=\"text-align: center;\"><strong>" + "97" + "<br>" + "Bk" + "<br>"
				+ "247.07" + "</strong></html>";
		elementButtonLabels[156] = "<html><div style=\"text-align: center;\"><strong>" + "98" + "<br>" + "Cf" + "<br>"
				+ "251.08" + "</strong></html>";
		elementButtonLabels[157] = "<html><div style=\"text-align: center;\"><strong>" + "99" + "<br>" + "Es" + "<br>"
				+ "252.083" + "</strong></html>";
		elementButtonLabels[158] = "<html><div style=\"text-align: center;\"><strong>" + "100" + "<br>" + "Fm" + "<br>"
				+ "257.095" + "</strong></html>";
		elementButtonLabels[159] = "<html><div style=\"text-align: center;\"><strong>" + "101" + "<br>" + "Md" + "<br>"
				+ "258.098" + "</strong></html>";
		elementButtonLabels[160] = "<html><div style=\"text-align: center;\"><strong>" + "101" + "<br>" + "No" + "<br>"
				+ "259.101" + "</strong></html>";
		elementButtonLabels[161] = "<html><div style=\"text-align: center;\"><strong>" + "103" + "<br>" + "Lr" + "<br>"
				+ "262.11" + "</strong></html>";
	}

	public void actionPerformed(ActionEvent e) {
		String arg = e.getActionCommand();
		if (arg == "Exit")
			System.exit(0);

		if (arg == "About") {
			JOptionPane.showMessageDialog(null,
					"This is a free Periodic Table of the Elements.  Please ask before using my code." + "\n"
							+ "Credits:" + "\n" + "~GitHub for hosting my repository." + "\n"
							+ "~Merck KGaA for providing a comprehensive database of information in their iOS app EMD PTE"
							+ "\n" + "~All of my CS professors at ONU for giving me the knowledge needed to code.");
		}

	}

	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look
			// and feel.
		}

		PeriodicTableFrame f = new PeriodicTableFrame();
		f.setBounds(0, 0, 1366, 768);
		f.setTitle("Periodic Table of the Elements");
		f.setVisible(true);
	}
}
