--DROP TABLE IF EXISTS `coffee`.`menu`;
CREATE table menu(
                     menu_id BIGINT not null auto_increment,
                     menu_name VARCHAR(50) not null,
                     menu_price BIGINT not null,
                     reg_date DATETIME not null,
                     mod_date DATETIME not null,
                     primary key(menu_id)
);

--DROP TABLE IF EXISTS `coffee`.`order`;
CREATE table `order`(
                        order_id BIGINT not null auto_increment,
                        order_price BIGINT not null,
                        order_quantity BIGINT not null,
                        menu_name VARCHAR(50) not null,
                        reg_date Datetime not null,
                        mod_date Datetime not null,
                        member_id BIGINT,
                        menu_id BIGINT,
                        primary key(order_id)
);

--DROP TABLE IF EXISTS `coffee`.`member`;
CREATE table `member`(
                         member_id BIGINT not null auto_increment,
                         member_name VARCHAR(100) not null,
                         member_point BIGINT not null,
                         reg_date DATETIME not null,
                         mod_date DATETIME not null,
                         primary key(member_id)
);

--DROP TABLE IF EXISTS `coffee`.`point`;
CREATE table `point`(
                        point_id BIGINT not null auto_increment,
                        point_type VARCHAR(10) not null,
                        `point` bigint not null,
                        before_point bigint not null,
                        reg_date Datetime not null,
                        mod_date Datetime not null,
                        reg_by VARCHAR(100) not null,
                        mod_by VARCHAR(100) not null,
                        member_id bigint,
                        primary key(point_id)
);



