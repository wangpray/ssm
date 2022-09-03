package com.wyt.pojo;

public class Users {
    /*    姓名：<input type="text" name="name">
           年龄：<input name="age"><br>
    *
    * */
    private String name;
    private int age;

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
