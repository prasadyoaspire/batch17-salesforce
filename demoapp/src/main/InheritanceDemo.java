package main;

import bean.SmartPhone;

public class InheritanceDemo {
    
    public static void main(String[] args) {
        
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCalls();
        smartPhone.receiveCall();
        smartPhone.sendTextMsg();
        smartPhone.browseInternet();
        smartPhone.cameraClick();
        smartPhone.cameraClick("night");
    }
}
