package org.apache.james.admin.webapp.hibernate.pojos;
// Generated May 9, 2010 2:26:37 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Spool generated by hbm2java
 */
public class Spool  implements java.io.Serializable {


     private SpoolId id;
     private String messageState;
     private String errorMessage;
     private String sender;
     private String recipients;
     private String remoteHost;
     private String remoteAddr;
     private byte[] messageBody;
     private byte[] messageAttributes;
     private Date lastUpdated;

    public Spool() {
    }

	
    public Spool(SpoolId id, String messageState, String recipients, String remoteHost, String remoteAddr, byte[] messageBody, Date lastUpdated) {
        this.id = id;
        this.messageState = messageState;
        this.recipients = recipients;
        this.remoteHost = remoteHost;
        this.remoteAddr = remoteAddr;
        this.messageBody = messageBody;
        this.lastUpdated = lastUpdated;
    }
    public Spool(SpoolId id, String messageState, String errorMessage, String sender, String recipients, String remoteHost, String remoteAddr, byte[] messageBody, byte[] messageAttributes, Date lastUpdated) {
       this.id = id;
       this.messageState = messageState;
       this.errorMessage = errorMessage;
       this.sender = sender;
       this.recipients = recipients;
       this.remoteHost = remoteHost;
       this.remoteAddr = remoteAddr;
       this.messageBody = messageBody;
       this.messageAttributes = messageAttributes;
       this.lastUpdated = lastUpdated;
    }
   
    public SpoolId getId() {
        return this.id;
    }
    
    public void setId(SpoolId id) {
        this.id = id;
    }
    public String getMessageState() {
        return this.messageState;
    }
    
    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getRecipients() {
        return this.recipients;
    }
    
    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }
    public String getRemoteHost() {
        return this.remoteHost;
    }
    
    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }
    public String getRemoteAddr() {
        return this.remoteAddr;
    }
    
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }
    public byte[] getMessageBody() {
        return this.messageBody;
    }
    
    public void setMessageBody(byte[] messageBody) {
        this.messageBody = messageBody;
    }
    public byte[] getMessageAttributes() {
        return this.messageAttributes;
    }
    
    public void setMessageAttributes(byte[] messageAttributes) {
        this.messageAttributes = messageAttributes;
    }
    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }




}


