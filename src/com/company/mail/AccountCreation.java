package com.company.mail;

import java.util.HashMap;
import java.util.Map;

public class AccountCreation {
    public static Map createAccount(HashMap<String,User> map, String mail, User user){
        if(map.get(mail)==null){
        //if(map.get(mail)==null){
            map.put(mail,user);
        }
        else{
            System.out.println("account already exists!!!");
        }
        return map;
    }
    public static Map createAccount1(HashMap<String,UserGroups> map, String mail, UserGroups userGroups){
        ///if(map.get(name)==null){
        if(map.get(mail)==null){
            map.put(mail,userGroups);
        }
        else{
            System.out.println("account already exists!!!");
        }
        return map;
    }
   // public static void addUser(HashMap<String,User> map,String userMailId,UserGroups usergroups){
        //HashMap<String,User> userMap=createAccount((HashMap<String,User>) map,String userMailId,UserGroups usergroups);


    }
