package org.apache.james.admin.webapp.hibernate.pojos;
// Generated Oct 3, 2011 12:14:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Inbox generated by hbm2java
 */
@Entity
@Table(name="inbox"
    ,catalog="jamesemail"
)
public class Inbox  implements java.io.Serializable {


     private InboxId id;
     private String messageState;
     private String errorMessage;
     private String sender;
     private String recipients;
     private String remoteHost;
     private String remoteAddr;
     private byte[] messageBody;
     private byte[] messageAttributes;
     private Date lastUpdated;

    public Inbox() {
    }

	
    public Inbox(InboxId id, String messageState, String recipients, String remoteHost, String remoteAddr, byte[] messageBody, Date lastUpdated) {
        this.id = id;
        this.messageState = messageState;
        this.recipients = recipients;
        this.remoteHost = remoteHost;
        this.remoteAddr = remoteAddr;
        this.messageBody = messageBody;
        this.lastUpdated = lastUpdated;
    }
    public Inbox(InboxId id, String messageState, String errorMessage, String sender, String recipients, String remoteHost, String remoteAddr, byte[] messageBody, byte[] messageAttributes, Date lastUpdated) {
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
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="repositoryName", column=@Column(name="repository_name", nullable=false, length=100) ), 
        @AttributeOverride(name="messageName", column=@Column(name="message_name", nullable=false, length=200) ) } )
    public InboxId getId() {
        return this.id;
    }
    
    public void setId(InboxId id) {
        this.id = id;
    }
    
    @Column(name="message_state", nullable=false, length=30)
    public String getMessageState() {
        return this.messageState;
    }
    
    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }
    
    @Column(name="error_message", length=200)
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    @Column(name="sender")
    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    @Column(name="recipients", nullable=false, length=65535)
    public String getRecipients() {
        return this.recipients;
    }
    
    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }
    
    @Column(name="remote_host", nullable=false)
    public String getRemoteHost() {
        return this.remoteHost;
    }
    
    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }
    
    @Column(name="remote_addr", nullable=false, length=20)
    public String getRemoteAddr() {
        return this.remoteAddr;
    }
    
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }
    
    @Column(name="message_body", nullable=false)
    public byte[] getMessageBody() {
        return this.messageBody;
    }
    
    public void setMessageBody(byte[] messageBody) {
        this.messageBody = messageBody;
    }
    
    @Column(name="message_attributes")
    public byte[] getMessageAttributes() {
        return this.messageAttributes;
    }
    
    public void setMessageAttributes(byte[] messageAttributes) {
        this.messageAttributes = messageAttributes;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_updated", nullable=false, length=19)
    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }




}


