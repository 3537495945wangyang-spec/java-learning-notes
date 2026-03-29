package com.gdut.demo1_exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try(Door door = new Door(); Windows windows = new Windows()){
            door.open();
            windows.open();

        }catch(Exception e){
            System.out.println("出错");
        }finally{
            System.out.println("关闭");
        }

    }
}
class Door implements AutoCloseable{
    public  Door(){
        System.out.println("创建门");
    }
    public void open() throws Exception {
        System.out.println("打开门");
        throw new Exception("打开门时出错");

    }
    @Override
    public void close()  {
        System.out.println("关闭门");
    }
}

class Windows implements AutoCloseable{
    public  Windows(){
        System.out.println("创建窗");
    }
    public void open() throws Exception {
        System.out.println("打开窗");
        throw new Exception("打开窗时出错");

    }
    @Override
    public void close() {
        System.out.println("关闭窗");
    }
}
