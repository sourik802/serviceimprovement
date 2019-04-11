package com.monsanto.serviceimprovement.managedbean;

import org.primefaces.event.TabChangeEvent;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;

/**
 * Created by SNAND3 on 4/14/2018.
 */

@ManagedBean
@Component
public class MainController {

    private String tabName;

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public void onTabChange(TabChangeEvent event) {
        System.out.println("Active Tab: " + event.getTab().getTitle());
        setTabName(event.getTab().getTitle());
    }
}
