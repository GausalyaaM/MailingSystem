package com.company.mail;

import java.util.List;

public class UserGroups {
    private String groupName;
    private String groupMailId;
    private String password;
    private String Description;
    private List<String> userGroupList;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupMailId() {
        return groupMailId;
    }

    public void setGroupMailId(String groupMailId) {
        this.groupMailId = groupMailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<String> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<String> userGroupList) {
        this.userGroupList = userGroupList;
    }
    public String toString(){
        return this.groupName+" "+this.groupMailId+" "+this.password+" "+this.Description+" "+this.userGroupList;
    }
}
