package com.song.springboot.transaction;

import com.song.springboot.transaction.model.DpUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2020/12/5 20:18
 * @Created by Jeremy
 */
public class OutofMemoryTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        while(true){
            list.add(new DpUser());
        }
    }
}
