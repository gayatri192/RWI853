package com.rwi.multilevelInheritance;

public class Child extends Parent {
    String childName;

    Child(String grandparentName, String parentName, String childName) {
        super(grandparentName, parentName);  // Call to the constructor of Parent
        this.childName = childName;
    }

    String getChildName() {
        return childName;
    }

    void printFamilyDetails() {
        System.out.println("Grandparent: " + getGrandparentName());
        System.out.println("Parent: " + getParentName());
        System.out.println("Child: " + getChildName());
    }
}
