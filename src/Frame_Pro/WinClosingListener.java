package Frame_Pro;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {

	public void windowClosing(WindowEvent e) {
		System.out.println("어댑터를 생성하여 close감지!");
		System.exit(0);
	}
	
}
