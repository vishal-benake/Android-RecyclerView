package com.recyclerview.test;

public class Models {
    public String Name, Email;
    public int imageView;

    public Models(String name, String email, int imageView) {
        this.Name = name;
        this.Email = email;
        this.imageView = imageView;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
