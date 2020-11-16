package com.song.springbootioccirculardependencies.bean;

/**
 * @Description TODO
 * @Date 2020/11/14 17:58
 * @Created by Jeremy
 */
public class SuperUser extends User{

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                '}' + super.toString();
    }
}
