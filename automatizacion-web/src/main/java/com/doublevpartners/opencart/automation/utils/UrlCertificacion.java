package com.doublevpartners.opencart.automation.utils;

import java.util.ResourceBundle;

public class UrlCertificacion {

    public static final String OPEN_CART_ABSTRACTA = ResourceBundle.getBundle("Data_es_ES")
            .getString("certificationURL");

    private UrlCertificacion() {
        throw new IllegalStateException("Utility class");
    }
}





