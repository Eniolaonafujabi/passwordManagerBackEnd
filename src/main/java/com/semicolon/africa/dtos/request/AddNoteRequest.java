package com.semicolon.africa.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddNoteRequest{
    private String userId;
    private String title;
    private String content;
}
