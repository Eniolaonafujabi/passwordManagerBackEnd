package com.semicolon.africa.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateNoteRequest {
    private String userId;
    private String id;
    private String title;
    private String content;

}
