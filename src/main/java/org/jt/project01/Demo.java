package org.jt.project01;

public class Demo {
    private String name;
    private String location;
    private String education;
    
    public Demo() {
    }
    public Demo(String name, String location, String education) {
        this.name = name;
        this.location = location;
        this.education = education;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    } 
}
