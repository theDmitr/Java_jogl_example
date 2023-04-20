package dmitr.jogl_example.handler;

import com.jogamp.newt.event.MouseEvent;

import dmitr.jogl_example.Window;

public class MouseHandler implements com.jogamp.newt.event.MouseListener { 

	@Override
	public void mouseClicked(MouseEvent event) {
		float x = event.getX() / (Window.getWindow().getWidth() / Window.unitsWide);
		float y = event.getY() / (Window.getWindow().getWidth() / Window.unitsWide);
	}

	@Override
	public void mouseDragged(MouseEvent event) {

	}

	@Override
	public void mouseEntered(MouseEvent event) {

	}

	@Override
	public void mouseExited(MouseEvent event) {

	}

	@Override
	public void mouseMoved(MouseEvent event) {

	}

	@Override
	public void mousePressed(MouseEvent event) {

	}

	@Override
	public void mouseReleased(MouseEvent event) {

	}

	@Override
	public void mouseWheelMoved(MouseEvent event) {

	}

}
