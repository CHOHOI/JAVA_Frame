package Menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {

	public static void main(String[] args) {
		
		//�����ӿ� �޴� ���̱�
		Frame f=new Frame("�޴�");
		f.setSize(300,200);
		//1�ܰ�
		MenuBar mb=new MenuBar();
		//���θ޴�
		Menu mFile= new Menu("����");
		//���� �޴��� �Ӽ�
		MenuItem miNew=new MenuItem("New");
		MenuItem miOpen=new MenuItem("Open");
		MenuItem miSave=new MenuItem("Save");
		
		//4
		//���� �޴��� ������ �ִ� �޴�
		Menu print = new Menu("Print");
		MenuItem printSetup= new MenuItem("����Ʈ �¾�");
		MenuItem printpre= new MenuItem("�̸�����");
		
		print.add(printSetup);
		print.add(printpre);
		
		MenuItem miClose=new MenuItem("Close");//5
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		//�޴��ٿ� �߰�
		mb.add(mFile);
		
		f.setMenuBar(mb);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}
