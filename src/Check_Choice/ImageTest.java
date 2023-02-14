package Check_Choice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setLayout(null);
		
		f.setBounds(200,100,710,710);
		
		//이미지
		ImageIcon img = new ImageIcon("hi.jpg");
		
		JLabel j1=new JLabel(img); //Jlabel에만 ImageIcon 사용가능
		j1.setBounds(10,30,740,700); //원본 이미지 사이즈
		f.add(j1);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		

	}

}
