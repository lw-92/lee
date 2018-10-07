create table sys_user
(
   user_name            varchar(20) not null,
   login_name           varchar(20) not null,
   id                   bigint not null,
   password             varchar(20),
   tenant_id            varchar(20) not null,
   create_time          bigint,
   update_time          bigint,
   is_delete            boolean,
   userStatus           enum('ACTIVE','INACTIVE'),
   solt                 varchar(10),
   primary key (id)
);

alter table sys_user comment 'system mapper.user tables';

/*==============================================================*/
/* Index: loginNameIndex                                        */
/*==============================================================*/
create unique index loginNameIndex on sys_user
(
   login_name
);