/*
 Navicat Premium Data Transfer

 Source Server         : drui
 Source Server Type    : MySQL
 Source Server Version : 80034
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 80034
 File Encoding         : 65001

 Date: 09/09/2023 14:32:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stuNo` bigint NOT NULL AUTO_INCREMENT,
  `stuName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `gender` char(2) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL DEFAULT '男',
  `age` int NOT NULL,
  `isDeleted` tinyint UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`stuNo`) USING BTREE,
  INDEX `idx_stuno_isdeleted`(`stuNo`, `isDeleted`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '李志', '男性', 14, 0);
INSERT INTO `student` VALUES (2, '宋东野', '男性', 23, 0);
INSERT INTO `student` VALUES (3, '赵雷', '男性', 34, 0);
INSERT INTO `student` VALUES (4, '马頔', '女性', 32, 0);
INSERT INTO `student` VALUES (5, '陈粒', '女性', 18, 0);
INSERT INTO `student` VALUES (6, 'leo', '男性', 20, 0);
INSERT INTO `student` VALUES (7, 'druid', '男性', 20, 1);
INSERT INTO `student` VALUES (8, 'leree', '女性', 32, 0);
INSERT INTO `student` VALUES (9, 'jack', '男性', 21, 1);
INSERT INTO `student` VALUES (10, 'lisa', '男性', 33, 0);
INSERT INTO `student` VALUES (11, '李磊', '男性', 34, 0);
INSERT INTO `student` VALUES (12, '李磊', '男', 33, 1);
INSERT INTO `student` VALUES (13, 'libo', '男', 32, 1);
INSERT INTO `student` VALUES (14, 'lily', '男', 33, 1);
INSERT INTO `student` VALUES (15, 'lilys', '女性', 32, 0);

SET FOREIGN_KEY_CHECKS = 1;
