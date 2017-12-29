package ru.shapovalov.Class.DataBaseConection.Create;

import ru.shapovalov.Beans.entity.Account;

import ru.shapovalov.Beans.edit.EditAccount;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by igor on 02.04.15.
 */
@Stateless
public class CreateUser
{

    @EJB
    EditAccount editAccount;

    private boolean newRegistration = true;

    public boolean registrationUser(
                                  HttpServletResponse response, HttpServletRequest request, int personnelNumber,
                                  String firstNameUser, String lastNameUser, String middleName, String loginUser,
                                  String passwordUser, String email, long phoneNumber, int access) {
        try {
           Account account = editAccount.getLogin(loginUser);
            if(account.getLoginUser() == null) {
                newRegistration = false;
            }
           account = EditAccount.getInstance().getPersonnelNumber(personnelNumber);
           if(account.getPersonnelNumber() == 0) {
               newRegistration = false;
           }
        } catch (Exception e) {
            newRegistration = false;
            e.printStackTrace();
        }
        if(newRegistration == true) {
            Account account = new Account();
            account.setPersonnelNumber(personnelNumber);
            account.setFirstNameUser(firstNameUser);
            account.setLastNameUser(lastNameUser);
            account.setMiddleName(middleName);
            account.setLoginUser(loginUser);
            account.setPasswordUser(passwordUser);
            account.setEmail(email);
            account.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
            account.setPhoneNumber(phoneNumber);
            account.setAccess(access);
            EditAccount.getInstance().add(account);
        }
        return newRegistration;
    }
    public CreateUser(){}
    public static final CreateUser getInstance() {
        CreateUser createUser = new CreateUser();
        return createUser;
    }


}
