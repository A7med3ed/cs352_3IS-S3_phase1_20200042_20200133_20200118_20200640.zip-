package com.fawry_api.fawry.Model.Services;

import com.fawry_api.fawry.Model.Form;
import com.fawry_api.fawry.Controller.Services.InternetPaymentServices;

import java.util.Scanner;

public class OrangeInternet extends InternetPaymentServices {
    public OrangeInternet(){
        obj =new Form();

    }
    @Override
    public String getServiceName() {
        return "Orange Internet";
    }



}
