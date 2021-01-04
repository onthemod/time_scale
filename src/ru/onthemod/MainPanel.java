import javax.swing.*;
import java.awt.*;

/**
 * <p>
 * Title: Клиент приложений проекта iRule
 * </p>
 * <p>
 * Description:
 * </p>
 *
 * <p>Copyright: Copyright SPI (c) 2021</p>
 * <p>Company: Security Problems Institute Ltd.</p>
 *
 * @author Anton Atamas &lt;anton.atamas@spi2.ru&gt;
 */
public class MainPanel extends JPanel {

	public static MainPanel instance = null;
	private JPanel drawingPanel = null;

	public static MainPanel getInstance() {
		if (instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}

	public MainPanel() {
		super(new BorderLayout());
		setBackground(Color.red);
		drawingPanel = new JPanel();
		drawingPanel.setBackground(new Color (255,200,200));
		this.add(drawingPanel, BorderLayout.CENTER);
	}

	public JPanel getDrawingPanel() {
		return drawingPanel;
	}

}
