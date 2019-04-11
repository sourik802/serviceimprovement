package com.monsanto.serviceimprovement.managedbean;

import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

/**
 * Created by SNAND3 on 5/19/2018.
 */
@ManagedBean
@RequestScoped
@Component
public class FileUploadBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadBean.class);
    private Part file;
    private UploadedFile uploadFile;

    public FileUploadBean() {
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public UploadedFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(UploadedFile uploadFile) {
        this.uploadFile = uploadFile;
    }

    public void upload(){
        System.out.println("within upload() "+uploadFile.getFileName());
        LOGGER.info("within upload() "+uploadFile.getFileName());
    }
}
