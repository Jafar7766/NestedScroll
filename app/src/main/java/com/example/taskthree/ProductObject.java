package com.example.taskthree;

public class ProductObject {
    private String imagePath;
    private String name;
    ProductObject(String name, String imagePath) {
        this.imagePath = imagePath;
        this.name = name;
    }
    String getImagePath() {
        return imagePath;
    }
    String getName() {
        return name;
    }
}
