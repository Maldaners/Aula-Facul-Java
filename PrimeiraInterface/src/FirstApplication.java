import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstApplication {

	JFrame window = new JFrame ();
	JButton  button = new JButton ("Teste");
	
	public static void main(String[] args) {
		
		new FirstApplication ();
	
	}
	private FirstApplication ()
	{
		// define titulo da window
		
		window.setTitle("primeira aplicação");
		
		// define largura da window
		window.setSize(350,150);
		
		// local window
		window.setLocation(50,50);
		
		//define possibilidade de fechar window 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add button
		window.add(button);
		
		
		//visibilidade
		window.setVisible(true);
	}
}
