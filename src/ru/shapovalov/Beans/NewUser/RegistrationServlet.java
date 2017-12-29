package ru.shapovalov.Beans.NewUser;

import ru.shapovalov.Class.DataBaseConection.Create.CreateUser;
import ru.shapovalov.Beans.DispatcherServlet;

import javax.ejb.Stateless;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/**
 * Created by igor on 18.03.15.
 */

@Stateless
@WebServlet("/registrationServlet")
public class RegistrationServlet extends DispatcherServlet {

    String loginUser;
    String passwordUser;
    String firstNameUser;
    String lastNameUser;
    String middleName;
    int personnelNumber;
    String email;
    long phoneNumber;
    int access;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                loginUser = request.getParameter("login");
                passwordUser = encryptPassword(request.getParameter("password"));
                firstNameUser = request.getParameter("firstName");
                lastNameUser = request.getParameter("lastName");
                middleName = request.getParameter("middleName");
                personnelNumber = Integer.parseInt(request.getParameter("personnelNumber"));
                email = request.getParameter("email");
                phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
                access = 1;
// Obtain the data for the new user and register a new account using the method of "registrationUser"
        if(CreateUser.getInstance().registrationUser(response, request, personnelNumber, firstNameUser, lastNameUser,
                middleName, loginUser, passwordUser, email, phoneNumber, access) == true) {
            super.forward("/registration/registrationOk.jsp", request, response);
        } else {
            super.forward("/registration/registrationError.jsp", request, response);
        }

    }
//    Method gets the password hash
    public static String encryptPassword(String password){
        String sha1 = "";
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return sha1;
    }
    private static String byteToHex(final byte[] hash){
        Formatter formatter = new Formatter();
        for (byte b : hash){
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
