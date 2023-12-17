/*
 Navicat Premium Data Transfer

 Source Server         : LL
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : jwxt

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 17/12/2023 12:15:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`
(
    `classID` int(11) NOT NULL COMMENT '班号',
    `majorID` int(11) NOT NULL COMMENT '专业号',
    PRIMARY KEY (`classID`) USING BTREE,
    INDEX `fk_class_major` (`majorID`) USING BTREE,
    CONSTRAINT `fk_class_major` FOREIGN KEY (`majorID`) REFERENCES `major` (`majorID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`
(
    `courseID`   int(11)                                                 NOT NULL COMMENT '课程号',
    `courseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名',
    `hours`      date                                                    NOT NULL COMMENT '学时',
    `credit`     float                                                   NOT NULL COMMENT '学分',
    `teachID`    int(11)                                                 NOT NULL COMMENT '职工号',
    PRIMARY KEY (`courseID`) USING BTREE,
    INDEX `fk_course_teacher` (`teachID`) USING BTREE,
    CONSTRAINT `fk_course_teacher` FOREIGN KEY (`teachID`) REFERENCES `teacher` (`teachID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`
(
    `id`       int(11)                                                 NOT NULL,
    `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login`
VALUES (1, 'zhangsan', '123456');
INSERT INTO `login`
VALUES (2, 'lisi', '123456');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major`
(
    `majorID`   int(11)                                                 NOT NULL COMMENT '专业号',
    `majorName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业名',
    PRIMARY KEY (`majorID`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of major
-- ----------------------------

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc`
(
    `userID`   int(11) NOT NULL COMMENT '学号',
    `courseID` int(11) NOT NULL COMMENT '课程号',
    `grade`    int(11) NULL DEFAULT NULL COMMENT '成绩',
    PRIMARY KEY (`userID`, `courseID`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`
(
    `userID`   int(11)                                                 NOT NULL COMMENT '学号',
    `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
    `userSex`  tinyint(1)                                              NOT NULL COMMENT '性别',
    `userAge`  tinyint(2)                                              NOT NULL COMMENT '年龄',
    `markYear` year                                                    NOT NULL COMMENT '入学年份',
    `classID`  int(11)                                                 NULL DEFAULT NULL COMMENT '班级号',
    `majorID`  int(11)                                                 NULL DEFAULT NULL COMMENT '专业号',
    PRIMARY KEY (`userID`) USING BTREE,
    INDEX `fk_student_class` (`classID`) USING BTREE,
    INDEX `fk_student_major` (`majorID`) USING BTREE,
    CONSTRAINT `fk_student_class` FOREIGN KEY (`classID`) REFERENCES `class` (`classID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `fk_student_major` FOREIGN KEY (`majorID`) REFERENCES `major` (`majorID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student`
VALUES (2021000000, 'zhangsan', 1, 21, 2021, NULL, NULL);
INSERT INTO `student`
VALUES (2021000001, 'lisi', 0, 20, 2021, NULL, NULL);

-- ----------------------------
-- Table structure for teach_room
-- ----------------------------
DROP TABLE IF EXISTS `teach_room`;
CREATE TABLE `teach_room`
(
    `room_ID`  int(11)                                                 NOT NULL COMMENT '教研室号',
    `roomName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教研室名',
    `majorID`  int(11)                                                 NOT NULL COMMENT '专业号',
    PRIMARY KEY (`room_ID`) USING BTREE,
    INDEX `fk_teachroom_major` (`majorID`) USING BTREE,
    CONSTRAINT `fk_teachroom_major` FOREIGN KEY (`majorID`) REFERENCES `major` (`majorID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teach_room
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`
(
    `teachID`   int(11)                                                 NOT NULL COMMENT '职工号',
    `teachName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
    `teachSex`  tinyint(1)                                              NOT NULL COMMENT '性别',
    `teachAge`  tinyint(2)                                              NOT NULL COMMENT '年龄',
    `degree`    varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
    `title`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职称',
    `teachYear` year                                                    NOT NULL COMMENT '入职时间',
    `roomID`    int(11)                                                 NOT NULL COMMENT '办公室号',
    `classID`   int(11)                                                 NOT NULL COMMENT '班级号',
    PRIMARY KEY (`teachID`) USING BTREE,
    INDEX `fk_teacher_teachroom` (`roomID`) USING BTREE,
    INDEX `fk_teacher_class` (`classID`) USING BTREE,
    CONSTRAINT `fk_teacher_class` FOREIGN KEY (`classID`) REFERENCES `class` (`classID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `fk_teacher_teachroom` FOREIGN KEY (`roomID`) REFERENCES `teach_room` (`room_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
