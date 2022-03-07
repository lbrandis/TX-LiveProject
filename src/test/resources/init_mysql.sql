CREATE TABLE `transaction` (
  `id` bigint NOT NULL,
  `account_number` int DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `merchant_logo` varchar(255) DEFAULT NULL,
  `merchant_name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `transaction` (`id`, `account_number`, `amount`, `currency`, `date`, `merchant_logo`, `merchant_name`, `type`) VALUES 
(1,12345,1000,'USD','2022-03-06 04:05:09.996000','Amazon Logo','Amazon','Credit'),
(2,23456,2500,'USD','2022-03-06 04:05:10.200000','Apple Logo','Apple','Debit'),
(3,34567,3000,'USD','2022-03-06 04:05:10.277000','Lexus Logo','Lexus','Debit'),
(4,45678,4000,'USD','2022-03-06 04:05:10.333000','BMW Logo','BMW','Credit'),
(5,56789,5000,'USD','2022-03-06 04:05:10.389000','MSG Logo','MSG','Credit');