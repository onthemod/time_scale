import javax.swing.*;
import java.awt.*;

/**
 * <p>
 * Title: Клиент приложений проекта iRule
 * </p>
 * <p>
 * Description: главное окно
 * </p>
 *
 * <p>Copyright: Copyright SPI (c) 2021</p>
 * <p>Company: Security Problems Institute Ltd.</p>
 *
 * @author Anton Atamas &lt;anton.atamas@spi2.ru&gt;
 */
public class MainFrame extends JFrame {

	public MainFrame() {
		super("Graph recognition");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(MainPanel.getInstance());
		setPreferredSize(new Dimension(550, 300));
	}

	public static void main(String args[]) {
		MainFrame hww = new MainFrame();
		hww.pack();
		hww.setVisible(true);
	}
}
