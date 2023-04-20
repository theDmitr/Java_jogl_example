package dmitr.jogl_example;

import com.jogamp.nativewindow.WindowClosingProtocol;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

import dmitr.jogl_example.handler.EventHandler;
import dmitr.jogl_example.handler.KeyHandler;
import dmitr.jogl_example.handler.MouseHandler;

public class Window {

    private static GLWindow window;
    private static final GLCapabilities capabilities;
    private static FPSAnimator animator;

    public static float unitsWide = 1f;

    static {
        GLProfile.initSingleton();
        capabilities = new GLCapabilities(GLProfile.get(GLProfile.GL2));
    }

    public static void createWindow(int width, int height, int FPS) {
        window = GLWindow.create(capabilities);
        window.setDefaultCloseOperation(WindowClosingProtocol.WindowClosingMode.DISPOSE_ON_CLOSE);
        window.setSize(width, height);

        window.addGLEventListener(new EventHandler());
        window.addKeyListener(new KeyHandler());
        window.addMouseListener(new MouseHandler());

        animator = new FPSAnimator(window, FPS);
        animator.start();

        window.setVisible(true);
        window.requestFocus(true);
    }

    public static void killWindow() {
        System.exit(1);
    }

    public static GLWindow getWindow() { return window; }
    public static GLCapabilities getCapabilities() { return capabilities; }
    public static FPSAnimator getAnimator() { return animator; }

}