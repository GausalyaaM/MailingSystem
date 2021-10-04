package com.company.mail;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static List<User> userList=new ArrayList<>();
    static Map<String,User> map=new HashMap<>();
    static Map<String,UserGroups> map1=new HashMap<>();
    static String mail="";
    public static void main(String[] args) {

        System.out.println("1.Create User");
        System.out.println("2.Create User Groups");
        System.out.println("3.Group Assignment");
        System.out.println("3.Compose mail");
        System.out.println("4.View inbox");
        System.out.println("5.View sent mails");
        System.out.println("6.Remove mails from inbox or send folder");
        System.out.println("7.Exit");
        System.out.println("Enter your option:");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                scan.nextLine();
                System.out.println("Enter your name:");
                String name = scan.nextLine();
                for (int j = 0; j < name.length(); j++)
                    if (name.charAt(j) >= '0' && name.charAt(j) <= '9') {
                        System.out.println("Name should contain only alphabets!");
                        return;
                    }
                System.out.println("Enter your mail:");
                String mail = scan.nextLine();
                int size = mail.length();
                String subStr = mail.substring(size - 4, size);
                if (!(subStr.equals(".com"))) {
                    System.out.println("Emailid should have '.com' at the last!");
                }
                while (!(mail.contains("@"))) {
                    System.out.println("Email should contain '@' symbol in between!");
                    System.out.println("Enter an appropriate mailid");
                    mail = scan.nextLine();
                }
                System.out.println("Enter your password:");
                String password = scan.nextLine();
                if (password.length() >= 8 && password.length() <= 16) {
                    System.out.println("Password has been successfully set!");
                } else {
                    System.out.println("Password length is not appropriate!!");
                }
                User user = new User();
                user.setUserName(name);
                user.setEmail(mail);
                user.setPassword(password);
                userList.add(user);
                AccountCreation.createAccount((HashMap<String, User> )map, mail, user);
                System.out.println(map);
            case 2:
                scan.nextLine();
                System.out.println("Enter the group name:");
                String groupName = scan.nextLine();
                System.out.println("Enter the group mail id:");
                String groupMailId = scan.nextLine();
                while((map.containsKey(groupMailId))){
                    System.out.println("MailId matches with the group mailId!!");
                    System.out.println("Please try with some other mail id...Enter another mailId:");
                    groupMailId=scan.nextLine();
                }
                int size1 = groupMailId.length();
                String subStr1 = groupMailId.substring(size1 - 4, size1);
                if (!(subStr1.equals(".com"))) {
                    System.out.println("Emailid should have '.com' at the last!");
                }
                while (!(groupMailId.contains("@"))) {
                    System.out.println("Email should contain '@' symbol in between!");
                    System.out.println("Enter an appropriate mailid");
                    groupMailId = scan.nextLine();
                }
                    System.out.println("Enter the password:");
                    String groupPassword = scan.nextLine();
                if (groupPassword.length() >= 8 && groupPassword.length() <= 16) {
                    System.out.println("Password has been successfully set!");
                } else {
                    System.out.println("Password length is not appropriate!!");
                }
                    System.out.println("Enter the description for the group:");
                    String description = scan.nextLine();
                    UserGroups userGroups=new UserGroups();
                    userGroups.setGroupName(groupName);
                    userGroups.setGroupMailId(groupMailId);
                    userGroups.setPassword(groupPassword);
                    userGroups.setDescription(description);
                    AccountCreation.createAccount1((HashMap<String, UserGroups>) map1, groupMailId, userGroups);
                    System.out.println(map1);
            case 3:
                System.out.println("Enter group name:");
                String groupName1=scan.nextLine();
                System.out.println("Enter user:");
                String userName=scan.nextLine();
                System.out.println("Enter mailID:");
                String email=scan.nextLine();
                System.out.println("Do you wish add or remove from a group(1/2):");int choice=scan.nextInt();
                if(choice==1){
                    if(map1.containsKey(email)){
                        System.out.println("User already added in a group:");
                    }else{
                        UserGroups userGroups1=new UserGroups();
                        userGroups1.setGroupName(groupName1);
                        map1.put(email, userGroups1);
                    }
                    if(choice==2){
                        if(map.containsKey(email)){
                            map.remove(email);
                        }else{
                            System.out.println("User is not in a group!!");
                        }
                    }
                }

                }
        }
    }

