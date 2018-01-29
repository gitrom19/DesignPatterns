package com.grorom.patterns.protectionproxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MatchMakingTestDrive {
    List<PersonBean> database = new ArrayList<>();

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setHotOrNotRating(5);
        joe.setInterests("nothing");
        joe.setGender("male");
        joe.setName("Joe");
        database.add(joe);
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe");
        System.out.println("joe is proxy? " + Proxy.isProxyClass(joe.getClass()));
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("ownerProxy is proxy? " + Proxy.isProxyClass(ownerProxy.getClass()));
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Cant set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go Go");
        } catch (Exception e) {
            System.out.println("Cant set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    private PersonBean getPersonFromDatabase(String name) {
        for (PersonBean person : database) {
            if (name != null && name.equalsIgnoreCase(person.getName())) {
                return person;
            }
        }
        return new PersonBeanImpl();
    }
}
