
package phone;

public class Android extends Mobile{
    
    private String playStore;
    private boolean toucheAble;

    public Android() {
    }

    public Android(String playStore, boolean toucheAble) {
        this.playStore = playStore;
        this.toucheAble = toucheAble;
    }

    public Android(String playStore, boolean toucheAble, boolean makeCall, 
            String makeTextMessage, String camera, String multimedia) {
        super(makeCall, makeTextMessage, camera, multimedia);
        this.playStore = playStore;
        this.toucheAble = toucheAble;
    }

   

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public boolean isToucheAble() {
        return toucheAble;
    }

    public void setToucheAble(boolean toucheAble) {
        this.toucheAble = toucheAble;
    }

    @Override
    public String toString() {
        return "Android{" + "playStore=" + playStore + ", toucheAble=" + toucheAble + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(playStore+" "+toucheAble);
    
    }
    
    
    
    
}
