package poitn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class poitn2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public poitn2d() {
    }

    public poitn2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = x;
    }

    public float[] getXY() {
        float[] arry = new float[2];
        arry[0] = x;
        arry[1] = y;
        return arry;
    }
    @Override
    public String toString() {
        return "poitn2d{" +
                "x=" + x +
                ", y=" + y +
                Arrays.toString(getXY())+
                '}';
    }
}
