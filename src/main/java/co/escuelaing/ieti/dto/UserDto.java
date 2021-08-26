package co.escuelaing.ieti.dto;

public class UserDto
{
    private String nameDto, emailDto, lNameDto;

    public UserDto (String nameDto, String emailDto, String lNameDto)
    {
        this.nameDto = nameDto;
        this.emailDto = emailDto;
        this.lNameDto = lNameDto;
    }

    public void setNameDto (String nameDto)
    {
        this.nameDto = nameDto;
    }
    public String getNameDto ()
    {
        return nameDto;
    }

    public void setEmailDto (String emailDto)
    {
        this.emailDto = emailDto;
    }
    public String getEmailDto ()
    {
        return emailDto;
    }

    public String getLNameDto ()
    {
        return lNameDto;
    }
    public void setLNameDto (String lNameDto)
    {
        this.lNameDto = lNameDto;
    }
}