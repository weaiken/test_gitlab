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

 Date: 13/06/2019 20:54:14
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
  PRIMARY KEY (`bqid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for examinee
-- ----------------------------
DROP TABLE IF EXISTS `examinee`;
CREATE TABLE `examinee`  (
  `eid` int(50) NOT NULL AUTO_INCREMENT COMMENT '考生id',
  `ename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生名',
  `eemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生邮箱',
  `class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考生的班级信息',
  `studentid` int(50) NULL DEFAULT NULL COMMENT '考生学号',
  `uid` int(50) NULL DEFAULT NULL COMMENT '已注册的考生信息关联',
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for examinee_ans
-- ----------------------------
DROP TABLE IF EXISTS `examinee_ans`;
CREATE TABLE `examinee_ans`  (
  `eaid` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键标识',
  `rid` int(50) NOT NULL COMMENT '成绩报告id',
  `qid` int(50) NOT NULL COMMENT '题目id',
  `ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生对题目的回答内容',
  `score` int(255) NOT NULL COMMENT '题目得分',
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
  `describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷描述',
  `type` int(5) NOT NULL DEFAULT 0 COMMENT '试卷类型（0：私有；1：公开）',
  `time` int(50) NOT NULL COMMENT '试卷的时间限制',
  `Invitation_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邀请码',
  `out_times` int(50) NOT NULL DEFAULT 1 COMMENT '切换窗口次数',
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
  `bdescribe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库描述',
  PRIMARY KEY (`bid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ques_single
-- ----------------------------
DROP TABLE IF EXISTS `ques_single`;
CREATE TABLE `ques_single`  (
  `qsid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  PRIMARY KEY (`qsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `qid` int(50) NOT NULL AUTO_INCREMENT COMMENT '题目id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目描述',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目类型',
  `standard_ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案',
  `analysis` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '题目解析',
  PRIMARY KEY (`qid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for records_buy
-- ----------------------------
DROP TABLE IF EXISTS `records_buy`;
CREATE TABLE `records_buy`  (
  `rbid` int(50) NOT NULL AUTO_INCREMENT COMMENT '买交易记录id',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交易时间',
  `sid` int(50) NOT NULL COMMENT '商品id',
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
  PRIMARY KEY (`rsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `rid` int(50) NOT NULL AUTO_INCREMENT COMMENT '成绩报告id',
  `eid` int(50) NOT NULL COMMENT '考生id',
  `pid` int(50) NOT NULL COMMENT '试卷id',
  `grade` int(255) NOT NULL COMMENT '试卷分数',
  `comments` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '教师评语',
  `starttime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试开始时间',
  `endtime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试结束时间',
  PRIMARY KEY (`rid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for store_paper
-- ----------------------------
DROP TABLE IF EXISTS `store_paper`;
CREATE TABLE `store_paper`  (
  `spid` int(50) NOT NULL COMMENT '货品id',
  `pid` int(50) NOT NULL COMMENT '试卷id',
  `price` double(50, 2) NOT NULL COMMENT '价钱',
  PRIMARY KEY (`spid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for store_ques_bank
-- ----------------------------
DROP TABLE IF EXISTS `store_ques_bank`;
CREATE TABLE `store_ques_bank`  (
  `sbid` int(50) NOT NULL COMMENT '货品id',
  `bid` int(50) NOT NULL COMMENT '题库id',
  `price` double(50, 2) NOT NULL COMMENT '价钱',
  PRIMARY KEY (`sbid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

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
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
