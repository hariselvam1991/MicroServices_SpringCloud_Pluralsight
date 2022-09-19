package com.techbruiser.dataservice1;

public class ContactDetails {

    private String contactId;
    private String contactName;
    private String postalCode;

    public ContactDetails() {}

    public ContactDetails(String contactId, String contactName, String postalCode) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    
}
