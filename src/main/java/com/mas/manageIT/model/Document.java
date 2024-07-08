package com.mas.manageIT.model;

import com.mas.manageIT.model.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Document {

    private Long id;

    private DocumentType type;

    private String description;

}
