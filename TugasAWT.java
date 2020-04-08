package id.d3ti.oopl.keempat.AWT;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TugasAWT extends Frame implements WindowListener {
	String nim;
	String nama;
	String jk;
	String tmp_lahir;
	String tgl_lahir;
	TextField cnim, cnama, ctmp_lahir, ctgl_lahir;
	Choice cjk1;
	Button b;

	public TugasAWT() {
		super("Data Diri");
		Panel a = new Panel();
		add(a);
		
		a.setLayout(new GridLayout(7, 2));
		
		a.add(new Label("nim :"));
		a.add(cnim = new TextField());
		

		a.add(new Label("nama :"));
		a.add(cnama = new TextField());
		
		a.add(new Label("jk :"));
		cjk1 = new Choice();
		cjk1.add("Laki-laki");
		cjk1.add("Perempuan");
		a.add(cjk1);
		
		a.add(new Label("tmp_lahir :"));
		a.add(ctmp_lahir = new TextField());
		
		a.add(new Label("tgl_lahir :"));
		a.add(ctgl_lahir = new TextField());

		a.add(new Label(""));
		a.add(b = new Button("save"));

		setSize(250, 300);
		setVisible(true);
		addWindowListener(this);
	}

	public boolean action(Event e, Object what) {
		if (what.equals("save")) {
			nim = cnim.getText();
			nama = cnama.getText();
			jk = cjk1.getSelectedItem().toString();
			tmp_lahir = ctmp_lahir.getText();
			tgl_lahir = ctgl_lahir.getText();
			JFrame frame = new JFrame();

			frame.setTitle("Hasil Form");

			frame.setSize(400, 300);

			frame.setLocationRelativeTo(null);
			//tampil
			JLabel label = new JLabel("NIM= " + nim);
			JLabel label2 = new JLabel("nama= " + nama);
			JLabel label3 = new JLabel("jenis kelamin= " + jk);
			JLabel label4 = new JLabel("tmp lahir= " + tmp_lahir);
			JLabel label5 = new JLabel("tgl lahir= " + tgl_lahir);

			frame.setLayout(null);

			frame.add(label);
			frame.add(label2);
			frame.add(label3);
			frame.add(label4);
			frame.add(label5);
			
			label.setBounds(20, 20, 150, 30);
			label2.setBounds(20, 40, 150, 30);
			label3.setBounds(20, 60, 150, 30);
			label4.setBounds(20, 80, 150, 30);
			label5.setBounds(20, 100, 150, 30);

			// Mengaktifkan event agar ketika frame di close maka, program akan berhenti
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// [Optional] Untuk menonaktifkan button maximize di Frame
			frame.setResizable(false);

			// Aktifkan Visible Frame
			frame.setVisible(true);

		}
		return true;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new TugasAWT();
	}
}

