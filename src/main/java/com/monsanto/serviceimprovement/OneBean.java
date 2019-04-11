/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monsanto.serviceimprovement;


import com.monsanto.serviceimprovement.entity.CropEntity;
import com.monsanto.serviceimprovement.repository.CropRepository;
import org.primefaces.component.tabview.TabView;
import org.primefaces.event.TabChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

/**
 *
 * @author SNAND3
 */
@ManagedBean
@RequestScoped
public class OneBean {

    @Autowired
    CropRepository cropRepository;

    private String message = "Hello JSF";
    private String formName;
    private Integer tabIndex;
    private TabView tabView;
    private Part uploadFile;

    public OneBean() {
    }

    public Part getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(Part uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String upload(){
        System.out.println("within upload() "+uploadFile);
        return "content1";
    }

    String getMessage() {
        CropEntity crop = cropRepository.findByName("Corn");
        return crop.getCropId().toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Integer getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(Integer tabIndex) {
        this.tabIndex = tabIndex;
    }

    public TabView getTabView() {
        return tabView;
    }

    public void setTabView(TabView tabView) {
        this.tabView = tabView;
    }

    public void onTabChange(TabChangeEvent event) {
        System.out.println("Active Tab: " + event.getTab().getTitle());
        System.out.println("Tab index "+getTabIndex());
        System.out.println("TabView "+getTabView());
        setFormName(event.getTab().getTitle());
    }

    public void bind(){
        System.out.println("Inside bind");
    }


}

