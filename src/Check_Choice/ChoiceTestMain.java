package Check_Choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTestMain {

	public static void main(String[] args) {
		Frame f=new Frame("질문");
		
		f.setSize(500,200);
		f.setLocation(400,100);
		
		//레이아웃 자동배치 off
		f.setLayout(null);
		//=======================
		Choice day=new Choice();
		day.add("요일선택");
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		//높이는 안에있는 요소 사이즈로 결정되므로 의미가 없음
		//가로 사이즈는 설정이 필요함 다만 자동 자동배치는 반드시 OFF 상태여야함
		day.setSize(150,0);
		day.setLocation(50,100); //위치
		//#1
		//day.addItemListener(new ChoiceHandler());
		
		//#2
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("요일 : "+day.getSelectedItem());
				
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
