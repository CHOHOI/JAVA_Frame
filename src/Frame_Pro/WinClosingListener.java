package Frame_Pro;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {

	public void windowClosing(WindowEvent e) {
		System.out.println("����͸� �����Ͽ� close����!");
		System.exit(0);
	}
	
}
