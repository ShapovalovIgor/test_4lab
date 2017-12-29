package ru.shapovalov.Beans.edit;

import ru.shapovalov.Beans.entity.Account;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by igor on 15.05.15.
 */

@Stateless
@Local
public class EditAccount
{
    @PersistenceContext(unitName = "ACCOUNT")
    private EntityManager em;

    //add account
    public Account add(Account account){
        return em.merge(account);
    }

    //Получить аккаунт по ИД
    public Account getId(int id){
        return em.find(Account.class, id);
    }

    //Получить аккаунт по логину
    public Account getLogin(String loginUser){
        return em.find(Account.class, loginUser);
    }

    //Получить аккаунт по персанальному номеру
    public Account getPersonnelNumber(int personnelNumber){
        return em.find(Account.class, personnelNumber);
    }

    //Получить аккаунт по уровню доступа
    public Account getAccess(int access){
        return em.find(Account.class, access);
    }

    //Получить список с определённым уровнем доступа
    public List<Account> getSearch(int search){
       TypedQuery<Account> namedQuery = (TypedQuery<Account>) em.createQuery("select a from Account  a where access =   " + search + "  ");
        return namedQuery.getResultList();
    }


    // если аккаунт которого мыпытаемся обновить нет,
    // то запишется он как новый
    public void update(Account account){
        add(account);
    }

    // удаляем аккаунт по id
    public void delete(int id){
        em.remove(getId(id));
    }

    // Получаем все аккаунты с БД
    public List<Account> getAll(){
        TypedQuery<Account> namedQuery = (TypedQuery<Account>) em.createQuery("select a from Account a");
        return namedQuery.getResultList();
    }
    public EditAccount(){}
    public static final EditAccount getInstance() {
        EditAccount editAccount = new EditAccount();
        return editAccount;
    }


}
