package com.gdut.demo;

//家电父类

public class HomeApplo implements  Press{
    private String name;
    private boolean status;//布尔默认值为false
    public HomeApplo(String name, boolean status    ) {
        this.name = name;
        this.status = status;

    }

    public HomeApplo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }


    @Override
    public void press() {
        System.out.println("即将为您执行您的开关要求");
        this.status = !this.status;
    }
}
