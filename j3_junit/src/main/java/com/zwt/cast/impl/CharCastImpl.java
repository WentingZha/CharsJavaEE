package com.zwt.cast.impl;

import com.zwt.cast.CharsCast;
import org.springframework.stereotype.Repository;

@Repository
public class CharCastImpl implements CharsCast {
    @Override
    public void initAChar() {
        System.out.println("CharCastImpl init a Char");
    }
}
