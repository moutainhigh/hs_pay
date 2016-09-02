﻿drop table TB_ACCOUNT_BANK cascade constraints;

/*==============================================================*/
/* Table: TB_ACCOUNT_BANK                                       */
/*==============================================================*/
create table TB_ACCOUNT_BANK 
(
   ID                   VARCHAR2(32)         not null,
   USER_ID              VARCHAR2(32)         not null,
   ACCOUNT              VARCHAR2(32)         not null,
   BANK                 VARCHAR2(50)         not null,
   REQUEST_ID           VARCHAR2(32)         not null,
   CREATE_DATE          DATE,
   CREATE_BY            VARCHAR2(32),
   UPDATE_DATE          DATE,
   UPDATE_BY            VARCHAR2(32),
   REMARK               VARCHAR2(500),
   constraint PK_TB_ACCOUNT_BANK primary key (ID)
);

comment on table TB_ACCOUNT_BANK is
'用户绑定银行卡信息表';

comment on column TB_ACCOUNT_BANK.ID is
'主键编号';

comment on column TB_ACCOUNT_BANK.USER_ID is
'用户编号';

comment on column TB_ACCOUNT_BANK.ACCOUNT is
'银行账号';

comment on column TB_ACCOUNT_BANK.BANK is
'银行';

comment on column TB_ACCOUNT_BANK.REQUEST_ID is
'快捷支付标识';

comment on column TB_ACCOUNT_BANK.CREATE_DATE is
'创建时间';

comment on column TB_ACCOUNT_BANK.CREATE_BY is
'创建人';

comment on column TB_ACCOUNT_BANK.UPDATE_DATE is
'更新时间';

comment on column TB_ACCOUNT_BANK.UPDATE_BY is
'更新人';

comment on column TB_ACCOUNT_BANK.REMARK is
'备注';
