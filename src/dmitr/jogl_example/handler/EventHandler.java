package dmitr.jogl_example.handler;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

import dmitr.jogl_example.Window;
import dmitr.jogl_example.render.Renderer;

public class EventHandler implements GLEventListener {

	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		Renderer.render(gl);
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		Window.killWindow();
	}

	@Override
	public void init(GLAutoDrawable drawable) {
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		GL2 gl = drawable.getGL().getGL2();
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(-1f, 1f, -1f, 1f, -1f, 1f);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

}
