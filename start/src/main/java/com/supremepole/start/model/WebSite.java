package com.supremepole.start.model;

/**
 * @author supremepole
 */
public class WebSite {
    private Long id;
    private String websitename;
    private String websiteurl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return websitename;
    }

    public void setCountryname(String countryname) {
        this.websitename = countryname;
    }

    public String getCountrycode() {
        return websiteurl;
    }

    public void setCountrycode(String countrycode) {
        this.websiteurl = countrycode;
    }
}
