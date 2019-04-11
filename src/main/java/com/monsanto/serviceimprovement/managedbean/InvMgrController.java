package com.monsanto.serviceimprovement.managedbean;

import com.monsanto.serviceimprovement.helper.InvMgrHelper;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;

/**
 * Created by SNAND3 on 4/15/2018.
 */

@ManagedBean
@Component
@ViewScoped
public class InvMgrController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvMgrController.class);

    @NotNull(message = "Enter Inventory BID")
    private String invBid;
    @NotNull(message = "Select Activate or Deactivate Option")
    private String activationOption;
    @ManagedProperty("#{messageBean}")
    private MessageBean messageBean;
    @Autowired
    private InvMgrHelper invMgrHelper;
    private UploadedFile uploadFile;

    @PostConstruct
    public void init(){
        if(messageBean == null){
            messageBean = new MessageBean();
        }
    }

    public String getInvBid() {
        return invBid;
    }

    public void setInvBid(String invBid) {
        this.invBid = invBid;
    }

    public String getActivationOption() {
        return activationOption;
    }

    public void setActivationOption(String activationOption) {
        this.activationOption = activationOption;
    }

    public void setMessageBean(MessageBean messageBean) {
        this.messageBean = messageBean;
    }

    public UploadedFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(UploadedFile uploadFile) {
        this.uploadFile = uploadFile;
    }


    public void validate(){
        if(getInvBid().length() < 10){
            messageBean.error("Invalid Inventory BID");
        }
    }

    public void activationAction() {
        LOGGER.info("within activationAction()");
        LOGGER.info("Submitted values " + getInvBid() + "   " + getActivationOption());
        String updateStatus = invMgrHelper.activationUpdate(getInvBid(), getActivationOption());
        LOGGER.info("Activate/Deactivate update status "+updateStatus);
        if(updateStatus.equals("Success")){
            messageBean.info("Inventory successfully updated");
        }else if(updateStatus.equals("Inventory does not exist")){
            messageBean.warn("Invalid Inventory BID");
        }else {
            messageBean.error("Failed to update inventory");
        }
    }

    public void upload(){
        System.out.println("within upload() "+uploadFile.getFileName());
        LOGGER.info("within upload() "+uploadFile.getFileName());
    }
}
