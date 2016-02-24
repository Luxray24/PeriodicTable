/**
 * 
 */
package periodicTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 * @author Mark
 *
 */
public class PeriodicTableFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] elementButtons = new JButton[162];
	private String[] elementButtonLabels = new String[162];
	private JPanel displayPanel = new JPanel();
	private Color nonmetalRed = new Color(255, 0, 0);
	private Color alkaliMetalGreen = new Color(25, 155, 25);
	private Color alkalineEarthMetalGreen = new Color(25, 100, 25);
	private Color metalloidViolet = new Color(200, 100, 255);
	private Color otherMetalPurple = new Color(100, 0, 100);
	private Color halogenPink = new Color(255, 0, 100);
	private Color nobleGasOrange = new Color(251, 78, 18);
	private Color transitionMetalBlue = new Color(0, 100, 255);
	private Color lanthanideBlue = new Color(0, 155, 155);
	private Color actinideBlue = new Color(0, 55, 55);
	private Color textWhite = new Color(255, 255, 255);
	//private Color shadow = new Color(0, 0, 0);

	PeriodicTableFrame() {
		elementButtonLabels[0] = "<html><div style=\"text-align: center;\"><strong>" + "1" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
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
				+ "4.0026" + "</strong></html>";
		elementButtonLabels[18] = "<html><div style=\"text-align: center;\"><strong>" + "3" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[19] = "<html><div style=\"text-align: center;\"><strong>" + "4" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
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
		elementButtonLabels[30] = "<html><div style=\"text-align: center;\"><strong>" + "5" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[31] = "<html><div style=\"text-align: center;\"><strong>" + "6" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[32] = "<html><div style=\"text-align: center;\"><strong>" + "7" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[33] = "<html><div style=\"text-align: center;\"><strong>" + "8" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[34] = "<html><div style=\"text-align: center;\"><strong>" + "9" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[35] = "<html><div style=\"text-align: center;\"><strong>" + "10" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[36] = "<html><div style=\"text-align: center;\"><strong>" + "11" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[37] = "<html><div style=\"text-align: center;\"><strong>" + "12" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
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
		elementButtonLabels[48] = "<html><div style=\"text-align: center;\"><strong>" + "13" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[49] = "<html><div style=\"text-align: center;\"><strong>" + "14" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[50] = "<html><div style=\"text-align: center;\"><strong>" + "15" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[51] = "<html><div style=\"text-align: center;\"><strong>" + "16" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[52] = "<html><div style=\"text-align: center;\"><strong>" + "17" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[53] = "<html><div style=\"text-align: center;\"><strong>" + "18" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[54] = "<html><div style=\"text-align: center;\"><strong>" + "19" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[55] = "<html><div style=\"text-align: center;\"><strong>" + "20" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[56] = "<html><div style=\"text-align: center;\"><strong>" + "21" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[57] = "<html><div style=\"text-align: center;\"><strong>" + "22" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[58] = "<html><div style=\"text-align: center;\"><strong>" + "23" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[59] = "<html><div style=\"text-align: center;\"><strong>" + "24" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[60] = "<html><div style=\"text-align: center;\"><strong>" + "25" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[61] = "<html><div style=\"text-align: center;\"><strong>" + "26" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[62] = "<html><div style=\"text-align: center;\"><strong>" + "27" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[63] = "<html><div style=\"text-align: center;\"><strong>" + "28" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[64] = "<html><div style=\"text-align: center;\"><strong>" + "29" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[65] = "<html><div style=\"text-align: center;\"><strong>" + "30" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[66] = "<html><div style=\"text-align: center;\"><strong>" + "31" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[67] = "<html><div style=\"text-align: center;\"><strong>" + "32" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[68] = "<html><div style=\"text-align: center;\"><strong>" + "33" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[69] = "<html><div style=\"text-align: center;\"><strong>" + "34" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[70] = "<html><div style=\"text-align: center;\"><strong>" + "35" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[71] = "<html><div style=\"text-align: center;\"><strong>" + "36" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[72] = "<html><div style=\"text-align: center;\"><strong>" + "37" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[73] = "<html><div style=\"text-align: center;\"><strong>" + "38" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[74] = "<html><div style=\"text-align: center;\"><strong>" + "39" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[75] = "<html><div style=\"text-align: center;\"><strong>" + "40" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[76] = "<html><div style=\"text-align: center;\"><strong>" + "41" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[77] = "<html><div style=\"text-align: center;\"><strong>" + "42" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[78] = "<html><div style=\"text-align: center;\"><strong>" + "43" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[79] = "<html><div style=\"text-align: center;\"><strong>" + "44" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[80] = "<html><div style=\"text-align: center;\"><strong>" + "45" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[81] = "<html><div style=\"text-align: center;\"><strong>" + "46" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[82] = "<html><div style=\"text-align: center;\"><strong>" + "47" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[83] = "<html><div style=\"text-align: center;\"><strong>" + "48" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[84] = "<html><div style=\"text-align: center;\"><strong>" + "49" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[85] = "<html><div style=\"text-align: center;\"><strong>" + "50" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[86] = "<html><div style=\"text-align: center;\"><strong>" + "51" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[87] = "<html><div style=\"text-align: center;\"><strong>" + "52" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[88] = "<html><div style=\"text-align: center;\"><strong>" + "53" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[89] = "<html><div style=\"text-align: center;\"><strong>" + "54" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[90] = "<html><div style=\"text-align: center;\"><strong>" + "55" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[91] = "<html><div style=\"text-align: center;\"><strong>" + "56" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[92] = "<html><div style=\"text-align: center;\"><strong>" + "*" + "<br>" + "57-71" + "</strong></html>";
		elementButtonLabels[93] = "<html><div style=\"text-align: center;\"><strong>" + "72" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[94] = "<html><div style=\"text-align: center;\"><strong>" + "73" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[95] = "<html><div style=\"text-align: center;\"><strong>" + "74" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[96] = "<html><div style=\"text-align: center;\"><strong>" + "75" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[97] = "<html><div style=\"text-align: center;\"><strong>" + "76" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[98] = "<html><div style=\"text-align: center;\"><strong>" + "77" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[99] = "<html><div style=\"text-align: center;\"><strong>" + "78" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[100] = "<html><div style=\"text-align: center;\"><strong>" + "79" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[101] = "<html><div style=\"text-align: center;\"><strong>" + "80" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[102] = "<html><div style=\"text-align: center;\"><strong>" + "81" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[103] = "<html><div style=\"text-align: center;\"><strong>" + "82" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[104] = "<html><div style=\"text-align: center;\"><strong>" + "83" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[105] = "<html><div style=\"text-align: center;\"><strong>" + "84" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[106] = "<html><div style=\"text-align: center;\"><strong>" + "85" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[107] = "<html><div style=\"text-align: center;\"><strong>" + "86" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[108] = "<html><div style=\"text-align: center;\"><strong>" + "87" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[109] = "<html><div style=\"text-align: center;\"><strong>" + "88" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[110] = "<html><div style=\"text-align: center;\"><strong>" + "**" + "<br>" + "89-103" + "</strong></html>";
		elementButtonLabels[111] = "<html><div style=\"text-align: center;\"><strong>" + "104" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[112] = "<html><div style=\"text-align: center;\"><strong>" + "105" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[113] = "<html><div style=\"text-align: center;\"><strong>" + "106" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[114] = "<html><div style=\"text-align: center;\"><strong>" + "107" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[115] = "<html><div style=\"text-align: center;\"><strong>" + "108" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[116] = "<html><div style=\"text-align: center;\"><strong>" + "109" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[117] = "<html><div style=\"text-align: center;\"><strong>" + "110" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[118] = "<html><div style=\"text-align: center;\"><strong>" + "111" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[119] = "<html><div style=\"text-align: center;\"><strong>" + "112" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[120] = "<html><div style=\"text-align: center;\"><strong>" + "113" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[121] = "<html><div style=\"text-align: center;\"><strong>" + "114" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[122] = "<html><div style=\"text-align: center;\"><strong>" + "115" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[123] = "<html><div style=\"text-align: center;\"><strong>" + "116" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[124] = "<html><div style=\"text-align: center;\"><strong>" + "117" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[125] = "<html><div style=\"text-align: center;\"><strong>" + "118" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[126] = "";
		elementButtonLabels[127] = "";
		elementButtonLabels[128] = "";
		elementButtonLabels[129] = "<html><div style=\"text-align: center;\"><strong>" + "57" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[130] = "<html><div style=\"text-align: center;\"><strong>" + "58" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[131] = "<html><div style=\"text-align: center;\"><strong>" + "59" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[132] = "<html><div style=\"text-align: center;\"><strong>" + "60" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[133] = "<html><div style=\"text-align: center;\"><strong>" + "61" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[134] = "<html><div style=\"text-align: center;\"><strong>" + "62" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[135] = "<html><div style=\"text-align: center;\"><strong>" + "63" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[136] = "<html><div style=\"text-align: center;\"><strong>" + "64" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[137] = "<html><div style=\"text-align: center;\"><strong>" + "65" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[138] = "<html><div style=\"text-align: center;\"><strong>" + "66" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[139] = "<html><div style=\"text-align: center;\"><strong>" + "67" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[140] = "<html><div style=\"text-align: center;\"><strong>" + "68" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[141] = "<html><div style=\"text-align: center;\"><strong>" + "69" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[142] = "<html><div style=\"text-align: center;\"><strong>" + "70" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[143] = "<html><div style=\"text-align: center;\"><strong>" + "71" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[144] = "";
		elementButtonLabels[145] = "";
		elementButtonLabels[146] = "";
		elementButtonLabels[147] = "<html><div style=\"text-align: center;\"><strong>" + "89" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[148] = "<html><div style=\"text-align: center;\"><strong>" + "90" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[149] = "<html><div style=\"text-align: center;\"><strong>" + "91" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[150] = "<html><div style=\"text-align: center;\"><strong>" + "92" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[151] = "<html><div style=\"text-align: center;\"><strong>" + "93" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[152] = "<html><div style=\"text-align: center;\"><strong>" + "94" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[153] = "<html><div style=\"text-align: center;\"><strong>" + "95" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[154] = "<html><div style=\"text-align: center;\"><strong>" + "96" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[155] = "<html><div style=\"text-align: center;\"><strong>" + "97" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[156] = "<html><div style=\"text-align: center;\"><strong>" + "98" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[157] = "<html><div style=\"text-align: center;\"><strong>" + "99" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[158] = "<html><div style=\"text-align: center;\"><strong>" + "100" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[159] = "<html><div style=\"text-align: center;\"><strong>" + "101" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[160] = "<html><div style=\"text-align: center;\"><strong>" + "101" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";
		elementButtonLabels[161] = "<html><div style=\"text-align: center;\"><strong>" + "103" + "<br>" + "H" + "<br>"
				+ "1.00794" + "</strong></html>";

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
