USE de_data;

CREATE TABLE `de_data`.`users` (
  `userid` INT NOT NULL AUTO_INCREMENT,
  `user_role_id` INT NOT NULL,
  `fname` VARCHAR(45) NOT NULL,
  `lname` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `phonenumber` CHAR(10) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `created_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);
  
  CREATE TABLE `de_data`.`user_role` (
  `user_role_id` INT NOT NULL,
  `user_role_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE INDEX `user_role_name_UNIQUE` (`user_role_name` ) VISIBLE);
  
  CREATE TABLE `de_data`.`business` (
  `business_id` INT NOT NULL AUTO_INCREMENT,
  `business_name` VARCHAR(45) NULL,
  `business_email` VARCHAR(45) NULL,
  `business_contact_no` CHAR(10) NULL,
  `business_city` VARCHAR(45) NULL,
  `ref_uid` INT NULL ,
  PRIMARY KEY (`business_id`));

  
  ALTER TABLE business ADD FOREIGN KEY(`ref_uid`) REFERENCES user_role(`user_role_id`);
  
  CREATE TABLE `de_data`.`sales-info` (
  `sales_id` INT NOT NULL AUTO_INCREMENT,
  `invoice_number` VARCHAR(45) NULL,
  `ref_bid` INT NULL ,
  `amount` DECIMAL(10) NULL,
  `created_time` VARCHAR(45) NULL,
  FOREIGN KEY (`ref_bid`) REFERENCES business(business_id),
  PRIMARY KEY (`sales_id`),
  UNIQUE INDEX `invoice_number_UNIQUE` (`invoice_number` ASC) VISIBLE);
  
ALTER TABLE `de_data`.`user_role` 
CHANGE COLUMN `user_role_id` `user_role_id` INT NOT NULL AUTO_INCREMENT ;

  
INSERT INTO user_role (`user_role_name`) VALUES ('SYSTEM_ADMIN');
INSERT INTO user_role (`user_role_name`) VALUES ('ADMIN');
INSERT INTO user_role (`user_role_name`) VALUES ('STAFF');

INSERT INTO users (`user_role_id`,`fname`, `lname`, `gender`, `phonenumber`, `email`, `password`) VALUES (3,'Jhon', 'Mark', 'Male', '9562424103', 'jhonmark@gmail.com', 'jhon@123');
INSERT INTO users (`user_role_id`,`fname`, `lname`, `gender`, `phonenumber`, `email`, `password`) VALUES (1,'Marry', 'Cruise', 'Female', '9847578258', 'marrycruise@gmail.com', 'marry@123');
INSERT INTO users (`user_role_id`,`fname`, `lname`, `gender`, `phonenumber`, `email`, `password`) VALUES (3,'Harry', 'Holmes', 'Male', '5656232', 'hhh@gmail.com', 'marry@123');



ALTER TABLE users ADD FOREIGN KEY(`user_role_ref`) REFERENCES user_role(user_role_ref);


INSERT INTO `de_data`.`business` (`business_name`, `business_email`, `business_contact_no`, `business_city`, `ref_uid`) VALUES ('DataEquinox', 'dataequinox@outlook.com', '9856231202', 'Tokyo', '1');
INSERT INTO `de_data`.`business` (`business_name`, `business_email`, `business_contact_no`, `business_city`, `ref_uid`) VALUES ('Infosys', 'infosys@in.com', '5689451223', 'Kochi', '1');
INSERT INTO `de_data`.`business` (`business_name`, `business_email`, `business_contact_no`, `business_city`, `ref_uid`) VALUES ('Quest', 'quest@qis.com', '7895632141', 'Kochi', '1');
INSERT INTO `de_data`.`business` (`business_name`, `business_email`, `business_contact_no`, `business_city`, `ref_uid`) VALUES ('TCS', 'tcs@tcs.com', '7841236523', 'Trivandrum', '1');
INSERT INTO `de_data`.`business` (`business_name`, `business_email`, `business_contact_no`, `business_city`, `ref_uid`) VALUES ('Wipro', 'wipro@wipro.com', '7452365212', 'Tokyo', '1');

ALTER TABLE `de_data`.`sales-info` 
CHANGE COLUMN `created_time` `invoicedate` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ;

INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0001', '5000');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0002', '1500');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0003', '4800');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0004', '8900');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0005', '7800');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0006', '50200');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0007', '15020');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0008', '48010');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount` ) VALUES ('1', '0009', '9060');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`) VALUES ('1', '0010', '88080');

INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0011', '5000', '2008-10-03 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0012', '1500', '2009-10-08 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0013', '4800', '2007-05-0 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0014', '8900', '2012-11-06 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0015', '7800', '2020-08-02 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0016', '50200', '2020-10-03 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0017', '15020', '2020-10-08 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0018', '48010', '2020-05-18 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0019', '9060', '2021-01-16 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('2', '0020', '88080', '2021-01-22 22:59:52');

INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0021', '5000', '2020-10-05 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0022', '1500', '2020-10-02 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0023', '4800', '2020-05-02 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0024', '8900', '2020-11-01 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0025', '7800', '2020-08-02 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0026', '50200', '2020-10-03 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0027', '15020', '2020-10-08 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0028', '48010', '2020-05-18 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0029', '9060', '2021-01-16 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('3', '0030', '88080', '2021-01-22 22:59:52');

INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0031', '50100', '2020-02-05 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0032', '15000', '2020-03-02 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0033', '48010', '2020-04-02 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0034', '89002', '2020-05-01 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0035', '78002', '2020-08-02 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0036', '50220', '2020-06-03 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0037', '150220', '2020-10-08 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0038', '480120', '2020-05-23 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0039', '90620', '2021-01-12 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('4', '0040', '288080', '2021-01-02 22:59:52');

INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0041', '45000', '2020-10-06 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0042', '15400', '2020-10-05 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0043', '64800', '2020-05-06 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0044', '89400', '2020-11-08 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0045', '57800', '2020-08-12 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0046', '502200', '2020-10-23 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0047', '145020', '2020-10-18 12:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0048', '548010', '2020-05-28 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0049', '95060', '2021-01-30 22:59:52');
INSERT INTO `de_data`.`sales-info` (`ref_bid`, `invoice_number`, `amount`, `invoicedate`) VALUES ('5', '0050', '588080', '2021-01-20 22:59:52');

ALTER TABLE `de_data`.`sales-info` 
RENAME TO  `de_data`.`sales_info` ;



 /* 5 */  SELECT  B.business_id , B.business_name, SUM(S.amount) AS TOTAL_SALES  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid GROUP BY S.ref_bid;

 /* 6 */  SELECT  B.business_id , B.business_name, SUM(S.amount) AS TOTAL_SALES_IN_2021_JAN  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid AND S.invoicedate LIKE '2021-01-%' GROUP BY S.ref_bid;

 /* 7 */ 
		
			SELECT business_id,business_name AS Business_Leader_In_Each_City,T.business_city ,T.MaxTotal AS Total_Gross FROM (SELECT B.business_id , B.business_name, B.business_city, SUM(S.amount) AS Total  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid GROUP BY B.business_id)AS temp 
			INNER JOIN(
						SELECT business_city,MAX(Total) MaxTotal
						FROM (SELECT B.business_id , B.business_name, B.business_city,SUM(S.amount) AS Total  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid GROUP BY B.business_id) AS K
						GROUP BY business_city
						) AS T
			ON T.business_city=temp.business_city
			AND T.MaxTotal=temp.Total;
            
      
 

 /* 8  */  
		    SELECT business_id,business_name,T.business_city AS Leader_In_Each_City_In_JAN_2021,T.MaxTotal_In_JAN_2020 AS Total_Gross_In_JAN_2021 FROM (SELECT B.business_id , B.business_name, B.business_city, SUM(S.amount) AS Total_In_JAN_2020 FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid AND S.invoicedate LIKE '2021-01-%' GROUP BY B.business_id) AS temp2 
			INNER JOIN(
						SELECT business_city,MAX(Total_In_JAN_2020) AS MaxTotal_In_JAN_2020
						FROM (SELECT B.business_id , B.business_name, B.business_city, SUM(S.amount) AS Total_In_JAN_2020 FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid AND S.invoicedate LIKE '2021-01-%' GROUP BY B.business_id) AS temp2
						GROUP BY business_city
						) AS T
			ON T.business_city=temp2.business_city
			AND T.MaxTotal_In_JAN_2020=temp2.Total_In_JAN_2020
            ;
            
          

/* 9  */  
		
       UPDATE business AS B SET B.business_name=CONCAT('Big_',B.business_name)  
          WHERE B.business_name=
          (SELECT business_name FROM 
          (SELECT B.business_name,SUM(S.amount) AS TOTAL_SALES  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid GROUP BY S.ref_bid) AS temp3
         WHERE TOTAL_SALES=(SELECT MAX(TOTAL_SALES) FROM (SELECT B.business_name,SUM(S.amount) AS TOTAL_SALES  FROM business AS B, sales_info AS S WHERE B.business_id=S.ref_bid GROUP BY S.ref_bid)temp3));
          

 /*10*/  ALTER TABLE users ADD COLUMN `active` BOOLEAN NOT NULL DEFAULT true;
 

