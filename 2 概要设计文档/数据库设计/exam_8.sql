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

 Date: 17/06/2019 09:22:42
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
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bank_ques_mapping
-- ----------------------------
INSERT INTO `bank_ques_mapping` VALUES (1, 3, 2, 8, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (2, 5, 6, 8, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (3, 4, 6, 10, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (4, 1, 3, 6, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (5, 4, 2, 9, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (6, 5, 1, 9, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (7, 3, 5, 5, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (8, 1, 6, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (9, 2, 6, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (10, 2, 2, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (11, 1, 2, 3, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (12, 4, 4, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (13, 3, 1, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (14, 3, 4, 4, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (15, 5, 4, 2, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (16, 2, 4, 3, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (17, 5, 1, 5, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (18, 1, 2, 9, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (19, 4, 1, 5, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (20, 4, 3, 6, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (21, 2, 4, 6, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (22, 1, 1, 4, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (23, 3, 6, 9, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (24, 3, 5, 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (25, 5, 4, 3, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (26, 1, 4, 11, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (27, 3, 5, 11, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (28, 4, 2, 4, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (29, 5, 1, 1, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (30, 5, 5, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (31, 1, 6, 8, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (32, 3, 5, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (33, 4, 3, 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (34, 3, 5, 3, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (35, 2, 3, 5, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (36, 5, 6, 4, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (37, 3, 6, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (38, 1, 6, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (39, 2, 2, 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (40, 3, 1, 6, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (41, 1, 4, 5, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (42, 4, 4, 8, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (43, 4, 3, 7, 3, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (44, 5, 5, 6, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (45, 1, 6, 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (46, 4, 1, 3, 2, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (47, 1, 3, 12, 5, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (48, 1, 1, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `bank_ques_mapping` VALUES (49, 2, 1, 4, 2, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for examinee
-- ----------------------------
DROP TABLE IF EXISTS `examinee`;
CREATE TABLE `examinee`  (
  `eid` int(50) NOT NULL AUTO_INCREMENT COMMENT '考生id',
  `pid` int(50) NOT NULL COMMENT '考生参与的考试',
  `ename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生名',
  `eemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考生邮箱',
  `classs` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考生的班级信息',
  `studentid` int(50) NULL DEFAULT NULL COMMENT '考生学号',
  `isfinish` int(5) NOT NULL DEFAULT 0 COMMENT '是否已完成考试（1：是；0：否）',
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
  `is_limit` int(11) NOT NULL DEFAULT 0 COMMENT '是否有时间区间限制（0：没有；1：有，需要填写beg_time和end_time）',
  `beg_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考试时间区间：开始时间',
  `end_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考试时间区间：结束时间',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES (1, 1, '月考一', '本次月考的考试范围为第一章到第三章', 1, 45, 'FAWEC', 1, '0', 3, 2, 0, 3, 2, '2019-05-16 10:00:00', 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `paper` VALUES (2, 15, '单元考试', '圆锥曲线的计算', 1, 60, 'JHUHI', 1, 'c', 0, 2, 1, 3, 6, '2019-05-19 12:00:00', 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `paper` VALUES (3, 2, '第五次统一考试', '市区第五次统一考试', 0, 100, 'KHGGW', 1, '0', 0, 1, 6, 2, 1, '2019-06-01 10:00:01', 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `paper` VALUES (4, 1, 'Englishtest', 'question is certificated', 0, 30, 'WFFAW', 3, 'a', 2, 1, 1, 3, 3, '2019-06-07 12:00:01', 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `paper` VALUES (5, 1, '理综模拟二', '黄冈第二套', 0, 50, 'EWEFC', 1, 's', 1, 4, 1, 1, 2, '2019-06-12 10:00:02', 0, NULL, NULL, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of paper_ques_mapping
-- ----------------------------
INSERT INTO `paper_ques_mapping` VALUES (1, 4, 3, 3, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (2, 2, 5, 2, 3, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (3, 4, 1, 5, 3, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (4, 1, 3, 2, 1, 1, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (5, 2, 6, 3, 1, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (6, 5, 5, 2, 5, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (7, 3, 2, 2, 2, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (8, 2, 4, 3, 4, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (9, 2, 3, 3, 5, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (10, 1, 4, 5, 4, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (11, 5, 5, 5, 4, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (12, 1, 5, 2, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (13, 3, 4, 2, 3, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (14, 2, 5, 15, 12, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (15, 3, 5, 3, 8, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (16, 4, 1, 10, 8, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (17, 4, 6, 4, 5, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (18, 5, 6, 5, 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (19, 3, 6, 2, 4, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (20, 2, 3, 3, 6, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (21, 3, 6, 10, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (22, 1, 5, 2, 3, 1, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (23, 1, 4, 2, 6, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (24, 5, 3, 10, 7, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (25, 2, 4, 15, 11, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (26, 2, 3, 15, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (27, 3, 4, 2, 7, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (28, 2, 3, 10, 9, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (29, 1, 5, 5, 5, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (30, 3, 3, 2, 5, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (31, 5, 1, 5, 3, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (32, 4, 1, 3, 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (33, 4, 2, 15, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (34, 5, 3, 5, 1, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (35, 4, 2, 4, 7, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (36, 3, 5, 3, 9, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (37, 5, 2, 3, 6, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (38, 1, 2, 2, 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (39, 1, 5, 10, 9, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (40, 4, 2, 10, 9, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (41, 3, 1, 5, 1, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (42, 5, 4, 10, 8, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (43, 2, 6, 3, 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (44, 3, 3, 2, 6, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (45, 2, 4, 10, 7, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (46, 1, 4, 2, 8, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (47, 1, 6, 10, 10, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (48, 2, 2, 10, 8, 5, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (49, 4, 2, 4, 6, 4, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (50, 4, 1, 3, 4, 3, NULL, NULL, NULL, NULL);
INSERT INTO `paper_ques_mapping` VALUES (53, 5, 3, 2, 9, 1, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_bank
-- ----------------------------
INSERT INTO `ques_bank` VALUES (1, 1, '我的题库1', '存放语文资料', 3, 3, 0, 3, 3, '2019-06-16 19:25:00', NULL, NULL, NULL, NULL);
INSERT INTO `ques_bank` VALUES (2, 1, '题库', '全国高考2017年数学单选题', 2, 3, 1, 1, 0, '2019-06-11 15:20:00', NULL, NULL, NULL, NULL);
INSERT INTO `ques_bank` VALUES (3, 15, 'bank', 'multichoice', 2, 2, 2, 2, 3, '2019-06-06 19:25:01', NULL, NULL, NULL, NULL);
INSERT INTO `ques_bank` VALUES (4, 1, '经典题库', '经典题目', 1, 2, 4, 3, 0, '2019-05-11 15:20:01', NULL, NULL, NULL, NULL);
INSERT INTO `ques_bank` VALUES (5, 2, '人文题库', '最全的人文知识', 0, 1, 4, 2, 2, '2019-05-16 19:25:02', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for ques_fill
-- ----------------------------
DROP TABLE IF EXISTS `ques_fill`;
CREATE TABLE `ques_fill`  (
  `qfid` int(50) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单项选择题题干',
  `standard_ans` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目标准答案1',
  `knowledge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '知识点',
  `difficulty` int(5) NOT NULL COMMENT '题目难度',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目解析',
  `int_1` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `int_2` int(255) NULL DEFAULT NULL COMMENT '备用int',
  `var_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  `var_2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用varchar',
  PRIMARY KEY (`qfid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_fill
-- ----------------------------
INSERT INTO `ques_fill` VALUES (1, '表单的常用提交方法包括____和____方法。', 'get|-|post', 'JAVA', 1, '表单的提交方式为doget、dopost', NULL, NULL, NULL, NULL);
INSERT INTO `ques_fill` VALUES (2, '在JSP页面中通过Page指令____属性引入Java包中的类。', 'import', 'JAVA', 2, '引用包用import', NULL, NULL, NULL, NULL);
INSERT INTO `ques_fill` VALUES (3, 'MVC中V通常是由____来实现的、C通常由____来实现。', '视图层|-|控制层', 'JAVA', 1, 'MVC: \nM:Model \nV:View \nC:Controlle', NULL, NULL, NULL, NULL);
INSERT INTO `ques_fill` VALUES (4, '表单上传文件时，form的method必须为____，同时enctype属性必须为____。', 'post|-|multipart/form-data', 'JAVA', 3, '根据上课所讲此题得正确答案为post、multipart/form-data', NULL, NULL, NULL, NULL);
INSERT INTO `ques_fill` VALUES (5, '3+8=____。', '11', 'math', 1, '3+8=11', NULL, NULL, NULL, NULL);
INSERT INTO `ques_fill` VALUES (6, '举头望明月的下一句____。', '低头思故乡', 'chinese', 1, '举头望明月，低头思故乡', NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_judge
-- ----------------------------
INSERT INTO `ques_judge` VALUES (1, '钓鱼岛是中国的吗', 1, 'chinese', 1, '根据中国得牛逼之处，钓鱼岛是中国得', NULL, NULL, NULL, NULL);
INSERT INTO `ques_judge` VALUES (2, 'java的接口能被多个类实现吗', 1, 'JAVA', 1, '这是java的', NULL, NULL, NULL, NULL);
INSERT INTO `ques_judge` VALUES (3, '宋振海是数学家吗', 0, 'math', 1, '根据相关信息，它并不是一个数学家', NULL, NULL, NULL, NULL);
INSERT INTO `ques_judge` VALUES (4, '东北大学在沈阳吗', 1, 'chinese', 1, '根据百度所查，东北大学位于辽宁省沈阳市', NULL, NULL, NULL, NULL);
INSERT INTO `ques_judge` VALUES (5, '中国在南半球吗', 0, 'chinese', 2, '根据地理地图，中国位于北半球', NULL, NULL, NULL, NULL);
INSERT INTO `ques_judge` VALUES (6, '黄赤交角是23度吗', 0, 'chinese', 3, '黄赤交角，又名黄道交角、黄赤大距，是地球公转轨道面（黄道面）与赤道面（天赤道面）的交角。地球的黄赤交角为约为23°26\'。', NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_mul
-- ----------------------------
INSERT INTO `ques_mul` VALUES (1, '那些城市属于中国（）', '沈阳', '北京', '多伦多', '华盛顿', NULL, NULL, NULL, '1，2', 'chinese', 1, '根据地理位置所查，沈阳和石家庄是中国的城市', NULL, NULL, NULL, NULL);
INSERT INTO `ques_mul` VALUES (2, '哪些城市属于广州省（）', '安徽', '石家庄', '佛山', '广州', NULL, NULL, NULL, '3，4', 'chinese', 2, '根据地理位置所查，广东和佛山属于广州市', NULL, NULL, NULL, NULL);
INSERT INTO `ques_mul` VALUES (3, '以下关于URL的说法正确的是（）', 'URL是Uniform Resource Locator 的缩写，意见是统一资源定位符', 'URL是标准的互联网上资源的地址，是用完整描述Internet上网和其他资源的地址的一种标识方法', '在Internet上所有资源都有一个独一无二的URL地址。我们可以通过在浏览器地址栏输入URL实现对网页的访问', 'URL由三部分组成：协议，主机IP地址（有时包括端口号），路径，其中，第一部分和第二部分可以省略，第三部分不可缺少', NULL, NULL, NULL, '1，2，3', 'JAVA', 3, 'URL是Uniform Resource Locator 的缩写，意见是统一资源定位符，URL是标准的互联网上资源的地址，是用完整描述Internet上网和其他资源的地址的一种标识方法，在Internet上所有资源都有一个独一无二的URL地址。我们可以通过在浏览器地址栏输入URL实现对网页的访问', NULL, NULL, NULL, NULL);
INSERT INTO `ques_mul` VALUES (4, '在JSP中，选项()声明的是错误的全局变量（）', '<%!String Str”home”%>', '<%!int age=25;%>', '<% !String 2str=”home”;%>', '<%int ab$=36;>', NULL, NULL, NULL, '1，3，4', 'JAVA', 3, '<%!String Str”home”%>，<%!int age=25;%>，<% !String 2str=”home”;%>', NULL, NULL, NULL, NULL);
INSERT INTO `ques_mul` VALUES (5, '在JSP中，关于web.xml说法正确的是()', '<welcome-file-list>元素用于设定Web应用的起始访问页面', '<welcome-file>用于指定页面', '<welcome-file-list>元素可包', '有多个<welcome-file>子元素时，若Web容器在第一个子元素中没有找到指定的文件，则会停止查找', NULL, NULL, NULL, '1，2，3', 'JAVA', 3, '<welcome-file-list>元素用于设定Web应用的起始访问页面，<welcome-file>用于指定页面，<welcome-file-list>元素可包', NULL, NULL, NULL, NULL);
INSERT INTO `ques_mul` VALUES (6, '是|x|=1的数有哪几个', '1', '0', '-1', '0', NULL, NULL, NULL, '1，3', 'math', 1, '1，0，-1', NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_short
-- ----------------------------
INSERT INTO `ques_short` VALUES (1, '简述“协议是水平的、服务是垂直的”含义', '（1）协议是“水平”的，即协议是控制对等实体之间通信的规则；\r\n（2）服务是“垂直”的，即服务是由下层向上层通过层间借口提供的；', 'JAVA', 1, '（1）协议是“水平”的，即协议是控制对等实体之间通信的规则；\n\n（2）服务是“垂直”的，即服务是由下层向上层通过层间借口提供的；', NULL, NULL, NULL, NULL);
INSERT INTO `ques_short` VALUES (2, '介绍五层协议体系各层功能、为何要采用五层结构', '（1）应用层：通过应用金进程间的交互来完成特定网络应用。应用层协议定义的是应用进程间通信和交互的规则。（2）运输层：负责向两台主机中进程之间的通信提供通用的数据传输服务。（3）网络层：1）为分组交换网上的不同主机提供通信服务；2）选择合适的路由，使源主机运输层传下来的分组，能通过网络中的路由器找到目的主机。（4）数据链路层：将网络层交下来的IP数据报组装成帧，在两个相邻节点间的链路上传送帧。（5）物理层：1）考虑用多大的电压代表“1”或“0”，以及接收方如何识别出发送方所发送的比特。 2）确定连接电缆的插头应当有多少根引脚及各引脚应如何连接。\r\n', 'JAVA', 3, ' （1）层数太多，其每一层在描述和综合各层功能的系统工程任务中会遇到太多困难，且既复杂又不实用。\r\n （2）层数太少，会导致每一层协议过于复杂\r\n   故采取折中的办法，综合TCP/IP和OSI的优点，采用只有五层协议的体系结构，这样既简洁又能将概念解释清楚', NULL, NULL, NULL, NULL);
INSERT INTO `ques_short` VALUES (3, '哪一个月有二十八天', '每个月都有28天', 'math', 1, '每个月都是有28号的，为混绕题', NULL, NULL, NULL, NULL);
INSERT INTO `ques_short` VALUES (4, '一个绳子两个头，一根半绳子有几个头', '4个', 'math', 2, '一分2，2分为4', NULL, NULL, NULL, NULL);
INSERT INTO `ques_short` VALUES (5, '”白雪公主“这个形象最早来自于哪里？', '安徒生童话', 'chinese', 1, '白雪公主来自于安徒生童话', NULL, NULL, NULL, NULL);
INSERT INTO `ques_short` VALUES (6, '“卧薪尝胆”说的是？', '勾践', 'chinese', 1, '卧薪尝胆为勾践为所', NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ques_single
-- ----------------------------
INSERT INTO `ques_single` VALUES (1, '下列说法正确的是', 'JAVA程序的main方法必须写在类里面', 'JAVA程序中可以有多个main方法', ' JAVA程序中类名必须与文件名一样', '\r\n JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来', NULL, NULL, NULL, 1, 'JAVA', 1, '很明显答案为A', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (2, '1+1=？', '1', '2', '3', '4', NULL, NULL, NULL, 2, 'math', 1, '1+1=2', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (3, '100/50=？', '1', '2', '3', '4', NULL, NULL, NULL, 2, 'math', 2, '100/50=2', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (4, '在面向对象的方法中，一个对象请求另一个对象为其服务的方式是通过什么发送的？', '调用语句', '命令', '口令', '消息', NULL, NULL, NULL, 4, 'JAVA', 3, '根据上课所讲，答案为消息', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (5, '在java中，由java编译器自动导入，而无需在程序中用import导入的包是（）', 'java.applet', 'java.lang', ' java.util', ' java.awt', NULL, NULL, NULL, 2, 'JAVA', 1, '在java中，由java编译器自动导入，而无需在程序中用import导入的包是lang包', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (6, '“近朱者赤，近墨者黑”所蕴含的道理和下列哪句话最相似？', '青出于蓝，而胜于蓝', '蓬生麻中，不扶而直', '公生明，偏生暗', '锲而不舍，金石可镂。', NULL, NULL, NULL, 2, 'chinese', 2, '同义转化', NULL, NULL, NULL, NULL);
INSERT INTO `ques_single` VALUES (7, '英文有多少个字母？', '16', '15', '26', '25', NULL, NULL, NULL, 3, '常识', 1, '常识……', NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of store_paper
-- ----------------------------
INSERT INTO `store_paper` VALUES (1, 5, 0.00, 1, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (2, 5, 0.00, 20, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (3, 4, 0.00, 50, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (4, 5, 0.00, 17, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (5, 4, 0.00, 15, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (6, 4, 0.00, 11, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (7, 3, 0.00, 19, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (8, 2, 0.00, 11, NULL, NULL, NULL, NULL);
INSERT INTO `store_paper` VALUES (9, 4, 0.00, 42, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of store_ques_bank
-- ----------------------------
INSERT INTO `store_ques_bank` VALUES (1, 4, 0.00, 21, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (2, 5, 0.00, 5, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (3, 2, 0.00, 20, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (4, 2, 0.00, 26, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (5, 4, 0.00, 48, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (6, 5, 0.00, 29, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (7, 1, 0.00, 26, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (8, 2, 0.00, 31, NULL, NULL, NULL, NULL);
INSERT INTO `store_ques_bank` VALUES (9, 4, 0.00, 43, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, '156902387@qq.com', '123456', '白蒲', 1, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (2, '875655762@qq.com', '123456', '雷志', 1, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (3, '1031707557@qq.com', '123456', '宋振海', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (4, '1245439847@qq.com', '123456', '贾良雨', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (5, '2878536089@qq.com', '123456', '李志祥', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (6, 'wzy_me@outlook.com', '123456', 'Resun', 0, NULL, 0, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (7, '123456@qq.com', '123456', '小明', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (8, '1234567@qq.com', '123456', '小红', 1, NULL, 0, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (9, '2345678@qq.com', '123456', '小明明', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (10, '3456789@qq.com', '123456', '小红红', 1, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (11, '4567900@qq.com', '123456', '浩克', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (12, '5679011@qq.com', '123456', '美队', 0, NULL, 0, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (13, '6790122@qq.com', '123456', '钢铁侠Tony', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (14, '7901233@qq.com', '123456', '学生Test', 0, NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (15, '9012344@qq.com', '123456', '教师Test', 1, NULL, 1, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Triggers structure for table bank_ques_mapping
-- ----------------------------
DROP TRIGGER IF EXISTS `update_bank_num`;
delimiter ;;
CREATE TRIGGER `update_bank_num` AFTER INSERT ON `bank_ques_mapping` FOR EACH ROW BEGIN
	IF new.type = 1 THEN
		UPDATE ques_bank SET qsi_num = qsi_num + 1 WHERE bid = new.bid;
	ELSEIF new.type = 2 THEN
		UPDATE ques_bank SET qm_num = qm_num + 1 WHERE bid = new.bid;
	ELSEIF new.type = 3 THEN
		UPDATE ques_bank SET qj_num = qj_num + 1 WHERE bid = new.bid;
	ELSEIF new.type = 4 THEN
		UPDATE ques_bank SET qf_num = qf_num + 1 WHERE bid = new.bid;
	ELSEIF new.type = 5 THEN
		UPDATE ques_bank SET qsh_num = qsh_num + 1 WHERE bid = new.bid;
	END IF;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table paper
-- ----------------------------
DROP TRIGGER IF EXISTS `del_paper_from_store`;
delimiter ;;
CREATE TRIGGER `del_paper_from_store` AFTER DELETE ON `paper` FOR EACH ROW BEGIN
	DELETE FROM store_paper WHERE store_paper.pid=old.pid;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table paper_ques_mapping
-- ----------------------------
DROP TRIGGER IF EXISTS `update_paper_num`;
delimiter ;;
CREATE TRIGGER `update_paper_num` AFTER INSERT ON `paper_ques_mapping` FOR EACH ROW BEGIN
	IF new.type = 1 THEN
		UPDATE paper SET qsi_num = qsi_num + 1 WHERE pid = new.pid;
	ELSEIF new.type = 2 THEN
		UPDATE paper SET qm_num = qm_num + 1 WHERE pid = new.pid;
	ELSEIF new.type = 3 THEN
		UPDATE paper SET  qj_num = qj_num + 1 WHERE pid = new.pid;
	ELSEIF new.type = 4 THEN
		UPDATE paper SET qf_num = qf_num + 1 WHERE pid = new.pid;
	ELSEIF new.type = 5 THEN
		UPDATE paper SET qsh_num = qsh_num + 1 WHERE pid = new.pid;
	END IF;
	
#	UPDATE paper_ques_mapping SET paper_ques_mapping.`order` = paper_ques_mapping.`order` + 1 WHERE pid = new.pid AND paper_ques_mapping.`order` >= new.`order`;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table ques_bank
-- ----------------------------
DROP TRIGGER IF EXISTS `delete_bank_from_store`;
delimiter ;;
CREATE TRIGGER `delete_bank_from_store` AFTER DELETE ON `ques_bank` FOR EACH ROW BEGIN
	DELETE FROM store_ques_bank WHERE store_ques_bank.bid=old.bid;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table report
-- ----------------------------
DROP TRIGGER IF EXISTS `update_examinee_isfinish`;
delimiter ;;
CREATE TRIGGER `update_examinee_isfinish` AFTER INSERT ON `report` FOR EACH ROW BEGIN
	UPDATE `exam`.`examinee` SET `isfinish` = 1 WHERE `eid` = new.eid;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
