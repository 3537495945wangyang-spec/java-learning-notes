package com.gdut.demo3_generics_Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pair <T,K>{
    private T first;
    private K second;

    public void setPair(T first,K second){
        this.first = first;
        this.second = second;
    }
    public String toString(){
        return "(" + first + "," + second + ")";
    }

    public String getPair() {
        return "(" + first + "," + second + ")";
    }
}
