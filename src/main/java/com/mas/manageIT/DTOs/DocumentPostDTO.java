package com.mas.manageIT.DTOs;

import com.mas.manageIT.model.enums.DocumentType;
import lombok.Data;

@Data
public class DocumentPostDTO {

    private DocumentType type;
    private String description;

}
