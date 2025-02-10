package com.websockets.introduction.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
public class Message {
    private String name;
    private String content;

    public Message(String name, String content){
        this.name = name;
        this.content = content;
    }
    public String getName(){
        return name;
    }
    public String getContent(){
        return content;
    }
}
