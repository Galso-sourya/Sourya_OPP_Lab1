package com.gl.first;
import java.util.*;  
public class CredentialService {
static char[] generatePassword() {
	String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Small_chars = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
            String symbols = "!@#$%^&*_=+-/.?<>)";


    String values = Capital_chars + Small_chars +
                    numbers + symbols;
    Random rndm_method = new Random();

    char[] password = new char[8];

    for (int i = 0; i <8; i++)
    {
        password[i] =
          values.charAt(rndm_method.nextInt(values.length()));

    }
    return password;
}
String generateEmailAddress(String firstName,String lastName,String shortDepartment) {
String email=firstName+lastName+"@"+shortDepartment+".abc.com";
return email;
}
void showCredentials(String email,char[] pass) {
	System.out.println("Email   ---> "+email);
	System.out.print("Password---> "+pass);
}
}
