
package com.delivery.rezito.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class User {

    @SerializedName("id")
    @Expose
    private String id="";
    @SerializedName("name")
    @Expose
    private String name="";
    @SerializedName("imei")
    @Expose
    private String imei="";
    @SerializedName("email")
    @Expose
    private String email="";
    @SerializedName("mobile")
    @Expose
    private String mobile="";
    @SerializedName("password")
    @Expose
    private String password="";
    @SerializedName("address")
    @Expose
    private String address="";
    @SerializedName("pincode")
    @Expose
    private String pincode="";
    @SerializedName("area")
    @Expose
    private String area="";
    @SerializedName("society")
    @Expose
    private String society="";
    @SerializedName("hno")
    @Expose
    private String hno="";
    @SerializedName("status")
    @Expose
    private String status="";
    @SerializedName("rdate")
    @Expose
    private String rdate="";
    @SerializedName("pin")
    @Expose
    private String pin="";

    @SerializedName("reject")
    @Expose
    private String reject="";

    @SerializedName("accept")
    @Expose
    private String accept="";

    @SerializedName("complete")
    @Expose
    private String complete="";


    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
