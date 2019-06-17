/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : exam

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 16/06/2019 15:10:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bank_ques_mapping
-- ----------------------------
DROP TABLE IF EXISTS `bank_ques_mapping`;
CREATE TABLE `bank_ques_mapping`  (
  `bqid` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
  `bid` int(50) NOT NULL COMMENT '题库id',
  `qid` int(50) NOT NULL COMMENT '题目id',
  `order` int(255) NOT NULL COMMENT '题目顺序',
  `type` int(255) NOT NULL COMMENT '题目类型（1：单选；2：多选；3：判断；4：填空；5：简答）',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`bqid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for examinee
-- ----------------------------
DROP TABLE IF EXISTS `examinee`;
CREATE TABLE `examinee`  (
  `eid` int(50) NOT NULL AUTO_INCREMENT COMMENT '考生id',
  `pid` int(50) NOT NULL COMMENT '考生参与的考试',
  `ename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生名',
  `eemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生邮箱',
  `class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考生的班级信息',
  `studentid` int(50) NULL DEFAULT NULL COMMENT '考生学号',
  `isfinish` int(5) NULL DEFAULT NULL COMMENT '是否已完成考试（1：是；0：否）',
  `uid` int(50) NULL DEFAULT NULL COMMENT '与已注册的学生信息关联',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for examinee_ans
-- ----------------------------
DROP TABLE IF EXISTS `examinee_ans`;
CREATE TABLE `examinee_ans`  (
  `eaid` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
  `eid` int(50) NOT NULL COMMENT '参加考试的考生id',
  `qid` int(50) NOT NULL COMMENT '试卷中的问题的id',
  `ans` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生对题目的回答内容',
  `score` int(255) NOT NULL COMMENT '题目得分',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`eaid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper`  (
  `pid` int(50) NOT NULL AUTO_INCREMENT COMMENT '试卷id',
  `uid` int(50) NOT NULL COMMENT '试卷作者',
  `pname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷标题',
  `pdescribe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷描述',
  `type` int(5) NOT NULL DEFAULT 0 COMMENT '试卷类型（0：私有；1：公开）',
  `time` int(50) NOT NULL COMMENT '试卷的时间限制',
  `Invitation_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邀请码',
  `out_times` int(50) NOT NULL DEFAULT 1 COMMENT '切换窗口次数',
  `pick_info` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '\"0\":姓名邮箱，“c”:+班级,“s”:+学号,\"a\":所有',
  `qsi_num` int(50) NOT NULL DEFAULT 0 COMMENT '单选题数量',
  `qm_num` int(50) NOT NULL DEFAULT 0 COMMENT '多选题数量',
  `qj_num` int(50) NOT NULL DEFAULT 0 COMMENT '判断题数量',
  `qf_num` int(50) NOT NULL DEFAULT 0 COMMENT '填空题数量',
  `qsh_num` int(50) NOT NULL DEFAULT 0 COMMENT '简答题数量',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷更新/创建时间',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for paper_ques_mapping
-- ----------------------------
DROP TABLE IF EXISTS `paper_ques_mapping`;
CREATE TABLE `paper_ques_mapping`  (
  `pqid` int(50) NOT NULL AUTO_INCREMENT COMMENT '表主键标识',
  `pid` int(50) NOT NULL COMMENT '试卷id',
  `qid` int(50) NOT NULL COMMENT '题目id',
  `score` int(255) NOT NULL COMMENT '题目得分值',
  `order` int(255) NOT NULL COMMENT '题目顺序',
  `type` int(255) NOT NULL COMMENT '题目类型（1：单选；2：多选；3：判断；4：填空；5：简答）',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`pqid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_bank
-- ----------------------------
DROP TABLE IF EXISTS `ques_bank`;
CREATE TABLE `ques_bank`  (
  `bid` int(50) NOT NULL AUTO_INCREMENT COMMENT '题库id',
  `uid` int(50) NOT NULL COMMENT '题库作者',
  `bname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库名',
  `bdescribe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库描述',
  `qsi_num` int(50) NOT NULL DEFAULT 0 COMMENT '单选题数量',
  `qm_num` int(50) NOT NULL DEFAULT 0 COMMENT '多选题数量',
  `qj_num` int(50) NOT NULL DEFAULT 0 COMMENT '判断题数量',
  `qf_num` int(50) NOT NULL DEFAULT 0 COMMENT '填空题数量',
  `qsh_num` int(50) NOT NULL DEFAULT 0 COMMENT '简答题数量',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库更新/创建时间',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`bid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_fill
-- ----------------------------
DROP TABLE IF EXISTS `ques_fill`;
CREATE TABLE `ques_fill`  (
  `qfid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `blank1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '填空1',
  `blank2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空2',
  `blank3` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空3',
  `blank4` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空4',
  `blank5` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空5',
  `blank6` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空6',
  `blank7` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '填空7',
  `standard_ans1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案1',
  `standard_ans2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案2',
  `standard_ans3` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案3',
  `standard_ans4` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案4',
  `standard_ans5` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案5',
  `standard_ans6` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案6',
  `standard_ans7` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目标准答案7',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qfid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_judge
-- ----------------------------
DROP TABLE IF EXISTS `ques_judge`;
CREATE TABLE `ques_judge`  (
  `qjid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `standard_ans` int(5) NOT NULL COMMENT '题目标准答案（0：错误；1：正确）',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qjid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_mul
-- ----------------------------
DROP TABLE IF EXISTS `ques_mul`;
CREATE TABLE `ques_mul`  (
  `qsid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `chioce1` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项1',
  `chioce2` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项2',
  `chioce3` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项3',
  `chioce4` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项4',
  `chioce5` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项5',
  `chioce6` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项6',
  `chioce7` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项7',
  `standard_ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_short
-- ----------------------------
DROP TABLE IF EXISTS `ques_short`;
CREATE TABLE `ques_short`  (
  `qsid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `standard_ans` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案（0：错误；1：正确）',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_single
-- ----------------------------
DROP TABLE IF EXISTS `ques_single`;
CREATE TABLE `ques_single`  (
  `qmid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `chioce1` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项1',
  `chioce2` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项2',
  `chioce3` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项3',
  `chioce4` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '选项4',
  `chioce5` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项5',
  `chioce6` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项6',
  `chioce7` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '选项7',
  `standard_ans` int(5) NOT NULL COMMENT '题目标准答案1',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qmid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for records_buy
-- ----------------------------
DROP TABLE IF EXISTS `records_buy`;
CREATE TABLE `records_buy`  (
  `rbid` int(50) NOT NULL AUTO_INCREMENT COMMENT '买交易记录id',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交易时间',
  `sid` int(50) NOT NULL COMMENT '商品id',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`rbid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for records_sell
-- ----------------------------
DROP TABLE IF EXISTS `records_sell`;
CREATE TABLE `records_sell`  (
  `rsid` int(50) NOT NULL AUTO_INCREMENT COMMENT '卖交易记录id',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交易时间',
  `sid` int(50) NOT NULL COMMENT '商品id',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`rsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `rid` int(50) NOT NULL AUTO_INCREMENT COMMENT '成绩报告id',
  `rname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '成绩报告名，如：《Java入门测试》成绩报告',
  `eid` int(50) NOT NULL COMMENT '考生id',
  `grade` double(255, 0) NOT NULL COMMENT '试卷分数',
  `starttime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试开始时间',
  `endtime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试结束时间',
  `comments` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '教师评语',
  `finish_stat` int(5) NOT NULL COMMENT '判断状态（0：未判卷；1：已判卷）',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`rid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for store_paper
-- ----------------------------
DROP TABLE IF EXISTS `store_paper`;
CREATE TABLE `store_paper`  (
  `spid` int(50) NOT NULL AUTO_INCREMENT COMMENT '货品id',
  `pid` int(50) NOT NULL COMMENT '试卷id',
  `price` double(50, 2) NOT NULL COMMENT '价钱',
  `sale_num` int(255) NOT NULL DEFAULT 0 COMMENT '试卷销售量',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`spid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for store_ques_bank
-- ----------------------------
DROP TABLE IF EXISTS `store_ques_bank`;
CREATE TABLE `store_ques_bank`  (
  `sbid` int(50) NOT NULL AUTO_INCREMENT COMMENT '货品id',
  `bid` int(50) NOT NULL COMMENT '题库id',
  `price` double(50, 2) NOT NULL COMMENT '价钱',
  `sale_num` int(255) NOT NULL DEFAULT 0 COMMENT '题库销售量',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`sbid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `uid` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登录账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户密码',
  `uname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
  `role` int(255) NOT NULL COMMENT '角色（0：教师；1：学生）',
  `photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `active` int(255) NOT NULL COMMENT '账户激活状态，邮箱验证（0：未激活；1：激活）',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
