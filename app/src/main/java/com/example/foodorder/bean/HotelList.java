package com.example.foodorder.bean;



public class HotelList {

    private String hotel_name;
    private String hotel_nameone;
    private String hotel_nametwo;
    private String type;
    private String typeone;
    private String typetwo;
    private int  hotel_image;
    private int   hotel_imageone;
    private int   hotel_imagetwo;

    public HotelList(String hotel_name, String hotel_nameone, String hotel_nametwo, String type, String typeone, String typetwo, int hotel_image, int hotel_imageone, int hotel_imagetwo) {
        this.hotel_name = hotel_name;
        this.hotel_nameone = hotel_nameone;
        this.hotel_nametwo = hotel_nametwo;
        this.type = type;
        this.typeone = typeone;
        this.typetwo = typetwo;
        this.hotel_image = hotel_image;
        this.hotel_imageone = hotel_imageone;
        this.hotel_imagetwo = hotel_imagetwo;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_nameone() {
        return hotel_nameone;
    }

    public void setHotel_nameone(String hotel_nameone) {
        this.hotel_nameone = hotel_nameone;
    }

    public String getHotel_nametwo() {
        return hotel_nametwo;
    }

    public void setHotel_nametwo(String hotel_nametwo) {
        this.hotel_nametwo = hotel_nametwo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeone() {
        return typeone;
    }

    public void setTypeone(String typeone) {
        this.typeone = typeone;
    }

    public String getTypetwo() {
        return typetwo;
    }

    public void setTypetwo(String typetwo) {
        this.typetwo = typetwo;
    }

    public int getHotel_image() {
        return hotel_image;
    }

    public void setHotel_image(int hotel_image) {
        this.hotel_image = hotel_image;
    }

    public int getHotel_imageone() {
        return hotel_imageone;
    }

    public void setHotel_imageone(int hotel_imageone) {
        this.hotel_imageone = hotel_imageone;
    }

    public int getHotel_imagetwo() {
        return hotel_imagetwo;
    }

    public void setHotel_imagetwo(int hotel_imagetwo) {
        this.hotel_imagetwo = hotel_imagetwo;
    }
}
