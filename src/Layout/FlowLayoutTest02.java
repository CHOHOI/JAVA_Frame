package Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest02 {

	Frame f=new Frame();
	
	Button jb1=new Button("��ư1");
	Button jb2=new Button("��ư2");
	Button jb3=new Button("��ư3");
	Button jb4=new Button("��ư4");
	Button jb5=new Button("��ư5");
	Button jb6=new Button("��ư6");
	

	public FlowLayoutTest02() {
		f.setLayout(new FlowLayout());//Frame�� FlowLayout���� ����
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jb4);
		f.add(jb5);
		f.add(jb6);
		f.setSize(400,300); //������ ũ��
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
		});
	}//������
	public static void main(String[] args) {
		
		new FlowLayoutTest02();

	}

}