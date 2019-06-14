CREATE TABLE `bank_ques_mapping` (
`bqid` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
`bid` int(50) NOT NULL COMMENT '题库id',
`qid` int(50) NOT NULL COMMENT '题目id',
PRIMARY KEY (`bqid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `examinee` (
`eid` int(50) NOT NULL AUTO_INCREMENT COMMENT '考生id',
`ename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生名',
`eemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生邮箱',
`class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考生的班级信息',
`studentid` int(50) NULL DEFAULT NULL COMMENT '考生学号',
`uid` int(50) NULL DEFAULT NULL COMMENT '已注册的考生信息关联',
PRIMARY KEY (`eid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `examinee_ans` (
`eaid` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
`rid` int(50) NOT NULL COMMENT '成绩报告id',
`qid` int(50) NOT NULL COMMENT '题目id',
`ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生对题目的回答内容',
`score` int(255) NOT NULL COMMENT '题目得分',
PRIMARY KEY (`eaid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `paper` (
`pid` int(50) NOT NULL AUTO_INCREMENT COMMENT '试卷id',
`uid` int(50) NOT NULL COMMENT '试卷作者',
`pname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷标题',
`describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷描述',
`type` int(5) NOT NULL DEFAULT 0 COMMENT '试卷类型（0：私有；1：公开）',
`time` int(50) NOT NULL COMMENT '试卷的时间限制',
`Invitation_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邀请码',
`out_times` int(50) NOT NULL DEFAULT 1 COMMENT '切换窗口次数',
PRIMARY KEY (`pid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `paper_ques_mapping` (
`pqid` int(50) NOT NULL AUTO_INCREMENT COMMENT '表主键标识',
`pid` int(50) NOT NULL COMMENT '试卷id',
`qid` int(50) NOT NULL COMMENT '题目id',
`score` int(255) NOT NULL COMMENT '题目得分值',
PRIMARY KEY (`pqid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `paper_store` (
`spid` int(50) NOT NULL COMMENT '货品id',
`pid` int(50) NOT NULL COMMENT '试卷id',
`price` double(50,2) NOT NULL COMMENT '价钱',
PRIMARY KEY (`spid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 0
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `ques_bank` (
`bid` int(50) NOT NULL AUTO_INCREMENT COMMENT '题库id',
`uid` int(50) NOT NULL COMMENT '题库作者',
`bname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库名',
`bdescribe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库描述',
PRIMARY KEY (`bid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `ques_bank_store` (
`sbid` int(50) NOT NULL COMMENT '货品id',
`bid` int(50) NOT NULL COMMENT '题库id',
`price` double(50,2) NOT NULL COMMENT '价钱',
PRIMARY KEY (`sbid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 0
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `question` (
`qid` int(50) NOT NULL AUTO_INCREMENT COMMENT '题目id',
`content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目描述',
`knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
`difficulty` int(5) NOT NULL COMMENT '题目难度',
`type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目类型',
`standard_ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案',
`analysis` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目解析',
PRIMARY KEY (`qid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `records_buy` (
`rbid` int(50) NOT NULL AUTO_INCREMENT COMMENT '买交易记录id',
`date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交易时间',
`sid` int(50) NOT NULL COMMENT '商品id',
PRIMARY KEY (`rbid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `records_sell` (
`rsid` int(50) NOT NULL AUTO_INCREMENT COMMENT '卖交易记录id',
`date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交易时间',
`sid` int(50) NOT NULL COMMENT '商品id',
PRIMARY KEY (`rsid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `report` (
`rid` int(50) NOT NULL AUTO_INCREMENT COMMENT '成绩报告id',
`eid` int(50) NOT NULL COMMENT '考生id',
`pid` int(50) NOT NULL COMMENT '试卷id',
`grade` int(255) NOT NULL COMMENT '试卷分数',
`comments` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '教师评语',
`starttime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试开始时间',
`endtime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试结束时间',
PRIMARY KEY (`rid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;
CREATE TABLE `userinfo` (
`uid` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户id',
`email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登录账号',
`password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户密码',
`uname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
`role` int(255) NOT NULL COMMENT '角色（0：教师；1：学生）',
`photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户头像',
`active` int(255) NOT NULL,
PRIMARY KEY (`uid`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Compact;

ALTER TABLE `paper` ADD CONSTRAINT `fk_paper_paper_1` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`);
ALTER TABLE `examinee` ADD CONSTRAINT `fk_examinee_examinee_1` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`);
ALTER TABLE `report` ADD CONSTRAINT `fk_report_report_1` FOREIGN KEY (`eid`) REFERENCES `examinee` (`eid`);
ALTER TABLE `report` ADD CONSTRAINT `fk_report_report_2` FOREIGN KEY (`pid`) REFERENCES `paper` (`pid`);
ALTER TABLE `examinee_ans` ADD CONSTRAINT `fk_examinee_ans_examinee_ans_1` FOREIGN KEY (`rid`) REFERENCES `report` (`rid`);
ALTER TABLE `examinee_ans` ADD CONSTRAINT `fk_examinee_ans_examinee_ans_2` FOREIGN KEY (`qid`) REFERENCES `question` (`qid`);
ALTER TABLE `paper_ques_mapping` ADD CONSTRAINT `fk_paper_ques_mapping_paper_ques_mapping_1` FOREIGN KEY (`pid`) REFERENCES `paper` (`pid`);
ALTER TABLE `paper_ques_mapping` ADD CONSTRAINT `fk_paper_ques_mapping_paper_ques_mapping_2` FOREIGN KEY (`qid`) REFERENCES `question` (`qid`);
ALTER TABLE `ques_bank` ADD CONSTRAINT `fk_ques_bank_ques_bank_1` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`);
ALTER TABLE `bank_ques_mapping` ADD CONSTRAINT `fk_bank_ques_mapping_bank_ques_mapping_1` FOREIGN KEY (`bid`) REFERENCES `ques_bank` (`bid`);
ALTER TABLE `bank_ques_mapping` ADD CONSTRAINT `fk_bank_ques_mapping_bank_ques_mapping_2` FOREIGN KEY (`qid`) REFERENCES `question` (`qid`);
ALTER TABLE `paper_store` ADD CONSTRAINT `fk_paper_store_paper_store_1` FOREIGN KEY (`pid`) REFERENCES `paper` (`pid`);
ALTER TABLE `ques_bank_store` ADD CONSTRAINT `fk_ques_bank_store_ques_bank_store_1` FOREIGN KEY (`bid`) REFERENCES `ques_bank` (`bid`);
ALTER TABLE `records_buy` ADD CONSTRAINT `fk_records_buy_records_buy_1` FOREIGN KEY (`sid`) REFERENCES `paper_store` (`spid`);
ALTER TABLE `records_buy` ADD CONSTRAINT `fk_records_buy_records_buy_2` FOREIGN KEY (`sid`) REFERENCES `ques_bank_store` (`sbid`);
ALTER TABLE `records_sell` ADD CONSTRAINT `fk_records_sell_records_sell_1` FOREIGN KEY (`sid`) REFERENCES `paper_store` (`spid`);
ALTER TABLE `records_sell` ADD CONSTRAINT `fk_records_sell_records_sell_2` FOREIGN KEY (`sid`) REFERENCES `ques_bank_store` (`sbid`);

