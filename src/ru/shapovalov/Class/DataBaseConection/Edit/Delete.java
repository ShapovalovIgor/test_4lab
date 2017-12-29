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
public class Delete
{
    @EJB
    EditAccount editAccount;
    private boolean delete = false;

    public boolean deleteUser(HttpServletResponse response, HttpServletRequest request, int id) {
        Account account = null;
        try {
            account = editAccount.getId(id);
                if (account.getId() == id) {
                    delete = true;
                }
        }catch (Exception e){
            delete = false;
        }
        if(delete == true) {
            try {
                EditAccount.getInstance().delete(account.getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            delete = false;
        }

        return delete;
    }
    public Delete(){}
    public static final Delete getInstance() {
        Delete deleteUser = new Delete();
        return deleteUser;
    }


}
