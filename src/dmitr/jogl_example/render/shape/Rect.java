package dmitr.jogl_example.render.shape;

import com.jogamp.opengl.GL2;

import dmitr.jogl_example.render.Color;

public class Rect implements IShape {
	
	public float x = 0f;
	public float y = 0f;
	public float width = 0f;
	public float height = 0f;
	public Color color;
	
	public Rect(float x, float y, float width, float height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	@Override
	public void draw(GL2 gl) {
		gl.glColor3f(color.getR(), color.getG(), color.getB());
		gl.glBegin(GL2.GL_QUADS);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x + width, y);
			gl.glVertex2f(x + width, y + height);
			gl.glVertex2f(x, y + height);
		gl.glEnd();
	}

}
