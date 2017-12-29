package ru.shapovalov.Class.DataBaseConection.Edit;

import ru.shapovalov.Beans.edit.EditAccount;
import ru.shapovalov.Beans.entity.Account;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by igor on 02.04.15.
 */
@Stateless
public class EditUser
{

    @EJB
    EditAccount editAccount;

    private boolean newRegistration = true;

    public boolean registrationUser(
                                  HttpServletResponse response, HttpServletRequest request, int id, int personnelNumber,
                                  String firstNameUser, String lastNameUser, String middleName, String loginUser,
                                  String passwordUser, String email, long phoneNumber) {
        try {
            Account account = editAccount.getId(id);
            account.setPersonnelNumber(personnelNumber);
            account.setFirstNameUser(firstNameUser);
            account.setLastNameUser(lastNameUser);
            account.setMiddleName(middleName);
            account.setLoginUser(loginUser);
            account.setPasswordUser(passwordUser);
            account.setEmail(email);
            account.setPhoneNumber(phoneNumber);
         } catch (Exception e) {
            newRegistration = false;
                e.printStackTrace();
        }
        return newRegistration;
    }
    public EditUser(){}
    public static final EditUser getInstance() {
        EditUser createUser = new EditUser();
        return createUser;
    }


}
