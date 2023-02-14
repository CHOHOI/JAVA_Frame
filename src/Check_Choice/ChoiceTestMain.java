package Check_Choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTestMain {

	public static void main(String[] args) {
		Frame f=new Frame("����");
		
		f.setSize(500,200);
		f.setLocation(400,100);
		
		//���̾ƿ� �ڵ���ġ off
		f.setLayout(null);
		//=======================
		Choice day=new Choice();
		day.add("���ϼ���");
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		//���̴� �ȿ��ִ� ��� ������� �����ǹǷ� �ǹ̰� ����
		//���� ������� ������ �ʿ��� �ٸ� �ڵ� �ڵ���ġ�� �ݵ�� OFF ���¿�����
		day.setSize(150,0);
		day.setLocation(50,100); //��ġ
		//#1
		//day.addItemListener(new ChoiceHandler());
		
		//#2
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���� : "+day.getSelectedItem());
				
			}
		});
		f.add(day);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
	}

}
