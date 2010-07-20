package org.apache.james.admin.webapp.hibernate.pojos;
// Generated May 9, 2010 2:26:37 PM by Hibernate Tools 3.2.1.GA



/**
 * InboxId generated by hbm2java
 */
public class InboxId  implements java.io.Serializable {


     private String repositoryName;
     private String messageName;

    public InboxId() {
    }

    public InboxId(String repositoryName, String messageName) {
       this.repositoryName = repositoryName;
       this.messageName = messageName;
    }
   
    public String getRepositoryName() {
        return this.repositoryName;
    }
    
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
    public String getMessageName() {
        return this.messageName;
    }
    
    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InboxId) ) return false;
		 InboxId castOther = ( InboxId ) other; 
         
		 return ( (this.getRepositoryName()==castOther.getRepositoryName()) || ( this.getRepositoryName()!=null && castOther.getRepositoryName()!=null && this.getRepositoryName().equals(castOther.getRepositoryName()) ) )
 && ( (this.getMessageName()==castOther.getMessageName()) || ( this.getMessageName()!=null && castOther.getMessageName()!=null && this.getMessageName().equals(castOther.getMessageName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRepositoryName() == null ? 0 : this.getRepositoryName().hashCode() );
         result = 37 * result + ( getMessageName() == null ? 0 : this.getMessageName().hashCode() );
         return result;
   }   


}


