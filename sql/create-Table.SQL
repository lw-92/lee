CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(11) DEFAULT NULL COMMENT '用户名',
  `login_name` varchar(11) NOT NULL COMMENT '登陆名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '第一次登录时间',
  `tenant_id` varchar(11) NOT NULL DEFAULT '0' COMMENT 'tenantId',
  `role_id` int(11) NOT NULL COMMENT '角色id：1系统管理员（系统预设） 2运营管理员 3机构管理员 4机构用户 5政府管理员（系统预设） 6政府审核员 ',
  `create_by` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(10) DEFAULT NULL COMMENT '用户状态 1 有效 2无效 3停用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户表';