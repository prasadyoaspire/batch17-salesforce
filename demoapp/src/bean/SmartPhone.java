package bean;

public class SmartPhone extends Phone {
    
    public void browseInternet() {
        System.out.println("browsing internet");
    }
    public void cameraClick() {
        System.out.println("Click camera");
    }
    public void cameraClick(String mode) {
        System.out.println("Camera click with mode "+mode);
    }
}
