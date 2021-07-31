import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Element {
	Bullet(int x, int y, int velocidad, int width, int height) {
		super(x, y, velocidad, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	void move(int sign) {
		y += sign * velocidad;
	}

	@Override
	void pinta(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}

}
