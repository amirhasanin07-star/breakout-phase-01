package config;

public final class GameConstants {

    //canvas
    public static final int w = 800;
    public static final int h = 600;
    public static final int hudh = 35;
    public static final int topy = hudh;
    public static final int fps = 60;
    public static final int delay = 1000 / fps;

    //paddle
    public static final int padw = 100;
    public static final int padh = 15;
    public static final double pady = 545.0;
    public static final double padx = (w - padw) / 2.0;
    public static final double padmin = 0.0;
    public static final double padmax = w - padw;
    public static final double padspd = 8.0;

    //ball
    public static final int balld = 16;
    public static final double ballr = balld / 2.0;
    public static final double ballspd = 6.0;
    public static final double startang = 20.0;
    public static final double maxang = 60.0;

    //brick
    public static final int rows = 5;
    public static final int cols = 8;
    public static final int total = rows * cols;
    public static final int bw = 85;
    public static final int bh = 25;
    public static final int gap = 6;
    public static final int leftm = 39;
    public static final int topm = 60;
    public static final int pts = 100;

    //rules
    public static final int lives = 3;

    //HUD
    public static final int hudpad = 16;
    public static final int orbd = 12;
    public static final int orbgap = 6;
    public static final double boxw = 460.0;
    public static final double boxh = 130.0;

    private GameConstants() {
        throw new AssertionError("GameConstants cannot be instantiated.");
    }
}