package AnonymInner;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
	      TalkingClock clock = new TalkingClock();
		  clock.start(1000, true);
		  JOptionPane.showMessageDialog(null, "Quit program?");
		  System.exit(0);

	}

}
