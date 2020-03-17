package com.officeHour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {

    public static void main(String[] args) {

        ArrayList<String> keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator <String> iterator = keysToSearch.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //print before modification and

        Iterator <String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            System.out.println("*" + iterator1.next());
        }

        // create a map with <String, String>
        HashMap <String, String> personalInfo = new HashMap<>();
        personalInfo.put("name", "Bryan");
        personalInfo.put("student_id", "456532234455");
        personalInfo.put("major", "computer science");

        Iterator <String> mapIterator = personalInfo.keySet().iterator();
        while (mapIterator.hasNext()) {
            String key = mapIterator.next();
            System.out.println(key + ":" + personalInfo.get(key));
        }

        //============================================================
        // Selenium
        /*
        id - unique (it is not always available)
        class - classname
        name
        tag - every element will have a tag

        will only work with the link
        linktext
        partial linktext

        locator that is using html (syntax)
        css
        xpath



         */









    }
}
