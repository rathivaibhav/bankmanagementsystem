create database databankmanagementsystem;

show databases;

use databankmanagementsystem;

create table signup(formno varchar(20),name varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(60),marital_status varchar(20),address varchar(50),city varchar(20),pin varchar(20),state varchar(25));
show tables;
select* from signupthree;
create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),seniorcitizen varchar(20),existingaccount varchar(20),pan varchar(20),aadhar varchar(20));
create table signupthree(formno varchar(20),accountType varchar(40),cardnumber varchar(30),pin varchar(20),facility varchar(100));
create table login(formno varchar(20),cardnumber varchar(20),pin varchar(10));

select* from login;

create table bank(pin varchar(10), date varchar(50),type varchar(20),amount varchar(20));

select* from bank;
 
