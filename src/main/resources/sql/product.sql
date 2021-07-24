CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(255) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `exp_date` datetime(6) DEFAULT NULL,
  `length` double NOT NULL,
  `mf_company` varchar(255) DEFAULT NULL,
  `mf_date` datetime(6) DEFAULT NULL,
  `mf_location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` int(11) NOT NULL,
  `width` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
SELECT * FROM matric.product;