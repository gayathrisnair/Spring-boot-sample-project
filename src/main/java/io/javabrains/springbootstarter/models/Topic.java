package io.javabrains.springbootstarter.models;

import org.springframework.stereotype.Controller;
import sun.java2d.pipe.TextPipe;
import sun.security.util.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "topic")
public class Topic {

    public Topic(){}
    public Topic(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Id
    private int id;
    private String name;
    private String description;

    public String getCharTest() {
        return charTest;
    }

    public String getSizeTest() {
        return sizeTest;
    }

    public String getSizeWithValidationTest() {
        return sizeWithValidationTest;
    }

    @Column(length=1)
    private String charTest;

    public void setCharTest(String charTest) {
        this.charTest = charTest;
    }

    public void setSizeTest(String sizeTest) {
        this.sizeTest = sizeTest;
    }

    public void setSizeWithValidationTest(String sizeWithValidationTest) {
        this.sizeWithValidationTest = sizeWithValidationTest;
    }

    @Size(max=1)
    private String sizeTest;

    @Column(length = 1)
    @Size(max=1)
    private String sizeWithValidationTest;

    public String getSizeAndColumnLength() {
        return sizeAndColumnLength;
    }

    public void setSizeAndColumnLength(String sizeAndColumnLength) {
        this.sizeAndColumnLength = sizeAndColumnLength;
    }

    @Column(length = 1)
    @Size(max=2)
    private String sizeAndColumnLength;
    //Size overwrites @column

    private String test;

    @Size(max=1)
    private String testWithChangedConfig;
}
