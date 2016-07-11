/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  spitzmessera
 * Created: 11.07.2016
 */

create table product (
    id_product integer primary key,
    netprice float not null,
    productname varchar(max) not null,
    productdescr varchar(max) not null,
    manufacturer varchar(max) not null,
    picturepath varchar(max) not null,
    stockCount integer not null
)