package day5;

public class Friends {
    String nama;
    static int numOfFriends;

    Friends(String name) {
        this.nama = name;
        numOfFriends++;
    }

    static void printNumOfFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }
}