package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String pinCode) {
        this.pinCode = pinCode;
        this.safeFolder = new ArrayList<>();
    }

    public void changePin(String newPin) {
        this.pinCode = newPin;
        System.out.println("PIN-koodi päivitetty.");
    }

    public void addData(String data) {
        safeFolder.add(data);
    }

    public ArrayList<String> listData(String inputPin) {
        if(this.pinCode.equals(inputPin)) {
            return new ArrayList<>(safeFolder);
        }else{
            System.out.println("Väärä PIN-koodi!");
            return null;
        }
    }    
}
