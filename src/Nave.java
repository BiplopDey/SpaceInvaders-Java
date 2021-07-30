import java.awt.Graphics;
import java.awt.Rectangle;

abstract class Nave extends Rectangle{
	
	int v;
	int contadorExplotar;
	
	int puntos;
	int vidas;
	Boolean isLive=true;
	
	Nave(int x,int y,int v, int width, int height){
		super(x,y,width,height);
		this.v=v;
		
	}
	
	void restarVida() {
		vidas--;
		if(vidas==0) {
			isLive=false;
		}
	}
	
	int getVidas() {
		return vidas;
	}
	
	void setVidas(int vidas) {
		this.vidas=vidas;
	}
	
	void limites() {
		if(x<=0) {
			x=0;
		}else if(x>=Finestra.AMPLE-width){
			x=Finestra.AMPLE-width;
		}
	}
	
	abstract void moure(int signo);
	abstract void pinta(Graphics g);
	
}
