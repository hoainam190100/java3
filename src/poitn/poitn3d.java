package poitn;

import java.util.Arrays;

class poitn3d extends poitn2d{
    private float z=0.0f;
    public poitn3d(){
    }
    public poitn3d(float z,float x,float y){
        super(x, y);
        this.z=z;
    }

     public float getZ() {
         return z;
     }

     public void setZ(float z) {
         this.z = z;
     }
     public void setXYZ(float x,float y, float z){
        this.z=z;
        this.setXY(x,y);
     }
     public float[] getXYZ(){
        float[]arry=new float[3];
        arry[0]=getX();
        arry[1]=getY();
        arry[2]=z;
        return arry;
     }

     @Override
     public String toString() {
         return "poitn3d{" +
                 "z=" + z +
                 Arrays.toString(getXYZ())+
                 '}';
     }
 }
