package com.zwt.charsjavaee.f_spring_ioc.f1_context.factory;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;
import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.impl.UserCastImpl;

public class StaticFactory {

    public static UserCast getUserCast(){
        return new UserCastImpl();
    }

}
