package dmitr.jogl_example.render;

import com.jogamp.opengl.GL2;

import dmitr.jogl_example.render.shape.IShape;
import dmitr.jogl_example.render.shape.Rect;

public class Renderer {
	
	private static final IShape shape = new Rect(-0.5f, -0.5f, 1.0f, 1.0f, new Color(1f, 0.5f, 1f, 0f));
	
	public static void render(GL2 gl) {
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		gl.glClearColor(0, 0, 0, 1f);
		shape.draw(gl);
	}
	
}