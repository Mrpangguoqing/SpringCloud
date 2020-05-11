/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50548
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50548
 File Encoding         : 65001

 Date: 05/05/2020 16:27:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('人事部', 1);
INSERT INTO `dept` VALUES ('开发部', 2);
INSERT INTO `dept` VALUES ('财务部', 3);
INSERT INTO `dept` VALUES ('市场部', 4);
INSERT INTO `dept` VALUES ('运维部', 5);
INSERT INTO `dept` VALUES ('666', 6);
INSERT INTO `dept` VALUES (NULL, 7);

SET FOREIGN_KEY_CHECKS = 1;
