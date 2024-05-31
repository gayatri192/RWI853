package com.rwi.multilevelInheritance;

public class Parent extends Grandparent {
    String parentName;

    Parent(String grandparentName, String parentName) {
        super(grandparentName);  // Call to the constructor of Grandparent
        this.parentName = parentName;
    }

    String getParentName() {
        return parentName;
    }
}