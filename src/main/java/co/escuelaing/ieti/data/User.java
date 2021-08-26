package co.escuelaing.ieti.data;

public class User
{
    public String idUser, nameUser, emailUser, lNameUser, createdAtUser;

    public User ( String idUser, String nameUser, String emailUser, String lNameUser, String createdAtUser)
    {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.lNameUser = lNameUser;
        this.createdAtUser = createdAtUser;
    }

    public void setIdUser (String idUser)
    {
        this.idUser = idUser;
    }
    public String getIdUser ()
    {
        return idUser;
    }

    public void setNameUser (String nameUser)
    {
        this.nameUser = nameUser;
    }
    public String getNameUser ()
    {
        return nameUser;
    }

    public void setEmailUser (String emailUser)
    {
        this.emailUser = emailUser;
    }
    public String getEmailUser ()
    {
        return emailUser;
    }

    public void setLNameUser (String lNameUser)
    {
        this.lNameUser = lNameUser;
    }
    public String getLNameUser ()
    {
        return lNameUser;
    }

    public void setCreatedAtUser (String createdAtUser)
    {
        this.createdAtUser = createdAtUser;
    }
    public String getCreatedAtUser ()
    {
        return createdAtUser;
    }
}