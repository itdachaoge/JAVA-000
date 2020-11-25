#基于电商交易场景（用户、商品、订单），设计一套简单的表结构
#数据库名称：product-shop
#一共6张表：
-- product_category（商品类目表）、product_info（商品表）、order_master（订单表）、order_detail（订单详情表）、users（用户表）、user_address（用户地址表）



-- ----------------------------
-- Table structure for product_category
-- ----------------------------
drop table if exists `product_category`;
create table `product_category` (
    `category_id` int not null auto_increment comment '主键id 商品类目id',
    `category_name` varchar(64) not null comment '类目名字',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key (`category_id`)
) engine=innodb default charset=utf8mb4 comment='商品类目表 ';
-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product-shop`.`product_category` (`category_id`, `category_name`, `category_type`, `create_time`, `update_time`) VALUES ('1', '爆款热销', '2', '2020-11-25 07:20:32', '2020-11-25 08:52:13');
INSERT INTO `product-shop`.`product_category` (`category_id`, `category_name`, `category_type`, `create_time`, `update_time`) VALUES ('2', '热销榜', '3', '2020-11-25 17:11:46', '2020-11-25 08:52:18');
INSERT INTO `product-shop`.`product_category` (`category_id`, `category_name`, `category_type`, `create_time`, `update_time`) VALUES ('3', '热销男生榜单', '4', '2020-11-25 09:22:14', '2020-11-25 08:52:21');



-- ----------------------------
-- Table structure for product_info
-- ----------------------------
drop table if exists `product_info`;
create table `product_info` (
    `product_id` varchar(32) not null comment '主键id 商品id',
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '单价',
    `product_stock` int not null comment '库存',
    `product_description` varchar(64) comment '描述',
    `product_icon` varchar(512) comment '小图',
    `product_status` tinyint(3) default '0' COMMENT '商品状态,0正常1下架',
    `category_type` int not null comment '关联类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key (`product_id`)
) engine=innodb default charset=utf8mb4 comment='商品表 ';
-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product-shop`.`product_info` (`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`) VALUES ('157856563244160021', '皮蛋粥', '3.20', '100', '很好喝的粥', 'http://xxxx.jpg', '0', '2', '2019-02-20 21:29:15', '2020-11-25 09:09:33');
INSERT INTO `product-shop`.`product_info` (`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`) VALUES ('157875196366160022', '皮皮虾', '3.20', '97', '很好吃的虾', 'http://xxxx.jpg', '0', '2', '2019-01-26 10:59:05', '2020-11-25 09:09:38');
INSERT INTO `product-shop`.`product_info` (`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`) VALUES ('157875196366160044', '棒棒冰', '6.00', '185', '很好吃', 'http://xxx.jpg', '0', '3', '2019-01-28 20:27:44', '2020-11-25 09:09:40');






-- ----------------------------
-- Table structure for order_master
-- ----------------------------
drop table if exists `order_master`;
create table `order_master` (
    `order_id` varchar(32) not null comment '主键id 订单id',
    `buyer_username` varchar(32) not null comment '买家名字',
    `buyer_phone` varchar(32) not null comment '买家电话',
    `buyer_address` varchar(128) not null comment '买家地址',
    `users_id` varchar(64) not null comment '关联用户id',
    `order_amount` decimal(8,2) not null comment '订单总金额',
    `order_status` tinyint(3) not null default '0' comment 'xxxx',
    `pay_status` tinyint(3) not null default '0' comment '支付状态, 默认未支付',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key (`order_id`),
    key `idx_users_id` (`users_id`)
) engine=innodb default charset=utf8mb4 comment='订单表 ';
-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `product-shop`.`order_master` (`order_id`, `buyer_username`, `buyer_phone`, `buyer_address`, `users_id`, `order_amount`, `order_status`, `pay_status`, `create_time`, `update_time`) VALUES ('1567522275308479404', '大超哥', '18942612161', '北京市海淀区中关村', '2020017YR51G1XWH', '33.20', '0', '0', '2020-11-25 22:51:15', '2020-11-25 08:57:47');
INSERT INTO `product-shop`.`order_master` (`order_id`, `buyer_username`, `buyer_phone`, `buyer_address`, `users_id`, `order_amount`, `order_status`, `pay_status`, `create_time`, `update_time`) VALUES ('1567522329370243779', '大超哥', '18942612162', '北京市海淀区中关村', '2020017YR51G1XWH', '30.00', '0', '0', '2020-11-25 22:52:09', '2020-11-25 09:32:40');
INSERT INTO `product-shop`.`order_master` (`order_id`, `buyer_username`, `buyer_phone`, `buyer_address`, `users_id`, `order_amount`, `order_status`, `pay_status`, `create_time`, `update_time`) VALUES ('1567522367961460656', '大超哥', '18942612167', '北京市海淀区中关村', '2020017YR51G1XWH', '36.40', '2', '1', '2020-11-25 22:52:48', '2020-11-25 09:33:22');





