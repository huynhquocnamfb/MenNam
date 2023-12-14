/*
 Navicat Premium Data Transfer

 Source Server         : DBNam
 Source Server Type    : MySQL
 Source Server Version : 100428 (10.4.28-MariaDB)
 Source Host           : localhost:3306
 Source Schema         : teambuilding

 Target Server Type    : MySQL
 Target Server Version : 100428 (10.4.28-MariaDB)
 File Encoding         : 65001

 Date: 30/11/2023 01:11:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `IdQuestion` int NOT NULL,
  `IdTest` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Question` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Opt_A` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Opt_B` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Opt_C` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Opt_D` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Answer` int NOT NULL,
  PRIMARY KEY (`IdQuestion`) USING BTREE,
  INDEX `FK_Question_Test`(`IdTest` ASC) USING BTREE,
  CONSTRAINT `FK_Question_Test` FOREIGN KEY (`IdTest`) REFERENCES `test` (`IdTest`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for rankteam
-- ----------------------------
DROP TABLE IF EXISTS `rankteam`;
CREATE TABLE `rankteam`  (
  `IdRankTeam` int NOT NULL,
  `TeamID` int NOT NULL,
  `ScoreSum` int NOT NULL,
  PRIMARY KEY (`IdRankTeam`) USING BTREE,
  INDEX `FK_RankTeam_Team`(`TeamID` ASC) USING BTREE,
  CONSTRAINT `FK_RankTeam_Team` FOREIGN KEY (`TeamID`) REFERENCES `team` (`TeamID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of rankteam
-- ----------------------------

-- ----------------------------
-- Table structure for rankuser
-- ----------------------------
DROP TABLE IF EXISTS `rankuser`;
CREATE TABLE `rankuser`  (
  `IDRank` int NOT NULL,
  `IdUser` int NOT NULL,
  `IdReSult` int NOT NULL,
  PRIMARY KEY (`IDRank`) USING BTREE,
  INDEX `FK_RankUser_User`(`IdUser` ASC) USING BTREE,
  INDEX `FK_RankUser_Result`(`IdReSult` ASC) USING BTREE,
  CONSTRAINT `FK_RankUser_Result` FOREIGN KEY (`IdReSult`) REFERENCES `result` (`IdResult`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `FK_RankUser_User` FOREIGN KEY (`IdUser`) REFERENCES `user` (`IdUser`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of rankuser
-- ----------------------------

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result`  (
  `IdResult` int NOT NULL,
  `IDUser` int NOT NULL,
  `IdTest` int NOT NULL,
  `Test` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Score` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`IdResult`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result
-- ----------------------------
INSERT INTO `result` VALUES (1, 1, 0, 'Test 1', '90%');
INSERT INTO `result` VALUES (2, 2, 0, 'Test 1', '85%');
INSERT INTO `result` VALUES (3, 3, 0, 'Test 1', '78%');
INSERT INTO `result` VALUES (4, 4, 0, 'Test 4', '95%');
INSERT INTO `result` VALUES (5, 5, 0, 'Test 4', '88%');
INSERT INTO `result` VALUES (6, 6, 0, 'Test 4', '82%');

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `TeamID` int NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`TeamID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES (1, 'Team A');
INSERT INTO `team` VALUES (2, 'Team B');
INSERT INTO `team` VALUES (3, 'Team C');
INSERT INTO `team` VALUES (4, 'Team D');
INSERT INTO `team` VALUES (5, 'Team E');
INSERT INTO `team` VALUES (6, 'Team F');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `IdTest` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Time` time NOT NULL,
  PRIMARY KEY (`IdTest`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('test1', 'Test 1', '01:00:00');
INSERT INTO `test` VALUES ('test2', 'Test 2', '01:30:00');
INSERT INTO `test` VALUES ('test3', 'Test 3', '02:00:00');
INSERT INTO `test` VALUES ('test4', 'Test 4', '01:45:00');
INSERT INTO `test` VALUES ('test5', 'Test 5', '02:30:00');
INSERT INTO `test` VALUES ('test6', 'Test 6', '01:15:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `IdUser` int NOT NULL,
  `UserName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Status` int NOT NULL,
  `TeamID` int NOT NULL,
  `Role` int NOT NULL,
  PRIMARY KEY (`IdUser`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'user1', 'password1', 'User 1', 'user1@example.com', 1, 1, 1);
INSERT INTO `user` VALUES (2, 'user2', 'password2', 'User 2', 'user2@example.com', 1, 2, 2);
INSERT INTO `user` VALUES (3, 'user3', 'password3', 'User 3', 'user3@example.com', 1, 3, 2);
INSERT INTO `user` VALUES (4, 'user4', 'password4', 'User 4', 'user4@example.com', 1, 4, 1);
INSERT INTO `user` VALUES (5, 'user5', 'password5', 'User 5', 'user5@example.com', 1, 5, 2);
INSERT INTO `user` VALUES (6, 'user6', 'password6', 'User 6', 'user6@example.com', 1, 6, 2);

SET FOREIGN_KEY_CHECKS = 1;
