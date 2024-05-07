
package phone;


public class Mobile {
    
    private boolean  makeCall;
    private String makeTextMessage;
    private String camera;
    private String multimedia;

    public Mobile() {
    }

    public Mobile(boolean makeCall, String makeTextMessage, String camera, String multimedia) {
        this.makeCall = makeCall;
        this.makeTextMessage = makeTextMessage;
        this.camera = camera;
        this.multimedia = multimedia;
    }

    public boolean isMakeCall() {
        return makeCall;
    }

    public void setMakeCall(boolean makeCall) {
        this.makeCall = makeCall;
    }

    public String getMakeTextMessage() {
        return makeTextMessage;
    }

    public void setMakeTextMessage(String makeTextMessage) {
        this.makeTextMessage = makeTextMessage;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Mobile{" + "makeCall=" + makeCall + ", makeTextMessage=" + makeTextMessage + ", camera=" + camera + ", multimedia=" + multimedia + '}';
    }
    
    
    public  void printDetails(){
    
        System.out.println("Mobile Details is "+makeCall+" "+ 
                makeTextMessage+" "+camera+" "+multimedia);
    }
    
    
        
    
}
