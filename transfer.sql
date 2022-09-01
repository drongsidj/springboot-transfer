/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : transfer

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 31/08/2022 23:13:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `account_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '账号ID',
  `account_name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号别名',
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '客户ID',
  `balance` decimal(13, 2) NULL DEFAULT NULL COMMENT '账户余额',
  `available_balance` decimal(13, 2) NULL DEFAULT NULL COMMENT '可用余额',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `is_deleted` tinyint(1) NOT NULL COMMENT '逻辑删除(0是未删除，1是删除)',
  PRIMARY KEY (`account_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '账户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, '第一', 2, 55.00, 1000.00, '2000-10-07 19:51:36', '2022-08-30 23:57:10', 0);
INSERT INTO `account` VALUES (2, '小中', 3, 60.00, 20.00, '2022-08-04 22:00:08', '2022-08-30 23:57:10', 0);
INSERT INTO `account` VALUES (3, '校招', 2, 100.00, 200.00, '2022-08-18 23:15:32', '2022-08-18 23:15:32', 0);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `customer_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  `customer_name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户姓名',
  `customer_grade` tinyint(1) NULL DEFAULT 1 COMMENT '客户等级(1是最低，依次递增)',
  `create_time` datetime NULL DEFAULT NULL COMMENT '客户创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '客户修改时间',
  `is_deleted` tinyint(1) UNSIGNED NULL DEFAULT 0 COMMENT '逻辑删除(0是未删除，1是删除)',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '客户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (2, 'ad', 2, '2022-08-04 22:02:23', '2022-08-17 00:57:36', 0);
INSERT INTO `customer` VALUES (3, '电饭锅', 1, '2022-08-07 18:36:46', '2022-08-07 18:36:49', 0);

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record`  (
  `record_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '转账记录ID',
  `borrow_id` bigint(20) UNSIGNED NOT NULL COMMENT '借方ID',
  `lend_id` bigint(20) UNSIGNED NOT NULL COMMENT '贷方ID',
  `transfer_amount` decimal(13, 2) NOT NULL COMMENT '交易金额',
  `create_time` datetime NULL DEFAULT NULL COMMENT '交易发起时间',
  `begain_time` datetime NULL DEFAULT NULL COMMENT '交易开始时间',
  `transfer_type` tinyint(1) NOT NULL DEFAULT 1 COMMENT '转账类型(1实时转账，2是预约转账)',
  `appointment_status` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否取消预约(Y、N)',
  `appointment_time` datetime NULL DEFAULT NULL COMMENT '交易预约时间',
  `is_succeed` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易是否成功(Y、N)',
  `add_time` datetime NULL DEFAULT NULL COMMENT '交易记录新增时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '交易记录最后更新时间',
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '交易信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES (24, 2, 1, 5.00, '2022-08-30 23:55:49', '2022-08-30 23:55:49', 2, 'N', '2022-08-30 23:57:10', 'Y', '2022-08-30 23:55:49', '2022-08-30 23:57:10');

SET FOREIGN_KEY_CHECKS = 1;