-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
drop table if exists `order_detail`;
create table `order_detail` (
    `detail_id` varchar(32) not null comment '主键id 订单详情id',
    `order_id` varchar(32) not null comment '关联订单id',
    `product_id` varchar(32) not null comment '关联商品id',
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '当前价格,单位分',
    `product_quantity` int not null comment '数量',
    `product_icon` varchar(512) comment '小图',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key (`detail_id`),
    key `idx_order_id` (`order_id`)
) engine=innodb default charset=utf8mb4 comment='订单详情表 ';
-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `product-shop`.`order_detail` (`detail_id`, `order_id`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_icon`, `create_time`, `update_time`) VALUES ('1567522275455833411', '1567522275308479404', '157875196366160044', '棒棒冰', '6.00', '5', 'http://xxx.jpg', '2020-11-25 22:51:15', '2020-11-25 09:11:09');
INSERT INTO `product-shop`.`order_detail` (`detail_id`, `order_id`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_icon`, `create_time`, `update_time`) VALUES ('1567522275495993442', '1567522275308479404', '157856563244160021', '皮皮虾', '3.20', '1', 'http://xxxx.jpg', '2020-11-25 22:51:15', '2020-11-25 22:51:15');
INSERT INTO `product-shop`.`order_detail` (`detail_id`, `order_id`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_icon`, `create_time`, `update_time`) VALUES ('1567522329476645859', '1567522329370243779', '157875196366160044', '棒棒冰', '6.00', '5', 'http://xxx.jpg', '2020-11-25 22:52:09', '2020-11-25 22:52:09');
INSERT INTO `product-shop`.`order_detail` (`detail_id`, `order_id`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_icon`, `create_time`, `update_time`) VALUES ('1567522368043713326', '1567522367961460656', '157875196366160044', '棒棒冰', '6.00', '5', 'http://xxx.jpg', '2020-11-25 22:52:48', '2020-11-25 22:52:48');
INSERT INTO `product-shop`.`order_detail` (`detail_id`, `order_id`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_icon`, `create_time`, `update_time`) VALUES ('1567522368098323110', '1567522367961460656', '157856563244160021', '皮皮虾', '3.20', '2', 'http://xxxx.jpg', '2020-11-25 22:52:48', '2020-11-25 09:33:13');



-- ----------------------------
-- Table structure for users
-- ----------------------------
drop table if exists `users`;
create table `users` (
  `id` varchar(64) not null comment '主键id 用户id',
  `username` varchar(32) not null comment '用户名',
  `password` varchar(64) not null comment '密码',
  `nickname` varchar(32) default null comment '昵称',
  `realname` varchar(128) default null comment '真实姓名',
  `face` varchar(1024) default null comment  '头像',
  `phone` varchar(32) default null comment '手机号',
  `email` varchar(32) default null comment '邮箱地址',
  `sex` int(11) default null comment '性别 1:男  0:女  2:保密',
  `birthday` date default null comment '生日',
  `created_time` datetime not null comment '创建时间',
  `updated_time` datetime not null comment '更新时间',
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='用户表 ';
-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `product-shop`.`users` (`id`, `username`, `password`, `nickname`, `realname`, `face`, `phone`, `email`, `sex`, `birthday`, `created_time`, `updated_time`) VALUES ('2020017YR51G1XWH', 'zhangycl', '123456', '大超哥', NULL, '', NULL, NULL, '2', '2020-11-25', '2020-11-25 23:44:30', '2020-11-25 23:44:30');
INSERT INTO `product-shop`.`users` (`id`, `username`, `password`, `nickname`, `realname`, `face`, `phone`, `email`, `sex`, `birthday`, `created_time`, `updated_time`) VALUES ('202015GTKCBSS7MW', 'admin', '123456', '管理员', NULL, '', NULL, NULL, '2', '2020-11-25', '2020-11-25 22:11:58', '2020-11-25 22:11:58');





-- ----------------------------
-- Table structure for user_address
-- ----------------------------
drop table if exists `user_address`;
create table `user_address` (
  `id` varchar(64) not null comment '地址主键id',
  `users_id` varchar(64) not null comment '关联用户id',
  `receiver` varchar(32) not null comment '收件人姓名',
  `phone` varchar(32) not null comment '收件人手机号',
  `province` varchar(32) not null comment '省份',
  `city` varchar(32) not null comment '城市',
  `district` varchar(32) not null comment '区县',
  `detail` varchar(128) not null comment '详细地址',
  `extand` varchar(128) default null comment '扩展字段',
  `is_default` int(11) default null comment '是否默认地址',
  `created_time` datetime not null comment '创建时间',
  `updated_time` datetime not null comment '更新时间',
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='用户地址表 ';
-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `product-shop`.`user_address` (`id`, `users_id`, `receiver`, `phone`, `province`, `city`, `district`, `detail`, `extand`, `is_default`, `created_time`, `updated_time`) VALUES ('202025CG3AA14Y3C', '2020017YR51G1XWH', 'zhangycl', '13333333333', '北京', '北京', '海淀区', '中关村', NULL, '1', '2020-11-25 17:34:14', '2020-11-25 17:34:14');
INSERT INTO `product-shop`.`user_address` (`id`, `users_id`, `receiver`, `phone`, `province`, `city`, `district`, `detail`, `extand`, `is_default`, `created_time`, `updated_time`) VALUES ('202025CG4ZCSSWM8', '202015GTKCBSS7MW', 'admin', '13666666666', '北京', '北京', '东城区', '世贸大厦', NULL, '0', '2020-11-25 17:34:24', '2020-11-25 17:34:24');
