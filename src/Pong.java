import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 1000;// extend width
	private final static int WINDOW_HEIGHT = 800;// extend height
	
	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
		
	}

}
