package com.example.customrecyclerview;

public class RecyclerViewModel {
    String txt;
    int img;//integer type because image is in the form of integer 3D array.

    public RecyclerViewModel(String txt, int img){
        this.txt=txt;
        this.img=img;
    }

    public String getTxt() {
        return txt;
    }

    public int getImg() {
        return img;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
