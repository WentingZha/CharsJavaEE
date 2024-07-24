package com.zwt.charsjavaee.e_ajax.e3_json;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectMapperTest {

    private final ObjectMapper cast = new ObjectMapper();

    @Test
    public void test() throws Exception{
        User user = new User("ZhaWenTing",36);
        String json = cast.writeValueAsString(user);
        System.out.println("Json String: "+json);

        User user1 = cast.readValue(json, User.class);
        System.out.println("Json object"+user1);
    }

    @Test
    public void test2() throws Exception{
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","ZhaWenTing");
        hashMap.put("gender","female");
        String string = cast.writeValueAsString(hashMap);
        System.out.println("Json String"+string);

        HashMap hashMap1 = cast.readValue(string, HashMap.class);
        System.out.println("Object"+hashMap1);
    }

    @Test
    public void test3() throws Exception{
        HashMap<String,User> hashMap = new HashMap<>();
        hashMap.put("Teacher1",new User("ZhaWenTing",36));
        hashMap.put("Teacher2",new User("GLZ",58));
        String string = cast.writeValueAsString(hashMap);
        System.out.println("Json String"+string);

        HashMap<String,User> hashMap1 = cast.readValue(string,new TypeReference<HashMap<String,User>>(){});
        System.out.println("Object"+hashMap1);
    }

    @Test
    public void test4() throws Exception{
        ArrayList<String> list = new ArrayList<>();
        list.add("ZWT");
        list.add("GLZ");
        String string = cast.writeValueAsString(list);
        System.out.println("Json String"+string);

        ArrayList<String> list2 = cast.readValue(string,new TypeReference<ArrayList<String>>(){});
        System.out.println("Object "+list2.get(0));
    }

    @Test
    public void test5() throws Exception{
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("ZhaWenTing",36));
        list.add(new User("GLZ",58));
        String string = cast.writeValueAsString(list);
        System.out.println("Json String"+string);

        ArrayList<User> list2 = cast.readValue(string,new TypeReference<ArrayList<User>>(){});
        System.out.println("Object "+list2);
    }
}