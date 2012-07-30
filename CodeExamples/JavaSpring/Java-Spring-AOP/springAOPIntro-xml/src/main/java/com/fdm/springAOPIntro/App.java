package com.fdm.springAOPIntro;

import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        List<String> names = new ArrayList<String>();
        List<User> users = new ArrayList<User>();
        names.add("name");
        names.add(";DROP table");
        names.add("myName");
        names.add("alpha");
        User user = null;
        for(String name : names){
        	user = context.getBean("user",User.class);
        	user.setUsername(name);
        	users.add(user);
        }
        for(User myUser : users){
        	System.out.println(myUser.getUsername());
        }
    }
}