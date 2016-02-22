/**
 * 
 */
package PeriodicTable;

import java.awt.BorderLayout;
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
public class PeriodicTable extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] elementButtons = new JButton[162];
	private String[] elementButtonLabels = new String[162];
	private JPanel displayPanel = new JPanel();

	PeriodicTable() {
		elementButtonLabels[0] = "<html><div style=\"text-align: center;\"><strong>" + "1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
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
		elementButtonLabels[17] = "<html><div style=\"text-align: center;\"><strong>" + "2" + "<br>" + "He" + "<br>" + "4.0026" + "</strong></html>";
		elementButtonLabels[18] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[19] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
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
		elementButtonLabels[30] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[31] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[32] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[33] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[34] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[35] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[36] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[37] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
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
		elementButtonLabels[48] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[49] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[50] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[51] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[52] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[53] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[54] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[55] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[56] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[57] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[58] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[59] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[60] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[61] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[62] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[63] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[64] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[65] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[66] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[67] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[68] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[69] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[70] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[71] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[72] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[73] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[74] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[75] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[76] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[77] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[78] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[79] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[80] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[81] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[82] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[83] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[84] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[85] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[86] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[87] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[88] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[89] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[90] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[91] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[92] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[93] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[94] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[95] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[96] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[97] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[98] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[99] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[100] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[101] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[102] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[103] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[104] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[105] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[106] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[107] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[108] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[109] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[110] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[111] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[112] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[113] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[114] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[115] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[116] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[117] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[118] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[119] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[120] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[121] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[122] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[123] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[124] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[125] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[126] = "";
		elementButtonLabels[127] = "";
		elementButtonLabels[128] = "";
		elementButtonLabels[129] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[130] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[131] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[132] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[133] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[134] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[135] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[136] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[137] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[138] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[139] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[140] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[141] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[142] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[143] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[144] = "";
		elementButtonLabels[145] = "";
		elementButtonLabels[146] = "";
		elementButtonLabels[147] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[148] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[149] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[150] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[151] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[152] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[153] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[154] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[155] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[156] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[157] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[158] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[159] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[160] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";
		elementButtonLabels[161] = "<html><div style=\"text-align: center;\"><strong>" + 
				"1" + "<br>" + "H" + "<br>" + "1.00794" + "</strong></html>";

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

		PeriodicTable f = new PeriodicTable();
		f.setBounds(0, 0, 1366, 768);
		f.setTitle("Periodic Table of the Elements");
		f.setVisible(true);
	}
}
