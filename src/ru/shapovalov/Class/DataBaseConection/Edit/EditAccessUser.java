package ru.shapovalov.Class.DataBaseConection.Edit;

import ru.shapovalov.Beans.edit.EditAccount;
import ru.shapovalov.Beans.entity.Account;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by igor on 02.04.15.
 */
@Stateless
public class EditAccessUser
{

    @EJB
    EditAccount editAccount;

    private boolean editAccess = true;

    public boolean editAccess(
                                  HttpServletResponse response, HttpServletRequest request, int id, int access) {
        if(editAccess == true) {
            try {
                Account account = editAccount.getId(id);
                account.setAccess(access);
                EditAccount.getInstance().update(account);
  } catch (Exception e) {
                editAccess = false;
                e.printStackTrace();
            }
        }
        return editAccess;
    }
    public EditAccessUser(){}
    public static final EditAccessUser getInstance() {
        EditAccessUser createUser = new EditAccessUser();
        return createUser;
    }
}
