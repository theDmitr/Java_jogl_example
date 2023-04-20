package dmitr.jogl_example.handler;

import com.jogamp.newt.event.KeyEvent;

import dmitr.jogl_example.Window;

public class KeyHandler implements com.jogamp.newt.event.KeyListener {

	@Override
	public void keyPressed(KeyEvent event) {
		
		switch (event.getKeyCode()) {
			case 107: {
				Window.getWindow().setFullscreen(!Window.getWindow().isFullscreen());
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
	}

}