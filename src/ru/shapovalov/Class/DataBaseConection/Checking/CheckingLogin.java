package ru.shapovalov.Class.DataBaseConection.Checking;

import ru.shapovalov.Beans.edit.EditAccount;
import ru.shapovalov.Beans.entity.Account;
import ru.shapovalov.Beans.NewUser.RegistrationServlet;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by igor on 02.04.15.
 */
@Stateless
public class CheckingLogin
{

    @EJB
    EditAccount editAccount;

    public int checkingAccessLevel(String loginUser, String passwordUser, HttpServletRequest request) {
        loginUser = request.getParameter("login");
        passwordUser = RegistrationServlet.encryptPassword(request.getParameter("password"));
        int access = 0;
        try {
           Account account = editAccount.getLogin(loginUser);
                if (account.getLoginUser().equals(loginUser) && account.getLoginUser().hashCode() == loginUser.hashCode() &&
                        account.getPasswordUser().equals(passwordUser) && account.getPasswordUser().hashCode() == passwordUser.hashCode()) {
                access = account.getAccess();
                }else {
                    access = 0;
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return access;
    }
    public CheckingLogin() {}
    public static final CheckingLogin getInstance() {
       CheckingLogin checkingLogin = new CheckingLogin();
        return checkingLogin;
    }
}