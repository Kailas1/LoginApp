package com.km.model;

import java.util.Date;

public class User {
   String uname, password, email;
   Date registeredon;
public String getUname() {
	return uname;
}
public String getPassword() {
	return password;
}
public String getEmail() {
	return email;
}
public Date getRegisteredon() {
	return registeredon;
}
public void setUname(String uname) {
	this.uname = uname;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public void setRegisteredon(Date registeredon) {
	this.registeredon = registeredon;
}
 
    //put getter and setter here  
}