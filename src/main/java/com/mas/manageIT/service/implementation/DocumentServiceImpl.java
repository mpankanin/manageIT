package com.mas.manageIT.service.implementation;

import com.mas.manageIT.model.Document;
import com.mas.manageIT.repository.DocumentRepository;
import com.mas.manageIT.service.DocumentService;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final Logger logger = LoggerFactory.getLogger(DocumentServiceImpl.class);


    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public Document add(Document document, long orderId) {
        return null;
    }

}
