package com.gl.first;
import java.util.Scanner;
public class Example {
public static void main(String args[]) {
System.out.println("Please enter the department fro the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
Scanner scan1=new Scanner(System.in);
int department=scan1.nextInt();
String firstName=scan1.next();
String lastName=scan1.next();
Employee man=new Employee(firstName,lastName);
scan1.close();
String shortDepartment;
if(department==1)shortDepartment="tech";
else if(department==2)shortDepartment="admin";
else if(department==3)shortDepartment="hr";
else shortDepartment="legal";
CredentialService m=new CredentialService();
String showing=m.generateEmailAddress(firstName,lastName,shortDepartment);
char[] pass=m.generatePassword();
m.showCredentials(showing,pass);
	}
}
